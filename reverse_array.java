import java.util.Scanner;

class reverse_array{
    public static void ain(String[] args) {
        int n;
        System.out.println("Enter the size of array");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        int array[]=new int[n];
        System.out.println("Enter the elements of array");
        
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        // reverse a array

        int revArray[]=new int[n];
        // int j=0;
        // for(int i=n-1;i>=0;i--){
        //     revArray[i]=array[j++];
        // }
            int temp;
            for(int i=0;i<n/2;i++){
                temp=array[i];
                array[i]=revArray[n-1];
                revArray[n-1]=temp;
            }

        System.out.println(" Original array");
        for(int i=0;i<n;i++){
            System.out.print(" "+ array[i]);
        }
        System.out.println(" ");
        System.out.println("Reverse array");
        for(int i=0;i<n;i++){
            System.out.print(" "+ revArray[i]);
        }
    }
}