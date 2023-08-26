import java.util.*;
public class delete_even {
    static void EnterElements(int arr[],int i){
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
    static int[] DeleteEvenNumbers(int arr[],int brr[]){
        //counting the odd numbers in the original array
        int oddCount=0;
        for(int i = 0; i <arr.length;i++){
            if(arr[i]%2 != 0){
                oddCount++;
            }
        }
        brr = new int [oddCount];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                brr[k] = arr[i];
                k++;
            }
        }
        return brr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int brr[]={0};
        
        System.out.println("Enter the elements in the array");
        EnterElements(arr,0);
        
        System.out.println("Displaying the array");
        DisplayArray(arr,0);
        System.out.println(" ");
        
        System.out.println("Deleting the even numbers from the array");
        int resultarr[] = DeleteEvenNumbers(arr,brr);
        System.out.println("The new array --> ");
        for(int i=0;i<resultarr.length;i++){
            System.out.print(resultarr[i]+ " ");
        }
        System.out.println(" ");
    }
}