package Trie;

public class Main {
    public static void main(String[] args) {
        Trie myTrie = new Trie();

        myTrie.insertWord("apple");
        myTrie.search("apple");
        myTrie.startsWith("appl");
        myTrie.insertWord("harshitha");
        myTrie.startsWith("hari");
        myTrie.search("hari");
    }
}
