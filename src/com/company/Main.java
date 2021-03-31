package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        //below two ArrayList are used to store the given input
        ArrayList<Integer> ArrayL1 = new ArrayList<Integer>();
        ArrayList<Integer> ArrayL2 = new ArrayList<Integer>();
        //ArrayList<Integer> ArrayL3 = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        int n, i;

        // size of ArrayL1 = size of ArrayL2 = n
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            ArrayL1.add(in.nextInt());
        }
        for (i = 0; i < n; i++) {
            ArrayL2.add(in.nextInt());
        }

        //write your code here


        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //ArrayL3.add(ArrayL1.get(i) + ArrayL2.get(j));
                ArrayL1.add(ArrayL1.get(i) + ArrayL2.get(j));
            }
        }

        for (i = 0; i < n; i++){
            ArrayL1.remove(0);
        }
        //System.out.println(ArrayL1.toString());

        /*
        int[] arr = ArrayL3.stream().mapToInt(j -> j).toArray();
        buildHeap(arr);
        for (i=0;i<arr.length;i++){
            System.out.print(i);
        }

         */
        buildHeap(ArrayL1);

        for (i=0;i<n;i++){
            System.out.println(ArrayL1.get(i));
        }

    }

    public static void buildHeap(ArrayList<Integer> arr){
        int i = (arr.size()/2)-1;
        while (i>=0){
            heapify(arr,i,arr.size());
            i--;
        }

    }

    private static void heapify(ArrayList<Integer> arr, int i, int n) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        int largest = i;

        if (l < n && arr.get(l) > arr.get(largest)) {
            largest = l;
        }
        if (r < n && arr.get(r) > arr.get(largest)) {
            largest = r;
        }

        if (largest != i) {
            Collections.swap(arr, i, largest);
            heapify(arr, largest, n);
        }
    }

}
