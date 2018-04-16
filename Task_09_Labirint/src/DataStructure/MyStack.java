package DataStructure;

public class MyStack
{
    private int maxSize;
    private Point[] stackArray;
    private int top;

    public MyStack(int s) {
        maxSize = s;
        stackArray = new Point[maxSize];
        top = -1;
    }

    public void push(Point j) {
        stackArray[++top] = j;
    }

    public Point pop() {
        return stackArray[top--];
    }

    public Point peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }

    public int size() {
        return top;
    }

    public Point element(int index) {
        return stackArray[index];
    }
}
