import java.util.Arrays;

public class Question_3 {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Amit", "Priya", "Neha", "Karan"};

        Arrays.sort(names);

        System.out.println("Names in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
