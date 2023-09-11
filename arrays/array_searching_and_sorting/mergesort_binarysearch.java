import java.util.*;
public class mergesort_binarysearch {
    static void EnterElements(int arr[], int i){
        if(i==arr.length){
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
    static void MergeSort(int arr[], int left, int right){
        int mid;
        if(left<right){
            //calculate the mid point in the original array
            mid = (left+right)/2;
            
            //call merge sort function recursively
            MergeSort(arr,left,mid);
            MergeSort(arr,mid+1,right);
            
            //Merge the array
            Merge(arr,left,mid,right);
        }
    }
    static void Merge(int arr[], int left, int mid, int right){
        //calculate the size of left and right sub array size
        int left_size = mid-left+1;
        int right_size = right-mid;
        
        //initialize the left and right sub array
        int L[] = new int[left_size];
        int R[] = new int[right_size];
        
        //copy all the elements from original array to the left and right sub array
        for(int i=0;i<left_size;i++){
            L[i] = arr[left+i];
        }
        for(int j=0;j<right_size;j++){
            R[j] = arr[mid+1+j];
        }
        
        //now arranging the elements in the original array
        int i=0,j=0,k=left;
        while(i<left_size && j<right_size){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //copy the remaining elements in the original array
        while(i<left_size){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<right_size){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static int BinarySearch(int arr[], int left, int right, int key){
        int mid;
        if(left<=right){
            mid=(left+right)/2;
            if(key<arr[mid]){
                return BinarySearch(arr,left,mid-1,key);
            }
            else if(key>arr[mid]){
                return BinarySearch(arr,mid+1,right,key);
            }
            else{
                //if(key==arr[mid])
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
        
        System.out.println("Performing Merge sort on the array");
        MergeSort(arr,0,arr.length-1);
        
        System.out.println("Display array after the Merge Sort was performed");
        DisplayArray(arr,0);
        System.out.println("");
        
        System.out.println("Enter the number that you want to search in the array");
        int key = sc.nextInt();
        int index = BinarySearch(arr,0,arr.length-1,key);
        if(index!=-1){
            System.out.println("The number "+arr[index]+" is present in position "+index+" in the array");
        }
        else{
            System.out.println("The number "+key+" is not present in the array");
        }
    }
}