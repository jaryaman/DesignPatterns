package com.jaryaman.patterns.memento;
// Implementing undo on an editor, which contains a string as its state

public class MementoExample {
    public static void main(){
        var editor = new Editor();
        var history = new History();


        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }
}
