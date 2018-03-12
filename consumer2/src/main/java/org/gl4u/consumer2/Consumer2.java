package org.gl4u.consumer2;

import otg.gl4u.common.ConflictClass;

public class Consumer2 {

    public void useConflictClass() {
        ConflictClass cl = new ConflictClass();
        String res = cl.printAndReturnSmth();
        System.out.println(res);
    }

}
