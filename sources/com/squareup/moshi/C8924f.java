package com.squareup.moshi;

import com.squareup.moshi.C8930i;
import com.squareup.moshi.p206u.C8971a;
import com.squareup.moshi.p206u.C8972b;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import p413s.C12905f;
import p413s.C12909g;
import p413s.C12910h;

/* renamed from: com.squareup.moshi.f */
/* compiled from: JsonAdapter */
public abstract class C8924f<T> {

    /* renamed from: com.squareup.moshi.f$a */
    /* compiled from: JsonAdapter */
    class C8925a extends C8924f<T> {

        /* renamed from: a */
        final /* synthetic */ C8924f f25342a;

        C8925a(C8924f fVar, C8924f fVar2) {
            this.f25342a = fVar2;
        }

        public T fromJson(C8930i iVar) throws IOException {
            return this.f25342a.fromJson(iVar);
        }

        /* access modifiers changed from: package-private */
        public boolean isLenient() {
            return this.f25342a.isLenient();
        }

        public void toJson(C8939o oVar, T t) throws IOException {
            boolean o = oVar.mo32919o();
            oVar.mo32915b(true);
            try {
                this.f25342a.toJson(oVar, t);
            } finally {
                oVar.mo32915b(o);
            }
        }

        public String toString() {
            return this.f25342a + ".serializeNulls()";
        }
    }

    /* renamed from: com.squareup.moshi.f$b */
    /* compiled from: JsonAdapter */
    class C8926b extends C8924f<T> {

        /* renamed from: a */
        final /* synthetic */ C8924f f25343a;

        C8926b(C8924f fVar, C8924f fVar2) {
            this.f25343a = fVar2;
        }

        public T fromJson(C8930i iVar) throws IOException {
            boolean o = iVar.mo32875o();
            iVar.mo32869b(true);
            try {
                return this.f25343a.fromJson(iVar);
            } finally {
                iVar.mo32869b(o);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean isLenient() {
            return true;
        }

        public void toJson(C8939o oVar, T t) throws IOException {
            boolean p = oVar.mo32920p();
            oVar.mo32913a(true);
            try {
                this.f25343a.toJson(oVar, t);
            } finally {
                oVar.mo32913a(p);
            }
        }

        public String toString() {
            return this.f25343a + ".lenient()";
        }
    }

    /* renamed from: com.squareup.moshi.f$c */
    /* compiled from: JsonAdapter */
    class C8927c extends C8924f<T> {

        /* renamed from: a */
        final /* synthetic */ C8924f f25344a;

        C8927c(C8924f fVar, C8924f fVar2) {
            this.f25344a = fVar2;
        }

        public T fromJson(C8930i iVar) throws IOException {
            boolean l = iVar.mo32873l();
            iVar.mo32866a(true);
            try {
                return this.f25344a.fromJson(iVar);
            } finally {
                iVar.mo32866a(l);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean isLenient() {
            return this.f25344a.isLenient();
        }

        public void toJson(C8939o oVar, T t) throws IOException {
            this.f25344a.toJson(oVar, t);
        }

        public String toString() {
            return this.f25344a + ".failOnUnknown()";
        }
    }

    /* renamed from: com.squareup.moshi.f$d */
    /* compiled from: JsonAdapter */
    class C8928d extends C8924f<T> {

        /* renamed from: a */
        final /* synthetic */ C8924f f25345a;

        /* renamed from: b */
        final /* synthetic */ String f25346b;

        C8928d(C8924f fVar, C8924f fVar2, String str) {
            this.f25345a = fVar2;
            this.f25346b = str;
        }

        public T fromJson(C8930i iVar) throws IOException {
            return this.f25345a.fromJson(iVar);
        }

        /* access modifiers changed from: package-private */
        public boolean isLenient() {
            return this.f25345a.isLenient();
        }

        public void toJson(C8939o oVar, T t) throws IOException {
            String m = oVar.mo32918m();
            oVar.mo32897d(this.f25346b);
            try {
                this.f25345a.toJson(oVar, t);
            } finally {
                oVar.mo32897d(m);
            }
        }

        public String toString() {
            return this.f25345a + ".indent(\"" + this.f25346b + "\")";
        }
    }

    /* renamed from: com.squareup.moshi.f$e */
    /* compiled from: JsonAdapter */
    public interface C8929e {
        /* renamed from: a */
        C8924f<?> mo32832a(Type type, Set<? extends Annotation> set, C8952r rVar);
    }

    public final C8924f<T> failOnUnknown() {
        return new C8927c(this, this);
    }

    public abstract T fromJson(C8930i iVar) throws IOException;

    public final T fromJson(C12910h hVar) throws IOException {
        return fromJson(C8930i.m29333a(hVar));
    }

    public final T fromJsonValue(Object obj) {
        try {
            return fromJson((C8930i) new C8936m(obj));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public C8924f<T> indent(String str) {
        if (str != null) {
            return new C8928d(this, this, str);
        }
        throw new NullPointerException("indent == null");
    }

    /* access modifiers changed from: package-private */
    public boolean isLenient() {
        return false;
    }

    public final C8924f<T> lenient() {
        return new C8926b(this, this);
    }

    public final C8924f<T> nonNull() {
        if (this instanceof C8971a) {
            return this;
        }
        return new C8971a(this);
    }

    public final C8924f<T> nullSafe() {
        if (this instanceof C8972b) {
            return this;
        }
        return new C8972b(this);
    }

    public final C8924f<T> serializeNulls() {
        return new C8925a(this, this);
    }

    public abstract void toJson(C8939o oVar, T t) throws IOException;

    public final void toJson(C12909g gVar, T t) throws IOException {
        toJson(C8939o.m29444a(gVar), t);
    }

    public final Object toJsonValue(T t) {
        C8938n nVar = new C8938n();
        try {
            toJson((C8939o) nVar, t);
            return nVar.mo32911v();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final T fromJson(String str) throws IOException {
        C12905f fVar = new C12905f();
        fVar.mo41155b(str);
        C8930i a = C8930i.m29333a((C12910h) fVar);
        T fromJson = fromJson(a);
        if (isLenient() || a.peek() == C8930i.C8932b.END_DOCUMENT) {
            return fromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final String toJson(T t) {
        C12905f fVar = new C12905f();
        try {
            toJson((C12909g) fVar, t);
            return fVar.mo41186q();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
