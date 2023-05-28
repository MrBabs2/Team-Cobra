package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public final class CodedOutputStream {

    /* renamed from: a */
    private final byte[] f28203a;

    /* renamed from: b */
    private final int f28204b;

    /* renamed from: c */
    private int f28205c;

    /* renamed from: d */
    private int f28206d = 0;

    /* renamed from: e */
    private final OutputStream f28207e;

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f28207e = outputStream;
        this.f28203a = bArr;
        this.f28205c = 0;
        this.f28204b = bArr.length;
    }

    /* renamed from: a */
    public static CodedOutputStream m35116a(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    /* renamed from: b */
    public static int m35117b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m35118b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m35125b(boolean z) {
        return 1;
    }

    /* renamed from: h */
    public static int m35134h(long j) {
        return 8;
    }

    /* renamed from: j */
    public static int m35136j(int i) {
        return m35140l(i);
    }

    /* renamed from: j */
    public static int m35137j(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: k */
    public static int m35138k(int i) {
        return 4;
    }

    /* renamed from: k */
    public static int m35139k(long j) {
        return 8;
    }

    /* renamed from: l */
    public static int m35140l(int i) {
        if (i >= 0) {
            return m35144n(i);
        }
        return 10;
    }

    /* renamed from: m */
    static int m35142m(int i) {
        return i > 4096 ? RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT : i;
    }

    /* renamed from: m */
    public static int m35143m(long j) {
        return m35137j(j);
    }

    /* renamed from: n */
    public static int m35144n(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: n */
    public static long m35145n(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: o */
    public static int m35146o(int i) {
        return 4;
    }

    /* renamed from: p */
    public static int m35147p(int i) {
        return m35144n(m35150s(i));
    }

    /* renamed from: q */
    public static int m35148q(int i) {
        return m35144n(C10472w.m35489a(i, 0));
    }

    /* renamed from: r */
    public static int m35149r(int i) {
        return m35144n(i);
    }

    /* renamed from: s */
    public static int m35150s(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: b */
    public void mo35635b(int i, int i2) throws IOException {
        mo35642c(i, 0);
        mo35641c(i2);
    }

    /* renamed from: c */
    public void mo35643c(int i, C10449o oVar) throws IOException {
        mo35642c(1, 3);
        mo35646d(2, i);
        mo35636b(3, oVar);
        mo35642c(1, 4);
    }

    /* renamed from: d */
    public void mo35646d(int i, int i2) throws IOException {
        mo35642c(i, 0);
        mo35655i(i2);
    }

    /* renamed from: e */
    public void mo35649e(long j) throws IOException {
        mo35644c(j);
    }

    /* renamed from: f */
    public void mo35651f(long j) throws IOException {
        mo35647d(m35145n(j));
    }

    /* renamed from: g */
    public void mo35653g(long j) throws IOException {
        mo35647d(j);
    }

    /* renamed from: h */
    public void mo35654h(int i) throws IOException {
        mo35650f(m35150s(i));
    }

    /* renamed from: i */
    public void mo35655i(int i) throws IOException {
        mo35650f(i);
    }

    /* renamed from: e */
    public static int m35132e(int i, int i2) {
        return m35148q(i) + m35136j(i2);
    }

    /* renamed from: f */
    public static int m35133f(int i, int i2) {
        return m35148q(i) + m35140l(i2);
    }

    /* renamed from: i */
    public static int m35135i(long j) {
        return m35137j(j);
    }

    /* renamed from: l */
    public static int m35141l(long j) {
        return m35137j(m35145n(j));
    }

    /* renamed from: a */
    public void mo35619a(int i, double d) throws IOException {
        mo35642c(i, 1);
        mo35616a(d);
    }

    /* renamed from: g */
    public void mo35652g(int i) throws IOException {
        mo35648e(i);
    }

    /* renamed from: d */
    public static int m35130d(int i, C10449o oVar) {
        return m35148q(i) + m35131d(oVar);
    }

    /* renamed from: b */
    public void mo35636b(int i, C10449o oVar) throws IOException {
        mo35642c(i, 2);
        mo35639b(oVar);
    }

    /* renamed from: e */
    public void mo35648e(int i) throws IOException {
        mo35645d(i & 255);
        mo35645d((i >> 8) & 255);
        mo35645d((i >> 16) & 255);
        mo35645d((i >> 24) & 255);
    }

    /* renamed from: f */
    public void mo35650f(int i) throws IOException {
        while ((i & -128) != 0) {
            mo35645d((i & 127) | 128);
            i >>>= 7;
        }
        mo35645d(i);
    }

    /* renamed from: d */
    public static int m35131d(C10449o oVar) {
        int e = oVar.mo34361e();
        return m35144n(e) + e;
    }

    /* renamed from: a */
    public void mo35620a(int i, float f) throws IOException {
        mo35642c(i, 5);
        mo35617a(f);
    }

    /* renamed from: b */
    public void mo35637b(long j) throws IOException {
        mo35647d(j);
    }

    /* renamed from: c */
    public void mo35641c(int i) throws IOException {
        if (i >= 0) {
            mo35650f(i);
        } else {
            mo35647d((long) i);
        }
    }

    /* renamed from: a */
    public void mo35625a(int i, boolean z) throws IOException {
        mo35642c(i, 0);
        mo35631a(z);
    }

    /* renamed from: b */
    public void mo35634b(int i) throws IOException {
        mo35648e(i);
    }

    /* renamed from: d */
    public void mo35645d(int i) throws IOException {
        mo35615a((byte) i);
    }

    /* renamed from: c */
    public static int m35128c(C10449o oVar) {
        return oVar.mo34361e();
    }

    /* renamed from: b */
    public void mo35639b(C10449o oVar) throws IOException {
        mo35650f(oVar.mo34361e());
        oVar.mo34358a(this);
    }

    /* renamed from: d */
    public void mo35647d(long j) throws IOException {
        while ((-128 & j) != 0) {
            mo35645d((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo35645d((int) j);
    }

    /* renamed from: c */
    public static int m35127c(C10417d dVar) {
        return m35144n(dVar.size()) + dVar.size();
    }

    /* renamed from: a */
    public void mo35624a(int i, C10449o oVar) throws IOException {
        mo35642c(i, 3);
        mo35630a(oVar);
        mo35642c(i, 4);
    }

    /* renamed from: b */
    public static int m35119b(int i, double d) {
        return m35148q(i) + m35117b(d);
    }

    /* renamed from: c */
    public static int m35129c(byte[] bArr) {
        return m35144n(bArr.length) + bArr.length;
    }

    /* renamed from: b */
    public static int m35120b(int i, float f) {
        return m35148q(i) + m35118b(f);
    }

    /* renamed from: c */
    public void mo35642c(int i, int i2) throws IOException {
        mo35650f(C10472w.m35489a(i, i2));
    }

    /* renamed from: b */
    public static int m35123b(int i, boolean z) {
        return m35148q(i) + m35125b(z);
    }

    /* renamed from: a */
    public void mo35623a(int i, C10417d dVar) throws IOException {
        mo35642c(i, 2);
        mo35628a(dVar);
    }

    /* renamed from: c */
    public void mo35644c(long j) throws IOException {
        mo35645d(((int) j) & 255);
        mo35645d(((int) (j >> 8)) & 255);
        mo35645d(((int) (j >> 16)) & 255);
        mo35645d(((int) (j >> 24)) & 255);
        mo35645d(((int) (j >> 32)) & 255);
        mo35645d(((int) (j >> 40)) & 255);
        mo35645d(((int) (j >> 48)) & 255);
        mo35645d(((int) (j >> 56)) & 255);
    }

    /* renamed from: b */
    public static int m35122b(int i, C10417d dVar) {
        return m35148q(i) + m35127c(dVar);
    }

    /* renamed from: b */
    public static int m35121b(int i, long j) {
        return m35148q(i) + m35141l(j);
    }

    /* renamed from: a */
    public void mo35621a(int i, int i2) throws IOException {
        mo35642c(i, 0);
        mo35618a(i2);
    }

    /* renamed from: b */
    public static int m35124b(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m35144n(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    /* renamed from: a */
    public void mo35622a(int i, long j) throws IOException {
        mo35642c(i, 0);
        mo35651f(j);
    }

    /* renamed from: b */
    private void m35126b() throws IOException {
        OutputStream outputStream = this.f28207e;
        if (outputStream != null) {
            outputStream.write(this.f28203a, 0, this.f28205c);
            this.f28205c = 0;
            return;
        }
        throw new OutOfSpaceException();
    }

    /* renamed from: a */
    public void mo35616a(double d) throws IOException {
        mo35644c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public void mo35617a(float f) throws IOException {
        mo35648e(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public void mo35626a(long j) throws IOException {
        mo35644c(j);
    }

    /* renamed from: a */
    public void mo35631a(boolean z) throws IOException {
        mo35645d(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo35627a(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        mo35650f(bytes.length);
        mo35640b(bytes);
    }

    /* renamed from: b */
    public void mo35638b(C10417d dVar) throws IOException {
        mo35629a(dVar, 0, dVar.size());
    }

    /* renamed from: b */
    public void mo35640b(byte[] bArr) throws IOException {
        mo35633a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void mo35630a(C10449o oVar) throws IOException {
        oVar.mo34358a(this);
    }

    /* renamed from: a */
    public void mo35628a(C10417d dVar) throws IOException {
        mo35650f(dVar.size());
        mo35638b(dVar);
    }

    /* renamed from: a */
    public void mo35632a(byte[] bArr) throws IOException {
        mo35650f(bArr.length);
        mo35640b(bArr);
    }

    /* renamed from: a */
    public void mo35618a(int i) throws IOException {
        mo35641c(i);
    }

    /* renamed from: a */
    public static int m35115a(C10443k kVar) {
        int a = kVar.mo35792a();
        return m35144n(a) + a;
    }

    /* renamed from: a */
    public void mo35614a() throws IOException {
        if (this.f28207e != null) {
            m35126b();
        }
    }

    /* renamed from: a */
    public void mo35615a(byte b) throws IOException {
        if (this.f28205c == this.f28204b) {
            m35126b();
        }
        byte[] bArr = this.f28203a;
        int i = this.f28205c;
        this.f28205c = i + 1;
        bArr[i] = b;
        this.f28206d++;
    }

    /* renamed from: a */
    public void mo35633a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f28204b;
        int i4 = this.f28205c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f28203a, i4, i2);
            this.f28205c += i2;
            this.f28206d += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f28203a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f28205c = this.f28204b;
        this.f28206d += i5;
        m35126b();
        if (i7 <= this.f28204b) {
            System.arraycopy(bArr, i6, this.f28203a, 0, i7);
            this.f28205c = i7;
        } else {
            this.f28207e.write(bArr, i6, i7);
        }
        this.f28206d += i7;
    }

    /* renamed from: a */
    public void mo35629a(C10417d dVar, int i, int i2) throws IOException {
        int i3 = this.f28204b;
        int i4 = this.f28205c;
        if (i3 - i4 >= i2) {
            dVar.mo35684a(this.f28203a, i, i4, i2);
            this.f28205c += i2;
            this.f28206d += i2;
            return;
        }
        int i5 = i3 - i4;
        dVar.mo35684a(this.f28203a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f28205c = this.f28204b;
        this.f28206d += i5;
        m35126b();
        if (i7 <= this.f28204b) {
            dVar.mo35684a(this.f28203a, i6, 0, i7);
            this.f28205c = i7;
        } else {
            dVar.mo35683a(this.f28207e, i6, i7);
        }
        this.f28206d += i7;
    }
}
