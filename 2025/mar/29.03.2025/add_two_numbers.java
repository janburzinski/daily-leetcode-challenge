import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder numsFromFrontS1 = new StringBuilder();
        StringBuilder numsFromFrontS2 = new StringBuilder();

        // extract the numbers

        ListNode currFirst = l1;

        while (currFirst != null) {
            numsFromFrontS1.append(currFirst.val);
            currFirst = currFirst.next;
        }

        ListNode currSecond = l2;

        while (currSecond != null) {
            numsFromFrontS2.append(currSecond.val);
            currSecond = currSecond.next;
        }
        
        // read the num from behind
        numsFromFrontS1.reverse();
        numsFromFrontS2.reverse();

        // to int
        BigInteger o1 = new BigInteger(numsFromFrontS1.toString());
        BigInteger o2 = new BigInteger(numsFromFrontS2.toString());
        BigInteger sol = o1.add(o2);
        StringBuilder geilo = new StringBuilder();
        geilo.append(String.valueOf(sol));
        geilo.reverse();

        // add numbers into ListNode
        ListNode solution = new ListNode();
        solution.val = Character.getNumericValue(geilo.charAt(0));
        solution.next = null;

        ListNode curr = solution;

        for (int i = 1; i < geilo.length(); i++) {
            ListNode newLNode = new ListNode();
            newLNode.val = Character.getNumericValue(geilo.charAt(i));
            newLNode.next = null;

            curr.next = newLNode;
            curr = newLNode;
        }

        return solution;
    }
}