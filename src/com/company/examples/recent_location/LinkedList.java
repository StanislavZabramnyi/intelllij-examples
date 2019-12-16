package com.company.examples.recent_location;

import java.util.Objects;
import java.util.stream.Stream;

//ToDo: show test creation and moving to tests here
public class LinkedList<T> {

    final static class Node<T> {

        private T element;

        private Node<T> next;

        private Node(T element) {
            this.element = element;
        }

        static <T> Node<T> valueOf(T element) {
            return new Node<>(element);
        }
    }

    private Node<T> head;

    private int size;

    public static <T> LinkedList<T> of(T... elements) {
        LinkedList<T> list = new LinkedList<>();
        Stream.of(elements).forEach(list::add);
        return list;
    }

    public void add(T element) {
        add(size, element);
    }

    public void set(int index, T element) {
        Node<T> node = findNodeByIndex(index);
        node.element = element;
    }

    public T get(int index) {
        Node<T> node = findNodeByIndex(index);
        return node.element;
    }

    private Node<T> findNodeByIndex(int index) {
        Objects.checkIndex(index, size);
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void remove(int index) {
        if (index == 0) {
            Objects.checkIndex(index, size);
            head = head.next;
        } else {
            Node<T> previousNode = findNodeByIndex(index - 1);
            previousNode.next = previousNode.next.next;
        }
        size--;
    }

    public void add(int index, T element) {
        Node<T> newNode = Node.valueOf(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> node = findNodeByIndex(index - 1);
            newNode.next = node.next;
            node.next = newNode;
        }
        size++;
    }
    public boolean contains(T element) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.element.equals(element)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }
}
