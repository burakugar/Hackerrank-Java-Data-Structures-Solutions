/*
For this problem, we have  types of queries you can perform on a List:

Insert  at index :

Insert
x y
Delete the element at index :

Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
Constraints


Each element in is a 32-bit integer.


*/




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N= Integer.parseInt(in.nextLine());
        String str= in.nextLine();
        ArrayList<Integer> L = new ArrayList<>(N);   
        String [] tokens= str.split(" ");
        for(String token:tokens){
            L.add(Integer.parseInt(token));
        }
        int N1= Integer.parseInt(in.nextLine());
        for(int i=0;i<N1*2;i++){
            String command= in.nextLine();
            if(command.compareTo("Delete")==0){
                int deleted= Integer.parseInt(in.nextLine());
                L.remove(deleted);
                i++;
            }
            else if(command.compareTo("Insert")==0){
                command= in.nextLine();
                String [] added= command.split(" ");
                L.add(Integer.parseInt(added[0]),Integer.parseInt(added[1]))                ;
                i++;
            }
        }

       for(int i: L){
            System.out.print(i+" ");
        } 
    }
}

