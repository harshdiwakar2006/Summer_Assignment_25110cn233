public class Question_3 {
     public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            for (int i = 1; i <= (ch - 'A' + 1); i++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}