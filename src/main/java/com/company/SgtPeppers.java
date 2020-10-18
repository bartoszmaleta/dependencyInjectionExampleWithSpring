package com.company;

public class SgtPeppers implements CompactDisc {

    @Override
    public void play() {
        System.out.println("Sgt peppers");
    }

    // it will not be initialized as CompactDisc by Spring because it does not have 'Component' annotation.
}
