package DataStructure;

final public class MyResult {
    private final MyStack first;
    private final boolean second;

    public MyResult(MyStack first, boolean second) {
        this.first = first;
        this.second = second;
    }

    public MyStack getStack() {
        return first;
    }

    public boolean getFinalOut() {
        return second;
    }
}
