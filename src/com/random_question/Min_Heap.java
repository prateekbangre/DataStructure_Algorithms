package com.random.question;

import java.util.Arrays;

/**
 * @author prateek.bangre on 04/05/21.
 * @Project TestProject
 */
//url: https://www.youtube.com/watch?v=t0Cq6tVNRBA&list=PLOuZYwbmgZWXvkghUyMLdI90IwxbNCiWK&index=12
public class Min_Heap {

    private int capacity = 10;
    private int size = 0;

    int[] items = new int[capacity];

    //basic method to get data
    private int getLeftChildIndex(int parentIndex){ return 2 * parentIndex + 1; }
    private int getRightChildIndex(int parentIndex){ return 2 * parentIndex + 2; }
    private int getParentIndex(int childIndex){ return (childIndex-1)/2; }

    private boolean hasLeftChild(int index){ return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index){ return getRightChildIndex(index) < size; }
    private boolean hasParent(int index){ return getParentIndex(index) >= 0; }

    private int leftChild(int index){ return items[getLeftChildIndex(index)]; }
    private int rightChild(int index){ return items[getRightChildIndex(index)]; }
    private int parent(int index){ return items[getParentIndex(index)]; }

    //swap method
    private void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexTwo] = items[indexOne];
        items[indexOne] = temp;
    }

    //ensure we have extra capacity to store new
    private void ensureExtraCapacity(){
        if (size == capacity){
            items = Arrays.copyOf(items, capacity*2);
            capacity = capacity*2;
        }
    }

    //return top element
    private int peek(){
        if (size == 0){ throw new IllegalStateException(); }
        return items[0];
    }

    //removed the root element
    private int poll(){
        if (size == 0){ throw new IllegalStateException(); }

        int item = items[0];
        items[0] = items[size-1];
        --size;
        heapifyDown();
        return item;
    }

    //add new element
    private void add(int item){
        ensureExtraCapacity();
        items[size] = item;
        ++size;
        heapifyUp();
    }

    //set the correct position of element and start checking from end -> start (down -> top)
    private void heapifyUp(){
        int index = size - 1;
        while (hasParent(index) && parent(index) > items[index]){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }


    }

    //set the correct position of element and start checking from Start -> End (top -> down)
    private void heapifyDown(){
        int index = 0;

        while (hasLeftChild(index)){
            int smallChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)){
                smallChildIndex = getRightChildIndex(index);
            }

            if (items[index] < items[smallChildIndex]){
                break;
            }else {
                swap(index, smallChildIndex);
            }
            index = smallChildIndex;
        }
    }





    public static void main(String[] args) {

    }
}
