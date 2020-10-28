public class Node2<T> {
  private Node2<T> next;
  private Node2<T> prev;
  private T data;

  Node2(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Node2<T> next() {
    return next;
  }

  public void setNext(Node2<T> next) {
    this.next = next;
  }

  public Node2<T> prev() {
    return prev;
  }

  public void setPrev(Node2<T> prev) {
    this.prev = prev;
  }
}
