import java.util.*;
public class binary_search {
    static void EnterElements(int arr[], int i){
        if(i == arr.length){
            return;
        }
        Scanner sc = new Scanner(System.in);
        arr[i] = sc.nextInt();
        EnterElements(arr,i+1);
    }
    static void DisplayElements(int arr[],int i){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        DisplayElements(arr, i+1);
    }
    static void BubbleSort(int arr[], int n){
        if( n == 1 ){
            return;
        }
        int count = 0;
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                count+=1;
            }
        }
        if(count == 0 ){
            return;
        }
        BubbleSort(arr,n-1);
    }
    static int BinarySearchFunction(int arr[], int left, int right, int key){
        int mid;
        if(left<right){
            mid= (left+right)/2;
            if(key<arr[mid]){
                return BinarySearchFunction(arr,left,mid-1,key);
            }
            else if(key>arr[mid]){
                return BinarySearchFunction(arr,mid+1,right,key);
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
        
        System.out.println("Enter elements in the array");
        EnterElements(arr,0);
        
        System.out.println("Printing elements in the array");
        DisplayElements(arr,0);
        System.out.println(" ");
        
        System.out.println("Performing Bubble Sort on the array");
        BubbleSort(arr,arr.length);
        
        System.out.println("array after bubble sort");
        DisplayElements(arr,0);
        System.out.println(" ");
        
        System.out.println("Performing Binary search on the array");
        System.out.println("Enter the number that you want to find");
        int key = sc.nextInt();
        int index = BinarySearchFunction(arr,0,arr.length,key);
        if(index != -1){
            System.out.println(arr[index] + " is in position "+index+" in the array");
        }
        else{
            System.out.println(key+" is not found in the array");
        }
    }
}