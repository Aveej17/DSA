package Arrays.Searching;



public class SearchInString {
    public static void main(String[] args) {
        String s = "Jeeva";
        char target = 'J';

        System.out.println(search(s, target));
    }

    public static boolean search(String str, char target) {
        if(str.length() == 0){
            return false;
        }
        for(char chr :str.toCharArray()){
            if(target == chr){
                return true;
            }
        }
        return false;

    }
}
