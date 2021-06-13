import memento.Editor;
import memento.History;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        //current state is a
        editor.setContent("a");
        history.push(editor.createState());

        //current state is b
        editor.setContent("b");
        history.push(editor.createState());

        //current state is c
        editor.setContent("c");

        //current state will be set to b
        editor.restore(history.pop());


        //prints b\
        System.out.println(editor.getContent());

    }
}
