class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //brute force approach
    //  int[] arr=new int[nums1.length+nums2.length];
    //  System.arraycopy(nums1, 0, arr, 0, nums1.length);
    //  System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
    //  Arrays.sort(arr);
    //  if(arr.length%2!=0){
    //     return arr[arr.length/2];
    //  }   
    //  else{
    //     return (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2.0;
    //  }
    int len=nums1.length+nums2.length;
    int i=0,j=0;
    int count=0;
    int prev=0;
    int curr=0;
    while(count<=len/2){
        prev=curr;
        if(i==nums1.length){
            curr=nums2[j];
            j++;
        }
        else if(j==nums2.length){
            curr=nums1[i];
            i++;
        }
        else if(nums1[i]<nums2[j]){
            curr=nums1[i];
            i++;
        }
        else{
            curr=nums2[j];
            j++;
        }
        count++;
    }
    if(len%2!=0){
        return curr;
    }
    else{
        return (prev+curr)/2.0;
    }
    }
}