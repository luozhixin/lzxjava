package SuanFa;

import java.util.Arrays;

public class quicksort {
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        temp = arr[low];
        while (i<j) {     
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            while (temp>=arr[i]&&i<j) 
            {                
            	i++;           
            }           
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];

                arr[i] = t;
            } 
        }
        arr[low] = arr[i];
        arr[i] = temp;
        System.out.println(Arrays.toString(arr));
        quickSort(arr, low, j-1);
        quickSort(arr, j+1, high);
    }
   public static void main(String[] args){
        int[] arr = {9,10,3,7,2,5,6,8,1,11,5};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}