package com.jaryaman.memento;
// The Memento
public class EditorState {
    // fClarifinal means, once initialised, it cannot be changed again. It is permanent.
    // Hence we don't need a setter because you only set once, through the constructor
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
