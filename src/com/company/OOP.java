package com.company;

import java.util.Scanner;

public class OOP {

    static int binarySearch(int arr[],int v){
        int start=0,end=arr.length;
        while (start<=end){
            int mid =(start+end)/2;
            if (v == arr[mid])
                return mid;
            else if (v < arr[mid])
                end = mid-1;
            else start=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1,4,8,23,46,50};
        int index = binarySearch(arr,50);
        if (index == -1)
            System.out.println("value not found");
        else System.out.println("value was found in index "+index);
       /* System.out.println("please enter array");
        for (int i = 0;i<arr.length;i++)
            arr[i] = input.nextInt();*/

    }
}
