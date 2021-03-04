package com.linkedlistdemo;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
    @Test
    public void givenASentenceWhenWordsAreAddedToListShouldReturnWordFrequency(){
        String sentence = "To be or not to be";
        MyHasMap<String, Integer> myHasMap = new MyHasMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHasMap.get(word);
            if(value == null) value = 1;
            else value = value + 1;
            myHasMap.add(word, value);
        }
        int frequency = myHasMap.get("to");
        System.out.println(myHasMap);
        Assert.assertEquals(2,frequency);
    }
}
