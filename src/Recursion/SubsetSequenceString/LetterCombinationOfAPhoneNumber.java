package Recursion.SubsetSequenceString;

import java.util.ArrayList;

public class LetterCombinationOfAPhoneNumber {

    public static void main(String[] args) {
        LetterCombinationOfAPhoneNumber l = new LetterCombinationOfAPhoneNumber();
//        l.keyPad("", "12");
//        System.out.println(l.keypad1("", "12", new ArrayList<String>()));
        System.out.println(l.keypad2("", "12"));


    }

    public void keyPad(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        int digit = up.charAt(0) - '0' ; // "2" becomes 2;

        for(int i = (digit-1) * 3; i<digit*3; i++){
            char ch = (char) ('a'+i);
            keyPad(p+ch, up.substring(1));
        }
    }

    public ArrayList<String>  keypad1(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';

        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char) ('a'+i);
            keypad1(p+ch, up.substring(1), list);
        }
        return list;
    }

    public ArrayList<String> keypad2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        int digit = up.charAt(0) -'0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i = (digit-1)*3; i <digit*3; i++){
            char ch = (char)('a'+i);
            ans.addAll(keypad2(p+ch, up.substring(1)));
        }
        return ans;
    }
}
