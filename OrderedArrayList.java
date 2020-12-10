public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public void add(int index, T element) {
    for (int i = 0; i < size(); i++) {
      if (e.compareTo(get(i)) <= 0) {
        super.add(i,e);
      }
    }
    super.add(size(),e);
  }

  public boolean add(T e) {
    for (int i = 0; i < size(); i++) {
      if (e.compareTo(get(i)) <= 0) {
        super.add(i,e);
      }
    }
    super.add(size(),e);
  }

  public T set(int index, T element){

  }

}
