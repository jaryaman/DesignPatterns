package com.jaryaman;

public class PolymorphismExample {
    public static void main(){
        drawUIControl(new TextBox());
    }
    public static void drawUIControl(UIControl control){
        control.draw();
    }
}


