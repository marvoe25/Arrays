import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Client[] ppArr = {
                new PhysicalPerson("Test Ian Bill", 12, PhysicalPerson.Gender.MALE ),
                new PhysicalPerson("Te Anna Ivanovna", 25, PhysicalPerson.Gender.FEMALE),
                new PhysicalPerson("Brig Inna Kimovna", 35, PhysicalPerson.Gender.FEMALE),
                new PhysicalPerson("Shtab Stepanida Petrovna", 27, PhysicalPerson.Gender.FEMALE),
                new PhysicalPerson("Pelevin Denis Mantovich", 19, PhysicalPerson.Gender.MALE),
                new PhysicalPerson("Space Kim Denisovich", 32, PhysicalPerson.Gender.MALE),
                new PhysicalPerson("Zamyatina Inga Ianovna", 70, PhysicalPerson.Gender.FEMALE),
                new PhysicalPerson("Space Buran Denisovich", 22, PhysicalPerson.Gender.MALE),
                new PhysicalPerson("Akimova Julia Dmitrievna", 55, PhysicalPerson.Gender.FEMALE),
                new PhysicalPerson("Brig Inna Kimovna", 35, PhysicalPerson.Gender.FEMALE),
                new PhysicalPerson("Shtab Stepanida Petrovna", 27, PhysicalPerson.Gender.FEMALE),
                new PhysicalPerson("Pelevin Denis Mantovich", 19, PhysicalPerson.Gender.MALE),
                new PhysicalPerson("Space Kim Denisovich", 32, PhysicalPerson.Gender.MALE),
                new PhysicalPerson("Zamyatina Inga Ianovna", 70, PhysicalPerson.Gender.FEMALE),
                new PhysicalPerson("Space Buran Denisovich", 22, PhysicalPerson.Gender.MALE),
                new PhysicalPerson("Akimova Julia Dmitrievna", 55, PhysicalPerson.Gender.FEMALE),
                new PhysicalPerson("Suvorov Sergey Danilovich", 42, PhysicalPerson.Gender.MALE)};

        System.out.println(System.lineSeparator() + "Первоначальный массив клиентов:");
        System.out.println(Arrays.toString(ppArr));
        // Как вызвать метод printArray из ArrayUtils?
        //ArrayUtils.
        //ppArr.
        //printArray
        System.out.println(System.lineSeparator() + "Отсортированный по возрасту массив клиентов:");
        Arrays.sort(ppArr);
        System.out.println(Arrays.toString(ppArr));
        System.out.println(System.lineSeparator() + "Массив после удаления дубликатов:");
        /*Client [] newArr = new Client[ppArr.length + 1];
        for(int i=0; i<ppArr.length-1; i++) {
            for (int j = i + 1; j < ppArr.length; j++) {
                if (ppArr[i] != ppArr[j]) {
                    newArr[i] = ppArr[i];
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
         Arrays.stream(ppArr).distinct();
         */


        System.out.println(System.lineSeparator() + "Массив клиентов женского пола:");
       /* for (int i = 0; i < ppArr.length; i++) {
            if (ppArr[i].getGender() == PhysicalPerson.Gender.FEMALE) {
                System.out.print(ppArr[i]);
            }
        }
*/
        // Почему так получается вызвать?
        ppArr[0].filterArrayByGender(ppArr, true);
        ppArr[0].printArray(ppArr);


        System.out.println(System.lineSeparator() + "Проверка метода печати");
        ppArr[0].printResult();
        //ppArr.printResult();
        //printResult(ppArr);
        //не понимаю, почему не получается вызвать метод для массива
        //вернее, как его реализовать, чтобы он вызвался

        //printResult(Arrays.toString(ppArr));
        //System.out.println(Arrays.toString(ppArr));
    }
}

