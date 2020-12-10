import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T> {

  public T set(int index, T element){
    if (element.equals(null)) throw IllegalArgumentException;
    else super.set(index, element);
  }

  public void add(int index, T element) {
    if (element.equals(null)) throw IllegalArgumentException;
    else super.add(index, element);
  }

  public boolean add(T e) {
    if (e.equals(null)) throw IllegalArgumentException;
    else super.add(e);
  }

}
