package com.mercury.MergeSortedArray;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length1 = m-1;
        int length2 = n-1;
        int length = m+n-1;
        while(length1 >=0 && length2 >= 0){
            if(nums1[length1] > nums2[length2]){
                nums1[length] = nums1[length1];
                length1--;
            }else{
                nums1[length] = nums2[length2];
                length2--;
            }
            length--;
        }

        System.arraycopy(nums2,0,nums1,0,length2+1);
    }
}
