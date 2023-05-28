package com.google.gson;

import com.google.gson.p191t.C8729j;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.gson.j */
/* compiled from: JsonElement */
public abstract class C8679j {
    /* renamed from: a */
    public C8676g mo32328a() {
        if (mo32331d()) {
            return (C8676g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: b */
    public C8681l mo32329b() {
        if (mo32333g()) {
            return (C8681l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: c */
    public C8682m mo32330c() {
        if (mo32334h()) {
            return (C8682m) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: d */
    public boolean mo32331d() {
        return this instanceof C8676g;
    }

    /* renamed from: f */
    public boolean mo32332f() {
        return this instanceof C8680k;
    }

    /* renamed from: g */
    public boolean mo32333g() {
        return this instanceof C8681l;
    }

    /* renamed from: h */
    public boolean mo32334h() {
        return this instanceof C8682m;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C8694c cVar = new C8694c(stringWriter);
            cVar.mo32387b(true);
            C8729j.m28506a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
