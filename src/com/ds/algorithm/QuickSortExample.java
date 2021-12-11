package com.ds.algorithm;

public class QuickSortExample {

    public static void main(String[] args) {
        int[] arr = {-2,-5,1,4,-3,0,5,10,8};
        new QuickSortExample().quicksort(arr, 0, arr.length-1);

        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+ " ");
        }

    }

    private void quicksort(int[] arr, int l, int r) {
        if(l>=r){ return; }
        int part = partition(arr, l, r);
        quicksort(arr, l, part -1);
        quicksort(arr, part+1, r);
    }

    private int partition(int[] arr, int l, int r) {
        int pivot = arr[r]; // choosing right most element as pivot
        int i=l-1;
        for(int j=l;j<r;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,i,r);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
