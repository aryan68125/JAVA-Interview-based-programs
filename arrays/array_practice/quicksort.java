import java.util.*;
class quicksort{
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
  static void QuickSort(int arr[], int low, int high){
    if(low<high){
      int indexPI = Partition(arr,low,high);
      QuickSort(arr,low,indexPI-1);
      QuickSort(arr,indexPI+1,high);
    }
  }
  static int Partition(int arr[], int low, int high){
    int swapIndex = low-1;
    int pivot = arr[high];
    for(int j=low;j<high;j++){
      if(arr[j]<pivot){
        swapIndex++;
        int temp = arr[swapIndex];
        arr[swapIndex] = arr[j];
        arr[j] = temp;
      }
    }
    int temp2 = arr[swapIndex+1];
    arr[swapIndex+1] = arr[high];
    arr[high] = temp2;
    return swapIndex+1;
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

    System.out.println("Performing quick sort on the array");
    QuickSort(arr,0,arr.length-1);

    System.out.println("Display array after performing quick sort");
    DisplayArray(arr,0);
    System.out.println("");
  }
}
