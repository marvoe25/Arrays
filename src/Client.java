public abstract class Client extends ArrayUtils implements Comparable<Client> {

    String fio;
    int age;

    public Client(String fio, int age) {
        this.fio = fio;
        this.age = age;
    }

    public String getFIO() {
        return fio;
    }

    public void setFIO(String fio) {
        this.fio = fio;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract int compareTo(Client c);
    @Override
    public String toString() {
        return "Client{FIO: " + fio + ", Age: " + age + "};" + System.lineSeparator();
    }

   // public abstract int sortByParameter(Client c);
   // public abstract void deleteDuplicate(Client c);
   // public abstract void printResult();
}
