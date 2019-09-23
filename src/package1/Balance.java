package package1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Balance {
    public static boolean isBalanced(String str){
        Deque<Character> myStack = new LinkedList<>();
        boolean balanced = true;
        int i = 0;

        while(balanced && i<str.length()){
            char ch = str.charAt(i);
            if (isOpenBracket(ch)){
                myStack.push(ch);
            }
            else if (isCloseBracket(ch)){
                if(myStack.isEmpty()){
                    balanced = false;
                }
                else{
                    char topChar = myStack.pop();
                    if (!areMatches(topChar, ch)){
                        balanced = false;
                    }
                }
            }
            i++;
        }
        if (balanced && myStack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    private static boolean isOpenBracket(char ch){
        if(ch == '(' || ch == '<' || ch == '[' ||ch == '{'){
            return true;
        }
        return false;
    }

    private static boolean isCloseBracket(char ch){
        if(ch == ')' || ch == '>' || ch == ']' ||ch == '}'){
            return true;
        }
        return false;
    }

    private static boolean areMatches(char ch1, char ch2){
        if (    (ch1 == '(' && ch2 == ')') ||
                (ch1 == '{' && ch2 == '}') ||
                (ch1 == '[' && ch2 == ']') ||
                (ch1 == '<' && ch2 == '>')
        ){
            return true;
        }
        return false;
    }
}
