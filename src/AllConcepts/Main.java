package AllConcepts;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

         OOP me2 = new OOP(28, "Mugi");
         OOP2 me = new OOP2(1996, 28, "Mugi");

        me.name = "Mugundhan";
        me.setAge(25);

        me2.displayDetails();

        me.setAge(25);

        me.displayall();


        ExecutorService exe = Executors.newSingleThreadExecutor();

        Callable<String> callable = new Concurrency("Mugundhan");

        Future<String> future = exe.submit(callable);

        System.out.println("Future result: " + future);

        exe.shutdown();

        //Write code to return the sum of square of even elements in a List using Streams API
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> sq = numbers.
                stream().
                filter(n -> n % 2 == 0).
                sorted().
                distinct().
                collect(Collectors.toList());

        System.out.println(sq);

        //Comparator and Comparable

        System.out.println("Comparator and Comparable:");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mugundhan", 30));
        studentList.add(new Student("Mugi", 25));
        studentList.add(new Student("Krishnan", 27));

        System.out.println("Before sorting using Comparable:" + studentList);

        Collections.sort(studentList);

        System.out.println("After sorting using Comparable:" + studentList);

        System.out.println("Before sorting using Comparator by Name:" + studentList);

        Collections.sort(studentList, Comparator.comparing(Student::getName));

        System.out.println("After sorting using Comparator by Name:" + studentList);

        System.out.println("Before sorting using Comparator by Age:" + studentList);

        Collections.sort(studentList, (a1, a2) -> a1.getAge() - a2.getAge());

        System.out.println("After sorting using Comparator by Age:" + studentList);
    }
}
