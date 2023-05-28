package p413s;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p413s.p414c0.C12898a;

@C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 Z2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001ZB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0002J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0000J\u0013\u0010!\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\"H\u0002J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0002¢\u0006\u0002\b&J\u0015\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020\tH\u0007¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\tH\u0010¢\u0006\u0002\b)J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010*\u001a\u00020\u0010H\u0016J\u001d\u0010+\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0000H\u0010¢\u0006\u0002\b-J\u0010\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u0010\u00100\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0016J\u001a\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\tH\u0017J\u001a\u00101\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\tH\u0007J\r\u00103\u001a\u00020\u0004H\u0010¢\u0006\u0002\b4J\u0015\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020\tH\u0010¢\u0006\u0002\b7J\u001a\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00102\u001a\u00020\tH\u0017J\u001a\u00108\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u00020\tH\u0007J\b\u00109\u001a\u00020\u0000H\u0016J(\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J(\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0016J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020\u0000H\u0016J\b\u0010C\u001a\u00020\u0000H\u0016J\b\u0010D\u001a\u00020\u0000H\u0016J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bEJ\u000e\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0004J\u000e\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u0000J\u0010\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u00020JH\u0016J\u001c\u0010K\u001a\u00020\u00002\b\b\u0002\u0010L\u001a\u00020\t2\b\b\u0002\u0010M\u001a\u00020\tH\u0017J\b\u0010N\u001a\u00020\u0000H\u0016J\b\u0010O\u001a\u00020\u0000H\u0016J\b\u0010P\u001a\u00020\u0004H\u0016J\b\u0010Q\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010R\u001a\u00020?2\u0006\u0010S\u001a\u00020TH\u0016J\u0015\u0010R\u001a\u00020?2\u0006\u0010U\u001a\u00020VH\u0010¢\u0006\u0002\bWJ\u0010\u0010X\u001a\u00020?2\u0006\u0010S\u001a\u00020YH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006["}, mo16641d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "data", "", "([B)V", "getData$jvm", "()[B", "hashCode", "", "getHashCode$jvm", "()I", "setHashCode$jvm", "(I)V", "size", "utf8", "", "getUtf8$jvm", "()Ljava/lang/String;", "setUtf8$jvm", "(Ljava/lang/String;)V", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "base64Url", "compareTo", "other", "digest", "algorithm", "digest$jvm", "endsWith", "", "suffix", "equals", "", "get", "", "index", "getByte", "-deprecated_getByte", "getSize", "getSize$jvm", "hex", "hmac", "key", "hmac$jvm", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "fromIndex", "internalArray", "internalArray$jvm", "internalGet", "pos", "internalGet$jvm", "lastIndexOf", "md5", "rangeEquals", "offset", "otherOffset", "byteCount", "readObject", "", "in", "Ljava/io/ObjectInputStream;", "sha1", "sha256", "sha512", "-deprecated_size", "startsWith", "prefix", "string", "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$jvm", "writeObject", "Ljava/io/ObjectOutputStream;", "Companion", "jvm"}, mo16642k = 1, mo16643mv = {1, 1, 11})
/* renamed from: s.i */
/* compiled from: ByteString.kt */
public class C12911i implements Serializable, Comparable<C12911i> {

    /* renamed from: i */
    public static final C12911i f33158i = C12898a.m41519a();

    /* renamed from: j */
    public static final C12912a f33159j = new C12912a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private transient int f33160f;

    /* renamed from: g */
    private transient String f33161g;

    /* renamed from: h */
    private final byte[] f33162h;

    /* renamed from: s.i$a */
    /* compiled from: ByteString.kt */
    public static final class C12912a {
        private C12912a() {
        }

        /* renamed from: a */
        public final C12911i mo41246a(byte... bArr) {
            C10202j.m34178b(bArr, "data");
            return C12898a.m41522a(bArr);
        }

        /* renamed from: b */
        public final C12911i mo41248b(String str) {
            C10202j.m34178b(str, "$receiver");
            return C12898a.m41527b(str);
        }

        /* renamed from: c */
        public final C12911i mo41249c(String str) {
            C10202j.m34178b(str, "$receiver");
            return C12898a.m41530c(str);
        }

        public /* synthetic */ C12912a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static /* bridge */ /* synthetic */ C12911i m41657a(C12912a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo41247a(bArr, i, i2);
        }

        /* renamed from: a */
        public final C12911i mo41247a(byte[] bArr, int i, int i2) {
            C10202j.m34178b(bArr, "$receiver");
            C12897c.m41512a((long) bArr.length, (long) i, (long) i2);
            byte[] bArr2 = new byte[i2];
            C12893b.m41507a(bArr, i, bArr2, 0, i2);
            return new C12911i(bArr2);
        }

        /* renamed from: a */
        public final C12911i mo41245a(String str, Charset charset) {
            C10202j.m34178b(str, "$receiver");
            C10202j.m34178b(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            C10202j.m34174a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return new C12911i(bytes);
        }

        /* renamed from: a */
        public final C12911i mo41244a(String str) {
            C10202j.m34178b(str, "$receiver");
            return C12898a.m41520a(str);
        }

        /* renamed from: a */
        public final C12911i mo41243a(InputStream inputStream, int i) throws IOException {
            C10202j.m34178b(inputStream, "$receiver");
            int i2 = 0;
            if (i >= 0) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = inputStream.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new C12911i(bArr);
            }
            throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
        }
    }

    public C12911i(byte[] bArr) {
        C10202j.m34178b(bArr, "data");
        this.f33162h = bArr;
    }

    /* renamed from: c */
    public static final C12911i m41632c(String str) {
        return f33159j.mo41248b(str);
    }

    /* renamed from: d */
    public static final C12911i m41633d(String str) {
        return f33159j.mo41249c(str);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        C12911i a = f33159j.mo41243a((InputStream) objectInputStream, objectInputStream.readInt());
        Field declaredField = C12911i.class.getDeclaredField("h");
        C10202j.m34174a((Object) declaredField, "field");
        declaredField.setAccessible(true);
        declaredField.set(this, a.f33162h);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f33162h.length);
        objectOutputStream.write(this.f33162h);
    }

    /* renamed from: a */
    public String mo41218a() {
        return C12898a.m41518a(this);
    }

    /* renamed from: b */
    public final void mo41224b(String str) {
        this.f33161g = str;
    }

    /* renamed from: c */
    public final void mo41226c(int i) {
        this.f33160f = i;
    }

    /* renamed from: d */
    public final byte[] mo41228d() {
        return this.f33162h;
    }

    /* renamed from: e */
    public final int mo41229e() {
        return this.f33160f;
    }

    public boolean equals(Object obj) {
        return C12898a.m41525a(this, obj);
    }

    public int hashCode() {
        return C12898a.m41529c(this);
    }

    /* renamed from: i */
    public int mo41232i() {
        return C12898a.m41526b(this);
    }

    /* renamed from: l */
    public final String mo41233l() {
        return this.f33161g;
    }

    /* renamed from: m */
    public String mo41234m() {
        return C12898a.m41531d(this);
    }

    /* renamed from: o */
    public byte[] mo41235o() {
        return C12898a.m41532e(this);
    }

    /* renamed from: p */
    public C12911i mo41236p() {
        return mo41219a("MD5");
    }

    /* renamed from: q */
    public C12911i mo41237q() {
        return mo41219a("SHA-1");
    }

    /* renamed from: r */
    public C12911i mo41238r() {
        return mo41219a("SHA-256");
    }

    /* renamed from: s */
    public final int mo41239s() {
        return mo41232i();
    }

    /* renamed from: t */
    public C12911i mo41240t() {
        return C12898a.m41533f(this);
    }

    public String toString() {
        return C12898a.m41534g(this);
    }

    /* renamed from: v */
    public String mo41242v() {
        return C12898a.m41535h(this);
    }

    /* renamed from: a */
    public C12911i mo41219a(String str) {
        C10202j.m34178b(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.f33162h);
        C10202j.m34174a((Object) digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new C12911i(digest);
    }

    /* renamed from: b */
    public byte mo41223b(int i) {
        return C12898a.m41514a(this, i);
    }

    /* renamed from: a */
    public final byte mo41216a(int i) {
        return mo41223b(i);
    }

    /* renamed from: b */
    public final boolean mo41225b(C12911i iVar) {
        C10202j.m34178b(iVar, "prefix");
        return C12898a.m41528b(this, iVar);
    }

    /* renamed from: a */
    public void mo41220a(C12905f fVar) {
        C10202j.m34178b(fVar, "buffer");
        byte[] bArr = this.f33162h;
        fVar.write(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo41221a(int i, C12911i iVar, int i2, int i3) {
        C10202j.m34178b(iVar, "other");
        return C12898a.m41523a(this, i, iVar, i2, i3);
    }

    /* renamed from: a */
    public boolean mo41222a(int i, byte[] bArr, int i2, int i3) {
        C10202j.m34178b(bArr, "other");
        return C12898a.m41524a(this, i, bArr, i2, i3);
    }

    /* renamed from: a */
    public int compareTo(C12911i iVar) {
        C10202j.m34178b(iVar, "other");
        return C12898a.m41516a(this, iVar);
    }
}
