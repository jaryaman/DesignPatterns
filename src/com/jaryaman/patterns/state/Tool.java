package com.jaryaman.patterns.state;

/*A state pattern helps us abide by the "Open closed principle". I.e. classes are open for extension but closed for
* modification. We can add new functionality by adding new classes and test those clases, rather than modifying the
* existing classes and potentially breaking something.
* */
public interface Tool {
    void mouseDown();
    void mouseUp();
}
