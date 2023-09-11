import java.util.*;
public class insertionsort_binarysearch {
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
    static void InsertionSort(int arr[], int n){
        if(n <= 1){
            return;
        }
        InsertionSort(arr,n-1);
        int temp = arr[n-1];
        int j = n-2;
        while(j>=0 && arr[j]>temp){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = temp;
    }
    static int BinarySearch(int arr[], int left, int right, int key){
        int mid;
        if(left<=right){
            mid = (left+right)/2;
            if(key<arr[mid]){
                return BinarySearch(arr,left,mid-1,key);
            }
            else if(key>arr[mid]){
                return BinarySearch(arr,mid+1,right,key);
            }
            else{
                //if(key == arr[mid])
                return mid;
            }
        }
        else{
            //if key is not present in the array
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
        
        System.out.println("Display array");
        DisplayArray(arr,0);
        System.out.println("");
        
        System.out.println("Performing Insertion sort on the array");
        InsertionSort(arr,arr.length);
        
        System.out.println("Display array after performing Insertion sort on the array");
        DisplayArray(arr,0);
        System.out.println("");
        
        System.out.println("Enter the number that you want to search in the array");
        int key = sc.nextInt();
        int index = BinarySearch(arr,0,arr.length-1,key);
        if(index!=-1){
            System.out.println("The number "+arr[index]+" is in position "+index+" in the array");
        }
        else{
            System.out.println("The number "+key+" is not present in the array");
        }
    }
}