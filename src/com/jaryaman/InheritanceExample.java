package com.jaryaman;

public class InheritanceExample {
    public static void main() {
        var textBox = new TextBox();

        // This is the point for inheritance. Textbox doesn't implement enable directly, it inherits this method from
        // it parent UIControl
        textBox.enable();

    }
}
