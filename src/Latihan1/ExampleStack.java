package Latihan1;

public class ExampleStack {

    private final int maxSize;
    private int top;
    private final String[] stackArray;

    public ExampleStack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String element) {
        stackArray[++top] = element;
    }

    public String pop() {
        return stackArray[top--];
    }

    public String peek() {
        return stackArray[top];
    }

    public int search(String element) {
        int position = top;
        while (position >= 0) {
            if (stackArray[position].equals(element)) {
                return top - position + 1;
            }
            position--;
        }
        return -1;
    }

    public boolean empty() {
        return top == -1;
    }

    public static void main(String[] args) {
        ExampleStack st = new ExampleStack(5);

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Nest: " + st.peek());
        st.push("raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        if (count !=-1 && count >1){
            for (int i = 1; i < count; i++){
                st.pop();
            }
        }

        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}

