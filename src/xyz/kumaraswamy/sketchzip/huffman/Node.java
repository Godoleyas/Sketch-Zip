package xyz.kumaraswamy.sketchzip.huffman;

public class Node implements Comparable<Node> {

    public final Node left;
    public final Node right;

    private final int freq;

    public Node(int freq) {
      this.freq = freq;
      left = null;
      right = null;
    }

    public Node(Node left, Node right) {
      this.left = left;
      this.right = right;
      freq = left == null || right == null ? 0 : left.freq + right.freq;
    }

    @Override
    public int compareTo(Node another) {
      return Integer.compare(freq, another.freq);
    }

    @Override
    public String toString() {
      return "Node{" +
              "freq=" + freq +
              ", leftNode=" + left +
              ", rightNode=" + right +
              '}';
    }
  }