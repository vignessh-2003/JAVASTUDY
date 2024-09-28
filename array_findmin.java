package practise;
import java.util.*;
public class array_findmin {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int min= arr[0];
        for(int i=0;i<min;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);

    }

}
