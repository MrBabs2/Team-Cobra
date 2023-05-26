package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.C10417d;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
/* compiled from: BoundedByteString */
class C10414c extends C10446n {

    /* renamed from: i */
    private final int f28210i;

    /* renamed from: j */
    private final int f28211j;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c$b */
    /* compiled from: BoundedByteString */
    private class C10416b implements C10417d.C10418a {

        /* renamed from: f */
        private int f28212f;

        /* renamed from: g */
        private final int f28213g;

        public boolean hasNext() {
            return this.f28212f < this.f28213g;
        }

        public byte nextByte() {
            int i = this.f28212f;
            if (i < this.f28213g) {
                byte[] bArr = C10414c.this.f28275g;
                this.f28212f = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C10416b() {
            int k = C10414c.this.mo35674k();
            this.f28212f = k;
            this.f28213g = k + C10414c.this.size();
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    C10414c(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (((long) i) + ((long) i2) <= ((long) bArr.length)) {
            this.f28210i = i;
            this.f28211j = i2;
        } else {
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("Offset+Length too large: ");
            sb3.append(i);
            sb3.append("+");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo35671b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f28275g, mo35674k() + i, bArr, i2, i3);
    }

    /* renamed from: h */
    public byte mo35672h(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        } else if (i < size()) {
            return this.f28275g[this.f28210i + i];
        } else {
            int size = size();
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo35674k() {
        return this.f28210i;
    }

    public int size() {
        return this.f28211j;
    }

    public C10417d.C10418a iterator() {
        return new C10416b();
    }
}
