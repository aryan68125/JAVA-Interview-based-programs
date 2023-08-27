import java.util.*;
public class reverse_array {
    static void EnterElements(int arr[], int i){
        if(i == arr.length){
            return;
        }
        Scanner sc = new Scanner(System.in);
        arr[i] = sc.nextInt();
        EnterElements(arr,i+1);
    }
    static void DisplayArray(int arr[], int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        DisplayArray(arr,i+1);
    }
    static void ReverseArray(int arr[]){
        int k=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(k>i){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the elements in the array");
        EnterElements(arr,0);
        
        System.out.println("Printing the elements of the array");
        DisplayArray(arr,0);
        System.out.println(" ");
        
        System.out.println("Reversing the array");
        ReverseArray(arr);
        
        System.out.println("Printing the array after reversing it ");
        DisplayArray(arr,0);
        System.out.println(" ");
    }
}