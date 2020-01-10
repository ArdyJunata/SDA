package LatihanTree;

public class TrieTest {
    public static void main(String[] args) {
        String keys[] = {"ada", "apa", "bina", "buku", "budi", "tapi", "tidak", "tidur"};
        
        Trie trie = new Trie();
        
        for (int j = 0; j < keys.length; j++)
            trie.insert(keys[j]);
        if (trie.search("asu") == true)
            System.out.println("ada");
        else System.out.println("tidak ada");
        
    }
}
