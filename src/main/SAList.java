public class SAList {
  private ListNode front; // first node of this list (null if empty)
  private int listSize; // the number of elements in this list
  private int remIndex; // the index of the remembered node
  private ListNode remNode; // a reference to the node accessed by most recent call to get

  /** Constructs an empty SAList. */
  public SAList() {
    front = null;
    remIndex = -1;
    remNode = null;
    listSize = 0;
  }

  public int size() {
    return listSize;
  }

  public void addFirst(Object obj) {
    ListNode node = new ListNode(obj, front);
    this.front = node;
    remIndex = listSize;
    listSize++;
  }

  public Object get(int n) {
    ListNode current;
    int currentIndex;

    if (remIndex <= n && remNode != null) {
      current = remNode;
      currentIndex = remIndex;
    } else {
      current = front;
      currentIndex = 0;
    }

    while (currentIndex < n && current != null) {
      current = current.getNext();
      currentIndex++;
    }

    remNode = current;
    remIndex = currentIndex;

    if (current != null) {
      return current.getValue();
    } else {
      return null;
    }

  }

  public int getMostRecentIndex() {
    return this.remIndex;
  }

  public Object getMostRecentValue() {
    return this.remNode.getValue();
  }

}
