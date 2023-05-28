package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.C10417d;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s */
/* compiled from: RopeByteString */
class C10454s extends C10417d {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final int[] f28280m;

    /* renamed from: g */
    private final int f28281g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C10417d f28282h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C10417d f28283i;

    /* renamed from: j */
    private final int f28284j;

    /* renamed from: k */
    private final int f28285k;

    /* renamed from: l */
    private int f28286l;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$b */
    /* compiled from: RopeByteString */
    private static class C10456b {

        /* renamed from: a */
        private final Stack<C10417d> f28287a;

        private C10456b() {
            this.f28287a = new Stack<>();
        }

        /* renamed from: b */
        private void m35443b(C10417d dVar) {
            int a = m35439a(dVar.size());
            int i = C10454s.f28280m[a + 1];
            if (this.f28287a.isEmpty() || this.f28287a.peek().size() >= i) {
                this.f28287a.push(dVar);
                return;
            }
            int i2 = C10454s.f28280m[a];
            C10417d pop = this.f28287a.pop();
            while (!this.f28287a.isEmpty() && this.f28287a.peek().size() < i2) {
                pop = new C10454s(this.f28287a.pop(), pop);
            }
            C10454s sVar = new C10454s(pop, dVar);
            while (!this.f28287a.isEmpty()) {
                if (this.f28287a.peek().size() >= C10454s.f28280m[m35439a(sVar.size()) + 1]) {
                    break;
                }
                sVar = new C10454s(this.f28287a.pop(), sVar);
            }
            this.f28287a.push(sVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C10417d m35440a(C10417d dVar, C10417d dVar2) {
            m35442a(dVar);
            m35442a(dVar2);
            C10417d pop = this.f28287a.pop();
            while (!this.f28287a.isEmpty()) {
                pop = new C10454s(this.f28287a.pop(), pop);
            }
            return pop;
        }

        /* renamed from: a */
        private void m35442a(C10417d dVar) {
            if (dVar.mo35688b()) {
                m35443b(dVar);
            } else if (dVar instanceof C10454s) {
                C10454s sVar = (C10454s) dVar;
                m35442a(sVar.f28282h);
                m35442a(sVar.f28283i);
            } else {
                String valueOf = String.valueOf(String.valueOf(dVar.getClass()));
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: a */
        private int m35439a(int i) {
            int binarySearch = Arrays.binarySearch(C10454s.f28280m, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$c */
    /* compiled from: RopeByteString */
    private static class C10457c implements Iterator<C10446n> {

        /* renamed from: f */
        private final Stack<C10454s> f28288f;

        /* renamed from: g */
        private C10446n f28289g;

        /* renamed from: a */
        private C10446n m35445a(C10417d dVar) {
            while (dVar instanceof C10454s) {
                C10454s sVar = (C10454s) dVar;
                this.f28288f.push(sVar);
                dVar = sVar.f28282h;
            }
            return (C10446n) dVar;
        }

        public boolean hasNext() {
            return this.f28289g != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C10457c(C10417d dVar) {
            this.f28288f = new Stack<>();
            this.f28289g = m35445a(dVar);
        }

        public C10446n next() {
            C10446n nVar = this.f28289g;
            if (nVar != null) {
                this.f28289g = m35444a();
                return nVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: a */
        private C10446n m35444a() {
            while (!this.f28288f.isEmpty()) {
                C10446n a = m35445a(this.f28288f.pop().f28283i);
                if (!a.isEmpty()) {
                    return a;
                }
            }
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$d */
    /* compiled from: RopeByteString */
    private class C10458d implements C10417d.C10418a {

        /* renamed from: f */
        private final C10457c f28290f;

        /* renamed from: g */
        private C10417d.C10418a f28291g;

        /* renamed from: h */
        int f28292h;

        public boolean hasNext() {
            return this.f28292h > 0;
        }

        public byte nextByte() {
            if (!this.f28291g.hasNext()) {
                this.f28291g = this.f28290f.next().iterator();
            }
            this.f28292h--;
            return this.f28291g.nextByte();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C10458d(C10454s sVar) {
            C10457c cVar = new C10457c(sVar);
            this.f28290f = cVar;
            this.f28291g = cVar.next().iterator();
            this.f28292h = sVar.size();
        }

        public Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f28280m = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f28280m;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean mo35689c() {
        int b = this.f28282h.mo35685b(0, 0, this.f28284j);
        C10417d dVar = this.f28283i;
        if (dVar.mo35685b(b, 0, dVar.size()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public C10420e mo35690d() {
        return C10420e.m35252a((InputStream) new C10459e());
    }

    public boolean equals(Object obj) {
        int f;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10417d)) {
            return false;
        }
        C10417d dVar = (C10417d) obj;
        if (this.f28281g != dVar.size()) {
            return false;
        }
        if (this.f28281g == 0) {
            return true;
        }
        if (this.f28286l == 0 || (f = dVar.mo35691f()) == 0 || this.f28286l == f) {
            return m35427c(dVar);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo35691f() {
        return this.f28286l;
    }

    public int hashCode() {
        int i = this.f28286l;
        if (i == 0) {
            int i2 = this.f28281g;
            i = mo35681a(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f28286l = i;
        }
        return i;
    }

    public int size() {
        return this.f28281g;
    }

    private C10454s(C10417d dVar, C10417d dVar2) {
        this.f28286l = 0;
        this.f28282h = dVar;
        this.f28283i = dVar2;
        int size = dVar.size();
        this.f28284j = size;
        this.f28281g = size + dVar2.size();
        this.f28285k = Math.max(dVar.mo35680a(), dVar2.mo35680a()) + 1;
    }

    /* renamed from: a */
    static C10417d m35423a(C10417d dVar, C10417d dVar2) {
        C10454s sVar = dVar instanceof C10454s ? (C10454s) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return m35426b(dVar, dVar2);
            }
            if (sVar != null && sVar.f28283i.size() + dVar2.size() < 128) {
                dVar2 = new C10454s(sVar.f28282h, m35426b(sVar.f28283i, dVar2));
            } else if (sVar == null || sVar.f28282h.mo35680a() <= sVar.f28283i.mo35680a() || sVar.mo35680a() <= dVar2.mo35680a()) {
                if (size >= f28280m[Math.max(dVar.mo35680a(), dVar2.mo35680a()) + 1]) {
                    return new C10454s(dVar, dVar2);
                }
                return new C10456b().m35440a(dVar, dVar2);
            } else {
                dVar2 = new C10454s(sVar.f28282h, new C10454s(sVar.f28283i, dVar2));
            }
        }
        return dVar2;
    }

    /* renamed from: b */
    private static C10446n m35426b(C10417d dVar, C10417d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[(size + size2)];
        dVar.mo35684a(bArr, 0, 0, size);
        dVar2.mo35684a(bArr, 0, size, size2);
        return new C10446n(bArr);
    }

    public C10417d.C10418a iterator() {
        return new C10458d();
    }

    /* renamed from: c */
    private boolean m35427c(C10417d dVar) {
        C10457c cVar = new C10457c(this);
        C10446n nVar = (C10446n) cVar.next();
        C10457c cVar2 = new C10457c(dVar);
        C10446n nVar2 = (C10446n) cVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = nVar.size() - i;
            int size2 = nVar2.size() - i2;
            int min = Math.min(size, size2);
            if (!(i == 0 ? nVar.mo35810a(nVar2, i2, min) : nVar2.mo35810a(nVar, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.f28281g;
            if (i3 < i4) {
                if (min == size) {
                    nVar = (C10446n) cVar.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == size2) {
                    nVar2 = (C10446n) cVar2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$e */
    /* compiled from: RopeByteString */
    private class C10459e extends InputStream {

        /* renamed from: f */
        private C10457c f28293f;

        /* renamed from: g */
        private C10446n f28294g;

        /* renamed from: h */
        private int f28295h;

        /* renamed from: i */
        private int f28296i;

        /* renamed from: j */
        private int f28297j;

        /* renamed from: k */
        private int f28298k;

        public C10459e() {
            m35448b();
        }

        /* renamed from: a */
        private int m35446a(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m35447a();
                if (this.f28294g != null) {
                    int min = Math.min(this.f28295h - this.f28296i, i3);
                    if (bArr != null) {
                        this.f28294g.mo35684a(bArr, this.f28296i, i, min);
                        i += min;
                    }
                    this.f28296i += min;
                    i3 -= min;
                } else if (i3 == i2) {
                    return -1;
                }
            }
            return i2 - i3;
        }

        /* renamed from: b */
        private void m35448b() {
            C10457c cVar = new C10457c(C10454s.this);
            this.f28293f = cVar;
            C10446n next = cVar.next();
            this.f28294g = next;
            this.f28295h = next.size();
            this.f28296i = 0;
            this.f28297j = 0;
        }

        public int available() throws IOException {
            return C10454s.this.size() - (this.f28297j + this.f28296i);
        }

        public void mark(int i) {
            this.f28298k = this.f28297j + this.f28296i;
        }

        public boolean markSupported() {
            return true;
        }

        public int read(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw null;
            } else if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m35446a(bArr, i, i2);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public synchronized void reset() {
            m35448b();
            m35446a((byte[]) null, 0, this.f28298k);
        }

        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) m35446a((byte[]) null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        public int read() throws IOException {
            m35447a();
            C10446n nVar = this.f28294g;
            if (nVar == null) {
                return -1;
            }
            int i = this.f28296i;
            this.f28296i = i + 1;
            return nVar.mo35672h(i) & 255;
        }

        /* renamed from: a */
        private void m35447a() {
            int i;
            if (this.f28294g != null && this.f28296i == (i = this.f28295h)) {
                this.f28297j += i;
                this.f28296i = 0;
                if (this.f28293f.hasNext()) {
                    C10446n next = this.f28293f.next();
                    this.f28294g = next;
                    this.f28295h = next.size();
                    return;
                }
                this.f28294g = null;
                this.f28295h = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo35688b() {
        return this.f28281g >= f28280m[this.f28285k];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo35671b(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f28284j;
        if (i4 <= i5) {
            this.f28282h.mo35671b(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f28283i.mo35671b(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f28282h.mo35671b(bArr, i, i2, i6);
            this.f28283i.mo35671b(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo35687b(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.f28284j;
        if (i3 <= i4) {
            this.f28282h.mo35687b(outputStream, i, i2);
        } else if (i >= i4) {
            this.f28283i.mo35687b(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f28282h.mo35687b(outputStream, i, i5);
            this.f28283i.mo35687b(outputStream, 0, i2 - i5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo35680a() {
        return this.f28285k;
    }

    /* renamed from: a */
    public String mo35682a(String str) throws UnsupportedEncodingException {
        return new String(mo35692g(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo35681a(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f28284j;
        if (i4 <= i5) {
            return this.f28282h.mo35681a(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f28283i.mo35681a(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f28283i.mo35681a(this.f28282h.mo35681a(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo35685b(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f28284j;
        if (i4 <= i5) {
            return this.f28282h.mo35685b(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f28283i.mo35685b(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f28283i.mo35685b(this.f28282h.mo35685b(i, i2, i6), 0, i3 - i6);
    }
}
