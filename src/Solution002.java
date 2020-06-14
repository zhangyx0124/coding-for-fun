public class Solution002 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ini = new ListNode(0);
            ListNode res = ini;
            int carry = 0;
            while(l1!=null || l2!=null) {
                int a = (l1!=null)?l1.val:0;
                int b = (l2!=null)?l2.val:0;
                res.next = new ListNode((a+b+carry)%10);
                carry = (a+b+carry)/10;
                res = res.next;
                l1 = (l1!=null)?l1.next:l1;
                l2 = (l2!=null)?l2.next:l2;
            }
            if (carry == 1)
                res.next = new ListNode(carry);
            return ini.next;
        }
    }
}
