package p368r.p369a.p370g;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

/* renamed from: r.a.g.f */
/* compiled from: DNSOutgoing */
public final class C11609f extends C11608e {

    /* renamed from: o */
    public static boolean f30969o = true;

    /* renamed from: h */
    Map<String, Integer> f30970h;

    /* renamed from: i */
    private int f30971i;

    /* renamed from: j */
    private final C11610a f30972j;

    /* renamed from: k */
    private final C11610a f30973k;

    /* renamed from: l */
    private final C11610a f30974l;

    /* renamed from: m */
    private final C11610a f30975m;

    /* renamed from: n */
    private InetSocketAddress f30976n;

    /* renamed from: r.a.g.f$a */
    /* compiled from: DNSOutgoing */
    public static class C11610a extends ByteArrayOutputStream {

        /* renamed from: f */
        private final C11609f f30977f;

        /* renamed from: g */
        private final int f30978g;

        C11610a(int i, C11609f fVar) {
            this(i, fVar, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37960a(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                writeByte(bArr[i + i3]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo37961b(String str, int i, int i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                char charAt = str.charAt(i + i4);
                i3 = (charAt < 1 || charAt > 127) ? charAt > 2047 ? i3 + 3 : i3 + 2 : i3 + 1;
            }
            writeByte(i3);
            for (int i5 = 0; i5 < i2; i5++) {
                char charAt2 = str.charAt(i + i5);
                if (charAt2 >= 1 && charAt2 <= 127) {
                    writeByte(charAt2);
                } else if (charAt2 > 2047) {
                    writeByte(((charAt2 >> 12) & 15) | 224);
                    writeByte(((charAt2 >> 6) & 63) | 128);
                    writeByte(((charAt2 >> 0) & 63) | 128);
                } else {
                    writeByte(((charAt2 >> 6) & 31) | 192);
                    writeByte(((charAt2 >> 0) & 63) | 128);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void writeByte(int i) {
            write(i & 255);
        }

        /* access modifiers changed from: package-private */
        public void writeInt(int i) {
            writeShort(i >> 16);
            writeShort(i);
        }

        /* access modifiers changed from: package-private */
        public void writeShort(int i) {
            writeByte(i >> 8);
            writeByte(i);
        }

        C11610a(int i, C11609f fVar, int i2) {
            super(i);
            this.f30977f = fVar;
            this.f30978g = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37956a(String str) {
            mo37957a(str, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37957a(String str, boolean z) {
            while (true) {
                int indexOf = str.indexOf(46);
                if (indexOf < 0) {
                    indexOf = str.length();
                }
                if (indexOf <= 0) {
                    writeByte(0);
                    return;
                }
                String substring = str.substring(0, indexOf);
                if (!z || !C11609f.f30969o) {
                    mo37961b(substring, 0, substring.length());
                } else {
                    Integer num = this.f30977f.f30970h.get(str);
                    if (num != null) {
                        int intValue = num.intValue();
                        writeByte((intValue >> 8) | 192);
                        writeByte(intValue & 255);
                        return;
                    }
                    this.f30977f.f30970h.put(str, Integer.valueOf(size() + this.f30978g));
                    mo37961b(substring, 0, substring.length());
                }
                str = str.substring(indexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37958a(C11611g gVar) {
            mo37956a(gVar.mo37889b());
            writeShort(gVar.mo37895e().mo38196a());
            writeShort(gVar.mo37893d().mo38193a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37959a(C11620h hVar, long j) {
            mo37956a(hVar.mo37889b());
            writeShort(hVar.mo37895e().mo38196a());
            writeShort(hVar.mo37893d().mo38193a() | ((!hVar.mo37904k() || !this.f30977f.mo37940o()) ? 0 : 32768));
            writeInt(j == 0 ? hVar.mo37987q() : hVar.mo37977b(j));
            C11610a aVar = new C11610a(AdRequest.MAX_CONTENT_URL_LENGTH, this.f30977f, this.f30978g + size() + 2);
            hVar.mo37973a(aVar);
            byte[] byteArray = aVar.toByteArray();
            writeShort(byteArray.length);
            write(byteArray, 0, byteArray.length);
        }
    }

    public C11609f(int i) {
        this(i, true, 1460);
    }

    /* renamed from: a */
    public void mo37946a(InetSocketAddress inetSocketAddress) {
        this.f30976n = inetSocketAddress;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo37941p() ? "dns[query:" : "dns[response:");
        stringBuffer.append(" id=0x");
        stringBuffer.append(Integer.toHexString(mo37931f()));
        if (mo37930e() != 0) {
            stringBuffer.append(", flags=0x");
            stringBuffer.append(Integer.toHexString(mo37930e()));
            if (mo37942q()) {
                stringBuffer.append(":r");
            }
            if (mo37938m()) {
                stringBuffer.append(":aa");
            }
            if (mo37943r()) {
                stringBuffer.append(":tc");
            }
        }
        if (mo37935j() > 0) {
            stringBuffer.append(", questions=");
            stringBuffer.append(mo37935j());
        }
        if (mo37933h() > 0) {
            stringBuffer.append(", answers=");
            stringBuffer.append(mo37933h());
        }
        if (mo37934i() > 0) {
            stringBuffer.append(", authorities=");
            stringBuffer.append(mo37934i());
        }
        if (mo37932g() > 0) {
            stringBuffer.append(", additionals=");
            stringBuffer.append(mo37932g());
        }
        if (mo37935j() > 0) {
            stringBuffer.append("\nquestions:");
            for (C11611g append : this.f30965d) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append);
            }
        }
        if (mo37933h() > 0) {
            stringBuffer.append("\nanswers:");
            for (C11620h append2 : this.f30966e) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append2);
            }
        }
        if (mo37934i() > 0) {
            stringBuffer.append("\nauthorities:");
            for (C11620h append3 : this.f30967f) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append3);
            }
        }
        if (mo37932g() > 0) {
            stringBuffer.append("\nadditionals:");
            for (C11620h append4 : this.f30968g) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append4);
            }
        }
        stringBuffer.append("\nnames=");
        stringBuffer.append(this.f30970h);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public int mo37952u() {
        return ((((this.f30971i - 12) - this.f30972j.size()) - this.f30973k.size()) - this.f30974l.size()) - this.f30975m.size();
    }

    /* renamed from: v */
    public byte[] mo37953v() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f30970h.clear();
        C11610a aVar = new C11610a(this.f30971i, this);
        aVar.writeShort(this.f30963b ? 0 : mo37931f());
        aVar.writeShort(mo37930e());
        aVar.writeShort(mo37935j());
        aVar.writeShort(mo37933h());
        aVar.writeShort(mo37934i());
        aVar.writeShort(mo37932g());
        for (C11611g a : this.f30965d) {
            aVar.mo37958a(a);
        }
        for (C11620h a2 : this.f30966e) {
            aVar.mo37959a(a2, currentTimeMillis);
        }
        for (C11620h a3 : this.f30967f) {
            aVar.mo37959a(a3, currentTimeMillis);
        }
        for (C11620h a4 : this.f30968g) {
            aVar.mo37959a(a4, currentTimeMillis);
        }
        byte[] byteArray = aVar.toByteArray();
        try {
            aVar.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    /* renamed from: w */
    public InetSocketAddress mo37954w() {
        return this.f30976n;
    }

    /* renamed from: x */
    public int mo37955x() {
        return this.f30971i;
    }

    public C11609f(int i, boolean z, int i2) {
        super(i, 0, z);
        this.f30970h = new HashMap();
        this.f30971i = i2 > 0 ? i2 : 1460;
        this.f30972j = new C11610a(i2, this);
        this.f30973k = new C11610a(i2, this);
        this.f30974l = new C11610a(i2, this);
        this.f30975m = new C11610a(i2, this);
    }

    /* renamed from: a */
    public void mo37948a(C11611g gVar) throws IOException {
        C11610a aVar = new C11610a(AdRequest.MAX_CONTENT_URL_LENGTH, this);
        aVar.mo37958a(gVar);
        byte[] byteArray = aVar.toByteArray();
        aVar.close();
        if (byteArray.length < mo37952u()) {
            this.f30965d.add(gVar);
            this.f30972j.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* renamed from: a */
    public void mo37947a(C11604c cVar, C11620h hVar) throws IOException {
        if (cVar == null || !hVar.mo37975a(cVar)) {
            mo37950a(hVar, 0);
        }
    }

    /* renamed from: a */
    public void mo37950a(C11620h hVar, long j) throws IOException {
        if (hVar == null) {
            return;
        }
        if (j == 0 || !hVar.mo37886a(j)) {
            C11610a aVar = new C11610a(AdRequest.MAX_CONTENT_URL_LENGTH, this);
            aVar.mo37959a(hVar, j);
            byte[] byteArray = aVar.toByteArray();
            aVar.close();
            if (byteArray.length < mo37952u()) {
                this.f30966e.add(hVar);
                this.f30973k.write(byteArray, 0, byteArray.length);
                return;
            }
            throw new IOException("message full");
        }
    }

    /* renamed from: a */
    public void mo37949a(C11620h hVar) throws IOException {
        C11610a aVar = new C11610a(AdRequest.MAX_CONTENT_URL_LENGTH, this);
        aVar.mo37959a(hVar, 0);
        byte[] byteArray = aVar.toByteArray();
        aVar.close();
        if (byteArray.length < mo37952u()) {
            this.f30967f.add(hVar);
            this.f30974l.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }
}
