package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.flurry.sdk.i */
public final class C6856i {

    /* renamed from: a */
    public final boolean f12827a;

    /* renamed from: b */
    public final byte[] f12828b;

    /* renamed from: c */
    public final byte[] f12829c;

    /* renamed from: d */
    public final int f12830d;

    C6856i(byte[] bArr, byte[] bArr2, boolean z, int i) {
        this.f12828b = bArr2;
        this.f12829c = bArr;
        this.f12827a = z;
        this.f12830d = i;
    }

    /* renamed from: com.flurry.sdk.i$a */
    static class C6857a implements C7048v1<C6856i> {

        /* renamed from: com.flurry.sdk.i$a$a */
        class C6858a extends DataOutputStream {
            C6858a(C6857a aVar, OutputStream outputStream) {
                super(outputStream);
            }

            public final void close() {
            }
        }

        /* renamed from: com.flurry.sdk.i$a$b */
        class C6859b extends DataInputStream {
            C6859b(C6857a aVar, InputStream inputStream) {
                super(inputStream);
            }

            public final void close() {
            }
        }

        C6857a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23605a(OutputStream outputStream, Object obj) throws IOException {
            C6856i iVar = (C6856i) obj;
            if (outputStream != null && iVar != null) {
                C6858a aVar = new C6858a(this, outputStream);
                aVar.writeBoolean(iVar.f12827a);
                byte[] bArr = iVar.f12828b;
                if (bArr == null) {
                    aVar.writeInt(0);
                } else {
                    aVar.writeInt(bArr.length);
                    aVar.write(iVar.f12828b);
                }
                byte[] bArr2 = iVar.f12829c;
                if (bArr2 == null) {
                    aVar.writeInt(0);
                } else {
                    aVar.writeInt(bArr2.length);
                    aVar.write(iVar.f12829c);
                }
                aVar.writeInt(iVar.f12830d);
                aVar.flush();
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23604a(InputStream inputStream) throws IOException {
            byte[] bArr;
            byte[] bArr2 = null;
            if (inputStream == null) {
                return null;
            }
            C6859b bVar = new C6859b(this, inputStream);
            boolean readBoolean = bVar.readBoolean();
            int readInt = bVar.readInt();
            if (readInt > 0) {
                bArr = new byte[readInt];
                bVar.read(bArr, 0, readInt);
            } else {
                bArr = null;
            }
            int readInt2 = bVar.readInt();
            if (readInt2 > 0) {
                bArr2 = new byte[readInt2];
                bVar.read(bArr2, 0, readInt2);
            }
            return new C6856i(bArr2, bArr, readBoolean, bVar.readInt());
        }
    }
}
