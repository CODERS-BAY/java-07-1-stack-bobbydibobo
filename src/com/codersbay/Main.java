package com.codersbay;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> firstArrayList = new ArrayList<>();
        Stack firstStack = new Stack(firstArrayList);

        firstStack.push(8);
        firstStack.push(17);
        firstStack.push(23);
        firstStack.push(7);
        firstStack.push(27);
        firstStack.push(11);


        System.out.println(firstStack + " " + firstStack.size());

        System.out.println(firstStack + " " + firstStack.pop());

        System.out.println(firstStack + " " + firstStack.peek());

        System.out.println(firstStack + " " + Arrays.toString(firstStack.pop(3)));

        System.out.println(firstStack.pop());

        ArrayList<Integer> secArrayList = new ArrayList<>();
        Stack secStack = new Stack(secArrayList);

        secStack.pop();


    }
    
}
