package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.x1 */
public final class C7076x1<T> implements C7048v1<T> {

    /* renamed from: a */
    private final String f13340a;

    /* renamed from: b */
    private final int f13341b;

    /* renamed from: c */
    private final C7089y1<T> f13342c;

    /* renamed from: com.flurry.sdk.x1$a */
    class C7077a extends DataOutputStream {
        C7077a(C7076x1 x1Var, OutputStream outputStream) {
            super(outputStream);
        }

        public final void close() {
        }
    }

    /* renamed from: com.flurry.sdk.x1$b */
    class C7078b extends DataInputStream {
        C7078b(C7076x1 x1Var, InputStream inputStream) {
            super(inputStream);
        }

        public final void close() {
        }
    }

    public C7076x1(String str, int i, C7089y1<T> y1Var) {
        this.f13340a = str;
        this.f13341b = i;
        this.f13342c = y1Var;
    }

    /* renamed from: a */
    public final void mo23605a(OutputStream outputStream, T t) throws IOException {
        if (outputStream != null && this.f13342c != null) {
            C7077a aVar = new C7077a(this, outputStream);
            aVar.writeUTF(this.f13340a);
            aVar.writeInt(this.f13341b);
            this.f13342c.mo23619a(this.f13341b).mo23605a(aVar, t);
            aVar.flush();
        }
    }

    /* renamed from: a */
    public final T mo23604a(InputStream inputStream) throws IOException {
        if (inputStream == null || this.f13342c == null) {
            return null;
        }
        C7078b bVar = new C7078b(this, inputStream);
        String readUTF = bVar.readUTF();
        if (this.f13340a.equals(readUTF)) {
            return this.f13342c.mo23619a(bVar.readInt()).mo23604a(bVar);
        }
        throw new IOException("Signature: " + readUTF + " is invalid");
    }
}
