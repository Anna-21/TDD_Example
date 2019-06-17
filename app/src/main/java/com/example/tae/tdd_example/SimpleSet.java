package com.example.tae.tdd_example;

import android.content.Intent;

public class SimpleSet {

    private int[] container = new  int[10];
   private int addedElements = 0;

    public boolean isEmpty() {

        return addedElements==0;
    }

    public boolean addElement(int i) {

        if (this.contains(i))return false;
        container [addedElements++]=i;
        return true;

    }

    public int elementCount() {
        return addedElements;
    }

    public boolean contains(int i) {
        for (int element : container){

            if (element==i) return true;

        }

        return false;
    }

    public void removeElement(int i) {

        for(int j = 0;j< container.length; j++){
            if (container[j]==i){
                for (int k = j; k<container.length - 1; k++)
                {
                    container [k] = container[k+1];
                }
                addedElements --;
            }
        }

    }
}
