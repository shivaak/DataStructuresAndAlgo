package com.ds.algorithm;

public class BinarySearhRecusive {

    public static void main(String[] args) {
        int arr[] = {1,2,34};
        int key = 6;
        BinarySearhRecusive bsr = new BinarySearhRecusive();

        int index = bsr.find(arr,0,arr.length-1, key);
        if(index>=0){
            System.out.println("Found at " + index);
        }else{
            System.out.println("Not found");
        }

    }

    private int find(int[] arr, int l, int r, int key) {
        if(l>r){
            return -1;
        }
        int mid=(l+r)/2;
        if(key<arr[mid]){
          return find(arr, l , mid-1, key);
        } else if(key>arr[mid]) {
            return find(arr, mid+1,r, key);
        }else{
            return mid;
        }
    }
}
