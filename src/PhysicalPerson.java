import static java.lang.System.lineSeparator;

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

    public static PhysicalPerson[] filterArrayByGender(PhysicalPerson[] pp, boolean isWoman) {
        //System.out.println("Это недоделанный метод filterArrayByGender из ArrayUtils");
        Gender g = isWoman ? PhysicalPerson.Gender.FEMALE : Gender.MALE;
        PhysicalPerson[] newArr = new PhysicalPerson[pp.length];
        int j=0;
        for (int i = 0; i < pp.length; i++) {
            if (pp[i].getGender() == g) {
                newArr[j] = pp[i];//
                j++;//
                // System.out.print(clients[i]);
            }}
        PhysicalPerson[] resultArr = new PhysicalPerson[j];//
        System.arraycopy(newArr,0,resultArr,0,j);//
        return resultArr;//
          //  return clients;
        }


    }




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

