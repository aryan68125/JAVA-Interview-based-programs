import java.util.*;
public class bubble_sort_binary_search {
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
        System.out.print(arr[i]+ " ");
        DisplayArray(arr,i+1);
    }
    static void BubbleSort(int arr[], int n){
        if(n == 1){
            return;
        }
        int count = 0;
        for(int j=0 ; j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                count++;
            }
        }
        if(count == 0){
            return;
        }
        BubbleSort(arr,n-1);
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
        
        System.out.println("Performing bubbleSort on the array");
        BubbleSort(arr,arr.length);
        
        System.out.println("Displaying the array after the bubble sort operation");
        DisplayArray(arr,0);
        System.out.println(" ");
        
        System.out.println("Performing Binary Search on the array");
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