import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T> {

  set(int index, T element){
    if (element.equals(null)) throw IllegalArgumentException;
    else super.set(index, element);
  }

  add(int index, T element) {
    if (element.equals(null)) throw IllegalArgumentException;
    else super.add(index, element);
  }

  add(T e) {
    if (e.equals(null)) throw IllegalArgumentException;
    else super.add(e);
  }

}
