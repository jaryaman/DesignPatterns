package com.jaryaman.memento;

import org.jetbrains.annotations.NotNull;

// The Originator
public class Editor {
    private String content;

    // Editor has a *dependency* upon EditorState. Editor does not talk to History
    // at all.
    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(@NotNull EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
