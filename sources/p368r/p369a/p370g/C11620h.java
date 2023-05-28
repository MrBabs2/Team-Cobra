package p368r.p369a.p370g;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import p368r.p369a.C11597c;
import p368r.p369a.C11598d;
import p368r.p369a.p370g.C11609f;
import p368r.p369a.p370g.C11654n;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11670e;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.h */
/* compiled from: DNSRecord */
public abstract class C11620h extends C11603b {

    /* renamed from: m */
    private static C12938b f30981m = C12939c.m41778a(C11620h.class.getName());

    /* renamed from: n */
    public static final byte[] f30982n = {0};

    /* renamed from: h */
    private int f30983h;

    /* renamed from: i */
    private long f30984i = System.currentTimeMillis();

    /* renamed from: j */
    private int f30985j;

    /* renamed from: k */
    private final int f30986k;

    /* renamed from: l */
    private InetAddress f30987l;

    /* renamed from: r.a.g.h$c */
    /* compiled from: DNSRecord */
    public static class C11623c extends C11621a {
        C11623c(String str, C11669d dVar, boolean z, int i, InetAddress inetAddress) {
            super(str, C11670e.TYPE_A, dVar, z, i, inetAddress);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37973a(C11609f.C11610a aVar) {
            InetAddress inetAddress = this.f30989o;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (!(this.f30989o instanceof Inet4Address)) {
                    byte[] bArr = new byte[4];
                    System.arraycopy(address, 12, bArr, 0, 4);
                    address = bArr;
                }
                aVar.mo37960a(address, 0, address.length);
            }
        }

        C11623c(String str, C11669d dVar, boolean z, int i, byte[] bArr) {
            super(str, C11670e.TYPE_A, dVar, z, i, bArr);
        }

        /* renamed from: a */
        public C11598d mo37971a(boolean z) {
            C11662q qVar = (C11662q) super.mo37971a(z);
            qVar.mo38171a((Inet4Address) this.f30989o);
            return qVar;
        }
    }

    /* renamed from: r.a.g.h$d */
    /* compiled from: DNSRecord */
    public static class C11624d extends C11621a {
        C11624d(String str, C11669d dVar, boolean z, int i, InetAddress inetAddress) {
            super(str, C11670e.TYPE_AAAA, dVar, z, i, inetAddress);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37973a(C11609f.C11610a aVar) {
            InetAddress inetAddress = this.f30989o;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (this.f30989o instanceof Inet4Address) {
                    byte[] bArr = new byte[16];
                    for (int i = 0; i < 16; i++) {
                        if (i < 11) {
                            bArr[i] = address[i - 12];
                        } else {
                            bArr[i] = 0;
                        }
                    }
                    address = bArr;
                }
                aVar.mo37960a(address, 0, address.length);
            }
        }

        C11624d(String str, C11669d dVar, boolean z, int i, byte[] bArr) {
            super(str, C11670e.TYPE_AAAA, dVar, z, i, bArr);
        }

        /* renamed from: a */
        public C11598d mo37971a(boolean z) {
            C11662q qVar = (C11662q) super.mo37971a(z);
            qVar.mo38172a((Inet6Address) this.f30989o);
            return qVar;
        }
    }

    /* renamed from: r.a.g.h$e */
    /* compiled from: DNSRecord */
    public static class C11625e extends C11620h {

        /* renamed from: o */
        private final String f30992o;

        public C11625e(String str, C11669d dVar, boolean z, int i, String str2) {
            super(str, C11670e.TYPE_PTR, dVar, z, i);
            this.f30992o = str2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37973a(C11609f.C11610a aVar) {
            aVar.mo37956a(this.f30992o);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo37976a(C11639l lVar, long j) {
            return false;
        }

        /* renamed from: b */
        public boolean mo37890b(C11603b bVar) {
            return super.mo37890b(bVar) && (bVar instanceof C11625e) && mo37981c((C11625e) bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo37979b(C11639l lVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo37981c(C11620h hVar) {
            if (!(hVar instanceof C11625e)) {
                return false;
            }
            C11625e eVar = (C11625e) hVar;
            if (this.f30992o != null || eVar.f30992o == null) {
                return this.f30992o.equals(eVar.f30992o);
            }
            return false;
        }

        /* renamed from: s */
        public boolean mo37989s() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public String mo37992t() {
            return this.f30992o;
        }

        /* renamed from: a */
        public C11598d mo37971a(boolean z) {
            if (mo37903j()) {
                return new C11662q(C11662q.m38323c(mo37992t()), 0, 0, 0, z, (byte[]) null);
            }
            if (mo37902i()) {
                return new C11662q(mo37891c(), 0, 0, 0, z, (byte[]) null);
            }
            if (mo37900h()) {
                return new C11662q(mo37891c(), 0, 0, 0, z, (byte[]) null);
            }
            Map<C11598d.C11599a, String> c = C11662q.m38323c(mo37992t());
            c.put(C11598d.C11599a.Subtype, mo37891c().get(C11598d.C11599a.Subtype));
            return new C11662q(c, 0, 0, 0, z, mo37992t());
        }

        /* renamed from: a */
        public C11597c mo37970a(C11639l lVar) {
            C11598d a = mo37971a(false);
            ((C11662q) a).mo38173a(lVar);
            String r = a.mo37866r();
            return new C11661p(lVar, r, C11639l.m38226a(r, mo37992t()), a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo37885a(StringBuilder sb) {
            C11620h.super.mo37885a(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" alias: '");
            String str = this.f30992o;
            sb2.append(str != null ? str.toString() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }
    }

    /* renamed from: r.a.g.h$g */
    /* compiled from: DNSRecord */
    public static class C11627g extends C11620h {

        /* renamed from: o */
        private final byte[] f30998o;

        public C11627g(String str, C11669d dVar, boolean z, int i, byte[] bArr) {
            super(str, C11670e.TYPE_TXT, dVar, z, i);
            this.f30998o = (bArr == null || bArr.length <= 0) ? C11620h.f30982n : bArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37973a(C11609f.C11610a aVar) {
            byte[] bArr = this.f30998o;
            aVar.mo37960a(bArr, 0, bArr.length);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo37976a(C11639l lVar, long j) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo37979b(C11639l lVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo37981c(C11620h hVar) {
            if (!(hVar instanceof C11627g)) {
                return false;
            }
            C11627g gVar = (C11627g) hVar;
            if (this.f30998o == null && gVar.f30998o != null) {
                return false;
            }
            int length = gVar.f30998o.length;
            byte[] bArr = this.f30998o;
            if (length != bArr.length) {
                return false;
            }
            int length2 = bArr.length;
            while (true) {
                int i = length2 - 1;
                if (length2 <= 0) {
                    return true;
                }
                if (gVar.f30998o[i] != this.f30998o[i]) {
                    return false;
                }
                length2 = i;
            }
        }

        /* renamed from: s */
        public boolean mo37989s() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public byte[] mo37997t() {
            return this.f30998o;
        }

        /* renamed from: a */
        public C11598d mo37971a(boolean z) {
            return new C11662q(mo37891c(), 0, 0, 0, z, this.f30998o);
        }

        /* renamed from: a */
        public C11597c mo37970a(C11639l lVar) {
            C11598d a = mo37971a(false);
            ((C11662q) a).mo38173a(lVar);
            return new C11661p(lVar, a.mo37866r(), a.mo37858h(), a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo37885a(StringBuilder sb) {
            String str;
            C11620h.super.mo37885a(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" text: '");
            if (this.f30998o.length > 20) {
                str = new String(this.f30998o, 0, 17) + "...";
            } else {
                str = new String(this.f30998o);
            }
            sb2.append(str);
            sb2.append("'");
            sb.append(sb2.toString());
        }
    }

    C11620h(String str, C11670e eVar, C11669d dVar, boolean z, int i) {
        super(str, eVar, dVar, z);
        this.f30983h = i;
        int nextInt = new Random().nextInt(3);
        this.f30986k = nextInt;
        this.f30985j = nextInt + 80;
    }

    /* renamed from: a */
    public abstract C11597c mo37970a(C11639l lVar);

    /* renamed from: a */
    public abstract C11598d mo37971a(boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo37973a(C11609f.C11610a aVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo37975a(C11604c cVar) {
        try {
            for (C11620h d : cVar.mo37926b()) {
                if (mo37983d(d)) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            C12938b bVar = f30981m;
            bVar.mo41318c("suppressedBy() message " + cVar + " exception ", (Throwable) e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo37976a(C11639l lVar, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo37978b(C11620h hVar) {
        return mo37895e() == hVar.mo37895e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo37979b(C11639l lVar);

    /* renamed from: c */
    public boolean mo37980c(long j) {
        return mo37969a(50) <= j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo37981c(C11620h hVar);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo37983d(C11620h hVar) {
        return equals(hVar) && hVar.f30983h > this.f30983h / 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo37984e(long j) {
        this.f30984i = j;
        this.f30983h = 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11620h) && super.equals(obj) && mo37981c((C11620h) obj);
    }

    /* renamed from: o */
    public InetAddress mo37985o() {
        return this.f30987l;
    }

    /* renamed from: p */
    public C11598d mo37986p() {
        return mo37971a(false);
    }

    /* renamed from: q */
    public int mo37987q() {
        return this.f30983h;
    }

    /* renamed from: r */
    public void mo37988r() {
        int i = this.f30985j + 5;
        this.f30985j = i;
        if (i > 100) {
            this.f30985j = 100;
        }
    }

    /* renamed from: s */
    public abstract boolean mo37989s();

    /* renamed from: r.a.g.h$a */
    /* compiled from: DNSRecord */
    public static abstract class C11621a extends C11620h {

        /* renamed from: p */
        private static C12938b f30988p = C12939c.m41778a(C11621a.class.getName());

        /* renamed from: o */
        InetAddress f30989o;

        protected C11621a(String str, C11670e eVar, C11669d dVar, boolean z, int i, InetAddress inetAddress) {
            super(str, eVar, dVar, z, i);
            this.f30989o = inetAddress;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo37884a(DataOutputStream dataOutputStream) throws IOException {
            super.mo37884a(dataOutputStream);
            byte[] address = mo37991t().getAddress();
            for (byte writeByte : address) {
                dataOutputStream.writeByte(writeByte);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo37979b(C11639l lVar) {
            if (!lVar.mo38076E().mo38051a(this)) {
                return false;
            }
            f30988p.mo41310b("handleResponse() Denial detected");
            if (lVar.mo38088Q()) {
                lVar.mo38076E().mo38062h();
                lVar.mo38121y().clear();
                Iterator<C11598d> it = lVar.mo38079H().values().iterator();
                while (it.hasNext()) {
                    ((C11662q) it.next()).mo38167J();
                }
            }
            lVar.mo38091T();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo37981c(C11620h hVar) {
            try {
                if (!(hVar instanceof C11621a)) {
                    return false;
                }
                C11621a aVar = (C11621a) hVar;
                if (mo37991t() != null || aVar.mo37991t() == null) {
                    return mo37991t().equals(aVar.mo37991t());
                }
                return false;
            } catch (Exception e) {
                f30988p.mo41313b("Failed to compare addresses of DNSRecords", (Throwable) e);
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo37990e(C11620h hVar) {
            return mo37889b().equalsIgnoreCase(hVar.mo37889b());
        }

        /* renamed from: s */
        public boolean mo37989s() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public InetAddress mo37991t() {
            return this.f30989o;
        }

        protected C11621a(String str, C11670e eVar, C11669d dVar, boolean z, int i, byte[] bArr) {
            super(str, eVar, dVar, z, i);
            try {
                this.f30989o = InetAddress.getByAddress(bArr);
            } catch (UnknownHostException e) {
                f30988p.mo41318c("Address() exception ", (Throwable) e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo37976a(C11639l lVar, long j) {
            C11621a a;
            if (!lVar.mo38076E().mo38051a(this) || (a = lVar.mo38076E().mo38046a(mo37895e(), mo37904k(), 3600)) == null) {
                return false;
            }
            int a2 = mo37882a((C11603b) a);
            if (a2 == 0) {
                f30988p.mo41310b("handleQuery() Ignoring an identical address query");
                return false;
            }
            f30988p.mo41310b("handleQuery() Conflicting query detected.");
            if (lVar.mo38088Q() && a2 > 0) {
                lVar.mo38076E().mo38062h();
                lVar.mo38121y().clear();
                Iterator<C11598d> it = lVar.mo38079H().values().iterator();
                while (it.hasNext()) {
                    ((C11662q) it.next()).mo38167J();
                }
            }
            lVar.mo38091T();
            return true;
        }

        /* renamed from: a */
        public C11598d mo37971a(boolean z) {
            return new C11662q(mo37891c(), 0, 0, 0, z, (byte[]) null);
        }

        /* renamed from: a */
        public C11597c mo37970a(C11639l lVar) {
            C11598d a = mo37971a(false);
            ((C11662q) a).mo38173a(lVar);
            return new C11661p(lVar, a.mo37866r(), a.mo37858h(), a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo37885a(StringBuilder sb) {
            C11620h.super.mo37885a(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" address: '");
            sb2.append(mo37991t() != null ? mo37991t().getHostAddress() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }
    }

    /* renamed from: r.a.g.h$b */
    /* compiled from: DNSRecord */
    public static class C11622b extends C11620h {

        /* renamed from: o */
        String f30990o;

        /* renamed from: p */
        String f30991p;

        public C11622b(String str, C11669d dVar, boolean z, int i, String str2, String str3) {
            super(str, C11670e.TYPE_HINFO, dVar, z, i);
            this.f30991p = str2;
            this.f30990o = str3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37973a(C11609f.C11610a aVar) {
            String str = this.f30991p + " " + this.f30990o;
            aVar.mo37961b(str, 0, str.length());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo37976a(C11639l lVar, long j) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo37979b(C11639l lVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo37981c(C11620h hVar) {
            if (!(hVar instanceof C11622b)) {
                return false;
            }
            C11622b bVar = (C11622b) hVar;
            if (this.f30991p == null && bVar.f30991p != null) {
                return false;
            }
            if ((this.f30990o != null || bVar.f30990o == null) && this.f30991p.equals(bVar.f30991p) && this.f30990o.equals(bVar.f30990o)) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        public boolean mo37989s() {
            return true;
        }

        /* renamed from: a */
        public C11598d mo37971a(boolean z) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("cpu", this.f30991p);
            hashMap.put("os", this.f30990o);
            return new C11662q(mo37891c(), 0, 0, 0, z, (Map<String, ?>) hashMap);
        }

        /* renamed from: a */
        public C11597c mo37970a(C11639l lVar) {
            C11598d a = mo37971a(false);
            ((C11662q) a).mo38173a(lVar);
            return new C11661p(lVar, a.mo37866r(), a.mo37858h(), a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo37885a(StringBuilder sb) {
            C11620h.super.mo37885a(sb);
            sb.append(" cpu: '" + this.f30991p + "' os: '" + this.f30990o + "'");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo37977b(long j) {
        return (int) Math.max(0, (mo37969a(100) - j) / 1000);
    }

    /* renamed from: d */
    public boolean mo37982d(long j) {
        return mo37969a(this.f30985j) <= j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo37969a(int i) {
        return this.f30984i + (((long) (i * this.f30983h)) * 10);
    }

    /* renamed from: a */
    public boolean mo37886a(long j) {
        return mo37969a(100) <= j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37974a(C11620h hVar) {
        this.f30984i = hVar.f30984i;
        this.f30983h = hVar.f30983h;
        this.f30985j = this.f30986k + 80;
    }

    /* renamed from: r.a.g.h$f */
    /* compiled from: DNSRecord */
    public static class C11626f extends C11620h {

        /* renamed from: s */
        private static C12938b f30993s = C12939c.m41778a(C11626f.class.getName());

        /* renamed from: o */
        private final int f30994o;

        /* renamed from: p */
        private final int f30995p;

        /* renamed from: q */
        private final int f30996q;

        /* renamed from: r */
        private final String f30997r;

        public C11626f(String str, C11669d dVar, boolean z, int i, int i2, int i3, int i4, String str2) {
            super(str, C11670e.TYPE_SRV, dVar, z, i);
            this.f30994o = i2;
            this.f30995p = i3;
            this.f30996q = i4;
            this.f30997r = str2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37973a(C11609f.C11610a aVar) {
            aVar.writeShort(this.f30994o);
            aVar.writeShort(this.f30995p);
            aVar.writeShort(this.f30996q);
            if (C11604c.f30951m) {
                aVar.mo37956a(this.f30997r);
                return;
            }
            String str = this.f30997r;
            aVar.mo37961b(str, 0, str.length());
            aVar.writeByte(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo37979b(C11639l lVar) {
            C11662q qVar = (C11662q) lVar.mo38079H().get(mo37883a());
            if (qVar == null) {
                return false;
            }
            if (this.f30996q == qVar.mo37859i() && this.f30997r.equalsIgnoreCase(lVar.mo38076E().mo38061g())) {
                return false;
            }
            f30993s.mo41310b("handleResponse() Denial detected");
            if (qVar.mo38164G()) {
                String lowerCase = qVar.mo37862l().toLowerCase();
                qVar.mo38170a(C11654n.C11657c.m38310a().mo38154a(lVar.mo38076E().mo38059e(), qVar.mo37858h(), C11654n.C11658d.SERVICE));
                lVar.mo38079H().remove(lowerCase);
                lVar.mo38079H().put(qVar.mo37862l().toLowerCase(), qVar);
                C12938b bVar = f30993s;
                bVar.mo41310b("handleResponse() New unique name chose:" + qVar.mo37858h());
            }
            qVar.mo38167J();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo37981c(C11620h hVar) {
            if (!(hVar instanceof C11626f)) {
                return false;
            }
            C11626f fVar = (C11626f) hVar;
            if (this.f30994o == fVar.f30994o && this.f30995p == fVar.f30995p && this.f30996q == fVar.f30996q && this.f30997r.equals(fVar.f30997r)) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        public boolean mo37989s() {
            return true;
        }

        /* renamed from: t */
        public int mo37993t() {
            return this.f30996q;
        }

        /* renamed from: u */
        public int mo37994u() {
            return this.f30994o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public String mo37995v() {
            return this.f30997r;
        }

        /* renamed from: w */
        public int mo37996w() {
            return this.f30995p;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo37884a(DataOutputStream dataOutputStream) throws IOException {
            super.mo37884a(dataOutputStream);
            dataOutputStream.writeShort(this.f30994o);
            dataOutputStream.writeShort(this.f30995p);
            dataOutputStream.writeShort(this.f30996q);
            try {
                dataOutputStream.write(this.f30997r.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo37976a(C11639l lVar, long j) {
            C11662q qVar = (C11662q) lVar.mo38079H().get(mo37883a());
            if (qVar != null && ((qVar.mo38163F() || qVar.mo38162E()) && (this.f30996q != qVar.mo37859i() || !this.f30997r.equalsIgnoreCase(lVar.mo38076E().mo38061g())))) {
                C12938b bVar = f30993s;
                bVar.mo41310b("handleQuery() Conflicting probe detected from: " + mo37985o());
                C11626f fVar = new C11626f(qVar.mo37862l(), C11669d.CLASS_IN, true, 3600, qVar.mo37860j(), qVar.mo37867s(), qVar.mo37859i(), lVar.mo38076E().mo38061g());
                try {
                    if (lVar.mo38074C().equals(mo37985o())) {
                        C12938b bVar2 = f30993s;
                        bVar2.mo41315c("Got conflicting probe from ourselves\nincoming: " + toString() + "\n" + "local   : " + fVar.toString());
                    }
                } catch (IOException e) {
                    f30993s.mo41318c("IOException", (Throwable) e);
                }
                int a = mo37882a((C11603b) fVar);
                if (a == 0) {
                    f30993s.mo41310b("handleQuery() Ignoring a identical service query");
                    return false;
                } else if (qVar.mo38164G() && a > 0) {
                    String lowerCase = qVar.mo37862l().toLowerCase();
                    qVar.mo38170a(C11654n.C11657c.m38310a().mo38154a(lVar.mo38076E().mo38059e(), qVar.mo37858h(), C11654n.C11658d.SERVICE));
                    lVar.mo38079H().remove(lowerCase);
                    lVar.mo38079H().put(qVar.mo37862l().toLowerCase(), qVar);
                    C12938b bVar3 = f30993s;
                    bVar3.mo41310b("handleQuery() Lost tie break: new unique name chosen:" + qVar.mo37858h());
                    qVar.mo38167J();
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public C11598d mo37971a(boolean z) {
            return new C11662q(mo37891c(), this.f30996q, this.f30995p, this.f30994o, z, (byte[]) null);
        }

        /* renamed from: a */
        public C11597c mo37970a(C11639l lVar) {
            C11598d a = mo37971a(false);
            ((C11662q) a).mo38173a(lVar);
            return new C11661p(lVar, a.mo37866r(), a.mo37858h(), a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo37885a(StringBuilder sb) {
            C11620h.super.mo37885a(sb);
            sb.append(" server: '" + this.f30997r + ":" + this.f30996q + "'");
        }
    }

    /* renamed from: a */
    public void mo37972a(InetAddress inetAddress) {
        this.f30987l = inetAddress;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37885a(StringBuilder sb) {
        super.mo37885a(sb);
        sb.append(" ttl: '" + mo37977b(System.currentTimeMillis()) + "/" + this.f30983h + "'");
    }
}
