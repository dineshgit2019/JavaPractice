package org.example;

 class CopyConstructor {
  private int x ;
  CopyConstructor(int i)
  {
    this.x= i ;
  }
  CopyConstructor(CopyConstructor obj)
  {
    this.x= obj.x;
    System.out.println("copy constructor is called");
  }
}
public  class CopyConstructorExample
{
  public static void main(String[] args) {
    CopyConstructor c1 = new CopyConstructor(10);
    CopyConstructor c2 = new CopyConstructor(c1);


  }
}
