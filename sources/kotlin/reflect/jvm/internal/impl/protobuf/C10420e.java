package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e */
/* compiled from: CodedInputStream */
public final class C10420e {

    /* renamed from: a */
    private final byte[] f28222a;

    /* renamed from: b */
    private final boolean f28223b;

    /* renamed from: c */
    private int f28224c;

    /* renamed from: d */
    private int f28225d;

    /* renamed from: e */
    private int f28226e;

    /* renamed from: f */
    private final InputStream f28227f;

    /* renamed from: g */
    private int f28228g;

    /* renamed from: h */
    private boolean f28229h;

    /* renamed from: i */
    private int f28230i;

    /* renamed from: j */
    private int f28231j;

    /* renamed from: k */
    private int f28232k;

    /* renamed from: l */
    private int f28233l;

    /* renamed from: m */
    private int f28234m;

    /* renamed from: n */
    private C10421a f28235n;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e$a */
    /* compiled from: CodedInputStream */
    private interface C10421a {
        /* renamed from: a */
        void mo35736a();
    }

    private C10420e(InputStream inputStream) {
        this.f28229h = false;
        this.f28231j = Integer.MAX_VALUE;
        this.f28233l = 64;
        this.f28234m = 67108864;
        this.f28235n = null;
        this.f28222a = new byte[RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f28224c = 0;
        this.f28226e = 0;
        this.f28230i = 0;
        this.f28227f = inputStream;
        this.f28223b = false;
    }

    /* renamed from: A */
    private void m35249A() {
        int i = this.f28224c + this.f28225d;
        this.f28224c = i;
        int i2 = this.f28230i + i;
        int i3 = this.f28231j;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f28225d = i4;
            this.f28224c = i - i4;
            return;
        }
        this.f28225d = 0;
    }

    /* renamed from: a */
    public static long m35251a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public static C10420e m35252a(InputStream inputStream) {
        return new C10420e(inputStream);
    }

    /* renamed from: e */
    public static int m35254e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: b */
    public void mo35708b(int i) {
        this.f28231j = i;
        m35249A();
    }

    /* renamed from: c */
    public boolean mo35711c() throws IOException {
        return mo35725p() != 0;
    }

    /* renamed from: d */
    public C10417d mo35712d() throws IOException {
        int o = mo35724o();
        if (o <= this.f28224c - this.f28226e && o > 0) {
            C10417d a = (!this.f28223b || !this.f28229h) ? C10417d.m35227a(this.f28222a, this.f28226e, o) : new C10414c(this.f28222a, this.f28226e, o);
            this.f28226e += o;
            return a;
        } else if (o == 0) {
            return C10417d.f28215f;
        } else {
            return new C10446n(m35256g(o));
        }
    }

    /* renamed from: e */
    public double mo35714e() throws IOException {
        return Double.longBitsToDouble(mo35723n());
    }

    /* renamed from: f */
    public int mo35715f() throws IOException {
        return mo35724o();
    }

    /* renamed from: g */
    public int mo35716g() throws IOException {
        return mo35722m();
    }

    /* renamed from: h */
    public long mo35717h() throws IOException {
        return mo35723n();
    }

    /* renamed from: i */
    public float mo35718i() throws IOException {
        return Float.intBitsToFloat(mo35722m());
    }

    /* renamed from: j */
    public int mo35719j() throws IOException {
        return mo35724o();
    }

    /* renamed from: k */
    public long mo35720k() throws IOException {
        return mo35725p();
    }

    /* renamed from: l */
    public byte mo35721l() throws IOException {
        if (this.f28226e == this.f28224c) {
            m35257h(1);
        }
        byte[] bArr = this.f28222a;
        int i = this.f28226e;
        this.f28226e = i + 1;
        return bArr[i];
    }

    /* renamed from: m */
    public int mo35722m() throws IOException {
        int i = this.f28226e;
        if (this.f28224c - i < 4) {
            m35257h(4);
            i = this.f28226e;
        }
        byte[] bArr = this.f28222a;
        this.f28226e = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: n */
    public long mo35723n() throws IOException {
        int i = this.f28226e;
        if (this.f28224c - i < 8) {
            m35257h(8);
            i = this.f28226e;
        }
        byte[] bArr = this.f28222a;
        this.f28226e = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r2[r3] < 0) goto L_0x007b;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo35724o() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f28226e
            int r1 = r9.f28224c
            if (r1 != r0) goto L_0x0008
            goto L_0x007b
        L_0x0008:
            byte[] r2 = r9.f28222a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r9.f28226e = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0019
            goto L_0x007b
        L_0x0019:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x002c
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x0029:
            long r3 = r3 ^ r5
            int r0 = (int) r3
            goto L_0x0081
        L_0x002c:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003e
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L_0x003c:
            r1 = r3
            goto L_0x0081
        L_0x003e:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x004e
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x0029
        L_0x004e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L_0x003c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0081
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0081
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003c
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0081
        L_0x007b:
            long r0 = r9.mo35726q()
            int r1 = (int) r0
            return r1
        L_0x0081:
            r9.f28226e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10420e.mo35724o():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b6;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo35725p() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f28226e
            int r1 = r9.f28224c
            if (r1 != r0) goto L_0x0008
            goto L_0x00b6
        L_0x0008:
            byte[] r2 = r9.f28222a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r9.f28226e = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b6
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002e
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x002b:
            long r3 = r3 ^ r5
            goto L_0x00bb
        L_0x002e:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0040
            r1 = 16256(0x3f80, double:8.0315E-320)
        L_0x003c:
            long r3 = r3 ^ r1
        L_0x003d:
            r1 = r0
            goto L_0x00bb
        L_0x0040:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0050
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x002b
        L_0x0050:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0061
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L_0x003c
        L_0x0061:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L_0x002b
        L_0x0074:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0087
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x003c
        L_0x0087:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009a
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x002b
        L_0x009a:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x003d
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bb
        L_0x00b6:
            long r0 = r9.mo35726q()
            return r0
        L_0x00bb:
            r9.f28226e = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10420e.mo35725p():long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public long mo35726q() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = mo35721l();
            j |= ((long) (l & Byte.MAX_VALUE)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.m35197f();
    }

    /* renamed from: r */
    public int mo35727r() throws IOException {
        return mo35722m();
    }

    /* renamed from: s */
    public long mo35728s() throws IOException {
        return mo35723n();
    }

    /* renamed from: t */
    public int mo35729t() throws IOException {
        return m35254e(mo35724o());
    }

    /* renamed from: u */
    public long mo35730u() throws IOException {
        return m35251a(mo35725p());
    }

    /* renamed from: v */
    public String mo35731v() throws IOException {
        int o = mo35724o();
        if (o <= this.f28224c - this.f28226e && o > 0) {
            String str = new String(this.f28222a, this.f28226e, o, "UTF-8");
            this.f28226e += o;
            return str;
        } else if (o == 0) {
            return "";
        } else {
            return new String(m35256g(o), "UTF-8");
        }
    }

    /* renamed from: w */
    public String mo35732w() throws IOException {
        byte[] bArr;
        int o = mo35724o();
        int i = this.f28226e;
        if (o <= this.f28224c - i && o > 0) {
            bArr = this.f28222a;
            this.f28226e = i + o;
        } else if (o == 0) {
            return "";
        } else {
            bArr = m35256g(o);
            i = 0;
        }
        if (C10471v.m35485b(bArr, i, i + o)) {
            return new String(bArr, i, o, "UTF-8");
        }
        throw InvalidProtocolBufferException.m35195d();
    }

    /* renamed from: x */
    public int mo35733x() throws IOException {
        if (mo35709b()) {
            this.f28228g = 0;
            return 0;
        }
        int o = mo35724o();
        this.f28228g = o;
        if (C10472w.m35488a(o) != 0) {
            return this.f28228g;
        }
        throw InvalidProtocolBufferException.m35194c();
    }

    /* renamed from: y */
    public int mo35734y() throws IOException {
        return mo35724o();
    }

    /* renamed from: z */
    public long mo35735z() throws IOException {
        return mo35725p();
    }

    /* renamed from: a */
    static C10420e m35253a(C10446n nVar) {
        C10420e eVar = new C10420e(nVar);
        try {
            eVar.mo35710c(nVar.size());
            return eVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: f */
    private void m35255f(int i) throws IOException {
        if (this.f28224c - this.f28226e < i) {
            m35257h(i);
        }
    }

    /* renamed from: g */
    private byte[] m35256g(int i) throws IOException {
        if (i > 0) {
            int i2 = this.f28230i;
            int i3 = this.f28226e;
            int i4 = i2 + i3 + i;
            int i5 = this.f28231j;
            if (i4 > i5) {
                mo35713d((i5 - i2) - i3);
                throw InvalidProtocolBufferException.m35201j();
            } else if (i < 4096) {
                byte[] bArr = new byte[i];
                int i6 = this.f28224c - i3;
                System.arraycopy(this.f28222a, i3, bArr, 0, i6);
                this.f28226e = this.f28224c;
                int i7 = i - i6;
                m35255f(i7);
                System.arraycopy(this.f28222a, 0, bArr, i6, i7);
                this.f28226e = i7;
                return bArr;
            } else {
                int i8 = this.f28224c;
                this.f28230i = i2 + i8;
                this.f28226e = 0;
                this.f28224c = 0;
                int i9 = i8 - i3;
                int i10 = i - i9;
                ArrayList<byte[]> arrayList = new ArrayList<>();
                while (i10 > 0) {
                    int min = Math.min(i10, RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT);
                    byte[] bArr2 = new byte[min];
                    int i11 = 0;
                    while (i11 < min) {
                        InputStream inputStream = this.f28227f;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i11, min - i11);
                        if (read != -1) {
                            this.f28230i += read;
                            i11 += read;
                        } else {
                            throw InvalidProtocolBufferException.m35201j();
                        }
                    }
                    i10 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(this.f28222a, i3, bArr3, 0, i9);
                for (byte[] bArr4 : arrayList) {
                    System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
                    i9 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i == 0) {
            return C10436i.f28265a;
        } else {
            throw InvalidProtocolBufferException.m35198g();
        }
    }

    /* renamed from: h */
    private void m35257h(int i) throws IOException {
        if (!m35259j(i)) {
            throw InvalidProtocolBufferException.m35201j();
        }
    }

    /* renamed from: i */
    private void m35258i(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f28230i;
            int i3 = this.f28226e;
            int i4 = i2 + i3 + i;
            int i5 = this.f28231j;
            if (i4 <= i5) {
                int i6 = this.f28224c;
                int i7 = i6 - i3;
                this.f28226e = i6;
                m35257h(1);
                while (true) {
                    int i8 = i - i7;
                    int i9 = this.f28224c;
                    if (i8 > i9) {
                        i7 += i9;
                        this.f28226e = i9;
                        m35257h(1);
                    } else {
                        this.f28226e = i8;
                        return;
                    }
                }
            } else {
                mo35713d((i5 - i2) - i3);
                throw InvalidProtocolBufferException.m35201j();
            }
        } else {
            throw InvalidProtocolBufferException.m35198g();
        }
    }

    /* renamed from: j */
    private boolean m35259j(int i) throws IOException {
        int i2 = this.f28226e;
        if (i2 + i <= this.f28224c) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        } else if (this.f28230i + i2 + i > this.f28231j) {
            return false;
        } else {
            C10421a aVar = this.f28235n;
            if (aVar != null) {
                aVar.mo35736a();
            }
            if (this.f28227f != null) {
                int i3 = this.f28226e;
                if (i3 > 0) {
                    int i4 = this.f28224c;
                    if (i4 > i3) {
                        byte[] bArr = this.f28222a;
                        System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
                    }
                    this.f28230i += i3;
                    this.f28224c -= i3;
                    this.f28226e = 0;
                }
                InputStream inputStream = this.f28227f;
                byte[] bArr2 = this.f28222a;
                int i5 = this.f28224c;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.f28222a.length) {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.f28224c += read;
                    if ((this.f28230i + i) - this.f28234m <= 0) {
                        m35249A();
                        if (this.f28224c >= i) {
                            return true;
                        }
                        return m35259j(i);
                    }
                    throw InvalidProtocolBufferException.m35200i();
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public int mo35710c(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = i + this.f28230i + this.f28226e;
            int i3 = this.f28231j;
            if (i2 <= i3) {
                this.f28231j = i2;
                m35249A();
                return i3;
            }
            throw InvalidProtocolBufferException.m35201j();
        }
        throw InvalidProtocolBufferException.m35198g();
    }

    /* renamed from: b */
    public boolean mo35709b() throws IOException {
        return this.f28226e == this.f28224c && !m35259j(1);
    }

    /* renamed from: a */
    public void mo35703a(int i) throws InvalidProtocolBufferException {
        if (this.f28228g != i) {
            throw InvalidProtocolBufferException.m35193b();
        }
    }

    /* renamed from: a */
    public boolean mo35707a(int i, CodedOutputStream codedOutputStream) throws IOException {
        int b = C10472w.m35490b(i);
        if (b == 0) {
            long k = mo35720k();
            codedOutputStream.mo35650f(i);
            codedOutputStream.mo35653g(k);
            return true;
        } else if (b == 1) {
            long n = mo35723n();
            codedOutputStream.mo35650f(i);
            codedOutputStream.mo35626a(n);
            return true;
        } else if (b == 2) {
            C10417d d = mo35712d();
            codedOutputStream.mo35650f(i);
            codedOutputStream.mo35628a(d);
            return true;
        } else if (b == 3) {
            codedOutputStream.mo35650f(i);
            mo35705a(codedOutputStream);
            int a = C10472w.m35489a(C10472w.m35488a(i), 4);
            mo35703a(a);
            codedOutputStream.mo35650f(a);
            return true;
        } else if (b == 4) {
            return false;
        } else {
            if (b == 5) {
                int m = mo35722m();
                codedOutputStream.mo35650f(i);
                codedOutputStream.mo35634b(m);
                return true;
            }
            throw InvalidProtocolBufferException.m35196e();
        }
    }

    /* renamed from: d */
    public void mo35713d(int i) throws IOException {
        int i2 = this.f28224c;
        int i3 = this.f28226e;
        if (i > i2 - i3 || i < 0) {
            m35258i(i);
        } else {
            this.f28226e = i3 + i;
        }
    }

    private C10420e(C10446n nVar) {
        this.f28229h = false;
        this.f28231j = Integer.MAX_VALUE;
        this.f28233l = 64;
        this.f28234m = 67108864;
        this.f28235n = null;
        this.f28222a = nVar.f28275g;
        int k = nVar.mo35674k();
        this.f28226e = k;
        this.f28224c = k + nVar.size();
        this.f28230i = -this.f28226e;
        this.f28227f = null;
        this.f28223b = true;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public void mo35705a(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2) throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.mo35733x()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo35707a((int) r0, (kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream) r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10420e.mo35705a(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream):void");
    }

    /* renamed from: a */
    public void mo35704a(int i, C10449o.C10450a aVar, C10422f fVar) throws IOException {
        int i2 = this.f28232k;
        if (i2 < this.f28233l) {
            this.f28232k = i2 + 1;
            aVar.mo34377a(this, fVar);
            mo35703a(C10472w.m35489a(i, 4));
            this.f28232k--;
            return;
        }
        throw InvalidProtocolBufferException.m35199h();
    }

    /* renamed from: a */
    public void mo35706a(C10449o.C10450a aVar, C10422f fVar) throws IOException {
        int o = mo35724o();
        if (this.f28232k < this.f28233l) {
            int c = mo35710c(o);
            this.f28232k++;
            aVar.mo34377a(this, fVar);
            mo35703a(0);
            this.f28232k--;
            mo35708b(c);
            return;
        }
        throw InvalidProtocolBufferException.m35199h();
    }

    /* renamed from: a */
    public <T extends C10449o> T mo35702a(C10452q<T> qVar, C10422f fVar) throws IOException {
        int o = mo35724o();
        if (this.f28232k < this.f28233l) {
            int c = mo35710c(o);
            this.f28232k++;
            T t = (C10449o) qVar.mo34369a(this, fVar);
            mo35703a(0);
            this.f28232k--;
            mo35708b(c);
            return t;
        }
        throw InvalidProtocolBufferException.m35199h();
    }

    /* renamed from: a */
    public static int m35250a(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i2 |= (read & 127) << i3;
                if ((read & 128) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw InvalidProtocolBufferException.m35201j();
            }
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.m35201j();
            } else if ((read2 & 128) == 0) {
                return i2;
            } else {
                i3 += 7;
            }
        }
        throw InvalidProtocolBufferException.m35197f();
    }

    /* renamed from: a */
    public int mo35701a() {
        int i = this.f28231j;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f28230i + this.f28226e);
    }
}
