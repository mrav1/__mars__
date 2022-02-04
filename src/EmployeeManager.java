import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManager {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "C");
        map.put("B", "C");
        map.put("C", "F");
        map.put("F", "F");
        map.put("D", "E");
        map.put("E", "F");
        map.put("F", "F");
        EmployeeManager em = new EmployeeManager();
        System.out.println(em.solve(map));
    }

    private Map<String, Integer> solve(Map<String, String> map) {

        Map<String, List<String>> dirReporteesMap = new HashMap<>();
        // First level
        for (Map.Entry<String, String> set : map.entrySet()) {
            String mgr = set.getValue();
            String emp = set.getKey();
            if (dirReporteesMap.get(mgr) == null) {
                dirReporteesMap.put(mgr, new ArrayList<>());
            }
            dirReporteesMap.get(mgr).add(emp);
        }

        Map<String, Integer> res = new HashMap<>();
        for (Map.Entry<String, List<String>> en : dirReporteesMap.entrySet()) {
            int sum = 0;
            // Add 2nd level
            List<String> dirReportees = en.getValue();
            String mgr = en.getKey();
            for (String emp : dirReportees) {
                if (dirReporteesMap.get(emp) != null && !emp.equals(mgr)) {
                    sum += dirReporteesMap.get(emp).size();
                }
            }
            res.put(mgr, dirReportees.size() + sum);
        }
        return res;
    }


}
