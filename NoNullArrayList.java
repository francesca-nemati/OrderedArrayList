import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList(){
      super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set(int index, T element){
    if (element == null) throw new IllegalArgumentException ("Cannot add NULL to list");
    else return super.set(index, element);
  }

  public void add(int index, T element) {
    if (element == null) throw new IllegalArgumentException ("Cannot add NULL to list");
    else super.add(index, element);
  }

  public boolean add(T e) {
    if (e == null) throw new IllegalArgumentException ("Cannot add NULL to list");
    else return super.add(e);
  }

}
