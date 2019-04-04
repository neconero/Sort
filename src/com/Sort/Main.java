package com.Sort;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

   static void bubbleSort(Integer[] arr, int n){
       int temp;
       for(int i = 0; i< n-1; i++){
           for(int j = 0; j < n-i-1; j++){
               //swap
               if(arr[j] > arr[j+1]){
                   temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
           }
       }

    }


    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(64);
        test.add(34);
        test.add(25);
        test.add(12);
        test.add(22);
        test.add(11);

        //convert to arraylist to array
        Integer[] item = test.toArray(new Integer[test.size()]);
        int n = item.length;

        bubbleSort(item, n);
        System.out.println("Sorted array: ");
// convert array back to arraylist.
        ArrayList<Integer> me = new ArrayList<Integer>(Arrays.asList(item));

        for(int i=0; i < n; i++){
            System.out.print(me.get(i) + " ");
        }

    }
}
