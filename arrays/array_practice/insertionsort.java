import java.util.*;
class insertionsort
{
  static void EnterElement(int arr[], int i){
    if(i==arr.length){
      return;
    }
    Scanner sc = new Scanner(System.in);
    arr[i] = sc.nextInt();
    EnterElement(arr,i+1);
  }
  static void DisplayArray(int arr[], int i){
    if(i==arr.length){
      return;
    }
    System.out.print(arr[i]+" ");
    DisplayArray(arr,i+1);
  }
  static void InsertionSort(int arr[], int n){
    if(n<=1){
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
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("Enter element in the array");
    EnterElement(arr,0);

    System.out.println("Display Array");
    DisplayArray(arr,0);
    System.out.println("");

    System.out.println("Performing insertionsort on the array");
    InsertionSort(arr,arr.length);

    System.out.println("Display array after performing insertionsort");
    DisplayArray(arr,0);
    System.out.println("");
  }
}
