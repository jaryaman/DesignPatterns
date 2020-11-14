package com.jaryaman;

public abstract class UIControl {
    public void enable() {
        System.out.println("Enable");
    }
    public void disable() {
        System.out.println("Disable");
    }

    public abstract void draw();  // implementation depends on the concrete instance


}
