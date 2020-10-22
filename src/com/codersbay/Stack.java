package com.codersbay;

import java.util.ArrayList;

public class Stack {

    public ArrayList<Integer> myStack;

    public Stack(ArrayList<Integer> myStack) {
        this.myStack = myStack;
    }

    public void push (Integer newElement){
        this.myStack.add(newElement);
    }

    public int size(){
        return this.myStack.size();
    }

    public int pop(){
        int maxIndex = this.myStack.size() - 1;
        int maxNumb =  this.myStack.get(maxIndex);
        this.myStack.remove(maxIndex);
        return maxNumb;
    }

    public int peek(){
        int maxIndex = this.myStack.size() - 1;
        int maxNumb = this.myStack.get(maxIndex);
        return maxNumb;
    }

    public int[] pop(int n){

        int[] someSelectedInts = new int[n];
        int actualPosition = -1;

        //loop for return
        for (int i = 0; i < this.myStack.size(); i++ ){
            if (i >= this.myStack.size()-n){
                actualPosition++;
                someSelectedInts[actualPosition] = this.myStack.get(i);
            }
        }

        int indexOfFirstToDie = this.myStack.size() - n;

        while (indexOfFirstToDie < this.myStack.size()){
            this.myStack.remove(indexOfFirstToDie);
        }

        return someSelectedInts;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "myStack=" + myStack +
                '}';
    }
}


