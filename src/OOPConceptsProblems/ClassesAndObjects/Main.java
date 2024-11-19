package OOPConceptsProblems.ClassesAndObjects;
import java.util.stream.IntStream;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        // Display the number of available processors (cores)
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available Cores: " + cores); // Output number of cores on the system
    }
}
