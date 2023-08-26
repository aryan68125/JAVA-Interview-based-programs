import java.util.*;
public class linear_search {
    static void EnterElements(int arr[], int i){
        if(i == arr.length){
            return;
        }
        Scanner sc = new Scanner(System.in);
        arr[i] = sc.nextInt();
        EnterElements(arr, i+1);
    }
    static void DisplayArray(int arr[],int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        DisplayArray(arr,i+1);
    }
    static int LinearSearchFunction(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return LinearSearchFunction(arr,i+1,key);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter elements in the array");
        EnterElements(arr,0);
        
        System.out.println("Printing the array");
        DisplayArray(arr,0);
        System.out.println(" ");
        
        System.out.println("Performing Linear Search on the array");
        System.out.println("Enter the number that you want to search in the array");
        int key = sc.nextInt();
        int index = LinearSearchFunction(arr,0,key);
        if(index!=-1){
            System.out.println("The number "+arr[index]+" is in position "+ index + " in the array");
        }
        else{
            System.out.println("The number "+key+" is not present in the array");
        }
    }
}