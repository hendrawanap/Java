public class Stack<T> {
  private Node2<T> top;
  private int size;

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    if (isEmpty())
      return "[]";
    else {
      String output = "[";
      Node2<T> current = top;
      while (current != null) {
        if (current.prev() != null)
          output += current.getData() + ", ";
        else
          output += current.getData() + "]";
        current = current.prev();
      }
      return output;
    }
  }

  public void push(T data) {
    if (isEmpty())
      top = new Node2<T>(data);
    else {
      Node2<T> input = new Node2<T>(data);
      top.setNext(input);
      input.setPrev(top);
      top = input;
    }
    size++;
  }

  public T pop() {
    if (isEmpty())
      return null;
    else {
      Node2<T> popped = top;
      top = popped.prev();
      popped.setPrev(null);
      top.setNext(null);
      size--;
      return popped.getData();
    }
  }

  public T peek() {
    if (isEmpty())
      return null;
    else
      return top.getData();
  }
  
}

class TestStack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    System.out.println(stack);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println(stack);
    stack.pop();
    stack.pop();
    stack.pop();
    System.out.println(stack);
    stack.push(6);
    stack.push(7);
    stack.push(8);
    stack.push(9);
    System.out.println(stack);
    stack.push(10);
    stack.push(11);
    stack.push(12);
    System.out.println(stack);
  }
}
