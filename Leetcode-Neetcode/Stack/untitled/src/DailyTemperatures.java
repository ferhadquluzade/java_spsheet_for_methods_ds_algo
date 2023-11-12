import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class DailyTemperatures {
        public int[] dailyTemperatures(int[] temp) {
            ArrayList<Integer> al = new ArrayList<>();
            Stack<Integer> s = new Stack<>();
            al.add(0);
            int n = temp.length;
            s.push(n - 1);

            for (int i = n - 2; i >= 0; i--) {
                while (!s.isEmpty() && temp[i] >= temp[s.peek()]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    al.add(0);
                } else {
                    al.add(s.peek() - i);
                }
                s.push(i);
            }

            Collections.reverse(al);
            return al.stream().mapToInt(Integer::intValue).toArray();
            }
}
