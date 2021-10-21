package recursion;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class ReverseAStack {


    private void reverse(Stack<Integer> st) {

        if (st.isEmpty()) return;

        int element = st.pop();
        reverse(st);

        insertAtBottom(st, element);
    }


    public static void insertAtBottom(Stack<Integer> st, int element) {
        if (st.isEmpty()) {
            st.push(element);
            return;
        }

        int temp = st.pop();
        insertAtBottom(st, element);
        st.push(temp);
    }


    @Test
    public void test() {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        st.push(10);
        st.push(15);
        st.push(20);

        System.out.println(st.toString());

        reverse(st);
        System.out.println(st.toString());

    }
}
