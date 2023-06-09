package com.company;

public class Main {
    public static void main(String[] args) {
        //Numeric Values
        int[] unsorted = {11,25,31,7,88,33,67,5,12,55};
        int Temp = 0;

        //Swapping

        //Display of first array before swapping
        System.out.println("First Array: " + "\n");
        for (int element : unsorted) {
            System.out.println(element);
        }
        //Swapping method
        int temp = unsorted[0];
        unsorted[0] = unsorted[3];
        unsorted[3] = temp;

        //Second array after swapping
        System.out.println("\n" + "Second Array (swapped): " + "\n");
        for (int element : unsorted) {
            System.out.println(element);
        }

        System.out.println("______________________________________________________________");

        //Sorting

        //First array before sorting

        System.out.println("First Array: " + "\n");
        for (int element : unsorted) {
            System.out.println(element);
        }

        //Sorting method
        for(int i = 0; i < unsorted.length;i++){
            for(int j=i+1;j < unsorted.length;j++){
                if (unsorted[i] > unsorted[j]){
                    Temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = Temp;
                }
            }
        }
        //Second array after sorting
        System.out.println("Second Array (sorted): " + "\n");
        for (int element : unsorted) {
            System.out.println(element);
        }
    }
}
