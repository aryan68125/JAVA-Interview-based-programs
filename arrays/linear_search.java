// this program performs linear search on arrays
import java.util.*;
public class linear_search
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the elements inside the array one by one");
    EnterElementsInAttay(arr,0);
    System.out.println("Printing the array");
    PrintArray(arr,0);
    System.out.println("\n");

    //linear search through recursion
    System.out.println("Enter the number to be searched in the array");
    int num = sc.nextInt();
    System.out.println("Performing linear search in the array through recursion");
    Linear_Search(arr,0,num);

    // linear search through for loop
    System.out.println("Performing linear search through for loop");
    for(int i =0;i<arr.length;i++)
    {
      if(arr[i]==num)
      {
        System.out.println(arr[i] + " is in index " + i);
      }
    }
  }
  //This function will enter the elements in the array
  static void EnterElementsInAttay(int arr[], int i)
  {
    if(i==arr.length-1)
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
      if(i == arr.length-1)
      {
        return;
      }
      System.out.print(arr[i] + " ");
      PrintArray(arr,i+1);
  }
  //This function will perform linear search on the array
  static void Linear_Search(int arr[], int i,int num)
  {
    if(i==arr.length-1)
    {
      return;
    }
    if(arr[i]==num)
    {
      System.out.println("The number "+num+ " is in index "+i);
    }
    Linear_Search(arr,i+1,num);
  }
}
