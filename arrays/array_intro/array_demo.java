import java.util.*;

public class array_demo {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array");
         int size = sc.nextInt();
         int array[] = new int[size];
         
         //enter array elements
         System.out.println("Enter the elements inside the array");
         EnterElementsInAttay(array, 0);
         
         System.out.println("Printing the array elements");
         PrintArray(array, 0);
         System.out.println(" ");
         
         //linear search
         System.out.println("Enter the value that you want to search in the array");
         int key = sc.nextInt();
         array_demo array_demo = new array_demo();
         array_demo.LinearSearch(array, 0, key); //This is how you call a non static funtion in java
        
     }

    //This function will enter the elements in the array
  static void EnterElementsInAttay(int arr[], int i)
  {
      if(i==arr.length)
      {
          return;
      }
      Scanner sc2 = new Scanner(System.in);
      arr[i] = sc2.nextInt();
      EnterElementsInAttay(arr,i+1);
  }
    //This function will print the array
  static void PrintArray(int arr[],int i)
  {
      if(i == arr.length)
      {
          return;
      }
      System.out.print(arr[i] + " ");
      PrintArray(arr,i+1);
  }
    //linear search function
    void LinearSearch(int arr[], int i, int key){
         if(i == arr.length){
            return ;
         }
        if(arr[i] == key){
           
            System.out.println("The element : "+ arr[i]+ " is in position "+i+ " in the array");
            return ;
        }
        LinearSearch(arr, i+1, key);
     }
}