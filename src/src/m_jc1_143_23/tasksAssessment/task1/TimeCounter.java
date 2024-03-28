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
            endingOfTheWordHour = " час ";
        } else if (hourCounter == 2 || hourCounter == 3 || hourCounter == 4 || hourCounter == 22 || hourCounter == 23) {
            endingOfTheWordHour = " часa ";
        } else {
            endingOfTheWordHour = " часов ";
        }
        switch (minuteCounter) {
            case 1, 21, 31, 41, 51:
                endingOfTheWordMinute = " минутa ";
                break;
            case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                endingOfTheWordMinute = " минуты ";
                break;
            default:
                endingOfTheWordMinute = " минут ";
        }
        switch (secondCounter) {
            case 1, 21, 31, 41, 51:
                endingOfTheWordSecond = " секундa ";
                break;
            case 2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54:
                endingOfTheWordSecond = " секунды ";
                break;
            default:
                endingOfTheWordSecond = " секунд ";
        }
        String endingOfTheWordDay = dayCounter == 1 ? " cутки " : " суток ";
        String endingOfTheWordWeek = weekCounter == 1 ? " неделя " : " недели ";
        System.out.println("Количество секунд: " + numberOfSecond);
        if (weekCounter > 0) { // больше недели
            System.out.println(weekCounter + endingOfTheWordWeek + dayCounter  + endingOfTheWordDay +
                    hourCounter + endingOfTheWordHour + minuteCounter + endingOfTheWordMinute +
                    secondCounter +endingOfTheWordSecond);
        } else if (dayCounter > 0) { //больше суток, но меньше недели
            System.out.println(dayCounter +  endingOfTheWordDay + hourCounter + endingOfTheWordHour +
                    minuteCounter + endingOfTheWordMinute + secondCounter + endingOfTheWordSecond);
        } else if (hourCounter > 0) { //больше часа, но меньше суток
            if (numberOfSecond % hour == 0) {
                System.out.println(hourCounter + endingOfTheWordHour);
            } else if (numberOfSecond % minute == 0) {
                System.out.println(hourCounter + endingOfTheWordHour + minuteCounter + endingOfTheWordMinute);
            } else if (minuteCounter == 0) {
                System.out.println(hourCounter +  endingOfTheWordHour + secondCounter + endingOfTheWordSecond);
            } else {
                System.out.println(hourCounter +  endingOfTheWordHour + minuteCounter + endingOfTheWordMinute +
                        secondCounter + endingOfTheWordSecond);
            }
        } else if (minuteCounter > 0) { // больше минуты, но меньше часа
            if (numberOfSecond % minute == 0) {
                System.out.println(minuteCounter+ endingOfTheWordMinute);
            } else {
                System.out.println(minuteCounter +endingOfTheWordMinute + secondCounter +endingOfTheWordSecond);
            }
        } else { // меньше минутки
            System.out.println(secondCounter + endingOfTheWordSecond);
        }
    }
}