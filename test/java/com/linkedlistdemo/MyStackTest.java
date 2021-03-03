package com.linkedlistdemo;

import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assert.assertEquals(myThirdNode,peak);
    }
    @Test
    public void given3NumbersInStackWhenPopedShouldMatchWithLastAddedNode(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.pop();
        myStack.pop();
        myStack.pop();
        boolean result = myStack.isEmpty();
        Assert.assertTrue(result);
    }
}
