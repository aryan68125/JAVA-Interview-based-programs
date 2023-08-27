import java.util.*;
public class find_mini {
    static void EnterElements(int arr[], int i){
        if(i == arr.length){
            return;
        }
        Scanner sc = new Scanner(System.in);
        arr[i] = sc.nextInt();
        EnterElements(arr,i+1);
    }
    static void DisplayArray(int arr[], int i){
        if( i == arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        DisplayArray(arr, i+1);
    }
    static int FindMini(int arr[]){
        int mini = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mini){
                mini = arr[i];
            }
        }
        return mini;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int [size];
        
        System.out.println("Enter the elements in the array");
        EnterElements(arr,0);
        
        System.out.println("Displaying the array");
        DisplayArray(arr,0);
        System.out.println(" ");
        
        System.out.println("Finding the minimum number present in the array");
        int mini = FindMini(arr);
        System.out.println("The smallest number in array is = "+mini);
    }
}