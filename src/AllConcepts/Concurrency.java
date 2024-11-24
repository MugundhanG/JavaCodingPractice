package AllConcepts;

import java.util.concurrent.Callable;

public class Concurrency implements Callable<String> {

    public String name;

    public Concurrency(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {

        try {
            System.out.println("Calling " + name);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("this will always run");
        }

        return name;

    }


}
