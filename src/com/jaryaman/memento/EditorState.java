package com.jaryaman.memento;
// The Memento
public class EditorState {
    private final String content; // final means, once initialised, it cannot be accidentally changed

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
