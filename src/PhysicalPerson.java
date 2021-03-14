import static java.lang.System.lineSeparator;
import static java.lang.System.out;

public class PhysicalPerson extends Client {



    enum Gender {MALE, FEMALE}
    Gender gender;

    public PhysicalPerson(String fio, int age, Gender gender) {
        super(fio, age);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
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
    public Client[] filterArrayByGender(Client[] clients, boolean isWoman) {
        Gender g = isWoman ? PhysicalPerson.Gender.FEMALE : Gender.MALE;
      //  out.println(g.toString());
        Client[] newArr = new Client[clients.length];
        int j=0;
        for (int i = 0; i < clients.length; i++) {
            // как вытащить значение гендера из клиента
            if (this.gender == g ) {
                newArr[j] = clients[i];
                j++;
            }
            //continue;
        }
        Client[] resultArr = new Client[j];
        System.arraycopy(newArr,0,resultArr,0,j);
        return resultArr;
    }

    /**
     * old realisations
     * doesn't use
     * @param c
     * @return
     */
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
    //        System.out.println(c[i].toString());
    //    }


        //public void printResult(PhysicalPerson[] array) {
        //    System.out.println(Arrays.toString(array));
        //}

    }
//}



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

