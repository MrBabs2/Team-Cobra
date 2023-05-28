package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.C10417d;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.n */
/* compiled from: LiteralByteString */
class C10446n extends C10417d {

    /* renamed from: g */
    protected final byte[] f28275g;

    /* renamed from: h */
    private int f28276h = 0;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.n$b */
    /* compiled from: LiteralByteString */
    private class C10448b implements C10417d.C10418a {

        /* renamed from: f */
        private int f28277f;

        /* renamed from: g */
        private final int f28278g;

        public boolean hasNext() {
            return this.f28277f < this.f28278g;
        }

        public byte nextByte() {
            try {
                byte[] bArr = C10446n.this.f28275g;
                int i = this.f28277f;
                this.f28277f = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C10448b() {
            this.f28277f = 0;
            this.f28278g = C10446n.this.size();
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    C10446n(byte[] bArr) {
        this.f28275g = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo35680a() {
        return 0;
    }

    /* renamed from: a */
    public String mo35682a(String str) throws UnsupportedEncodingException {
        return new String(this.f28275g, mo35674k(), size(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo35671b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f28275g, i, bArr, i2, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo35688b() {
        return true;
    }

    /* renamed from: c */
    public boolean mo35689c() {
        int k = mo35674k();
        return C10471v.m35485b(this.f28275g, k, size() + k);
    }

    /* renamed from: d */
    public C10420e mo35690d() {
        return C10420e.m35253a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10417d) || size() != ((C10417d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C10446n) {
            return mo35810a((C10446n) obj, 0, size());
        }
        if (obj instanceof C10454s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(String.valueOf(obj.getClass()));
        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo35691f() {
        return this.f28276h;
    }

    /* renamed from: h */
    public byte mo35672h(int i) {
        return this.f28275g[i];
    }

    public int hashCode() {
        int i = this.f28276h;
        if (i == 0) {
            int size = size();
            i = mo35681a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f28276h = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo35674k() {
        return 0;
    }

    public int size() {
        return this.f28275g.length;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo35810a(C10446n nVar, int i, int i2) {
        if (i2 > nVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= nVar.size()) {
            byte[] bArr = this.f28275g;
            byte[] bArr2 = nVar.f28275g;
            int k = mo35674k() + i2;
            int k2 = mo35674k();
            int k3 = nVar.mo35674k() + i;
            while (k2 < k) {
                if (bArr[k2] != bArr2[k3]) {
                    return false;
                }
                k2++;
                k3++;
            }
            return true;
        } else {
            int size2 = nVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo35687b(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f28275g, mo35674k() + i, i2);
    }

    public C10417d.C10418a iterator() {
        return new C10448b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo35685b(int i, int i2, int i3) {
        int k = mo35674k() + i2;
        return C10471v.m35482a(i, this.f28275g, k, i3 + k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo35681a(int i, int i2, int i3) {
        return m35397a(i, this.f28275g, mo35674k() + i2, i3);
    }

    /* renamed from: a */
    static int m35397a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
