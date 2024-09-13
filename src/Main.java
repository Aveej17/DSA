import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int [] pushed = {1,2,3,4,5,6,7};
        int [] popped = {1,2,5,3,6,7,4};
        System.out.println(validateStackSequences(pushed, popped, 0, 0, new Stack<Integer>()));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped, int pushCounter, int popCounter, Stack<Integer> s) {
        if(s.isEmpty() && pushCounter==popped.length){
            return true;
        }
        else if(!s.isEmpty() && pushCounter==popped.length){
            return false;
        } else if (s.isEmpty() && popCounter==popped.length) {
            return true;
        }
        else if(!s.isEmpty() && pushCounter==popped.length-1 && popCounter == popped.length-1){
            return false;

        }
        s.push(pushed[pushCounter++]);

        while(s.peek() != popped[popCounter] && pushCounter<popped.length){
            s.push(pushed[pushCounter]);
            pushCounter++;

        }
        while(!s.isEmpty() && popCounter<popped.length && s.peek() == popped[popCounter]){
            s.pop();
            popCounter+=1;
        }

        return validateStackSequences(pushed, popped, pushCounter, popCounter, s);
    }
}