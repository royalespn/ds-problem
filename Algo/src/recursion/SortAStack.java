package recursion;

import org.junit.jupiter.api.Test;

import java.util.Stack;


/*

https://www.youtube.com/watch?v=lDThYwMDNTU&ab_channel=ProgrammingTutorials

https://www.youtube.com/watch?v=_s6GokFRsiI&ab_channel=ProgrammingTutorials

*/

public class SortAStack {


    private static void sort(Stack<Integer> st) {

        if (st.isEmpty()) return;

        int element = st.pop();
        sort(st);

        insertAtCorrectPlace(st, element);

    }

    private static void insertAtCorrectPlace(Stack<Integer> st, Integer i) {

        if (st.isEmpty() || st.peek() < i) {
            st.push(i);
            return;
        }

        int element = st.pop();
        insertAtCorrectPlace(st, i);
        st.push(element);
    }


    @Test
    public void test() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(5);
        st.push(15);
        st.push(20);

        sort(st);

        System.out.println(st.toString());

    }
}
