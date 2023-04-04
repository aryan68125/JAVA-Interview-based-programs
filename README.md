# JAVA interview based programs
## This repository contains interview based programs in java that are asked in the company exams and during the interview.
## Example code 1 ->
```
public class LearnCoding
{
  public static void main(String args[])
  {
    System.out.println("Hello World");
  }
}
```
### Explaining the example code 1
#### Here in the above program whatever written inside the main function gets executed first in it's respective order.
```
public static void main(String args[])
```
#### class : This Keyword is used to declare a ```class``` in Java
#### public : Here the ```public``` means that all the other methods or functions of ```LearnCoding``` class can access the ```main``` method.
#### void : Here ```void``` means that the ```main``` method should not return anything.
#### static : For any particular function of any particular class, if you want to use any method of any class we need to create objects. Whenever you create an object of a class it requires memory. If you declare something ```static``` you can invoke or revoke that method without using any objects. Hence it saves memory because we don't need to create any object here.
#### public static void main (psvm) : It;s the first function that is being executed in Java.
#### main : It represents the starting point of the program.
#### String[] args : It is used for command line argument. Here the name of the String array is args but it is not fixed and user can use any name in place of it.
#### System.out.println : It is used to print the content written inside the bracket inside double quotes in the terminal or a console and then move the cursor to the next line because here we have use ```println```.
## Now what happens if we change ```public static void main``` to ```public static int main```
```
public class LearnCoding
{
  public static int main(String args[])
  {
    System.out.println("Hello World");
  }
}
```
Here you will get an error - ```missing return statement``` because here you should be returning something as you have a function that should return an int value.
## What if Let's say we ```return 0```
#### Now the code looks like this ->
```
public class LearnCoding
{
  public static int main(String args[])
  {
    System.out.println("Hello World");
    return 0;
  }
}
```
#### But even after returning 0 we still get this error ```Main method must return a value of type void in class LearnCoding, please define the main method as : public static void main(String[] args)```.
#### So why is this happening?
The C and C++ programs which return int from the main function are processes of Operating System. The int value returned from the main in C and C++ is exit code or exit status. The exit code of C and C++ program illustrates, why the program terminated. Exit code 0 means successfull termination. However, non zero exit status indicates error. Example -> exit code 1 depicts Miscellaneous errors, such as "divide by zero".
Parent process of any child process keeps on waiting for the exit status of a child. And after recieving the exit status of child, cleans up the child process from the process table and frees the resources allocated to it. Which is why it becomes mandatory for C and C++ programs (which are processes of OS) to pass its exit status from main explicitly or implicitly.
#### process table of an OS looks something like this ->
![](util_images/process_tables.png)

# RECURSION :-
Recursion is a method where a function keeps calling itself until a base condition is met.
#### Example sudo code of recursion : Here we are calculating the factorial of n ->
```
 //recursive function that calls itself until a base condition is met here the base condition is 1 and it's calculating factorial.
 static int fact(int n)
 {
   if (n>1)
     {
       return n*fact(n-1);
     }
   else
   {
      return 1 ;
   }
 }

```
let's say ```factorial(int n)``` where ```n=5```.  
* if n>1 true then flow of function calling will be ```F[5] : 5 * F[4] --> F[4] : 4 * F[3] --> F[3] : 3 * F[2] --> F[2] : 2 * F[1] --> F[1] : 1```.  
* Now after the base condition which is 1 here is met then flow of return will be ```F[1] : 1 --> F[2] : 2 * 1 = 2 --> F[3] : 3 * 2 = 6 --> F[4] : 4 * 6 = 24 --> F[5] : 5 * 24 = 120```.  
* If the base condition is met then the function calling stops and immidiately the immidiate values are followed up.
![](util_images/recursion/execution_stack.jpeg)
![](util_images/recursion/flow_of_recursion_program.jpeg)
![](util_images/recursion/recursion_and_PMI_one.jpg)
![](util_images/recursion/recursion_and_PMI_two.jpg)
## Power using recursion ->
```
// calculate the power of a number if the power is positive
static long p(long x, long n)
{
  if (n!=0)
  {
    return x*p(x,n-1);
  }
  else
  {
    return 1;
  }
}
```
#### Calculate the power of number if the power is positive using recursion.
![](util_images/recursion/power_using_recursion.jpeg)
## Fibnocci series ->
```
static int fib(int n)
{
if (n==0)
{
  return 0;
}
if(n==1 || n==2)
{
  return 1;
}
return fib(n-1)+fib(n-2);
}
```
Any position in a fibnocci series is nothing but the sum of the last two digits ``` F(n) = F(n-1) + F(n-2) ```.  
The first two digits will always be 0 and 1 ``` F(0) = 0 & F(1) = 1 ```  
A tree will form because of parallel recursion when calculating fibnocci numbers through recursion technique.
![](util_images/recursion/flo_of_fibnocci_function_calling.jpeg)
## First and Last occurance in array ->
Let's say there is an array ``` A[3,5,7,2,4,5] ``` here we need to search for 5 in  
this array and print the first index of it i.e search for first occurance of 5 in  
the array. But before we do that let's clear out some basics.
#### enter the array elements recursively
```
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
```
#### print the array elements recursively
```
//Print elements in the array recursively
static void printArray(int arr[],int i)
{
    if(i==arr.length)
    {
      return;
    }
    System.out.println(arr[i]);
    //i++ will not be accepted here it will cause the code to explode use i+1 instead
    printArray(arr,i+1);
 }
```
#### Tree representing the flow of function calling and dataflow
![](util_images/recursion/recursive_array_print.png)
#### Printing array in reverse order
```
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
```
#### First occurance -> It means the first appearance of an element in the array.
```
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
```
#### Last occurance -> It means the last appearance of an element in the array.
```
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
```
## Largest and smallest number in the array through recursion
```
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
```
```
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
```
## Practice questions
### Problem 1 - Figure out the pattern and solve it using a recursive function to achieve the above for any positive number n
sample input 1----1  
sample output 1-----111  
sample input 2----2  
sample output 2----211121112  
sample input 2----3  
sample output 3----321112111232111211123
```
//This recursive function will print the pattern
public static void printpattern(int n){
    if(n == 0){
        return;
    }
    System.out.print(n + " ");
    printpattern(n-1);
    System.out.print(n + " ");
    printpattern(n-1);
    System.out.print(n + " ");
}
```
# Arrays :-
## Linear search
Points to remember  
* Time complexity O(n) Because there is only 1 for loop.
* Best case senario time complexity O(1) When the element to be searched is in First position.
* Worst case time complexity O(n) When the element to be searched is at the Last position.
* Space complexity O(1) because the size of the array is not growing it is constant.
* Average comparisions (n+1)/2
### Linear search algorithm outline
![](util_images/arrays/linear_search_algo.png)
### Linear search through recursion
```
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
```
### Linear search through for loop
```
for(int i =0;i<arr.length;i++)
{
  if(arr[i]==num)
  {
    System.out.println(arr[i] + " is in index " + i);
  }
}
```
## Binary Search
![](util_images/arrays/binary_search_1.png)
![](util_images/arrays/binary_search_2.png)
Points to remember
* Time complexity O(log n)
* Best case senario time complexity O(1) When the element to be searched is in First position.
* Worst case time complexity O(log n) When the element to be searched is at the Last position.
* Space complexity O(1) because the size of the array is not growing it is constant.
#### Important NOTE : Binary search is only useful when the array is sorted either in ascending order or in descending order.
### Binary search through recursion
```
//This function will perform binary search on the array
/*
This recusrion method of binary search will only work if the array is in
the ascending order. I will not work if the array is in descending order.
*/
static int Binary_Search(int arr[],int left,int right,int num)
{
  int mid ;
  if(right>=left)
  {
    mid = left + (right - left)/2;
    if(arr[mid]==num)
    {
      return mid;
    }
    else if(num<arr[mid])
    {
      return Binary_Search(arr,left,mid-1,num);
    }
    else //if num>arr[mid]
    {
      return Binary_Search(arr,mid+1,right,num);
    }
  }
  else //if the number is not found in the array
  {
    return -1;
  }
}
```
### Binary search using for loop
```
//binary search through while loop
public static void binarySearchWhileLoop(int arr[],int left, int right, int num)
{
  int mid = (left+right)/2;
  while(left<=right)
  {
    if(arr[mid]<num)
    {
      left = mid+1;
    }
    else if(arr[mid]>num)
    {
      right = mid-1;
    }
    else
    {
      System.out.println(arr[mid]+" is in index "+mid);
      break;
    }
    mid = (left+right)/2;
  }
  if(left>right)
  {
    System.out.println("Element not found");
  }
}
```
## Bubble sort
The reason why this algo is called bubble sort because it takes inspiration from a bubble formed in a cold drink.  
The largest bubble formed at the bottom of the glass rises to the top towards the surface more quickly than the smaller ones.  
Bubble Sort is the elementary sorting algorithm for sorting various data structures. It is a comparison-based sorting algorithm in which each element is compared with the next element, and is swapped if those elements are not in the correct order.
* The algorithm starts with comparing the first pair of elements.
* If the first element is smaller than the second element, then the elements are swapped
* This algorithm is not suitable for large data sets.  
### bubble sort algorithm outline
![](util_images/arrays/bubble_sort_1.png)
![](util_images/arrays/bubble_sort_2.png)  
Algorithm for Bubble Sort in Java
* Step1: Repeat step 1 to 4 for i=0 to n
* Step2: For j=0 to n
* Step3: if(arr[j]>arr[j+1]
* Step4: swap(arr[j],arr[j+1])
* Step5: End  
Bubble sort algotrithm visualization with example :  
![](util_images/arrays/bubble_sort_3.png)  
#### NOTE: Bubble sort is a swapping algorithm because at any point in time swapping between the elements happens.  
#### Pros and Cons of bubble sort
#### Pros:  
* Easy to implement
* Cool to implement
* Gives largest value of the array in the first iteration itself.
* Gives the smallest value of the array in the first iteration itself (with minor tweaks in the implementation).
* No demand for large amount of memory for operation.
#### Cons :
* Noob (Bad) algorithm
* very horrible time complexity O(n^2)
### Bubble sort using loops
```
//bubble sort using loop
public static void bubbleSortUsingLoop(int arr[])
{
  /*
  The reason why we are using arr.length-1 in the loop for passes because j+1
  will go out of bounds if we would have run the loop for arr.length
  */
  for(int i =0;i<arr.length-1;i++) //loop for number of passes
  {
    /*
     pass 1 : i=0 len=5
              j< len - 0 -1 ; 5-0-1=4
              j will run from 0 to 4 (number of iterations in each pass)
     pass 2 : i=1 len=5
              j< len - 1 -1 ; 5-1-1=3
              j will run from 0 to 3 (number of iterations in each pass)
     pass 2 : i=2 len=5
              j< len - 2 -1 ; 5-2-1=2
              j will run from 0 to 2 (number of iterations in each pass)
    pass 2 : i=3 len=5
             j< len - 3 -1 ; 5-3-1=1
             j will run from 0 to 1 (number of iterations in each pass)
    */
    for(int j = 0;j<arr.length-i-1;j++) //loop for number of iterations
    {
      if(arr[j]>arr[j+1])
      {
        int temp = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
    }
  }
}
```
