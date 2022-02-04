import java.time.Instant;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class SlidingWindowRateLimitter {

    private Queue<Long> log = new LinkedList<>();
    private final int maxReqs;

    protected SlidingWindowRateLimitter(int value) {
        maxReqs = value;
    }

    String allow() {
        long currentTime = Instant.EPOCH.getNano();
        long boundary = currentTime - TimeUnit.NANOSECONDS.convert(1, TimeUnit.MINUTES);

        while (!log.isEmpty() && log.peek() <= boundary) {
            log.remove();
        }

        if (log.size() < maxReqs)
            return "Accepted";

        return "Rejected";
    }

    boolean allowSync() {
        long curTime = System.currentTimeMillis();
        long boundary = curTime - 60000; // maxRequests in a window
        synchronized (log) {
            while (!log.isEmpty() && log.element() <= boundary) {
                log.poll();
            }

            if (log.size() < maxReqs) {
                log.add(curTime);
                return true;
            }

            return false;
        }
    }

}
