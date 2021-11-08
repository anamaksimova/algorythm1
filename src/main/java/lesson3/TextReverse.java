package lesson3;

public class TextReverse {
    private String exp;

    public TextReverse(String exp) {
        this.exp = exp;
    }

    public String textReverse() {
        MyStack<Character> stack = new MyStack<>(exp.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            stack.push(ch);}
        do {
            sb.append(stack.pop());
        }
        while (!stack.isEmpty());

        return sb.toString();
    }
    }


