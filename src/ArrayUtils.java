import java.util.Arrays;

public abstract class ArrayUtils {


    public  Client[] sortArray(Client[] clients){
        Arrays.sort(clients);
        return clients;
    };

    public abstract Client[] filterArrayByGender(Client[] clients, boolean isWoman);

    public Client[] deleteDuplicatesFromArray(Client[] clients) {
        System.out.println("Это недоделанный метод deleteDuplicatesFromArray из ArrayUtils");
        return clients;
    }

    public void printArray(Client[] clients) {
        System.out.println(Arrays.toString(clients));
    }


}
