import java.util.Arrays;
import static java.lang.System.out;

public abstract class ArrayUtils {

    public static Client[] sortArray(Client[] clients){
        Arrays.sort(clients);
        return clients;
    }

    public static void printArray(Client[] clients) {
        out.println(Arrays.toString(clients));
    }


    public static void deleteDuplicatesFromArray(Client[] clients) {
        System.out.println("Это недоделанный метод deleteDuplicatesFromArray из ArrayUtils");
       /* Client [] newArr = new Client[clients.length + 1];
        for(int i=0; i<clients.length-1; i++) {
            for (int j = i + 1; j < clients.length; j++) {
                if (clients[i] != clients[j]) {
                    newArr[i] = clients[i];
                }
            }
        }*/
        // Arrays.stream(clients).distinct();
        //return clients;
    }


}
