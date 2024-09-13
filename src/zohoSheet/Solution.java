package zohoSheet;

class Solution {
    public static String convertToTitle(int columnNumber) {

        System.out.println(701/26);
        System.out.println(701%26);
        String ans = "";
//        if(columnNumber<=26){
//            ans+= (char) (columnNumber+65);
//            return ans;
//        }

        while(columnNumber > 0){
            ans = (char)(columnNumber%26+64)+ans;
            columnNumber  = columnNumber/26;
            if(columnNumber>0 && columnNumber<=26){
                System.out.println(columnNumber);
                ans =(char)(columnNumber+64)+ans;
                break;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}