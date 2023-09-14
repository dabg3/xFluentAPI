package me.dabg.jflowlang;

/**
 * Type encoding of an unbounded depth stack via generics
 */
public class TypeEncoding3 {

    public static abstract class Stack<Rest extends Stack<?>> {
        public abstract TypeEncoding1.γ_ top();
        public abstract Rest pop();

        public abstract Stack<?> γ1();
        public abstract Stack<?> γ2();

        public static class P<Top extends TypeEncoding1.γ_.γ, Rest extends Stack<?>> extends Stack<Rest> {

            @Override
            public Top top() {
                return null;
            }

            @Override
            public Rest pop() {
                return null;
            }

            @Override
            public P<TypeEncoding1.γ_.γ.γ1, P<Top, Rest>> γ1() {
                return null;
            }

            @Override
            public P<TypeEncoding1.γ_.γ.γ2, P<Top, Rest>> γ2() {
                return null;
            }
        }

        public static class E extends Stack<¤> {

            @Override
            public TypeEncoding1.γ_.¤ top() {
                return null;
            }

            @Override
            public ¤ pop() {
                return null;
            }

            @Override
            public P<TypeEncoding1.γ_.γ.γ1, E> γ1() {
                return null;
            }

            @Override
            public P<TypeEncoding1.γ_.γ.γ2, E> γ2() {
                return null;
            }
        }

        public static final E empty = null;

        public static final class ¤ extends Stack<¤> {

            @Override
            public TypeEncoding1.γ_.¤ top() {
                return null;
            }

            @Override
            public ¤ pop() {
                return null;
            }

            @Override
            public ¤ γ1() {
                return null;
            }

            @Override
            public ¤ γ2() {
                return null;
            }
        }
    }
}
