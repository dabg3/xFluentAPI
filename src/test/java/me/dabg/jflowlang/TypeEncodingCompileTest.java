package me.dabg.jflowlang;

import org.junit.jupiter.api.Test;
/*
 * Compile-time stuff, no runtime assertions
 */
public class TypeEncodingCompileTest {

    @Test
    public void testEncoding1() {
        TypeEncoding1.γ_.γ.γ2 gamma2 = new TypeEncoding1.γ_.γ.γ1().g();
    }

    @Test
    public void testEncoding2() {
        TypeEncoding1.γ_.γ.γ1 gamma1 = TypeEncoding2.f.r1().s1();
    }

}
