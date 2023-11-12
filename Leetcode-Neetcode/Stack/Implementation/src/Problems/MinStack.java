package Problems;

import java.util.ArrayList;
import java.util.PriorityQueue;

class MinStack {

    ArrayList<Integer> list;
    PriorityQueue<Integer> pqueue;

    public MinStack() {
        list = new ArrayList<>();
        pqueue = new PriorityQueue<>();
    }

    public void push(int val) {
        list.add(val);
        pqueue.add(val);
    }

    public void pop() {
        int lastIndex = list.size() - 1;
        int lastElem = list.remove(lastIndex);
        pqueue.remove(lastElem);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
       return pqueue.peek();
    }
}