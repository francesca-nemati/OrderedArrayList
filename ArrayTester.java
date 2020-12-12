import java.util.*;
public class ArrayTester{

  public static void main(String[] args) {
    NoNullArrayList<String> Narr1 = new NoNullArrayList<String>();
    NoNullArrayList<Integer> Narr2 = new NoNullArrayList<Integer>(5);
    ArrayList<String> Aarr1 = new ArrayList<String>();
    ArrayList<Integer> Aarr2 = new ArrayList<Integer>(5);

    OrderedArrayList<String> Oarr1 = new OrderedArrayList<String>();
    OrderedArrayList<Integer> Oarr2 = new OrderedArrayList<Integer>(5);

    try {
      Aarr1.add("a");
      Aarr1.add("c");
      Aarr1.add("y");
      Aarr1.add(null);
      Aarr1.add("r");

      Aarr2.add(1);
      Aarr2.add(9);
      Aarr2.add(6);
      Aarr2.add(null);
      Aarr2.add(3);

      Narr1.add("a");
      Narr1.add("c");
      Narr1.add("y");
      Narr1.add("r");

      Narr2.add(1);
      Narr2.add(9);
      Narr2.add(6);
      Narr2.add(3);

      Narr1.add(null);
      Narr2.add(null);
    }

    catch (IllegalArgumentException e) {
      System.out.println("NULL was not added");
    }

    Oarr1.add("a");
    Oarr1.add("c");
    Oarr1.add("y");
    Oarr1.add("r");
    Oarr1.add("e");
    Oarr1.add("w");

    Oarr2.add(3);
    Oarr2.add(89);
    Oarr2.add(100);
    Oarr2.add(39);
    Oarr2.add(-2);
    Oarr2.add(5);

    System.out.println(Aarr1.toString());
    System.out.println(Aarr2.toString());
    System.out.println(Narr1.toString());
    System.out.println(Narr2.toString());
    System.out.println(Narr1.add("f"));
    System.out.println(Narr1.set(4,"g"));
    System.out.println(Narr1.toString());
    System.out.println(Oarr1.toString());
    System.out.println(Oarr2.toString());
    Oarr2.add(3, 1);
    Oarr1.add(3, "hi");
    System.out.println(Oarr2.toString());
    System.out.println(Oarr1.toString());
    System.out.println(Oarr1.set(3, "hello"));
    System.out.println(Oarr1.toString());

  }
}
