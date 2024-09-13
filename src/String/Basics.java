package String;

import java.util.Random;

public class Basics {
    public static void main(String[] args) {


        // Constructor 1
//        StringBuffer sb = new StringBuffer();
//        sb.append("Jeeva");
//
//        sb.append(7);
//        sb.append('k');
//        sb.append(new char[]{'k', 'k', 'l'});
//        sb.insert(4, 4);

//        String str = sb.toString();
//        System.out.println(str);

//        String sentence = "hi     i am Jeeva  how are you?";
//        System.out.println(sentence);
//        System.out.println(sentence.replaceAll("\\s\\s", ""));
//        System.out.println(sentence);
//
//        Random r = new Random();
//        System.out.println(r.nextFloat());
//        Basics basics = new Basics();
//        String s = basics.generate(23);
//        System.out.println(s);

//        System.out.println(findLength(sentence));


//        System.out.println(2|1);
        System.out.println(10^2);
        System.out.println(8^10);
    }



    private static int findLength(String s){
        int i = 0;
        while(s.charAt(i)!='\0'){
            i++;
        }
        return i;
    }
    public String generate(int size){

        StringBuffer k = new StringBuffer(size);
        Random random = new Random();
        for (int i = 0; i< size; i++){

            k.append((char) (97+random.nextFloat()*26));
        }
        return k.toString();

    }
}
