package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* renamed from: com.flurry.sdk.q0 */
public final class C6980q0 {

    /* renamed from: a */
    String f13120a;

    /* renamed from: b */
    byte[] f13121b;

    /* renamed from: com.flurry.sdk.q0$a */
    static class C6981a implements C7089y1<C6980q0> {
        C6981a() {
        }

        /* renamed from: a */
        public final C7048v1<C6980q0> mo23619a(int i) {
            return new C6982b(i);
        }
    }

    /* synthetic */ C6980q0(byte b) {
        this();
    }

    /* renamed from: a */
    public static String m14828a(String str) {
        return ".yflurrydatasenderblock.".concat(String.valueOf(str));
    }

    /* renamed from: b */
    public static C6777c7<C6980q0> m14829b(String str) {
        return new C6777c7<>(C6747b0.m14386a().getFileStreamPath(m14828a(str)), ".yflurrydatasenderblock.", 2, new C6981a());
    }

    private C6980q0() {
        this.f13120a = null;
        this.f13121b = null;
    }

    public C6980q0(byte[] bArr) {
        this.f13120a = null;
        this.f13121b = null;
        this.f13120a = UUID.randomUUID().toString();
        this.f13121b = bArr;
    }

    /* renamed from: com.flurry.sdk.q0$b */
    public static class C6982b implements C7048v1<C6980q0> {

        /* renamed from: a */
        private int f13122a = 1;

        /* renamed from: com.flurry.sdk.q0$b$a */
        class C6983a extends DataOutputStream {
            C6983a(C6982b bVar, OutputStream outputStream) {
                super(outputStream);
            }

            public final void close() {
            }
        }

        /* renamed from: com.flurry.sdk.q0$b$b */
        class C6984b extends DataInputStream {
            C6984b(C6982b bVar, InputStream inputStream) {
                super(inputStream);
            }

            public final void close() {
            }
        }

        public C6982b(int i) {
            this.f13122a = i;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23605a(OutputStream outputStream, Object obj) throws IOException {
            C6980q0 q0Var = (C6980q0) obj;
            if (outputStream != null && q0Var != null) {
                C6983a aVar = new C6983a(this, outputStream);
                int length = q0Var.f13121b.length;
                if (this.f13122a == 1) {
                    aVar.writeShort(length);
                } else {
                    aVar.writeInt(length);
                }
                aVar.write(q0Var.f13121b);
                aVar.writeShort(0);
                aVar.flush();
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23604a(InputStream inputStream) throws IOException {
            int i;
            if (inputStream == null) {
                return null;
            }
            C6984b bVar = new C6984b(this, inputStream);
            C6980q0 q0Var = new C6980q0((byte) 0);
            if (this.f13122a == 1) {
                i = bVar.readShort();
            } else {
                i = bVar.readInt();
            }
            if (i == 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            q0Var.f13121b = bArr;
            bVar.readFully(bArr);
            bVar.readUnsignedShort();
            return q0Var;
        }
    }
}
