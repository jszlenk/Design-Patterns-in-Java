package BehavioralDesignPatterns.Iterator.TreeTraversal;

public class Node<T> {

    public T value;
    Node<T> left, right, parent;

    Node(T value) {
        this.value = value;
    }

    Node(T value, Node<T> left, Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;

        left.parent = right.parent = this;
    }
}