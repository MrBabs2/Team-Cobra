package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.flurry.sdk.u1 */
public final class C7036u1<T> implements C7048v1<List<T>> {

    /* renamed from: a */
    C7048v1<T> f13239a;

    /* renamed from: com.flurry.sdk.u1$a */
    class C7037a extends DataOutputStream {
        C7037a(C7036u1 u1Var, OutputStream outputStream) {
            super(outputStream);
        }

        public final void close() {
        }
    }

    /* renamed from: com.flurry.sdk.u1$b */
    class C7038b extends DataInputStream {
        C7038b(C7036u1 u1Var, InputStream inputStream) {
            super(inputStream);
        }

        public final void close() {
        }
    }

    public C7036u1(C7048v1<T> v1Var) {
        this.f13239a = v1Var;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo23605a(OutputStream outputStream, Object obj) throws IOException {
        List list = (List) obj;
        if (outputStream != null) {
            C7037a aVar = new C7037a(this, outputStream);
            int size = list != null ? list.size() : 0;
            aVar.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f13239a.mo23605a(outputStream, list.get(i));
            }
            aVar.flush();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo23604a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        int readInt = new C7038b(this, inputStream).readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (i < readInt) {
            T a = this.f13239a.mo23604a(inputStream);
            if (a != null) {
                arrayList.add(a);
                i++;
            } else {
                throw new IOException("Missing record.");
            }
        }
        return arrayList;
    }
}
