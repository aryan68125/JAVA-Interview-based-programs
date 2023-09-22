import java.util.*;
class countingsort{
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
  static int max(int arr[], int i, int max_element){
    if(i == arr.length){
      return max_element;
    }
    if(max_element<arr[i]){
      max_element = arr[i];
    }
    return max(arr,i+1,max_element);
  }
  static int min(int arr[], int i, int min_element){
    if(i==arr.length){
      return min_element;
    }
    if(min_element>arr[i]){
      min_element = arr[i];
    }
    return min(arr,i+1,min_element);
  }
  static void CountingSort(int arr[]){
    //check if the array is empty or null
    if(arr == null || arr.length == 0){
      return;
    }

    //calculate the maximum and minimum element present in the array
    int max_element = max(arr,0,arr[0]);
    int min_element = min(arr,0,arr[0]);

    //create a count array
    int range = max_element-min_element+1;
    int countArr[] = new int[range];

    //copy the element sin the countArr
    for(int num : arr){
      countArr[num-min_element]++;
    }

    int index=0;
    for(int i=0;i<range;i++){
      while(countArr[i]>0){
        arr[index] = i+min_element;
        index++;
        countArr[i]--;
      }
    }
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

    System.out.println("Performing counting sort on the array");
    CountingSort(arr);

    System.out.println("Display array after performing counting sort");
    DisplayArray(arr,0);
    System.out.println("");
  }
}
