import java.util.*;
public class countsort_binary {
    static int max(int arr[], int i, int max_element){
        if(i==arr.length){
            return max_element;
        }
        if(max_element<arr[i]){
            max_element=arr[i];
        }
        return max(arr,i+1,max_element);
    }
    static int min(int arr[], int i , int min_element){
        if(i==arr.length){
            return min_element;
        }
        if(min_element>arr[i]){
            min_element=arr[i];
        }
        return min(arr,i+1,min_element);
    }
    static void countsort(int arr[]){
        //if array is null or empty
        if(arr==null||arr.length==0){
            return;
        }
        
        //find the maximum and minimum element in the array
        int max_element = max(arr,0,arr[0]);
        int min_element = min(arr,0,arr[0]);
        
        //create a CountArray that can keep track of number of occurances of elements in the array
        int range = max_element-min_element+1;
        int countArr[] = new int[range];
        
        //caluclate the number of occurances of element in the array and then store it in the CountArray
        for(int num : arr){
            countArr[num-min_element]++;
        }
        
        //now reconstruc the main array using countSort array
        int index = 0;
        for(int i=0;i<range;i++){
            while(countArr[i]>0){
                arr[index] = i+min_element;
                index++;
                countArr[i]--;
            }
        }
    }
    static void EnterElement(int arr[], int i){
        if(i==arr.length){
            return;
        }
        Scanner sc = new Scanner(System.in);
        arr[i] = sc.nextInt();
        EnterElement(arr,i+1);
    }
    static void DisplayArray(int arr[],int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        DisplayArray(arr,i+1);
    }
    static int BinarySearch(int arr[], int left, int right,int key){
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
                //if(key == arr[mid])
                return mid;
            }
        }
        else{
            //if key is not found in the array then return -1
            return -1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter elements in the array");
        EnterElement(arr,0);
        
        System.out.println("Display Array");
        DisplayArray(arr,0);
        System.out.println("");
        
        System.out.println("Performing counting sort on the array");
        countsort(arr);
        
        System.out.println("Display array after performing counting sort on the array");
        DisplayArray(arr,0);
        System.out.println("");
        
        System.out.println("Enter the number that you want to search in the array");
        int key = sc.nextInt();
        int index = BinarySearch(arr,0,arr.length-1,key);
        if(index!=-1){
            System.out.println("The number "+arr[index]+" is in position "+index+" in the array");
        }
        else{
            System.out.println("the number "+key+ " is not present in the array");
        }
    }
}