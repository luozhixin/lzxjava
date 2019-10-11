package test;

import java.util.Scanner;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/8 16:45
 * @Description:
 */
public class twosum {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,7,8,9,10,15,25};
        sel(arr,4);
    }
    public static void sel(int []arr,int num){
        for (int i = 0; i <arr.length ; i++) {
            int c=num-arr[i];
            for (int j = 0; j <arr.length ; j++) {
                if(c==arr[j]){
                    System.out.println(i+"ºÍ"+j);
                }
            }
        }
    }
}
