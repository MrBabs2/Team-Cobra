package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d */
/* compiled from: ByteString */
public abstract class C10417d implements Iterable<Byte> {

    /* renamed from: f */
    public static final C10417d f28215f = new C10446n(new byte[0]);

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$a */
    /* compiled from: ByteString */
    public interface C10418a extends Iterator<Byte> {
        byte nextByte();
    }

    static {
        Class<C10417d> cls = C10417d.class;
    }

    C10417d() {
    }

    /* renamed from: a */
    public static C10417d m35227a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C10446n(bArr2);
    }

    /* renamed from: b */
    public static C10417d m35228b(String str) {
        try {
            return new C10446n(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: j */
    public static C10419b m35229j() {
        return new C10419b(128);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo35680a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo35681a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract String mo35682a(String str) throws UnsupportedEncodingException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo35685b(int i, int i2, int i3);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo35687b(OutputStream outputStream, int i, int i2) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo35671b(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo35688b();

    /* renamed from: c */
    public abstract boolean mo35689c();

    /* renamed from: d */
    public abstract C10420e mo35690d();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo35691f();

    /* renamed from: g */
    public byte[] mo35692g() {
        int size = size();
        if (size == 0) {
            return C10436i.f28265a;
        }
        byte[] bArr = new byte[size];
        mo35671b(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: h */
    public String mo35693h() {
        try {
            return mo35682a("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract C10418a iterator();

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.d$b */
    /* compiled from: ByteString */
    public static final class C10419b extends OutputStream {

        /* renamed from: k */
        private static final byte[] f28216k = new byte[0];

        /* renamed from: f */
        private final int f28217f;

        /* renamed from: g */
        private final ArrayList<C10417d> f28218g;

        /* renamed from: h */
        private int f28219h;

        /* renamed from: i */
        private byte[] f28220i;

        /* renamed from: j */
        private int f28221j;

        C10419b(int i) {
            if (i >= 0) {
                this.f28217f = i;
                this.f28218g = new ArrayList<>();
                this.f28220i = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: b */
        private void m35247b() {
            int i = this.f28221j;
            byte[] bArr = this.f28220i;
            if (i >= bArr.length) {
                this.f28218g.add(new C10446n(this.f28220i));
                this.f28220i = f28216k;
            } else if (i > 0) {
                this.f28218g.add(new C10446n(m35246a(bArr, i)));
            }
            this.f28219h += this.f28221j;
            this.f28221j = 0;
        }

        /* renamed from: a */
        public synchronized C10417d mo35696a() {
            m35247b();
            return C10417d.m35224a((Iterable<C10417d>) this.f28218g);
        }

        public synchronized int size() {
            return this.f28219h + this.f28221j;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
        }

        public synchronized void write(int i) {
            if (this.f28221j == this.f28220i.length) {
                m35245a(1);
            }
            byte[] bArr = this.f28220i;
            int i2 = this.f28221j;
            this.f28221j = i2 + 1;
            bArr[i2] = (byte) i;
        }

        /* renamed from: a */
        private byte[] m35246a(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: a */
        private void m35245a(int i) {
            this.f28218g.add(new C10446n(this.f28220i));
            int length = this.f28219h + this.f28220i.length;
            this.f28219h = length;
            this.f28220i = new byte[Math.max(this.f28217f, Math.max(i, length >>> 1))];
            this.f28221j = 0;
        }

        public synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.f28220i.length - this.f28221j) {
                System.arraycopy(bArr, i, this.f28220i, this.f28221j, i2);
                this.f28221j += i2;
            } else {
                int length = this.f28220i.length - this.f28221j;
                System.arraycopy(bArr, i, this.f28220i, this.f28221j, length);
                int i3 = i2 - length;
                m35245a(i3);
                System.arraycopy(bArr, i + length, this.f28220i, 0, i3);
                this.f28221j = i3;
            }
        }
    }

    /* renamed from: b */
    public C10417d mo35686b(C10417d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return C10454s.m35423a(this, dVar);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static C10417d m35226a(byte[] bArr) {
        return m35227a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C10417d m35224a(Iterable<C10417d> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (C10417d add : iterable) {
                collection.add(add);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return f28215f;
        }
        return m35225a(collection.iterator(), collection.size());
    }

    /* renamed from: a */
    private static C10417d m35225a(Iterator<C10417d> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m35225a(it, i2).mo35686b(m35225a(it, i - i2));
    }

    /* renamed from: a */
    public void mo35684a(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Target end offset < 0: ");
                    sb3.append(i5);
                    throw new IndexOutOfBoundsException(sb3.toString());
                } else if (i3 > 0) {
                    mo35671b(bArr, i, i2, i3);
                }
            } else {
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Source end offset < 0: ");
                sb4.append(i4);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i3);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo35683a(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > size()) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Source end offset exceeded: ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i2 > 0) {
                mo35687b(outputStream, i, i2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }
}
