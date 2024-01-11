package validparentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "{}[]()";
        String s2 = "{}[]()";
        String s3 = "{[()]}()";
        String s4 = "{[()]}(";
        String s5 = "{[()]})";
        String s6 = "{[())}()";
        String s7 = "{{[()]}()";
        String s8 = "}{[()]}()";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
        System.out.println(isValid(s5));
        System.out.println(isValid(s6));
        System.out.println(isValid(s7));
        System.out.println(isValid(s8));
    }

    static public boolean isValid(String s) {
        char[] parentheses = s.toCharArray();
        Stack<Character> parStack = new Stack<>();
        for (char p : parentheses) {

            switch (p) {
                case '(':
                    parStack.push('(');
                    break;
                case '{':
                    parStack.push('{');
                    break;
                case '[':
                    parStack.push('[');
                    break;
                case '}':
                    if (parStack.isEmpty()) {
                        return false;
                    }
                    if (parStack.peek() == '{') {
                        parStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (parStack.isEmpty()) {
                        return false;
                    }
                    if (parStack.peek() == '[') {
                        parStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ')':
                    if (parStack.isEmpty()) {
                        return false;
                    }
                    if (parStack.peek() == '(') {
                        parStack.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        if (parStack.isEmpty()) {
            return true;
        }
        return false;
    }
}

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
