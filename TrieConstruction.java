import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfPattern;

    public TrieNode() {
        this.children = new HashMap<>();
        this.isEndOfPattern = false;
    }
}

public class TrieConstruction {
    static int nodeCount = 1; // Used for labeling nodes

    public static void buildTrie(String[] patterns) {
        TrieNode root = new TrieNode();

        for (String pattern : patterns) {
            TrieNode currentNode = root;

            for (char symbol : pattern.toCharArray()) {
                if (!currentNode.children.containsKey(symbol)) {
                    currentNode.children.put(symbol, new TrieNode());
                    System.out.println((nodeCount - 1) + "->" + nodeCount + ":" + symbol);
                    nodeCount++;
                }

                currentNode = currentNode.children.get(symbol);
            }

            currentNode.isEndOfPattern = true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] patterns = new String[n];
        for (int i = 0; i < n; i++) {
            patterns[i] = scanner.nextLine();
        }

        // Build Trie and output adjacency list
        buildTrie(patterns);

        scanner.close();
    }
}
