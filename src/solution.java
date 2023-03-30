import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                chars.add(c);
            }
        }
        int begin = 0;
        int end = chars.size() - 1;
        while (begin <= end) {
            if (!chars.get(begin).equals(chars.get(end))) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}