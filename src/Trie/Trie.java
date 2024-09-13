package Trie;

public class Trie {
    private final Node root;

    public Trie(){
        root = new Node();
    }

    public void insertWord(String s){
        Node temp = root;
        for(int i = 0; i<s.length(); i++){
            if(!temp.isContainsKey(s.charAt(i))){
                temp.put(s.charAt(i), new Node());
            }
            temp = temp.getNode(s.charAt(i));
        }

        temp.setEnd();
    }

    private boolean searchWord(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.isContainsKey(word.charAt(i))) {
                return false;
            }
            node = node.getNode(word.charAt(i));
        }
        return node.isEnd();
    }

    public void search(String word){
        if(searchWord(word)){
            System.out.println("The given word is existing in the trie");
        }
        else{
            System.out.println("The Word is not exist in trie");
        }
    }

    private boolean starts(String word){
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.isContainsKey(word.charAt(i))) {
                return false;
            }
            node = node.getNode(word.charAt(i));
        }
        return true;
    }

    public  void startsWith(String word){
        if(starts(word)){
            System.out.println("We have a word starts with "+word);
        }
        else{
            System.out.println("We don't have a word starts with "+word);
        }
    }
    private static class Node {
       Node []  links = new Node[26];
        boolean flag = false;

        private boolean isContainsKey(char s){
            return links[s-'a']!=null;
        }

        private Node getNode(char s){
            return links[s-'a'];
        }

        private void put(char s, Node node){
            links[s-'a'] = node;
        }

        private boolean isEnd(){
            return this.flag;
        }

        private void setEnd(){
            this.flag = true;
        }

    }

}
