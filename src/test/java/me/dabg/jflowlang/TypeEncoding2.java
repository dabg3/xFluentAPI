package me.dabg.jflowlang;

import static me.dabg.jflowlang.TypeEncoding1.γ_;

/**
 * Type encoding of a partial higher-arity (binary) function
 *
 * f: R x S -/-> γ
 *
 * defined by:
 * - R = {r1, r2}, S = {s1, s2}
 * - f(r1, s1) = γ1
 * - f(r2, s1) = γ1
 * - f(r1, s2) = γ2
 * - f(r2, s2) = undefined
 *
 * Fluent API with a finite amount of possible calls.
 * Available calls amount is defined by function arity (2 in this case)
 * so...Fluent API is modeled as a function
 */
public class TypeEncoding2 {

    // Fluent API starting point
    public static abstract class f {
        public static R.r1 r1() {
            return null;
        }

        public static R.r2 r2() {
            return null;
        }
    }

    public static abstract class R {
        public abstract γ_ s1();
        public abstract γ_ s2();

        public static final class r1 extends R {

            @Override
            public γ_.γ.γ1 s1() {
                return null;
            }

            @Override
            public γ_.γ.γ2 s2() {
                return null;
            }
        }

        public static final class r2 extends R {

            @Override
            public γ_.γ.γ1 s1() {
                return null;
            }

            @Override
            public γ_.¤ s2() {
                return null;
            }
        }
    }
}
