import static org.junit.Assert.*;
import java.util.*;

import java.beans.Transient;

import org.junit.*;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> ref = new ArrayList<>();
        ref.add("hello");
        ref.add("hellicious");
        ref.add("helicopter");
        ref.add("world");
        ref.add("computers");

        List<String> answer = new ArrayList<>();
        answer.add("hello");
        answer.add("hellicious");
        answer.add("helicopter");

        StringChecker sc = new StringChecker() {
            public boolean checkString(String s) {
                if (s.contains("hel")) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        assertEquals(answer, ListExamples.filter(ref, sc));
    }

    @Test
    public void testMerge() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("d");
        list2.add("e");

        List<String> answer = new ArrayList<>();
        answer.add("a");
        answer.add("b");
        answer.add("b");
        answer.add("c");
        answer.add("d");
        answer.add("e");

        assertEquals(answer, ListExamples.merge(list1, list2));
    }
}
