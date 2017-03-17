package kata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NonEmptyList<T> implements Iterable<T>{

  private List<T> nonEmptyList = new ArrayList<T>();
  
  public NonEmptyList(T first) {
    add(first);
  }

  @Override
  public Iterator<T> iterator() {
    return nonEmptyList.iterator();
  }

  public void add(T valueOf) {
    nonEmptyList.add(valueOf);
  }

}
