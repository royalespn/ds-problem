package recursion;

import org.junit.jupiter.api.Test;
import java.util.Stack;

public class RemoveMiddleElementInStack {

    private void removeMiddle(Stack<Integer> st, int size, int current) {

        if (st.empty() || current == size) {
            return;
        }

        int element = st.pop();
        removeMiddle(st, size, current + 1);

        if (current != size / 2) {
            st.push(element);
        }
    }


    @Test
    public void test() {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(30);

        removeMiddle(st, st.size(), 0);
        System.out.println(st.toString());


        Stack<Integer> st2 = new Stack<>();
        st2.push(5);
        st2.push(10);
        st2.push(15);
        st2.push(20);

        removeMiddle(st2, st2.size(), 0);
        System.out.println(st2.toString());
    }
}
