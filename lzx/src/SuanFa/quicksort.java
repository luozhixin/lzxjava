package SuanFa;

import java.util.Arrays;

public class quicksort {

    public static void quick(int [] arr ,int low, int high){
        if(low>high){
            return;
        }
        int l= low;
        int h= high;
        int temp=arr[low];
        while(l<h){
            while(temp<=arr[h]&&l<h){
                h--;
            }
            while(temp>=arr[l]&&l<h){
                l++;
            }
            if(l<h){
                int a=arr[l];
                arr[l]=arr[h];
                arr[h]=a;
            }
        }
        arr[low]=arr[l];
        arr[l]=temp;
        quick(arr,low,h-1);

        quick(arr,h+1,high);
    }
    public static void quickSort(int[] arr,int low,int high){

        if(low>high){
            return;
        }
        int temp;
        int l=low;
        int h=high;
        temp = arr[low];
        while (l<h) {
            while (temp<=arr[h]&&l<h) {
               h--;
            }
            while (temp>=arr[l]&&l<h)
            {                
            	l++;
            }           
            if (l<h) {
                int t = arr[h];
                arr[h] = arr[l];

                arr[l] = t;
            }
        }
        arr[low] = arr[l];
        arr[l] = temp;
        quickSort(arr, low, h-1);
        quickSort(arr, h+1, high);
    }
   public static void main(String[] args){
        int[] arr = {9,10,3,7,2,5,6,8,1,11,5};
       quick(arr, 0, arr.length-1);
       System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}