package kotlin.p042a0.p043j.p044a;

import kotlin.jvm.internal.C10199g;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10216x;
import kotlin.p042a0.C9064d;

/* renamed from: kotlin.a0.j.a.j */
/* compiled from: ContinuationImpl.kt */
public abstract class C9091j extends C9084c implements C10199g<Object> {
    private final int arity;

    public C9091j(int i, C9064d<Object> dVar) {
        super(dVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String a = C10216x.m34184a((C10199g) this);
        C10202j.m34174a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }

    public C9091j(int i) {
        this(i, (C9064d<Object>) null);
    }
}
