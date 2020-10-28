public class Node<T> {
  private Node<T> next;
  private T data;

  Node(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Node<T> next() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }
}
