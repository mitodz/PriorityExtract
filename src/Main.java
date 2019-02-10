import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        Scanner scanner= new Scanner(System.in).useDelimiter("\\W");
        int n = scanner.nextInt(); // число операций с очередью
        while (scanner.hasNext()) {
            if (scanner.next().equalsIgnoreCase("Insert")) {
                q.add(scanner.nextInt());
            } else {
                System.out.println(q.poll());
            }
        }
    }
}
