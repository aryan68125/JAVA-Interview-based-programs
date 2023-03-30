/*
Figure out the pattern and solve it using a recursive function to achieve the
above for any positive number n
sample input 1----1
sample output 1-----111
sample input 2----2
sample output 2----211121112
sample input 2----3
sample output 3----321112111232111211123
*/
import java.io.*;
import java.util.*;

public class print_pattern {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Printing pattern");
        printpattern(n);
        System.out.println("\n");
    }

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
}
