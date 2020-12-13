package com.jaryaman.patterns.memento;

import java.util.ArrayList;
import java.util.List;

// The Caretaker
public class History {
    // History is *composed* of EditorState
    private List<EditorState> states = new ArrayList<>();  // A list of EditorState objects

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}
