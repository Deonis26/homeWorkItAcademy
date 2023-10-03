package m_jc1_143_23.testAssignments.test4;

//  В американской армии считается несчастливым число 13, а в японской — 4. Перед международными учениями штаб российской
//  армии решил исключить номера боевой техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы
//  не смущать иностранных коллег. Если в распоряжении армии имеется 100 тысяч единиц боевой техники. Каждая боевая машина имеет
//  номер от 00001 до 99999 Напишите программу, которая рассчитает количество номеров, исключенных из списка.
//  ⚠️ Нельзя использовать строки при решении данной задачи
public class CombatVehicles {
    public static void main(String[] args) {

        int combatVehicles = 0;
        for (int i = 1; i < 100000; i++) {
            int duplicateI = i;
            boolean equipmentCounter = false;
            while (duplicateI > 0) {
                if ((duplicateI % 10 == 4) || (duplicateI % 100 == 13)) {
                    equipmentCounter = true;
                    break;
                }
                duplicateI = duplicateI / 10;
            }
            if (equipmentCounter == true) {
                combatVehicles++;
            }
        }
        System.out.println("Нужно исключить " + combatVehicles + " едениц боевой техники");
    }
}
