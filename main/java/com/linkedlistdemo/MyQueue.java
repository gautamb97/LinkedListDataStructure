package com.linkedlistdemo;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue(){
        this.myLinkedList = new MyLinkedList();
    }
    public void enqueue(MyNode myNode) {
        this.myLinkedList.append(myNode);
    }

    public void printQueue() {
        this.myLinkedList.printMyNodes();
    }

    public INode getHead() {
        return this.myLinkedList.head;
    }

    public INode getTail() {
        return this.myLinkedList.tail;
    }
    public INode dequeue() {
        return myLinkedList.pop();
    }
}
