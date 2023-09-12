package me.dabg.jflowlang;

/**
 * Type encoding of a <i>partial</i> unary function
 *
 * g: γ -/-> γ
 *
 * defined by:
 * - γ = {γ1, γ2}
 * - g(γ1) = γ2
 * - g(γ2) = invalid
 *
 * In mathematics, a partial function f from a set X to a set Y
 * is a function from a subset S of X (possibly the whole X itself) to *
 */
public class TypeEncoding1 {

    // γ_ denotes the augmented set γ ∪ {¤}
    public static abstract class γ_ {

        // ¤ represents an error value. Made package-private to split classes
        static abstract class ¤ extends γ_ {
            private ¤(){}
        }

        // γ is the finite set of elements (function domain/range)
        public static abstract class γ extends γ_ {

            public abstract γ_ g();

            public static final class γ1 extends γ {
                @Override
                public γ2 g() {
                    return null;
                }
            }

            public static final class γ2 extends γ {
                @Override
                public γ_.¤ g() {
                    return null;
                }
            }

        }
    }

}
