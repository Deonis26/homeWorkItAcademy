package m_jc1_143_23.tasksAssessment.task7;
import java.util.HashMap;
import java.util.Map;

public class MapEntry {
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        HashMap<K, Integer> result = new HashMap<>();
        for (K k : ks) {
            result.put(k, result.getOrDefault(k, 0) + 1);
        }
        return result;
    }
}

