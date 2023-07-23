public class reverse_array_swap {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        
        int start=0,end=5;
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;

        }
        System.out.println("Orginal array");
        for(int i: arr){
            System.out.print(" "+ i);
        }
    
    }
    
}
