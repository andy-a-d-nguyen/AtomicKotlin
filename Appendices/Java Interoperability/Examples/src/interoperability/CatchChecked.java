// interoperability/CatchChecked.java
package interoperability;

import interop.AnnotateThrowsKt;

import java.io.IOException;

import static atomictest.AtomicTestKt.eq;

public class CatchChecked {
    public static void main(String[] args) {
        try {
            AnnotateThrowsKt.hasCheckedException();
        } catch (IOException e) {
            eq(e, "java.io.IOException");
        }
    }
}