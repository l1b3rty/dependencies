package org.gl4u.general;

import org.gl4u.consumer1.Consumer1;
import org.gl4u.consumer2.Consumer2;

public class App {

    public static void main(String[] args) {
        Consumer2 c2 = new Consumer2();
        Consumer1 c1 = new Consumer1();

        c2.useConflictClass();
        c1.useConflictClass();
    }

}
