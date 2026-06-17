import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }

        System.out.println("Common Elements:");
        for (int num : common) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
