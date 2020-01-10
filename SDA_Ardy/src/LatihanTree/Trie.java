package LatihanTree;

public class Trie {

    static final int ALPHABET_SIZE = 26;

    static class TrieNode {

        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                children[i] = null;
            }
        }
    };

    TrieNode root;

    public Trie() {
        root = new TrieNode();

    }

    public void insert(String key) {
        int index;
        int length = key.length();
        int level;

        TrieNode insert = root;

        for (int i = 0; i < length; i++) {
            index = key.charAt(i) - 'a';
            if (insert.children[index] == null) {
                insert.children[index] = new TrieNode();
            }
            insert = insert.children[index];
        }
        insert.isEndOfWord = true;
    }

    public boolean search(String key) {
        int level;
        int length = key.length();
        int index;
        TrieNode search = root;

        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';

            if (search.children[index] == null) {
                return false;
            }

            search = search.children[index];
        }

        return (search != null && search.isEndOfWord);
    }
}
