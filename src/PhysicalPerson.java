import java.util.Arrays;
import static java.lang.System.*;

public class PhysicalPerson extends Client {

    public enum Gender {MALE, FEMALE}
    Gender gender;

    PhysicalPerson(String fio, int age, Gender gender) {
        super(fio, age);
        this.gender = gender;
    }


    @Override
    public int compareTo(Client c) {
        if (super.getAge() > c.age) {
            return 1;
        } else if (super.getAge() == c.age) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return lineSeparator() + "FIO: " + super.fio + ", Age: " + super.age + ",  Gender:" + gender;
    }

    @Override
    public int sortByParameter(Client c) {
        return 0;
    }

    @Override
    public void deleteDuplicate(Client c) {
    }

  @Override
    public void printResult() {
        out.println(this.toString());
    }

    //public void printResult(Client[] c) {
    //    for (int i = 0; i < c.length; i++) {
    //            System.out.println(c[i].toString());
    //        }
        //out.println(this.toString());

    //public void printResult(PhysicalPerson[] array) {
    //    System.out.println(Arrays.toString(array));
    //}

}



  /*  @Override
    public Client[] deleteDuplicate(Client c) {
        return new Client[0];
    }*/

 /*     public static PhysicalPerson[] getNewArr(PhysicalPerson[] oldArr) {
        PhysicalPerson[] newArr = new PhysicalPerson[oldArr.length + 1];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return  newArr;
    }

        public  PhysicalPerson[] deleteDuplicate(PhysicalPerson[] oldArr) {
        PhysicalPerson[] resultArr = new PhysicalPerson[oldArr.length];
        resultArr[0] = oldArr[0];
        int resultIndex = 1;
        for (int i = 1; i < oldArr.length; i++) {
            if (!resultArr[i].equals(oldArr[i])) {
                resultArr = getNewArr(resultArr);
                resultArr[resultIndex++] = oldArr[i];
            }
        }
        return resultArr;
    }*/

    /*    char gender;
    public PhysicalPerson(String fio, int age, char gender){
        super(fio, age);
        this.gender = gender;
    }
*/

