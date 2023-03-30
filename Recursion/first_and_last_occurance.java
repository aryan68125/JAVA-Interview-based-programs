//This program will print the first occurance of an element in the array
import java.util.*;
public class first_and_last_occurance
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the element one by one in the array");
    enterArray(arr,0);
    System.out.println("Printing the array elements normally");
    printArray(arr,0);
    System.out.println("\n");
    System.out.println("Printing array in reverse order");
    printArrayReverse(arr,arr.length-1);
    System.out.println("\n");

    System.out.println("Enter the number whoes first occurance you want to find");
    int number = sc.nextInt();
    first_occurance_element(arr,0,number);
    System.out.println("Enter the number whoes last occurance you want to find");
    last_occurance_element(arr,arr.length-1,number);

    System.out.println("Finding the largest element in the array");
    largest(arr,0,0);
    System.out.println("Finding the smallest element in the array");
    smallest(arr,0,999999999);
    }

    //Enter elements in the array recursively
    static void enterArray(int arr[],int i)
    {
        if(i==arr.length)
        {
          return;
        }
        Scanner sc2 = new Scanner(System.in);
        arr[i] = sc2.nextInt();
        //i++ will not be accepted here it will cause the code to explode use i+1 instead
        enterArray(arr,i+1);
    }
    //Print elements in the array recursively normally
    static void printArray(int arr[],int i)
    {
        if(i==arr.length)
        {
          return;
        }
        System.out.print(arr[i] + " ");
        //i++ will not be accepted here it will cause the code to explode use i+1 instead
        printArray(arr,i+1);
     }
     //Print elements in the array recursively in reverse order
     static void printArrayReverse(int arr[],int i)
     {
         if(i==-1)
         {
           return;
         }
         System.out.print(arr[i] + " ");
         //i++ will not be accepted here it will cause the code to explode use i+1 instead
         printArrayReverse(arr,i-1);
      }
      //printing the first occurance of the element in the array
      static void first_occurance_element(int arr[],int i,int num)
      {

        if(i==arr.length)
        {
          return;
        }
        if (arr[i]==num)
        {
          System.out.println(arr[i] + " first occured in index "+i);
          return;
        }
        //i++ will not be accepted here it will cause the code to explode use i+1 instead
        first_occurance_element(arr,i+1,num);
      }
      //printing the last occurance of the element in the array
      static void last_occurance_element(int arr[],int i,int num)
      {
          if(i==-1)
          {
            return;
          }
          if (arr[i]==num)
          {
            System.out.println(arr[i] + " last occurance is in index "+i);
            return;
          }
          //i++ will not be accepted here it will cause the code to explode use i+1 instead
          last_occurance_element(arr,i-1,num);
       }
       //finding the largest number in the array
       static void largest(int arr[],int i,int largest)
       {
         if (i==arr.length)
         {
           System.out.println("Largest element in the array is = "+largest);
           return;
         }
         if (arr[i]>largest)
         {
           largest = arr[i];
         }
         largest(arr,i+1,largest);
       }
       //finding the smallest element in the array
       static void smallest(int arr[],int i,long smallest)
       {
         if (i==arr.length)
         {
           System.out.println("Smallest element in the array is = "+smallest);
           return;
         }
         if(arr[i]<smallest)
         {
           smallest = arr[i];
         }
         smallest(arr,i+1,smallest);
       }
}
