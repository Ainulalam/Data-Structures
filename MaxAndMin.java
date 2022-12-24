import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        

        int arr[]={1,2 ,45,563,5443,356,-35,353,535,334};
        
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length ;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximun :"+ max);
        System.out.println("Mininum :"+ min);
    
    
    }
}
