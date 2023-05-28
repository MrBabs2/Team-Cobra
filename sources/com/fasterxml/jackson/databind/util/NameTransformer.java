package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        public String toString() {
            return "[ChainedTransformer(" + this._t1 + ", " + this._t2 + ")]";
        }

        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    protected static final class NopTransformer extends NameTransformer implements Serializable {
        protected NopTransformer() {
        }

        public String transform(String str) {
            return str;
        }
    }

    protected NameTransformer() {
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(final String str, final String str2) {
        boolean z = true;
        boolean z2 = str != null && str.length() > 0;
        if (str2 == null || str2.length() <= 0) {
            z = false;
        }
        if (z2) {
            if (z) {
                return new NameTransformer() {
                    public String toString() {
                        return "[PreAndSuffixTransformer('" + str + "','" + str2 + "')]";
                    }

                    public String transform(String str) {
                        return str + str + str2;
                    }
                };
            }
            return new NameTransformer() {
                public String toString() {
                    return "[PrefixTransformer('" + str + "')]";
                }

                public String transform(String str) {
                    return str + str;
                }
            };
        } else if (z) {
            return new NameTransformer() {
                public String toString() {
                    return "[SuffixTransformer('" + str2 + "')]";
                }

                public String transform(String str) {
                    return str + str2;
                }
            };
        } else {
            return NOP;
        }
    }

    public abstract String transform(String str);
}
