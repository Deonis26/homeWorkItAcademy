package m_jc1_143_23.tasksAssessment.task4;

public class WordCount {
    public static void main(String[] args) {
        /*Дан текст. Подсчитайте уникальное количество слов в тексте.
        Учитывайте, что слова могут разделяться несколькими пробелами,
        знаками препинания.
        Пробелы могут присутствовать так же в начале и конце текста. */
        // String text = "Hello world";
        // String text = " Hello world, hello Java, hello   students . The                    WORLD is beautiful !";
        String text = "Listen to the news from today and read the text at the same time. " +
                "Listen to the news from today without reading the text.";
        int dublicateWordCounter = 0;
        text = text.trim().replaceAll("[^a-zA-Zа-яА-Я0-9]+", " ");
        String arr[] = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ". " + arr[i]);
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    dublicateWordCounter++;
                    break;
                }
            }
        }
        int counterUniqueWord = arr.length - dublicateWordCounter;
        System.out.println();
        System.out.println("Number of unique words: " + counterUniqueWord);
        System.out.println("Количество элементов в массиве: " + arr.length);
    }
}