import java.util.*;
public class find_max_recursive {
    static void EnterElements(int arr[], int i){
        if(i == arr.length){
            return;
        }
        Scanner sc = new Scanner(System.in);
        arr[i] = sc.nextInt();
        EnterElements(arr,i+1);
    }
    static void DisplayArray(int arr[], int i){
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]+" ");
        DisplayArray(arr,i+1);
    }
    static int FindMax(int arr[], int i, int max){
        if(i == arr.length){
            return max;
        }
        if(max<arr[i]){
            max = arr[i];
        }
        return FindMax(arr,i+1,max);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the elements in the array");
        EnterElements(arr,0);
        
        System.out.println("Displaying the array");
        DisplayArray(arr,0);
        System.out.println(" ");
        
        System.out.println("Find the largest number in the array using recursion");
        int largest = arr[0];
        int max = FindMax(arr,0,largest);
        System.out.println("The largest number in the array  = "+max);
    }
}