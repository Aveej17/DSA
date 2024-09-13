package DP;

public class LCSLENGTH {
    static int[][] memo = new int[100][100];

    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "cut";
        System.out.println(recursive(s1, s2, 0, 0));

        for(int i = 0; i<s1.length()+1; i++){
            for(int j = 0; j<s2.length()+1; j++){
                memo[i][j] = -1;
            }
        }
        System.out.println(memoMethod(s1, s2, 0, 0));

        int[][] table = new int [s1.length()+1][s2.length()+1];
        int k = tabulation(s1, s2, table);

        System.out.println(k);

//        below is edit distance

        if(s1.length()==s2.length()) {
            System.out.println(s1.length()-k);
        } else if (s1.length()>s2.length()) {
            System.out.println(s1.length()-k);

        } else {
            System.out.println(s2.length()-k);
        }


    }

    private static int recursive(String s1, String s2, int m, int n){

        if(m == s1.length() || n == s2.length()){
            return 0;
        }
        if(s1.charAt(m)==s2.charAt(n)){
            return 1+recursive(s1, s2, m+1, n+1);
        }
        else {
            return Math.max(recursive(s1, s2, m + 1, n), recursive(s1, s2, m, n + 1));
        }
    }

    private static int memoMethod(String s1, String s2, int m, int n) {
        if(memo[m][n] != -1){
            return memo[m][n];
        }
        if(m==s1.length()|| n==s2.length()){
            memo[m][n] = 0;
        }
        else{
            if(s1.charAt(m)==s2.charAt(n)){
                memo[m][n] = 1 + memoMethod(s1, s2, m+1, n+1);
            }
            else{
                memo[m][n] = Math.max(memoMethod(s1, s2, m+1, n), memoMethod(s1, s2, m, n+1));
            }
        }
        return memo[m][n];
    }

    private static int tabulation(String s1, String s2, int [][] table){
        for(int i = 1; i<s1.length()+1; i++){
            for(int j = 1; j<s2.length()+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    table[i][j] = 1+(table[i-1][j-1]);
                }
                else{
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
                }
            }
        }
        return table[s1.length()][s2.length()];
    }
}
