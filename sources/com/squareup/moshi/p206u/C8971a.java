package com.squareup.moshi.p206u;

import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.C8939o;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;

/* renamed from: com.squareup.moshi.u.a */
/* compiled from: NonNullJsonAdapter */
public final class C8971a<T> extends C8924f<T> {

    /* renamed from: a */
    private final C8924f<T> f25463a;

    public C8971a(C8924f<T> fVar) {
        this.f25463a = fVar;
    }

    public T fromJson(C8930i iVar) throws IOException {
        if (iVar.peek() != C8930i.C8932b.NULL) {
            return this.f25463a.fromJson(iVar);
        }
        throw new JsonDataException("Unexpected null at " + iVar.getPath());
    }

    public void toJson(C8939o oVar, T t) throws IOException {
        if (t != null) {
            this.f25463a.toJson(oVar, t);
            return;
        }
        throw new JsonDataException("Unexpected null at " + oVar.getPath());
    }

    public String toString() {
        return this.f25463a + ".nonNull()";
    }
}
