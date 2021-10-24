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

    private static void insertAtCorrectPlace(Stack<Integer> st, Integer element) {

        if (st.isEmpty() || st.peek() < element) {
            st.push(element);
            return;
        }

        int temp = st.pop();
        insertAtCorrectPlace(st, element);
        st.push(temp);
    }


    @Test
    public void test() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(5);
        st.push(15);
        st.push(20);
        st.push(8);


        sort(st);

        System.out.println(st.toString());

    }
}
