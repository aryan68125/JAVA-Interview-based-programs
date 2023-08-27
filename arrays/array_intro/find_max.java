import java.util.*;
public class find_max {
    static void EnterElements(int arr[], int i){
        if(i == arr.length){
            return;
        }
        Scanner sc  = new Scanner(System.in);
        arr[i] = sc.nextInt();
        EnterElements(arr,i+1);
    }
    static void DisplayArray(int arr[], int i){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        DisplayArray(arr,i+1);
    }
    static int FindMax(int arr[]){
        int max = arr[0];
        for(int i=0 ; i<arr.length;i++){
            if(max<arr[i]){
                max= arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the elements in the array");
        EnterElements(arr,0);
        
        System.out.println("Display the array elements");
        DisplayArray(arr,0);
        System.out.println(" ");
        
        System.out.println("finding the largest value in the array using for loop");
        int max = FindMax(arr);
        System.out.println("The largest number in the array is = "+max);
    }
}