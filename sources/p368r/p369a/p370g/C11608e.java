package p368r.p369a.p370g;

import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: r.a.g.e */
/* compiled from: DNSMessage */
public abstract class C11608e {

    /* renamed from: a */
    private int f30962a;

    /* renamed from: b */
    boolean f30963b;

    /* renamed from: c */
    private int f30964c;

    /* renamed from: d */
    protected final List<C11611g> f30965d = Collections.synchronizedList(new LinkedList());

    /* renamed from: e */
    protected final List<C11620h> f30966e = Collections.synchronizedList(new LinkedList());

    /* renamed from: f */
    protected final List<C11620h> f30967f = Collections.synchronizedList(new LinkedList());

    /* renamed from: g */
    protected final List<C11620h> f30968g = Collections.synchronizedList(new LinkedList());

    protected C11608e(int i, int i2, boolean z) {
        this.f30964c = i;
        this.f30962a = i2;
        this.f30963b = z;
    }

    /* renamed from: a */
    public void mo37925a(int i) {
        this.f30964c = i;
    }

    /* renamed from: b */
    public void mo37927b(int i) {
        this.f30962a = i;
    }

    /* renamed from: c */
    public Collection<? extends C11620h> mo37928c() {
        return this.f30966e;
    }

    /* renamed from: d */
    public Collection<? extends C11620h> mo37929d() {
        return this.f30967f;
    }

    /* renamed from: e */
    public int mo37930e() {
        return this.f30964c;
    }

    /* renamed from: f */
    public int mo37931f() {
        if (this.f30963b) {
            return 0;
        }
        return this.f30962a;
    }

    /* renamed from: g */
    public int mo37932g() {
        return mo37924a().size();
    }

    /* renamed from: h */
    public int mo37933h() {
        return mo37928c().size();
    }

    /* renamed from: i */
    public int mo37934i() {
        return mo37929d().size();
    }

    /* renamed from: j */
    public int mo37935j() {
        return mo37937l().size();
    }

    /* renamed from: k */
    public int mo37936k() {
        return (this.f30964c & 30720) >> 11;
    }

    /* renamed from: l */
    public Collection<? extends C11611g> mo37937l() {
        return this.f30965d;
    }

    /* renamed from: m */
    public boolean mo37938m() {
        return (this.f30964c & 1024) != 0;
    }

    /* renamed from: n */
    public boolean mo37939n() {
        return ((mo37935j() + mo37933h()) + mo37934i()) + mo37932g() == 0;
    }

    /* renamed from: o */
    public boolean mo37940o() {
        return this.f30963b;
    }

    /* renamed from: p */
    public boolean mo37941p() {
        return (this.f30964c & 32768) == 0;
    }

    /* renamed from: q */
    public boolean mo37942q() {
        return (this.f30964c & 32768) == 32768;
    }

    /* renamed from: r */
    public boolean mo37943r() {
        return (this.f30964c & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
    }

    /* renamed from: s */
    public boolean mo37944s() {
        return (this.f30964c & 15) == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public String mo37945t() {
        StringBuffer stringBuffer = new StringBuffer(200);
        stringBuffer.append(toString());
        stringBuffer.append("\n");
        for (C11611g append : this.f30965d) {
            stringBuffer.append("\tquestion:      ");
            stringBuffer.append(append);
            stringBuffer.append("\n");
        }
        for (C11620h append2 : this.f30966e) {
            stringBuffer.append("\tanswer:        ");
            stringBuffer.append(append2);
            stringBuffer.append("\n");
        }
        for (C11620h append3 : this.f30967f) {
            stringBuffer.append("\tauthoritative: ");
            stringBuffer.append(append3);
            stringBuffer.append("\n");
        }
        for (C11620h append4 : this.f30968g) {
            stringBuffer.append("\tadditional:    ");
            stringBuffer.append(append4);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public Collection<? extends C11620h> mo37924a() {
        return this.f30968g;
    }

    /* renamed from: b */
    public List<C11620h> mo37926b() {
        ArrayList arrayList = new ArrayList(this.f30966e.size() + this.f30967f.size() + this.f30968g.size());
        arrayList.addAll(this.f30966e);
        arrayList.addAll(this.f30967f);
        arrayList.addAll(this.f30968g);
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo37923a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(4000);
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int min = Math.min(32, length - i);
            if (i < 16) {
                sb.append(' ');
            }
            if (i < 256) {
                sb.append(' ');
            }
            if (i < 4096) {
                sb.append(' ');
            }
            sb.append(Integer.toHexString(i));
            sb.append(':');
            int i2 = 0;
            while (i2 < min) {
                if (i2 % 8 == 0) {
                    sb.append(' ');
                }
                int i3 = i + i2;
                sb.append(Integer.toHexString((bArr[i3] & 240) >> 4));
                sb.append(Integer.toHexString((bArr[i3] & 15) >> 0));
                i2++;
            }
            if (i2 < 32) {
                while (i2 < 32) {
                    if (i2 % 8 == 0) {
                        sb.append(' ');
                    }
                    sb.append("  ");
                    i2++;
                }
            }
            sb.append("    ");
            for (int i4 = 0; i4 < min; i4++) {
                if (i4 % 8 == 0) {
                    sb.append(' ');
                }
                byte b = bArr[i + i4] & 255;
                sb.append((b <= 32 || b >= Byte.MAX_VALUE) ? '.' : (char) b);
            }
            sb.append("\n");
            i += 32;
            if (i >= 2048) {
                sb.append("....\n");
                break;
            }
        }
        return sb.toString();
    }
}
