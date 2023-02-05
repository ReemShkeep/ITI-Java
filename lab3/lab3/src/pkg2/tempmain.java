package pkg2;

import pkg1.tempConvert;

public class tempmain {
    public static void main(String[] args) {
      float x=24;
      tempConvert obj = new tempConvert();
      System.out.println("Temp is = "+x+"C or " +obj.apply(x) + "F");
      
      
    }
}
