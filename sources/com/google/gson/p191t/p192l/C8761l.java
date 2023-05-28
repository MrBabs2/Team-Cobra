package com.google.gson.p191t.p192l;

import com.google.gson.C8668e;
import com.google.gson.C8677h;
import com.google.gson.C8678i;
import com.google.gson.C8679j;
import com.google.gson.C8683n;
import com.google.gson.C8684o;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.p191t.C8729j;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8694c;
import java.io.IOException;

/* renamed from: com.google.gson.t.l.l */
/* compiled from: TreeTypeAdapter */
public final class C8761l<T> extends C8688q<T> {

    /* renamed from: a */
    private final C8684o<T> f24902a;

    /* renamed from: b */
    private final C8678i<T> f24903b;

    /* renamed from: c */
    final C8668e f24904c;

    /* renamed from: d */
    private final C8805a<T> f24905d;

    /* renamed from: e */
    private final C8690r f24906e;

    /* renamed from: f */
    private final C8761l<T>.C0980b f24907f = new C8763b();

    /* renamed from: g */
    private C8688q<T> f24908g;

    /* renamed from: com.google.gson.t.l.l$b */
    /* compiled from: TreeTypeAdapter */
    private final class C8763b implements C8683n, C8677h {
        private C8763b(C8761l lVar) {
        }
    }

    public C8761l(C8684o<T> oVar, C8678i<T> iVar, C8668e eVar, C8805a<T> aVar, C8690r rVar) {
        this.f24902a = oVar;
        this.f24903b = iVar;
        this.f24904c = eVar;
        this.f24905d = aVar;
        this.f24906e = rVar;
    }

    /* renamed from: b */
    private C8688q<T> m28596b() {
        C8688q<T> qVar = this.f24908g;
        if (qVar != null) {
            return qVar;
        }
        C8688q<T> a = this.f24904c.mo32298a(this.f24906e, this.f24905d);
        this.f24908g = a;
        return a;
    }

    /* renamed from: a */
    public T mo32314a(C8691a aVar) throws IOException {
        if (this.f24903b == null) {
            return m28596b().mo32314a(aVar);
        }
        C8679j a = C8729j.m28504a(aVar);
        if (a.mo32332f()) {
            return null;
        }
        return this.f24903b.mo32327a(a, this.f24905d.getType(), this.f24907f);
    }

    /* renamed from: a */
    public void mo32316a(C8694c cVar, T t) throws IOException {
        C8684o<T> oVar = this.f24902a;
        if (oVar == null) {
            m28596b().mo32316a(cVar, t);
        } else if (t == null) {
            cVar.mo32400p();
        } else {
            C8729j.m28506a(oVar.mo32355a(t, this.f24905d.getType(), this.f24907f), cVar);
        }
    }
}
