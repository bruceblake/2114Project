import junit.framework.TestCase;

public class SAListTest {

  private SAList list;
  private Object a;
  private Object b;
  private Object c;

  public void setUp() {
    // c -> b -> a -> null
    list = new SAList();
    list.addFirst(a, null);
    list.addFirst(b, a);
    list.addFirst(c, b);
  }

  public void testSize() {
    assertEquals(list.size(), 3);
    Object d = new Object();
    list.addFirst(d, c);
    assertEquals(list.size(), 4);
  }

  public void testAddFirst(Object obj) {

  }

  public void setGet(int n) {

  }

  public void testGetMostRecentIndex() {

  }

  public void testGetMostRecentValue() {

  }
}
