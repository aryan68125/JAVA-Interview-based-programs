import java.util.*;
public class bubblesort{
  static void BubbleSort(int arr[], int n){
    if(n==0){
      return;
    }
    int count = 0;
    for(int j=0;j<n;j++){
      if(arr[j+1]<arr[j]){
        int temp=arr[j+1];
        arr[j+1] = arr[j];
        arr[j] = temp;
        count++;
      }
    }
    if(count == 0){
      return;
    }
    BubbleSort(arr,n-1);
  }
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
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("Enter elements in the array");
    EnterElement(arr,0);

    System.out.println("Display array");
    DisplayArray(arr,0);
    System.out.println("");

    System.out.println("Performing bubble sort on the array");
    BubbleSort(arr,arr.length-1);

    System.out.println("Display array after performing bubble sort on the array");
    DisplayArray(arr,0);
    System.out.println("");
  }
}
