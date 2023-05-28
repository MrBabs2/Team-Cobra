package p368r.p369a.p370g;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import p368r.p369a.C11594b;
import p368r.p369a.p370g.C11620h;
import p368r.p369a.p370g.C11628i;
import p368r.p369a.p370g.C11654n;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11670e;
import p368r.p369a.p370g.p371s.C11672g;
import p368r.p369a.p370g.p372t.C11675a;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.k */
/* compiled from: HostInfo */
public class C11636k implements C11628i {

    /* renamed from: j */
    private static C12938b f31015j = C12939c.m41778a(C11636k.class.getName());

    /* renamed from: f */
    protected String f31016f;

    /* renamed from: g */
    protected InetAddress f31017g;

    /* renamed from: h */
    protected NetworkInterface f31018h;

    /* renamed from: i */
    private final C11638b f31019i;

    /* renamed from: r.a.g.k$a */
    /* compiled from: HostInfo */
    static /* synthetic */ class C11637a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31020a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                r.a.g.s.e[] r0 = p368r.p369a.p370g.p371s.C11670e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31020a = r0
                r.a.g.s.e r1 = p368r.p369a.p370g.p371s.C11670e.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31020a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.a.g.s.e r1 = p368r.p369a.p370g.p371s.C11670e.TYPE_A6     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31020a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.a.g.s.e r1 = p368r.p369a.p370g.p371s.C11670e.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11636k.C11637a.<clinit>():void");
        }
    }

    /* renamed from: r.a.g.k$b */
    /* compiled from: HostInfo */
    private static final class C11638b extends C11628i.C11630b {
        public C11638b(C11639l lVar) {
            mo38002a(lVar);
        }
    }

    private C11636k(InetAddress inetAddress, String str, C11639l lVar) {
        this.f31019i = new C11638b(lVar);
        this.f31017g = inetAddress;
        this.f31016f = str;
        if (inetAddress != null) {
            try {
                this.f31018h = NetworkInterface.getByInetAddress(inetAddress);
            } catch (Exception e) {
                f31015j.mo41318c("LocalHostInfo() exception ", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public static C11636k m38191a(InetAddress inetAddress, C11639l lVar, String str) {
        InetAddress inetAddress2;
        String str2 = str != null ? str : "";
        if (inetAddress == null) {
            try {
                String property = System.getProperty("net.mdns.interface");
                if (property != null) {
                    inetAddress2 = InetAddress.getByName(property);
                } else {
                    inetAddress2 = InetAddress.getLocalHost();
                    if (inetAddress2.isLoopbackAddress()) {
                        InetAddress[] a = C11594b.C11595a.m37927a().mo37844a();
                        if (a.length > 0) {
                            inetAddress2 = a[0];
                        }
                    }
                }
                if (inetAddress2.isLoopbackAddress()) {
                    f31015j.mo41315c("Could not find any address beside the loopback.");
                }
            } catch (IOException e) {
                C12938b bVar = f31015j;
                bVar.mo41318c("Could not initialize the host network interface on " + inetAddress + "because of an error: " + e.getMessage(), (Throwable) e);
                inetAddress2 = m38195q();
                if (str == null || str.length() <= 0) {
                    str = "computer";
                }
            }
        } else {
            inetAddress2 = inetAddress;
        }
        if (str2.length() == 0) {
            str2 = inetAddress2.getHostName();
        }
        if (str2.contains("in-addr.arpa") || str2.equals(inetAddress2.getHostAddress())) {
            if (str == null || str.length() <= 0) {
                str = inetAddress2.getHostAddress();
            }
            str2 = str;
        }
        int indexOf = str2.indexOf(".local");
        if (indexOf > 0) {
            str2 = str2.substring(0, indexOf);
        }
        String replaceAll = str2.replaceAll("[:%\\.]", "-");
        return new C11636k(inetAddress2, replaceAll + ".local.", lVar);
    }

    /* renamed from: q */
    private static InetAddress m38195q() {
        try {
            return InetAddress.getByName((String) null);
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11620h.C11625e mo38052b(C11670e eVar, boolean z, int i) {
        int i2 = C11637a.f31020a[eVar.ordinal()];
        if (i2 == 1) {
            return m38192b(z, i);
        }
        if (i2 == 2 || i2 == 3) {
            return m38194d(z, i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Inet4Address mo38057c() {
        if (mo38059e() instanceof Inet4Address) {
            return (Inet4Address) this.f31017g;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Inet6Address mo38058d() {
        if (mo38059e() instanceof Inet6Address) {
            return (Inet6Address) this.f31017g;
        }
        return null;
    }

    /* renamed from: e */
    public InetAddress mo38059e() {
        return this.f31017g;
    }

    /* renamed from: f */
    public NetworkInterface mo38060f() {
        return this.f31018h;
    }

    /* renamed from: g */
    public String mo38061g() {
        return this.f31016f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public synchronized String mo38062h() {
        String a;
        a = C11654n.C11657c.m38310a().mo38154a(mo38059e(), this.f31016f, C11654n.C11658d.HOST);
        this.f31016f = a;
        return a;
    }

    /* renamed from: i */
    public boolean mo38063i() {
        return this.f31019i.mo38013d();
    }

    /* renamed from: j */
    public boolean mo38064j() {
        return this.f31019i.mo38015f();
    }

    /* renamed from: k */
    public boolean mo38065k() {
        return this.f31019i.mo38016g();
    }

    /* renamed from: l */
    public boolean mo38066l() {
        return this.f31019i.mo38017h();
    }

    /* renamed from: m */
    public boolean mo38067m() {
        return this.f31019i.mo38018i();
    }

    /* renamed from: n */
    public boolean mo38068n() {
        return this.f31019i.mo38019j();
    }

    /* renamed from: o */
    public boolean mo38069o() {
        return this.f31019i.mo38020k();
    }

    /* renamed from: p */
    public boolean mo38070p() {
        return this.f31019i.mo38021l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("local host info[");
        sb.append(mo38061g() != null ? mo38061g() : "no name");
        sb.append(", ");
        sb.append(mo38060f() != null ? mo38060f().getDisplayName() : "???");
        sb.append(":");
        sb.append(mo38059e() != null ? mo38059e().getHostAddress() : "no address");
        sb.append(", ");
        sb.append(this.f31019i);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: c */
    private C11620h.C11621a m38193c(boolean z, int i) {
        if (!(mo38059e() instanceof Inet6Address)) {
            return null;
        }
        return new C11620h.C11624d(mo38061g(), C11669d.CLASS_IN, z, i, mo38059e());
    }

    /* renamed from: d */
    private C11620h.C11625e m38194d(boolean z, int i) {
        if (!(mo38059e() instanceof Inet6Address)) {
            return null;
        }
        return new C11620h.C11625e(mo38059e().getHostAddress() + ".ip6.arpa.", C11669d.CLASS_IN, z, i, mo38061g());
    }

    /* renamed from: b */
    private C11620h.C11625e m38192b(boolean z, int i) {
        if (!(mo38059e() instanceof Inet4Address)) {
            return null;
        }
        return new C11620h.C11625e(mo38059e().getHostAddress() + ".in-addr.arpa.", C11669d.CLASS_IN, z, i, mo38061g());
    }

    /* renamed from: b */
    public void mo38053b(C11675a aVar) {
        this.f31019i.mo38007b(aVar);
    }

    /* renamed from: b */
    public boolean mo38056b(C11675a aVar, C11672g gVar) {
        return this.f31019i.mo38010b(aVar, gVar);
    }

    /* renamed from: b */
    public boolean mo38054b() {
        return this.f31019i.mo38008b();
    }

    /* renamed from: b */
    public boolean mo38055b(long j) {
        if (this.f31017g == null) {
            return true;
        }
        return this.f31019i.mo38009b(j);
    }

    /* renamed from: a */
    public boolean mo38051a(C11620h.C11621a aVar) {
        C11620h.C11621a a = mo38046a(aVar.mo37895e(), aVar.mo37904k(), 3600);
        if (a == null || !a.mo37978b((C11620h) aVar) || !a.mo37990e(aVar) || a.mo37981c(aVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo38050a(DatagramPacket datagramPacket) {
        InetAddress address;
        boolean z = false;
        if (mo38059e() == null || (address = datagramPacket.getAddress()) == null) {
            return false;
        }
        if ((mo38059e().isLinkLocalAddress() || mo38059e().isMCLinkLocal()) && !address.isLinkLocalAddress()) {
            z = true;
        }
        if (!address.isLoopbackAddress() || mo38059e().isLoopbackAddress()) {
            return z;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11620h.C11621a mo38046a(C11670e eVar, boolean z, int i) {
        int i2 = C11637a.f31020a[eVar.ordinal()];
        if (i2 == 1) {
            return m38190a(z, i);
        }
        if (i2 == 2 || i2 == 3) {
            return m38193c(z, i);
        }
        return null;
    }

    /* renamed from: a */
    private C11620h.C11621a m38190a(boolean z, int i) {
        if (!(mo38059e() instanceof Inet4Address)) {
            return null;
        }
        return new C11620h.C11623c(mo38061g(), C11669d.CLASS_IN, z, i, mo38059e());
    }

    /* renamed from: a */
    public Collection<C11620h> mo38045a(C11669d dVar, boolean z, int i) {
        ArrayList arrayList = new ArrayList();
        C11620h.C11621a a = m38190a(z, i);
        if (a != null && a.mo37887a(dVar)) {
            arrayList.add(a);
        }
        C11620h.C11621a c = m38193c(z, i);
        if (c != null && c.mo37887a(dVar)) {
            arrayList.add(c);
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo37998a(C11675a aVar) {
        return this.f31019i.mo37998a(aVar);
    }

    /* renamed from: a */
    public void mo38047a(C11675a aVar, C11672g gVar) {
        this.f31019i.mo38004a(aVar, gVar);
    }

    /* renamed from: a */
    public boolean mo38048a() {
        return this.f31019i.mo38005a();
    }

    /* renamed from: a */
    public boolean mo38049a(long j) {
        return this.f31019i.mo38006a(j);
    }
}
