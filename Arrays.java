//Basics of arrays
import java.util.*;
public class Arrays{
    /**
     * @param args
     */
    public static void main(String args[]){
        int n;
        System.out.println("Enter number of elements of array: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0; j<n; j++){
            System.out.println(arr[j]);
        }
    }
}