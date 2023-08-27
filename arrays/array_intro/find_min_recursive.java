import java.util.*;
public class find_min_recursive {
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
        System.out.print(arr[i]+" ");
        DisplayArray(arr,i+1);
    }
    static int FindMin(int arr[], int i, int min){
        if(i == arr.length){
            return min;
        }
        if(min>arr[i]){
            min = arr[i];
        }
        return FindMin(arr,i+1,min);
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
        
        System.out.println("Finding the smallest number in the array");
        int smallest = arr[0];
        int min = FindMin(arr, 0, smallest);
        System.out.println("The smallest number in the array = "+min);
    }
}