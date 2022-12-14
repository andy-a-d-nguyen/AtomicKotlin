// interoperability/UsingKotlinClass.java
package interoperability;

import interop.Basic;

import static atomictest.AtomicTestKt.eq;

public class UsingKotlinClass {
    public static void main(String[] args) {
        Basic b = new Basic();
        eq(b.getProperty1(), 1);
        b.setProperty1(12);
        eq(b.value(), 120);
    }
}