public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public void add(int index, T element) {
    super.add(rightIndex(element), element);
  }

  public boolean add(T e) {
    super.add(rightIndex(e), e);
    return true;
  }

  public T set(int index, T element){
    if (element == null) throw new IllegalArgumentException ("Cannot add NULL to list");
    T e = super.remove(index);
    add(element);
    return e;
  }

  private int rightIndex(T element){
    if (element == null) return size();
    for (int i = 0; i < size(); i++) {
      if (element.compareTo(get(i)) <= 0) {
        return i;
      }
    }
    return size();
  }
}
