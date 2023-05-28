package p413s;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 J2\u00020\u0001:\u0001JB\u001d\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0015\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0011H\u0010¢\u0006\u0002\b\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002JV\u0010\u001a\u001a\u00020\u001b2K\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001b0\u001dH\bJf\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2K\u0010\u001c\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\"\u0012\u0013\u0012\u00110!¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001b0\u001dH\bJ\r\u0010&\u001a\u00020!H\u0010¢\u0006\u0002\b'J\b\u0010(\u001a\u00020!H\u0016J\b\u0010)\u001a\u00020\u0011H\u0016J\u001d\u0010*\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0001H\u0010¢\u0006\u0002\b,J\u0018\u0010-\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010.\u001a\u00020!H\u0016J\r\u0010/\u001a\u00020\u0004H\u0010¢\u0006\u0002\b0J\u0015\u00101\u001a\u0002022\u0006\u00103\u001a\u00020!H\u0010¢\u0006\u0002\b4J\u0018\u00105\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010.\u001a\u00020!H\u0016J(\u00106\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u00107\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J(\u00106\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u00107\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J\u0010\u00108\u001a\u00020!2\u0006\u00103\u001a\u00020!H\u0002J\u0010\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020;H\u0016J\u0018\u0010<\u001a\u00020\u00012\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!H\u0016J\b\u0010=\u001a\u00020\u0001H\u0016J\b\u0010>\u001a\u00020\u0001H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J\b\u0010@\u001a\u00020\u0001H\u0002J\b\u0010A\u001a\u00020\u0011H\u0016J\u0010\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020DH\u0016J\u0015\u0010B\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020FH\u0010¢\u0006\u0002\bGJ\b\u0010H\u001a\u00020IH\u0002R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006K"}, mo16641d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "segments", "", "", "directory", "", "([[B[I)V", "getDirectory", "()[I", "getSegments", "()[[B", "[[B", "asByteBuffer", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "base64", "", "base64Url", "digest", "algorithm", "digest$jvm", "equals", "", "other", "", "forEachSegment", "", "action", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "data", "", "offset", "byteCount", "beginIndex", "endIndex", "getSize", "getSize$jvm", "hashCode", "hex", "hmac", "key", "hmac$jvm", "indexOf", "fromIndex", "internalArray", "internalArray$jvm", "internalGet", "", "pos", "internalGet$jvm", "lastIndexOf", "rangeEquals", "otherOffset", "segment", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toByteString", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$jvm", "writeReplace", "Ljava/lang/Object;", "Companion", "jvm"}, mo16642k = 1, mo16643mv = {1, 1, 11})
/* renamed from: s.x */
/* compiled from: SegmentedByteString.kt */
public final class C12930x extends C12911i {

    /* renamed from: m */
    public static final C12931a f33203m = new C12931a((DefaultConstructorMarker) null);

    /* renamed from: k */
    private final transient byte[][] f33204k;

    /* renamed from: l */
    private final transient int[] f33205l;

    /* renamed from: s.x$a */
    /* compiled from: SegmentedByteString.kt */
    public static final class C12931a {
        private C12931a() {
        }

        /* renamed from: a */
        public final C12911i mo41303a(C12905f fVar, int i) {
            C10202j.m34178b(fVar, "buffer");
            C12897c.m41512a(fVar.size(), 0, (long) i);
            C12927v vVar = fVar.f33148f;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                if (vVar != null) {
                    int i5 = vVar.f33195c;
                    int i6 = vVar.f33194b;
                    if (i5 != i6) {
                        i3 += i5 - i6;
                        i4++;
                        vVar = vVar.f33198f;
                    } else {
                        throw new AssertionError("s.limit == s.pos");
                    }
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
            byte[][] bArr = new byte[i4][];
            int[] iArr = new int[(i4 * 2)];
            C12927v vVar2 = fVar.f33148f;
            int i7 = 0;
            while (i2 < i) {
                if (vVar2 != null) {
                    bArr[i7] = vVar2.f33193a;
                    i2 += vVar2.f33195c - vVar2.f33194b;
                    iArr[i7] = Math.min(i2, i);
                    iArr[i7 + i4] = vVar2.f33194b;
                    vVar2.f33196d = true;
                    i7++;
                    vVar2 = vVar2.f33198f;
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
            return new C12930x(bArr, iArr, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C12931a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C12930x(byte[][] bArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, iArr);
    }

    /* renamed from: H */
    private final C12911i m41740H() {
        return new C12911i(mo41301D());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final int m41742d(int i) {
        int binarySearch = Arrays.binarySearch(this.f33205l, 0, this.f33204k.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    private final Object writeReplace() {
        C12911i H = m41740H();
        if (H != null) {
            return H;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
    }

    /* renamed from: B */
    public final byte[][] mo41300B() {
        return this.f33204k;
    }

    /* renamed from: D */
    public byte[] mo41301D() {
        byte[] bArr = new byte[mo41239s()];
        int length = mo41300B().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = mo41302w()[length + i];
            int i5 = mo41302w()[i];
            int i6 = i5 - i2;
            C12893b.m41507a(mo41300B()[i], i4, bArr, i3, i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: b */
    public byte mo41223b(int i) {
        int i2;
        C12897c.m41512a((long) this.f33205l[this.f33204k.length - 1], (long) i, 1);
        int d = m41742d(i);
        if (d == 0) {
            i2 = 0;
        } else {
            i2 = this.f33205l[d - 1];
        }
        int[] iArr = this.f33205l;
        byte[][] bArr = this.f33204k;
        return bArr[d][(i - i2) + iArr[bArr.length + d]];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12911i) {
            C12911i iVar = (C12911i) obj;
            return iVar.mo41239s() == mo41239s() && mo41221a(0, iVar, 0, mo41239s());
        }
    }

    public int hashCode() {
        int e = mo41229e();
        if (e != 0) {
            return e;
        }
        int length = mo41300B().length;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i < length) {
            int i4 = mo41302w()[length + i];
            int i5 = mo41302w()[i];
            byte[] bArr = mo41300B()[i];
            int i6 = (i5 - i2) + i4;
            while (i4 < i6) {
                i3 = (i3 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i2 = i5;
        }
        mo41226c(i3);
        return i3;
    }

    /* renamed from: i */
    public int mo41232i() {
        return this.f33205l[this.f33204k.length - 1];
    }

    /* renamed from: m */
    public String mo41234m() {
        return m41740H().mo41234m();
    }

    /* renamed from: o */
    public byte[] mo41235o() {
        return mo41301D();
    }

    /* renamed from: t */
    public C12911i mo41240t() {
        return m41740H().mo41240t();
    }

    public String toString() {
        return m41740H().toString();
    }

    /* renamed from: w */
    public final int[] mo41302w() {
        return this.f33205l;
    }

    private C12930x(byte[][] bArr, int[] iArr) {
        super(C12911i.f33158i.mo41228d());
        this.f33204k = bArr;
        this.f33205l = iArr;
    }

    /* renamed from: a */
    public String mo41218a() {
        return m41740H().mo41218a();
    }

    /* renamed from: a */
    public C12911i mo41219a(String str) {
        C10202j.m34178b(str, "algorithm");
        MessageDigest instance = MessageDigest.getInstance(str);
        int length = mo41300B().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo41302w()[length + i];
            int i4 = mo41302w()[i];
            instance.update(mo41300B()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = instance.digest();
        C10202j.m34174a((Object) digest, "digest.digest()");
        return new C12911i(digest);
    }

    /* renamed from: a */
    public boolean mo41221a(int i, C12911i iVar, int i2, int i3) {
        int i4;
        C10202j.m34178b(iVar, "other");
        if (i < 0 || i > mo41239s() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int a = m41742d(i);
        while (i < i5) {
            if (a == 0) {
                i4 = 0;
            } else {
                i4 = mo41302w()[a - 1];
            }
            int i6 = mo41302w()[mo41300B().length + a];
            int min = Math.min(i5, (mo41302w()[a] - i4) + i4) - i;
            if (!iVar.mo41222a(i2, mo41300B()[a], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo41222a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        C10202j.m34178b(bArr, "other");
        if (i < 0 || i > mo41239s() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int a = m41742d(i);
        while (i < i5) {
            if (a == 0) {
                i4 = 0;
            } else {
                i4 = mo41302w()[a - 1];
            }
            int i6 = mo41302w()[mo41300B().length + a];
            int min = Math.min(i5, (mo41302w()[a] - i4) + i4) - i;
            if (!C12897c.m41513a(mo41300B()[a], i6 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    /* renamed from: a */
    public void mo41220a(C12905f fVar) {
        C10202j.m34178b(fVar, "buffer");
        int length = mo41300B().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = mo41302w()[length + i];
            int i4 = mo41302w()[i];
            C12927v vVar = new C12927v(mo41300B()[i], i3, i3 + (i4 - i2), true, false);
            C12927v vVar2 = fVar.f33148f;
            if (vVar2 == null) {
                vVar.f33199g = vVar;
                vVar.f33198f = vVar;
                fVar.f33148f = vVar;
            } else if (vVar2 != null) {
                C12927v vVar3 = vVar2.f33199g;
                if (vVar3 != null) {
                    vVar3.mo41294a(vVar);
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            } else {
                C10202j.m34172a();
                throw null;
            }
            i++;
            i2 = i4;
        }
        fVar.mo41180k(fVar.size() + ((long) mo41239s()));
    }
}
