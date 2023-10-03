package m_jc1_143_23.tasksAssessment.task1;

import java.util.Scanner;

// Напишите программу, которая будет переводить секунды в отформатированный вид - часы, минуты, секунды.
// Слова должны иметь правильное окончание. Для более высокого балла добавьте недели и сутки.
// Постарайтесь не выводить данные, значение которых равно 0

public class TimeCounter {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд: ");
        Scanner scanner = new Scanner(System.in);
        String endingOfTheWordHour, endingOfTheWordMinute, endingOfTheWordSecond;
        int minute = 60; // минута
        int hour = 3600; // час
        int day = 86400; // день
        int week = 604800; // неделя
        int numberOfSecond = scanner.nextInt();
        int secondCounter = numberOfSecond % 60; // счетчик секунды
        int minuteCounter = (numberOfSecond / minute) % 60; // счечик минуты
        int hourCounter = (numberOfSecond / hour) % 24; //счетчик часа
        int dayCounter = (numberOfSecond / day) % 7; // счетчик дня
        int weekCounter = numberOfSecond / week; // счетчик недели
        if (hourCounter == 1 || hourCounter == 21) {
            endingOfTheWordHour = " ";
        } else if (hourCounter == 2 || hourCounter == 3 || hourCounter == 4 || hourCounter == 22 || hourCounter == 23) {
            endingOfTheWordHour = "a ";
        } else {
            endingOfTheWordHour = "ов ";
        }
        switch (minuteCounter) {
            case 1, 21, 31, 41, 51:
                endingOfTheWordMinute = "a ";
                break;
            case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                endingOfTheWordMinute = "ы ";
                break;
            default:
                endingOfTheWordMinute = " ";
                // break;
        }
        switch (secondCounter) {
            case 1, 21, 31, 41, 51:
                endingOfTheWordSecond = "a ";
                break;
            case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                endingOfTheWordSecond = "ы ";
                break;
            default:
                endingOfTheWordSecond = " ";
                // break;
        }
        //String endingOfTheWordSecond = endingOfTheWordMinute;
        String endingOfTheWordDay = dayCounter == 1 ? "ки " : "ок ";
        String endingOfTheWordWeek = weekCounter == 1 ? "я " : "и ";
        System.out.println("Количество секунд: " + numberOfSecond);
        if (minuteCounter > 0 && numberOfSecond < hour && numberOfSecond % 60 != 0) {
            System.out.println(minuteCounter + " минут" + endingOfTheWordMinute + secondCounter + " секунд" + endingOfTheWordSecond);
        } else if (hourCounter > 0 && numberOfSecond < day && numberOfSecond % 60 != 0) {
            System.out.println(hourCounter + " час" + endingOfTheWordHour + minuteCounter + " минут" + endingOfTheWordMinute +
                    secondCounter + " секунд" + endingOfTheWordSecond);
        } else if (dayCounter > 0 && numberOfSecond < week && numberOfSecond % 60 != 0) {
            System.out.println(dayCounter + " сут" + hourCounter + " час" + minuteCounter + " минут" + secondCounter + " секунд");
        } else if (weekCounter > 0 && numberOfSecond < week * 4 && numberOfSecond % 60 != 0) {
            System.out.println(weekCounter + " недел" + endingOfTheWordWeek + dayCounter + " сут" + endingOfTheWordDay +
                    hourCounter + " час" + endingOfTheWordHour + minuteCounter + " минут" + endingOfTheWordMinute + secondCounter + " секунд" + endingOfTheWordSecond);
        } else if (numberOfSecond % 60 == 0 && numberOfSecond > 59 && numberOfSecond < hour) {
            System.out.println(minuteCounter + " минут" + endingOfTheWordMinute);
        } else if (numberOfSecond < minute) {
            System.out.println(numberOfSecond + " секунд" + endingOfTheWordSecond);
        } else if (numberOfSecond % hour == 0 && numberOfSecond < day) {
            System.out.println(hourCounter + " час" + endingOfTheWordHour);
        } else if (numberOfSecond % day == 0 && numberOfSecond < week) {
            System.out.println(dayCounter + " сут" + endingOfTheWordDay);
        } else if (numberOfSecond % week == 0 && numberOfSecond < week * 4 + 1) {
            System.out.println(weekCounter + " недел" + endingOfTheWordWeek);
        } else {
            System.out.println("Выход за пределы месяца");
        }
    }

}