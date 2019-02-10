import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        Scanner scanner= new Scanner("6\n" +
                                            "Insert 200\n" +
                                            "Insert 10\n" +
                                            "ExtractMax\n" +
                                            "Insert 5\n" +
                                            "Insert 500\n" +
                                            "ExtractMax").useDelimiter("\\W");
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
