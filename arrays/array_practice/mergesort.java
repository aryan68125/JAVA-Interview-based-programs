import java.util.*;
class mergesort{
  static void EnterElement(int arr[],int i){
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
  static void MergeSort(int arr[], int left, int right){
    int mid;
    if(left<right){
      mid = (left+right)/2;
      MergeSort(arr,left,mid);
      MergeSort(arr,mid+1,right);
      Merge(arr,left,mid,right);
    }
  }
  static void Merge(int arr[], int left, int mid, int right){
    //calculate the left and right sub array size
    int left_size = mid-left+1;
    int right_size = right-mid;

    //create the left and right sub array
    int L[] = new int[left_size];
    int R[] = new int[right_size];

    //copy the elements in the left and right sub array
    for(int i=0;i<left_size;i++){
      L[i] = arr[left+i];
    }
    for(int j=0;j<right_size;j++){
      R[j] = arr[mid+1+j];
    }

    int i = 0, j = 0, k = left;
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
    while(i<left_size){
      arr[k] = L[i];
      i++;
      k++;
    }
    while(j<right_size){
      arr[k] = R[j];
      j++;
      k++;
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("Enter the elements in the array");
    EnterElement(arr,0);

    System.out.println("Display array");
    DisplayArray(arr,0);
    System.out.println("");

    System.out.println("Performing merge sort on the array");
    MergeSort(arr,0,arr.length-1);

    System.out.println("Display array after performing mergesort");
    DisplayArray(arr,0);
    System.out.println("");
  }
}
