// Last updated: 7/9/2026, 9:51:17 AM
class MyQueue {

    // Pop Efficient Queue

    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {

        if (st.size() == 0) {
            st.push(x);
        }
        else {

            while (st.size() > 0) {
                helper.push(st.pop());
            }

            st.push(x);

            while (helper.size() > 0) {
                st.push(helper.pop());
            }
        }
    }

    public int pop() {
        return st.pop();
    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {

        if (st.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}