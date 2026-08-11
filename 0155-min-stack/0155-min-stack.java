
class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public MinStack() {
        // No need to initialize again
    }

    public void push(int value) {
        stack.push(value);

        // If minStack is empty, current value is minimum
        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            // Store the minimum value so far
            minStack.push(Math.min(value, minStack.peek()));
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

