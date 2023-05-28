package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.s0 */
public final class C7012s0 {

    /* renamed from: a */
    String f13155a;

    /* synthetic */ C7012s0(byte b) {
        this();
    }

    private C7012s0() {
    }

    public C7012s0(String str) {
        this.f13155a = str;
    }

    /* renamed from: com.flurry.sdk.s0$a */
    public static class C7013a implements C7048v1<C7012s0> {

        /* renamed from: com.flurry.sdk.s0$a$a */
        class C7014a extends DataOutputStream {
            C7014a(C7013a aVar, OutputStream outputStream) {
                super(outputStream);
            }

            public final void close() {
            }
        }

        /* renamed from: com.flurry.sdk.s0$a$b */
        class C7015b extends DataInputStream {
            C7015b(C7013a aVar, InputStream inputStream) {
                super(inputStream);
            }

            public final void close() {
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23605a(OutputStream outputStream, Object obj) throws IOException {
            C7012s0 s0Var = (C7012s0) obj;
            if (outputStream != null && s0Var != null) {
                C7014a aVar = new C7014a(this, outputStream);
                aVar.writeUTF(s0Var.f13155a);
                aVar.flush();
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23604a(InputStream inputStream) throws IOException {
            if (inputStream == null) {
                return null;
            }
            C7015b bVar = new C7015b(this, inputStream);
            C7012s0 s0Var = new C7012s0((byte) 0);
            s0Var.f13155a = bVar.readUTF();
            return s0Var;
        }
    }
}
