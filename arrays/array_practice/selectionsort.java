import java.util.*;
public class selectionsort{
  static void EnterElement(int arr[], int i){
    if(i == arr.length){
      return;
    }
    Scanner sc = new Scanner(System.in);
    arr[i] = sc.nextInt();
    EnterElement(arr,i+1);
  }
  static void DisplayArray(int arr[], int i){
    if(i == arr.length){
      return;
    }
    System.out.print(arr[i]+" ");
    DisplayArray(arr,i+1);
  }
  static void SelectionSort(int arr[], int i){
    if(i==arr.length-1){
      return;
    }
    int min_index = i;
    for(int j=i+1;j<arr.length;j++){
      if(arr[min_index]>arr[j]){
        min_index=j;
      }
    }
    int temp = arr[min_index];
    arr[min_index] = arr[i];
    arr[i] = temp;
    SelectionSort(arr,i+1);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements in the array");
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("Enter elements in the array");
    EnterElement(arr,0);

    System.out.println("Display array");
    DisplayArray(arr,0);
    System.out.println("");

    System.out.println("Performing selection sort on the array");
    SelectionSort(arr,0);

    System.out.println("Display array after performing selection sort on the array");
    DisplayArray(arr,0);
    System.out.println("");

  }
}
