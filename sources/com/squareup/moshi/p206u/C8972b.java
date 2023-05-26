package com.squareup.moshi.p206u;

import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.C8939o;
import java.io.IOException;

/* renamed from: com.squareup.moshi.u.b */
/* compiled from: NullSafeJsonAdapter */
public final class C8972b<T> extends C8924f<T> {

    /* renamed from: a */
    private final C8924f<T> f25464a;

    public C8972b(C8924f<T> fVar) {
        this.f25464a = fVar;
    }

    public T fromJson(C8930i iVar) throws IOException {
        if (iVar.peek() == C8930i.C8932b.NULL) {
            return iVar.mo32881v();
        }
        return this.f25464a.fromJson(iVar);
    }

    public void toJson(C8939o oVar, T t) throws IOException {
        if (t == null) {
            oVar.mo32902q();
        } else {
            this.f25464a.toJson(oVar, t);
        }
    }

    public String toString() {
        return this.f25464a + ".nullSafe()";
    }
}
