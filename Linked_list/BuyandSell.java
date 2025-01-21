package Linked_list;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class Solution {
    public int maxProfit(ListNode head) {
        if (head == null || head.next == null) return 0;
        int buy = head.val;
        int maxProfit = 0;
        ListNode current = head.next;
        while (current != null) {
            if (current.val < buy) {
                buy = current.val;
            } else {
                int profit = current.val - buy;
                maxProfit = Math.max(maxProfit, profit);
            }
            current = current.next;
        }
        return maxProfit;
    }
}
public class BuyandSell {
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        ListNode head = createLinkedList(stockPrices);
        Solution solution = new Solution();
        int maxProfit = solution.maxProfit(head);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}

