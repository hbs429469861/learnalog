package com.learnalog;

public class QuickSort {


    //定义快速排序的方法
    static int partition(int a[],int left,int right){
       int pivot = a[left];
       while (left<right){
           while (left<right && a[right]>= pivot){
               right--;
           }
           if (left<right)
               a[left++] = a[right];
           while (left<right && a[left] <= pivot)
               left++;
           if (left<right)
               a[right--] = a[left];
       }
       a[left] = pivot;
        return left;
    }

   static void quickSort(int n[], int left, int right){
        int dp;
        if (left<right){
            dp = partition(n,left,right);
            quickSort(n, left, dp - 1);
            quickSort(n, dp + 1, right);
        }
   }

    public static void main(String[] args) {

        int[] a = new int[]{2,7,4,5,10,1,9,3,8,6};
        int[] b = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] c = new int[]{10,9,8,7,6,5,4,3,2,1};
        int[] d = new int[]{1,10,2,9,3,2,4,7,5,6};


        quickSort(d, 0, d.length-1);

        System.out.println("排序后的结果：");
        for(int x : d){
            System.out.print(x+" ");
        }
    }
}
