/*


39 / 39 test cases passed.
Status: Accepted
Runtime: 3 ms
Memory Usage: 42.3 MB

Complexity : O(N)
Difficulty: Easy


Name:  Baseball Game
Link: https://leetcode.com/problems/baseball-game/description/

*/



class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);    
                stack.push(newTop);
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}
