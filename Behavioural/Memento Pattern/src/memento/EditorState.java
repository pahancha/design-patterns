package memento;

public class EditorState {
    //make this field private because I do not want to accidentally change it. :)
    private final String content;

    public EditorState(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
