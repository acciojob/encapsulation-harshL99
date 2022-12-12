package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj=new RWOnly();
/*     obj.name="Harsh";
     System.out.println(obj.name);
      Can't Access member variable of class RWOnly as it is Private in nature so it is not having scope till this class...
      */

      obj.setName("Harsh");
      System.out.println(obj.getName());
  }
}