package test;

import java.util.Arrays;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/8 11:16
 * @Description:
 */
public class qsort {
    public  static  void sort(int []arr,int low,int high){
        int l ,h;
        while (low>high) {
            return;
        }
        l=low;
        h=high;
        int temp=arr[l];
        while(l<h){
            while(temp<=arr[h]&&l<h){
                h--;
            }
            while(temp>=arr[l]&&l<h){
                l++;
            }
            if (l<h) {
                int q=arr[l];
                arr[l]=arr[h];
                arr[h]=q;
            }
        }
        arr[low]=arr[l];
        arr[l]=temp;
        sort(arr,low,l-1);
        sort(arr,l+1,high);
        }
    public static void main(String[] args) {
        int arr[]={45,4,6,45,23,41,456,78,11,1,23};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
