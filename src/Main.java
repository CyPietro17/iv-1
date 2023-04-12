import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        RandomSort randomSort = new RandomSort();

        int[] array = IntStream.generate(() -> new Random().nextInt(100)).limit(10).toArray();

        for(int number : array){
            System.out.print(number + " ");
        }
        System.out.println();

        int couter = randomSort.sort(array);



        for(int number : array){
            System.out.print(number + " ");
        }
        System.out.println("\nArray shoffule time " + couter);
    }
}