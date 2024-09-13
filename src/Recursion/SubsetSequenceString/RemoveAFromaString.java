package Recursion.SubsetSequenceString;

public class RemoveAFromaString {
    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(removeA(str));

        String str1 = "I ate apple today";
        System.out.println(skipApple(str1));
        System.out.println(skipApple(str));
        System.out.println(str1);

        String app = "I created a application for apple";
        System.out.println(SkipAppNotApple(app));
        System.out.println(app);

    }

    public static String removeA(String str) {

        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);

        if(ch == 'a'){
            return removeA(str.substring(1));
        }
        else {
            return str.charAt(0)+removeA(str.substring(1));
        }
    }

    public static String skipApple(String str){
        if(str.length()<5){
            return str;
        }
        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        else{
            return str.charAt(0)+skipApple(str.substring(1));
        }
    }

    public static String SkipAppNotApple(String str){
        if(str.length()<3){
            return str;
        }
        if(str.startsWith("app") && ! str.startsWith("apple")){
            return SkipAppNotApple(str.substring(3));
        }
        else {
            return str.charAt(0)+SkipAppNotApple(str.substring(1));
        }
    }
}
