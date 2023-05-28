package com.google.gson;

import com.google.gson.p191t.p192l.C8746f;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8693b;
import com.google.gson.stream.C8694c;
import java.io.IOException;

/* renamed from: com.google.gson.q */
/* compiled from: TypeAdapter */
public abstract class C8688q<T> {
    /* renamed from: a */
    public final C8688q<T> mo32357a() {
        return new C8689a();
    }

    /* renamed from: a */
    public abstract T mo32314a(C8691a aVar) throws IOException;

    /* renamed from: a */
    public abstract void mo32316a(C8694c cVar, T t) throws IOException;

    /* renamed from: com.google.gson.q$a */
    /* compiled from: TypeAdapter */
    class C8689a extends C8688q<T> {
        C8689a() {
        }

        /* renamed from: a */
        public void mo32316a(C8694c cVar, T t) throws IOException {
            if (t == null) {
                cVar.mo32400p();
            } else {
                C8688q.this.mo32316a(cVar, t);
            }
        }

        /* renamed from: a */
        public T mo32314a(C8691a aVar) throws IOException {
            if (aVar.peek() != C8693b.NULL) {
                return C8688q.this.mo32314a(aVar);
            }
            aVar.mo32377x();
            return null;
        }
    }

    /* renamed from: a */
    public final C8679j mo32356a(T t) {
        try {
            C8746f fVar = new C8746f();
            mo32316a(fVar, t);
            return fVar.mo32481q();
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }
}
