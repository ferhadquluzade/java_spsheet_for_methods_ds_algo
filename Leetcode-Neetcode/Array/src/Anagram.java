import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Anagram {
        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }

            int[] freq = new int[26];
            for (int i = 0; i < s.length(); i++) {
                System.out.println(freq[s.charAt(i)-'a']++);
//                System.out.println(freq[t.charAt(i) - 'a']--);
            }
            System.out.println(Arrays.toString(freq));
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] != 0) {
                    return false;
                }
            }

            return true;
    }
}
