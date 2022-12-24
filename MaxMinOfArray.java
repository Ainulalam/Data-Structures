
//Maximum and minimum of an array using minimum number of comparisons
import java.util.Arrays;
public class MaxMinOfArray {
    public static void main(String[] args) {
        int arr[]={1,5,47,66,46,761,64,-4,64,654};
        
        int max,min;
        if(arr[0]>arr[1]){

             max=arr[0];
             min=arr[1];
        }
        else{

             max=arr[1];
             min=arr[0];
        }

        for(int i=2;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Maximun" + max);
        System.out.println("Minimum" + min);
    }
}
