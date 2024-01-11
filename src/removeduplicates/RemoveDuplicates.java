package removeduplicates;

import java.util.Comparator;
import java.util.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    static public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        if (currentNode != null) {
            while (currentNode.next != null) {
                if (currentNode.next.val == currentNode.val) {
                    currentNode.next = currentNode.next.next;
                } else{
                    currentNode = currentNode.next;
                }
            }
        }
        return head;
    }
}
