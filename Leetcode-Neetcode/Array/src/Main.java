
public class Main {
    public static void main(String[] args) {
        Solution solution  = new Solution();
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(5);

        System.out.println(solution.mergeTwoLists(head1, head2).val);

    }
}