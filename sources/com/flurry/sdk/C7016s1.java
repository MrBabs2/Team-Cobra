package com.flurry.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.s1 */
public class C7016s1<ObjectType> implements C7048v1<ObjectType> {

    /* renamed from: a */
    protected final C7048v1<ObjectType> f13156a;

    public C7016s1(C7048v1<ObjectType> v1Var) {
        this.f13156a = v1Var;
    }

    /* renamed from: a */
    public void mo23605a(OutputStream outputStream, ObjectType objecttype) throws IOException {
        C7048v1<ObjectType> v1Var = this.f13156a;
        if (v1Var != null && outputStream != null && objecttype != null) {
            v1Var.mo23605a(outputStream, objecttype);
        }
    }

    /* renamed from: a */
    public ObjectType mo23604a(InputStream inputStream) throws IOException {
        C7048v1<ObjectType> v1Var = this.f13156a;
        if (v1Var == null || inputStream == null) {
            return null;
        }
        return v1Var.mo23604a(inputStream);
    }
}
