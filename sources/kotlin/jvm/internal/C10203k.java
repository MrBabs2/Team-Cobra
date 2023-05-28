package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.k */
/* compiled from: Lambda.kt */
public abstract class C10203k<R> implements C10199g<R>, Serializable {
    private final int arity;

    public C10203k(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String a = C10216x.m34185a(this);
        C10202j.m34174a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }
}
