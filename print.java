package javaapplication4;
public class print {
  public static <A> void printarr(A[] arr) {
    for (A genric:arr)
       System.out.printf("%s ",genric);
    System.out.println();
  }
  public static void main(String args[]) {
    Integer[] intArray={1,2,3,4,5,6,7,8,9};
    Double[] doubleArray={1.1,2.2,3.3,4.4};
    Character[] charArray={'J','A','V','A'};
    System.out.println("Integer Array : ");
    printarr(intArray);
    System.out.println("Char Array : ");
    printarr(charArray);
    System.out.println("Double Array : ");
    printarr(doubleArray);  
  }
}