public class RemoveStars {

    public String removeStars(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                if (i == 0) {
                    str.deleteCharAt(0);
                } else {
                    str.deleteCharAt(i-1);
                    i--; // account for shifting of characters after deletion
                    if (i < str.length() && str.charAt(i) == '*') {
                        str.deleteCharAt(i);
                    }
                }
            }
        }
        return str.toString();
    }

}
