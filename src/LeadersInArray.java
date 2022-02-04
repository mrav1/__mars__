import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {
        int[] inp = new int[]{13, 15, 6, 7, 8, 2};
        LeadersInArray lia = new LeadersInArray();
        lia.printLeaders(inp);
    }

    private void printLeaders(int[] inp) {

        List<Integer> leads = new ArrayList<>(inp.length);

        int max = inp[inp.length - 1];
        leads.add(max);

        int i = inp.length - 2;
        while (i >= 0) {
            if (inp[i] > max) {
                max = inp[i];
                leads.add(max);
            }
            i--;
        }

        System.out.println(leads);
    }
}
