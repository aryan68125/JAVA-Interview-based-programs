import java.util.*;
public class linear_search {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array");
        
        //Enter the array elements
        Enter_the_array_elements(arr, 0);
        
        //Print Array elements
        System.out.println("Printing array ");
        Print_Array(arr, 0);
        System.out.println(" ");
        
        //Linear Search
        System.out.println("Performing Linear Search");
        int key = sc.nextInt();
        int number_found = LinearSearch(arr,0,key);
        if(number_found != -1){
            System.out.println(arr[number_found] + " is found in position "+number_found+" inside the array.");
        }
        else{
            System.out.println("The number "+key+ " is not found in the array");
        }
    }
    static void Enter_the_array_elements(int arr[], int i){
        if(i == arr.length){
            return;
        }
        Scanner sc =new Scanner(System.in);
        arr[i] = sc.nextInt();
        
        Enter_the_array_elements(arr, i+1);
    }
    static void Print_Array(int arr[],int i){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        Print_Array(arr, i+1);
    }
    static int LinearSearch(int arr[],int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
       
        return LinearSearch(arr,i+1,key);
    }
}