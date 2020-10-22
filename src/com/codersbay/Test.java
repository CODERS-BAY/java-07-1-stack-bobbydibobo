package com.codersbay;

import org.junit.jupiter.api.TestTemplate;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test {


    @org.junit.jupiter.api.Test
    public void testPush(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack stack = new Stack(arrayList);

        stack.push(2);
        assertEquals(1, stack.size());

        stack.push(8);
        assertEquals(2, stack.size());
    }

    @org.junit.jupiter.api.Test
    public void testPop(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack stack = new Stack(arrayList);

        stack.push(2);
        stack.push(4);

        stack.pop();
        assertEquals(1, stack.size());
    }

    @org.junit.jupiter.api.Test
    public void testPopMore(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack stack = new Stack(arrayList);

        stack.push(2);
        stack.push(4);
        stack.push(2);
        stack.push(9);

        stack.pop(2);
        assertEquals(2, stack.size());
    }

}
