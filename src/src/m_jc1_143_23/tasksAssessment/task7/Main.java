package m_jc1_143_23.tasksAssessment.task7;

import java.util.Map;
import static m_jc1_143_23.tasksAssessment.task7.MapEntry.arrayToMap;

// Напишите метод, который получает на вход массив элементов типа К (Generic)
// и возвращает Map<K, Integer>, где K — значение из массива, а Integer — количество вхождений в массив.
public class Main {
    public static void main(String[] args) {
        String[] array = {"alex", "block", "сat", "dog", "ezhik"};
        Map<String, Integer> result = arrayToMap(array);
        for (String key : result.keySet()) {
            System.out.println(key + " - " + result.get(key));
        }
    }
}
