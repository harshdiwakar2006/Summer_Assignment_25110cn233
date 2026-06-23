public class Question_1 {
    int[] freq = new int[26];

    for (char ch : str.toCharArray()) {
        freq[ch - 'a']++;
    }

    for (char ch : str.toCharArray()) {
        if (freq[ch - 'a'] == 1) {
            return ch;
        }
    }

    return '\0';
}
