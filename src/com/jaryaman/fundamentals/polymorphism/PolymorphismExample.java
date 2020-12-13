package com.jaryaman.fundamentals.polymorphism;

import com.jaryaman.fundamentals.inheritance.TextBox;

public class PolymorphismExample {
    public static void main(){
        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }
    public static void drawUIControl(UIControl control){
        /*
        * This is the point. At run time, the control object can take on many different forms.
        * poly = many; morphic = forms. It can behave as a checkbox, a textbox, or any other concrete implementation
        * of a UI control
        * */
        control.draw();
    }
}


