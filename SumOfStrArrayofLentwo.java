package org.example;// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class SumOfStrArrayofLentwo {

  public int solution(String arr[]) {
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i].length() == 2)
        {
              sum += Integer.parseInt(arr[i]);
        }
    }

    return  sum;
  }

  public static void main(String[] args) {
    String []arr = {"12","21","1","4"};
    System.out.println(new SumOfStrArrayofLentwo().solution(arr));
  }
}