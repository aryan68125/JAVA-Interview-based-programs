import java.util.*;
public class selection_sort_recursion {
    static void EnterElements(int arr[], int i){
        if(i==arr.length){
            return;
        }
        Scanner sc = new Scanner(System.in);
        arr[i]= sc.nextInt();
       EnterElements(arr,i+1);
    }
    static void DisplayArray(int arr[],int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        DisplayArray(arr,i+1);
    }
    static void RecursiveSelectionSort(int arr[], int i){
        if(i == arr.length-1){
            return;
        }
        int min_index=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min_index]){
                min_index=j;
            }
        }
        if(i!=min_index){
            int temp = arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        RecursiveSelectionSort(arr,i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter the elements of the array");
        EnterElements(arr,0);
        
        System.out.println("Displying the array elements");
        DisplayArray(arr,0);
        System.out.println(" ");
        
        System.out.println("Performing the Selection sort recursive function on the array");
        RecursiveSelectionSort(arr,0);
        
        System.out.println("Displaying the array after Selection sort");
        DisplayArray(arr,0);
        System.out.println(" ");
    }
}