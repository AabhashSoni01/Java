
/* 3) Huffman Coding */
import java.util.PriorityQueue;

class Huffman {
    static class Node implements Comparable<Node> {
        char ch;
        int freq;
        Node left, right;

        Node(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }

        public int compareTo(Node o) {
            return this.freq - o.freq;
        }
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] freq = { 5, 9, 12, 13, 16, 45 };
        buildHuffman(chars, freq);
    }

    static void printCodes(Node root, String s) {
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + ":" + s);
            return;
        }
        printCodes(root.left, s + "0");
        printCodes(root.right, s + "1");
    }

    static void buildHuffman(char[] chars, int[] freq) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int i = 0; i < chars.length; i++)
            pq.add(new Node(chars[i], freq[i]));
        while (pq.size() > 1) {
            Node x = pq.poll();
            Node y = pq.poll();
            Node z = new Node('\0', x.freq + y.freq);
            z.left = x;
            z.right = y;
            pq.add(z);
        }
        System.out.println("Huffman Codes:");
        printCodes(pq.peek(), "");
    }
}
