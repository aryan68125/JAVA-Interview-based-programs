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
#### Here you will get an error - ```missing return statement``` because here you should be returning something as you have a function that should return an int value.
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
#### The C and C++ programs which return int from the main function are processes of Operating System. The int value returned from the main in C and C++ is exit code or exit status. The exit code of C and C++ program illustrates, why the program terminated. Exit code 0 means successfull termination. However, non zero exit status indicates error. Example -> exit code 1 depicts Miscellaneous errors, such as "divide by zero".
#### Parent process of any child process keeps on waiting for the exit status of a child. And after recieving the exit status of child, cleans up the child process from the process table and frees the resources allocated to it. Which is why it becomes mandatory for C and C++ programs (which are processes of OS) to pass its exit status from main explicitly or implicitly.
#### process table of an OS looks something like this ->
![](util_images/process_tables.png)

# RECURSION :-
#### Recursion is a method where a function keeps calling itself until a base condition is met.
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
#### let's say ```factorial(int n)``` where ```n=5```. ```if 5>1 true``` then flow of function calling will be ```F[5] : 5 * F[4] --> F[4] : 4 * F[3] --> F[3] : 3 * F[2] --> F[2] : 2 * F[1] --> F[1] : 1```. Now after the base condition which is 1 here is met then flow of return will be ```F[1] : 1 --> F[2] : 2 * 1 = 2 --> F[3] : 3 * 2 = 6 --> F[4] : 4 * 6 = 24 --> F[5] : 5 * 24 = 120```. If the base condition is met then the function calling stops and immidiately the immidiate values are followed up.
![](util_images/recursion/execution_stack.jpeg)
![](util_images/recursion/flow_of_recursion_program.jpeg)
![](util_images/recursion/recursion_and_PMI_one.jpg)
![](util_images/recursion/recursion_and_PMI_two.jpg)
## Power using recursion ->
#### Calculate the power of number if the power is positive using recursion.
![](util_images/recursion/power_using_recursion.jpeg)
## Fibnocci series ->
#### Any position in a fibnocci series is nothing but the sum of the last two digits ``` F(n) = F(n-1) + F(n-2) ```. The first two digits will always be 0 and 1 ``` F(0) = 0 & F(1) = 1 ```
