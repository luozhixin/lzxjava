package SuanFa;

import java.util.Arrays;

/**
 * @Auther:zhixin.Luo
 * @Date: 2019/10/8 10:32
 * @Description:
 */
public class sort {
    public static void main(String[] args) {
        int arr[]={5,4,9,8,6,7,1,3,2,15,12,31};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>=arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.printf(Arrays.toString(arr));
    }

}
