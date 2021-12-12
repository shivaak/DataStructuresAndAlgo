package com.ds.algorithm;

public class BinarySearchIterative {

    public static void main(String[] args) {
        int a[] = {0,1,2,3,4,5,6,7,8,9,10};
        int key = 7;

        int l =0 ,r= a.length-1;
        boolean found = false;
        while(l<=r){
            int mid=(l+r)/2;
            if(key==a[mid]){
                found = true;
                System.out.println("Found at index " + mid);
                break;
            }else if(key<a[mid]){
                r=mid-1;
            }else if(key>a[mid]){
                l=mid+1;
            }
        }

        if(!found){
            System.out.println("Not found");
        }

    }
}
