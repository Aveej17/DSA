package karpRabin;

public class KarpRabinAlgo {

    public static void main(String[] args) {
        String pattern = "LALITHA";
        String text = "Lorem Ipsum is simply dummy text of LALITHA the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown LALITHA printer took a galley of type and scrambled it to make a type specimen book. It has LALITHA survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        KarpRabinAlgo kr = new KarpRabinAlgo();
        kr.Search(text, pattern);
    }
    private final int PRIME = 101;
    private long calculateHash(String str){
        long hash = 0;
        for(int i = 0; i<str.length(); i++){
            hash = (long) (hash + str.charAt(i) * Math.pow(PRIME, i));
        }
        return hash;
    }

    private long updateHash(long preHash, char oldChar, char newChar, int patternLength){
        long newHash = (preHash - oldChar)/ PRIME;
        newHash = (long) (newHash + newChar * Math.pow(PRIME, patternLength-1));
        return newHash;
    }

    public void  Search(String text, String pattern){
        int patternLength = pattern.length();
        long patternHash = calculateHash(pattern);
        int Count = 0;
//        System.out.println(patternHash+"Hash");
        long textHash = calculateHash(text.substring(0, patternLength));

        for(int i = 0; i<=text.length() - patternLength; i++){
            if(textHash == patternHash){
                if (text.substring(i, i+patternLength).equals(pattern)){
                    System.out.println("Pattern Found at index "+ i);
                    Count++;
                }
            }
            if(i<text.length() - patternLength){
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i+patternLength),  patternLength);
            }
        }

        System.out.println(Count);

    }
}
