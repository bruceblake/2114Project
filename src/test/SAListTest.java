
import junit.framework.TestCase;
import java.util.*;

public class SAListTest extends TestCase {

  class Student {
    public String name;

    public Student(String name) {
      this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null || getClass() != obj.getClass())
        return false;
      Student student = (Student) obj;
      return name.equals(student.name);
    }

  }

  private SAList list;
  private Object a;
  private Object b;
  private Object c;
  private Object d;
  private Object e;

  public void setUp() {
    list = new SAList();
    a = new Student("A");
    b = new Student("B");
    c = new Student("C");
    d = new Student("D");
    e = new Student("E");

    list.addFirst(e);
    list.addFirst(d);
    list.addFirst(c);
    list.addFirst(b);
    list.addFirst(a);
  }

  public void testSize() {
    assertEquals(list.size(), 5);
    Object f = new Student("F");
    list.addFirst(f);
    assertEquals(list.size(), 6);
  }

  public void testAddFirst() {
    Object shouldBeA = list.get(0);
    assertTrue(shouldBeA.equals(a));
    Object f = new Student("F");
    list.addFirst(f);
    Object shouldBeF = list.get(0);
    assertTrue(shouldBeF.equals(f));
    Object z = new Student("Z");
    list.addFirst(z);
    Object shouldBeZ = list.get(0);
    assertTrue(z.equals(shouldBeZ));
  }

  public void testGet() {
    Object shouldBeA = list.get(0);
    assertTrue(shouldBeA.equals(a));
    assertEquals(list.getMostRecentIndex(), 0);
    assertEquals(list.getMostRecentValue(), shouldBeA);

    Object shouldBeB = list.get(1);
    assertTrue(shouldBeB.equals(b));
    assertEquals(list.getMostRecentIndex(), 1);
    assertEquals(list.getMostRecentValue(), shouldBeB);

    Object shouldBeE = list.get(4);
    assertTrue(shouldBeE.equals(e));
    assertEquals(list.getMostRecentIndex(), 4);
    assertEquals(list.getMostRecentValue(), shouldBeE);

  }

}
