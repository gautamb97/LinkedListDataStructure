package com.linkedlistdemo;

public class MyStack {
    private final MyLinkedList myLinkedList ;

    public MyStack(){
        this.myLinkedList = new MyLinkedList();
    }
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.pop();
    }
    public boolean isEmpty() {
        if(this.myLinkedList.head == null){
            return true;
        }
        else{
            return false;
        }
    }
}
