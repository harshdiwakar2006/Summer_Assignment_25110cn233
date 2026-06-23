public class Question_4 {
    public static void main(String[] args) {
        String str = "programming";

        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char maxChar = str.charAt(0);
        int maxCount = freq[maxChar];

        // Find character with maximum frequency
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
    }
}
