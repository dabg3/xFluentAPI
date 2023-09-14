package me.dabg.jflowlang;

import org.junit.jupiter.api.Test;

import static me.dabg.jflowlang.TypeEncoding3.Stack;
import static me.dabg.jflowlang.TypeEncoding1.γ_.γ;

/*
 * Compile-time stuff, no runtime assertions
 */
public class TypeEncodingCompileTest {

    @Test
    public void testEncoding1() {
        γ.γ2 gamma2 = new γ.γ1().g();
    }

    @Test
    public void testEncoding2() {
        γ.γ1 gamma1 = TypeEncoding2.f.r1().s1();
    }

    @Test
    public void testEncoding3() {
        Stack.P<γ.γ1, Stack.E> stack = Stack.empty.γ1();
        Stack.P<γ.γ2, Stack.P<γ.γ1, Stack.E>> stack2 = stack.γ2();

        Stack.P<γ.γ1, Stack.E> stackPop = stack2.pop();
    }

}
