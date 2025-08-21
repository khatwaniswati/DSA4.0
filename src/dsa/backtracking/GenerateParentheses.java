package dsa.backtracking;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        generateParentheses(n, "", 0, 0, 0);
    }

    static void generateParentheses(int n, String cur, int i, int open, int close) {
        if(i == 2*n) {
            System.out.println(cur);
            return;
        }
        if(open < n) {
            generateParentheses(n, cur+'(', i+1, open+1, close);
        }

        if(close < open) {
            generateParentheses(n, cur+ ')', i+1, open, close+1);
        }
    }

}