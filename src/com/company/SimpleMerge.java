package com.company;

public class SimpleMerge {
    public static int[] SimpleMerge(int[] arr1, int[] arr2){
    int[] arr3 = new int[arr1.length+arr2.length];
    int i =0,j=0,k=0;
    while(k<(arr1.length+arr2.length)-1){
        if(arr1[i]<arr2[j]){
            arr3[k]=arr1[i];
            i++;
        }
        else{
            arr3[k]=arr2[j];
            j++;
        }
        k++;
    }
    return arr3;
    }
}
