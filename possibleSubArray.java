public class possibleSubArray {
    public static void main(String[] args) {
        int arr[]={5,7,467,-1,34,2,25};

        System.out.println("Sub Array is");

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(" "+ arr[k]+ " ");
                }
            System.out.println(" ");
            }
        }
    }
}
