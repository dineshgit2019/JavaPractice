package org.example;

public class ReverseADigit {

  public static void main(String[] args) {
    int i = 12345;

    int cnt =0;
    while (i>0)
    {
      cnt =cnt*10+ i%10;
      i=i/10;
    }
    System.out.println(cnt);
  }
}
