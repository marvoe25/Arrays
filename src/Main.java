public class Main {
    public static void main(String[] args) {

        PhysicalPerson[] ppArr = {
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
        //PhysicalPerson.printResult(ppArr);
        ArrayUtils.printArray(ppArr);
        System.out.println(System.lineSeparator() + "Отсортированный по возрасту массив клиентов:");
        ArrayUtils.sortArray(ppArr);
        ArrayUtils.printArray(ppArr);
        System.out.println(System.lineSeparator() + "Массив после удаления дубликатов:");
        ArrayUtils.deleteDuplicatesFromArray(ppArr);
        ArrayUtils.printArray(ppArr);
        System.out.println(System.lineSeparator() + "Массив клиентов женского пола:");
        ArrayUtils.printArray(PhysicalPerson.filterArrayByGender(ppArr,true));
    }
}

