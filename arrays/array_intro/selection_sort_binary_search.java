import java.util.*;
public class selection_sort_binary_search{
    static void EnterElements(int arr[],int i){
        if(i == arr.length){
            return;
        }
        Scanner sc = new Scanner(System.in);
        arr[i]=sc.nextInt();
        EnterElements(arr,i+1);
    }
    static void DisplayArray(int arr[], int i){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        DisplayArray(arr, i+1);
    }
    static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    static int BinarySearch(int arr[], int left, int right, int key){
        int mid;
        if(left<right){
            mid=(left+right)/2;
            if(key < arr[mid]){
                return BinarySearch(arr,left,mid-1,key);
            }
            else if(key>arr[mid]){
                return BinarySearch(arr,mid+1,right,key);
            }
            else if(key == arr[mid]){
                return mid;
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
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
        
        System.out.println("Performing Selection sort on the array");
        SelectionSort(arr);
        
        System.out.println("Dsiplaying the array after selection sort");
        DisplayArray(arr,0);
        System.out.println(" ");
        
        System.out.println("Performing Binary search");
        System.out.println("Enter the number that you want to find");
        int key = sc.nextInt();
        int index = BinarySearch(arr,0,arr.length,key);
        if(index!= -1){
            System.out.println("The number "+arr[index]+ " is in position "+index+ " in the array");
        }
        else{
            System.out.println("The number "+key+" is not present in the array");
        }
    }
}