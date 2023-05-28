package p368r.p369a.p370g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p368r.p369a.C11598d;
import p368r.p369a.p370g.C11620h;
import p368r.p369a.p370g.C11628i;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11672g;
import p368r.p369a.p370g.p372t.C11675a;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.q */
/* compiled from: ServiceInfoImpl */
public class C11662q extends C11598d implements C11607d, C11628i {

    /* renamed from: x */
    private static C12938b f31088x = C12939c.m41778a(C11662q.class.getName());

    /* renamed from: g */
    private String f31089g;

    /* renamed from: h */
    private String f31090h;

    /* renamed from: i */
    private String f31091i;

    /* renamed from: j */
    private String f31092j;

    /* renamed from: k */
    private String f31093k;

    /* renamed from: l */
    private String f31094l;

    /* renamed from: m */
    private int f31095m;

    /* renamed from: n */
    private int f31096n;

    /* renamed from: o */
    private int f31097o;

    /* renamed from: p */
    private byte[] f31098p;

    /* renamed from: q */
    private Map<String, byte[]> f31099q;

    /* renamed from: r */
    private final Set<Inet4Address> f31100r;

    /* renamed from: s */
    private final Set<Inet6Address> f31101s;

    /* renamed from: t */
    private transient String f31102t;

    /* renamed from: u */
    private boolean f31103u;

    /* renamed from: v */
    private boolean f31104v;

    /* renamed from: w */
    private final C11664b f31105w;

    /* renamed from: r.a.g.q$a */
    /* compiled from: ServiceInfoImpl */
    static /* synthetic */ class C11663a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31106a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                r.a.g.s.e[] r0 = p368r.p369a.p370g.p371s.C11670e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31106a = r0
                r.a.g.s.e r1 = p368r.p369a.p370g.p371s.C11670e.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31106a     // Catch:{ NoSuchFieldError -> 0x001d }
                r.a.g.s.e r1 = p368r.p369a.p370g.p371s.C11670e.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31106a     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.a.g.s.e r1 = p368r.p369a.p370g.p371s.C11670e.TYPE_SRV     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31106a     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.a.g.s.e r1 = p368r.p369a.p370g.p371s.C11670e.TYPE_TXT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31106a     // Catch:{ NoSuchFieldError -> 0x003e }
                r.a.g.s.e r1 = p368r.p369a.p370g.p371s.C11670e.TYPE_PTR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11662q.C11663a.<clinit>():void");
        }
    }

    /* renamed from: r.a.g.q$b */
    /* compiled from: ServiceInfoImpl */
    private static final class C11664b extends C11628i.C11630b {

        /* renamed from: l */
        private final C11662q f31107l;

        public C11664b(C11662q qVar) {
            this.f31107l = qVar;
        }

        /* renamed from: a */
        public void mo38002a(C11639l lVar) {
            super.mo38002a(lVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo38012c(C11675a aVar) {
            super.mo38012c(aVar);
            if (this.f31004g == null && this.f31107l.mo38165H()) {
                lock();
                try {
                    if (this.f31004g == null && this.f31107l.mo38165H()) {
                        if (this.f31005h.mo38201d()) {
                            mo38003a(C11672g.ANNOUNCING_1);
                            if (mo38011c() != null) {
                                mo38011c().mo38032o();
                            }
                        }
                        this.f31107l.mo38175a(false);
                    }
                } finally {
                    unlock();
                }
            }
        }
    }

    public C11662q(String str, String str2, String str3, int i, int i2, int i3, boolean z, byte[] bArr) {
        this(m38319a(str, str2, str3), i, i2, i3, z, bArr);
    }

    /* renamed from: K */
    private final boolean m38318K() {
        return this.f31100r.size() > 0 || this.f31101s.size() > 0;
    }

    /* renamed from: a */
    public static Map<C11598d.C11599a, String> m38319a(String str, String str2, String str3) {
        Map<C11598d.C11599a, String> c = m38323c(str);
        c.put(C11598d.C11599a.Instance, str2);
        c.put(C11598d.C11599a.Subtype, str3);
        return m38320a(c);
    }

    /* renamed from: c */
    public static Map<C11598d.C11599a, String> m38323c(String str) {
        String str2;
        String str3;
        String str4;
        String substring;
        String str5;
        String str6;
        String str7;
        int indexOf;
        String lowerCase = str.toLowerCase();
        String str8 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int indexOf2 = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            str4 = m38324d(str.substring(0, indexOf2));
            substring = str.substring(indexOf2);
        } else if (lowerCase.contains("_") || !lowerCase.contains(".")) {
            if ((!lowerCase.startsWith("_") || lowerCase.startsWith("_services")) && (indexOf = lowerCase.indexOf("._")) > 0) {
                str6 = str.substring(0, indexOf);
                int i = indexOf + 1;
                if (i < lowerCase.length()) {
                    str5 = lowerCase.substring(i);
                    str = str.substring(i);
                } else {
                    str5 = lowerCase;
                }
            } else {
                str5 = lowerCase;
                str6 = str8;
            }
            int lastIndexOf = str5.lastIndexOf("._");
            if (lastIndexOf > 0) {
                int i2 = lastIndexOf + 2;
                str7 = str.substring(i2, str5.indexOf(46, i2));
            } else {
                str7 = str8;
            }
            if (str7.length() > 0) {
                int indexOf3 = str5.indexOf("_" + str7.toLowerCase() + ".");
                int length = str7.length() + indexOf3 + 2;
                int length2 = str5.length() - (str5.endsWith(".") ? 1 : 0);
                String substring2 = length2 > length ? str.substring(length, length2) : str8;
                if (indexOf3 > 0) {
                    lowerCase = str.substring(0, indexOf3 - 1);
                    str2 = substring2;
                } else {
                    str2 = substring2;
                    lowerCase = str8;
                }
            } else {
                str2 = str8;
            }
            int indexOf4 = lowerCase.toLowerCase().indexOf("._sub");
            if (indexOf4 > 0) {
                str8 = m38324d(lowerCase.substring(0, indexOf4));
                lowerCase = lowerCase.substring(indexOf4 + 5);
            }
            str4 = str6;
            String str9 = str8;
            str8 = str7;
            str3 = str9;
            HashMap hashMap = new HashMap(5);
            hashMap.put(C11598d.C11599a.Domain, m38324d(str2));
            hashMap.put(C11598d.C11599a.Protocol, str8);
            hashMap.put(C11598d.C11599a.Application, m38324d(lowerCase));
            hashMap.put(C11598d.C11599a.Instance, str4);
            hashMap.put(C11598d.C11599a.Subtype, str3);
            return hashMap;
        } else {
            int indexOf5 = lowerCase.indexOf(46);
            str4 = m38324d(str.substring(0, indexOf5));
            substring = m38324d(str.substring(indexOf5));
        }
        lowerCase = str8;
        str3 = lowerCase;
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put(C11598d.C11599a.Domain, m38324d(str2));
        hashMap2.put(C11598d.C11599a.Protocol, str8);
        hashMap2.put(C11598d.C11599a.Application, m38324d(lowerCase));
        hashMap2.put(C11598d.C11599a.Instance, str4);
        hashMap2.put(C11598d.C11599a.Subtype, str3);
        return hashMap2;
    }

    /* renamed from: d */
    private static String m38324d(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.startsWith(".")) {
            trim = trim.substring(1);
        }
        if (trim.startsWith("_")) {
            trim = trim.substring(1);
        }
        return trim.endsWith(".") ? trim.substring(0, trim.length() - 1) : trim;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        r0.clear();
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Map<java.lang.String, byte[]> mo38159A() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.Map<java.lang.String, byte[]> r0 = r9.f31099q     // Catch:{ all -> 0x0084 }
            if (r0 != 0) goto L_0x0077
            byte[] r0 = r9.mo37865q()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0077
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch:{ all -> 0x0084 }
            r0.<init>()     // Catch:{ all -> 0x0084 }
            r1 = 0
            r2 = 0
        L_0x0012:
            byte[] r3 = r9.mo37865q()     // Catch:{ Exception -> 0x006d }
            int r3 = r3.length     // Catch:{ Exception -> 0x006d }
            if (r2 >= r3) goto L_0x0075
            byte[] r3 = r9.mo37865q()     // Catch:{ Exception -> 0x006d }
            int r4 = r2 + 1
            byte r2 = r3[r2]     // Catch:{ Exception -> 0x006d }
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x0069
            int r3 = r4 + r2
            byte[] r5 = r9.mo37865q()     // Catch:{ Exception -> 0x006d }
            int r5 = r5.length     // Catch:{ Exception -> 0x006d }
            if (r3 <= r5) goto L_0x002f
            goto L_0x0069
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 >= r2) goto L_0x0041
            byte[] r6 = r9.mo37865q()     // Catch:{ Exception -> 0x006d }
            int r7 = r4 + r5
            byte r6 = r6[r7]     // Catch:{ Exception -> 0x006d }
            r7 = 61
            if (r6 == r7) goto L_0x0041
            int r5 = r5 + 1
            goto L_0x0030
        L_0x0041:
            byte[] r6 = r9.mo37865q()     // Catch:{ Exception -> 0x006d }
            java.lang.String r6 = r9.mo38168a((byte[]) r6, (int) r4, (int) r5)     // Catch:{ Exception -> 0x006d }
            if (r6 != 0) goto L_0x004f
            r0.clear()     // Catch:{ Exception -> 0x006d }
            goto L_0x0075
        L_0x004f:
            if (r5 != r2) goto L_0x0057
            byte[] r2 = p368r.p369a.C11598d.f30936f     // Catch:{ Exception -> 0x006d }
            r0.put(r6, r2)     // Catch:{ Exception -> 0x006d }
            goto L_0x0067
        L_0x0057:
            int r5 = r5 + 1
            int r2 = r2 - r5
            byte[] r7 = new byte[r2]     // Catch:{ Exception -> 0x006d }
            byte[] r8 = r9.mo37865q()     // Catch:{ Exception -> 0x006d }
            int r4 = r4 + r5
            java.lang.System.arraycopy(r8, r4, r7, r1, r2)     // Catch:{ Exception -> 0x006d }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x006d }
        L_0x0067:
            r2 = r3
            goto L_0x0012
        L_0x0069:
            r0.clear()     // Catch:{ Exception -> 0x006d }
            goto L_0x0075
        L_0x006d:
            r1 = move-exception
            t.b.b r2 = f31088x     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = "Malformed TXT Field "
            r2.mo41318c((java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0084 }
        L_0x0075:
            r9.f31099q = r0     // Catch:{ all -> 0x0084 }
        L_0x0077:
            java.util.Map<java.lang.String, byte[]> r0 = r9.f31099q     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x007e
            java.util.Map<java.lang.String, byte[]> r0 = r9.f31099q     // Catch:{ all -> 0x0084 }
            goto L_0x0082
        L_0x007e:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0084 }
        L_0x0082:
            monitor-exit(r9)
            return r0
        L_0x0084:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0088
        L_0x0087:
            throw r0
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11662q.mo38159A():java.util.Map");
    }

    /* renamed from: B */
    public Map<C11598d.C11599a, String> mo38160B() {
        HashMap hashMap = new HashMap(5);
        hashMap.put(C11598d.C11599a.Domain, mo37853c());
        hashMap.put(C11598d.C11599a.Protocol, mo37861k());
        hashMap.put(C11598d.C11599a.Application, mo37852b());
        hashMap.put(C11598d.C11599a.Instance, mo37858h());
        hashMap.put(C11598d.C11599a.Subtype, mo37864n());
        return hashMap;
    }

    /* renamed from: C */
    public String mo38161C() {
        String str;
        String n = mo37864n();
        StringBuilder sb = new StringBuilder();
        if (n.length() > 0) {
            str = "_" + n.toLowerCase() + "._sub.";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(mo37866r());
        return sb.toString();
    }

    /* renamed from: E */
    public boolean mo38162E() {
        return this.f31105w.mo38013d();
    }

    /* renamed from: F */
    public boolean mo38163F() {
        return this.f31105w.mo38014e();
    }

    /* renamed from: G */
    public boolean mo38164G() {
        return this.f31105w.mo38019j();
    }

    /* renamed from: H */
    public boolean mo38165H() {
        return this.f31104v;
    }

    /* renamed from: I */
    public boolean mo38166I() {
        return this.f31105w.mo38020k();
    }

    /* renamed from: J */
    public boolean mo38167J() {
        return this.f31105w.mo38021l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo38178b(String str) {
        this.f31094l = str;
    }

    /* renamed from: e */
    public Inet4Address[] mo37855e() {
        Set<Inet4Address> set = this.f31100r;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11662q) && mo37862l().equals(((C11662q) obj).mo37862l());
    }

    /* renamed from: f */
    public Inet6Address[] mo37856f() {
        Set<Inet6Address> set = this.f31101s;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    /* renamed from: g */
    public InetAddress[] mo37857g() {
        ArrayList arrayList = new ArrayList(this.f31100r.size() + this.f31101s.size());
        arrayList.addAll(this.f31100r);
        arrayList.addAll(this.f31101s);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    /* renamed from: h */
    public String mo37858h() {
        String str = this.f31092j;
        return str != null ? str : "";
    }

    public int hashCode() {
        return mo37862l().hashCode();
    }

    /* renamed from: i */
    public int mo37859i() {
        return this.f31095m;
    }

    /* renamed from: j */
    public int mo37860j() {
        return this.f31097o;
    }

    /* renamed from: k */
    public String mo37861k() {
        String str = this.f31090h;
        return str != null ? str : "tcp";
    }

    /* renamed from: l */
    public String mo37862l() {
        String str;
        String str2;
        String c = mo37853c();
        String k = mo37861k();
        String b = mo37852b();
        String h = mo37858h();
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        if (h.length() > 0) {
            str = h + ".";
        } else {
            str = str3;
        }
        sb.append(str);
        if (b.length() > 0) {
            str2 = "_" + b + ".";
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (k.length() > 0) {
            str3 = "_" + k + ".";
        }
        sb.append(str3);
        sb.append(c);
        sb.append(".");
        return sb.toString();
    }

    /* renamed from: m */
    public String mo37863m() {
        String str = this.f31094l;
        return str != null ? str : "";
    }

    /* renamed from: n */
    public String mo37864n() {
        String str = this.f31093k;
        return str != null ? str : "";
    }

    /* renamed from: q */
    public byte[] mo37865q() {
        byte[] bArr = this.f31098p;
        return (bArr == null || bArr.length <= 0) ? C11620h.f30982n : bArr;
    }

    /* renamed from: r */
    public String mo37866r() {
        String str;
        String c = mo37853c();
        String k = mo37861k();
        String b = mo37852b();
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (b.length() > 0) {
            str = "_" + b + ".";
        } else {
            str = str2;
        }
        sb.append(str);
        if (k.length() > 0) {
            str2 = "_" + k + ".";
        }
        sb.append(str2);
        sb.append(c);
        sb.append(".");
        return sb.toString();
    }

    /* renamed from: s */
    public int mo37867s() {
        return this.f31096n;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[" + C11662q.class.getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("name: '");
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (mo37858h().length() > 0) {
            str = mo37858h() + ".";
        } else {
            str = str2;
        }
        sb2.append(str);
        sb2.append(mo38161C());
        sb.append(sb2.toString());
        sb.append("' address: '");
        InetAddress[] g = mo37857g();
        if (g.length > 0) {
            for (InetAddress append : g) {
                sb.append(append);
                sb.append(':');
                sb.append(mo37859i());
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(mo37859i());
        }
        sb.append("' status: '");
        sb.append(this.f31105w.toString());
        sb.append(mo37869w() ? "' is persistent," : "',");
        sb.append(" has ");
        if (!mo37868u()) {
            str2 = "NO ";
        }
        sb.append(str2);
        sb.append("data");
        if (mo37865q().length > 0) {
            Map<String, byte[]> A = mo38159A();
            if (!A.isEmpty()) {
                sb.append("\n");
                for (String next : A.keySet()) {
                    sb.append("\t" + next + ": " + new String(A.get(next)) + "\n");
                }
            } else {
                sb.append(" empty");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: u */
    public synchronized boolean mo37868u() {
        return mo37863m() != null && m38318K() && mo37865q() != null && mo37865q().length > 0;
    }

    /* renamed from: w */
    public boolean mo37869w() {
        return this.f31103u;
    }

    /* renamed from: x */
    public boolean mo38185x() {
        return this.f31105w.mo38005a();
    }

    /* renamed from: y */
    public C11639l mo38186y() {
        return this.f31105w.mo38011c();
    }

    /* renamed from: z */
    public String mo38187z() {
        if (this.f31102t == null) {
            this.f31102t = mo37862l().toLowerCase();
        }
        return this.f31102t;
    }

    public C11662q(Map<C11598d.C11599a, String> map, int i, int i2, int i3, boolean z, Map<String, ?> map2) {
        this(map, i, i2, i3, z, m38322b(map2));
    }

    /* renamed from: b */
    public String mo37852b() {
        String str = this.f31091i;
        return str != null ? str : "";
    }

    C11662q(Map<C11598d.C11599a, String> map, int i, int i2, int i3, boolean z, String str) {
        this(map, i, i2, i3, z, (byte[]) null);
        this.f31094l = str;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            m38321a((OutputStream) byteArrayOutputStream, str);
            this.f31098p = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("unexpected exception: " + e);
        }
    }

    /* renamed from: b */
    public void mo38179b(C11675a aVar) {
        this.f31105w.mo38007b(aVar);
    }

    public C11662q clone() {
        C11662q qVar = new C11662q(mo38160B(), this.f31095m, this.f31096n, this.f31097o, this.f31103u, this.f31098p);
        for (Inet6Address add : mo37856f()) {
            qVar.f31101s.add(add);
        }
        for (Inet4Address add2 : mo37855e()) {
            qVar.f31100r.add(add2);
        }
        return qVar;
    }

    /* renamed from: b */
    public boolean mo38181b(C11675a aVar, C11672g gVar) {
        return this.f31105w.mo38010b(aVar, gVar);
    }

    /* renamed from: a */
    protected static Map<C11598d.C11599a, String> m38320a(Map<C11598d.C11599a, String> map) {
        HashMap hashMap = new HashMap(5);
        String str = "local";
        String str2 = map.containsKey(C11598d.C11599a.Domain) ? map.get(C11598d.C11599a.Domain) : str;
        if (!(str2 == null || str2.length() == 0)) {
            str = str2;
        }
        hashMap.put(C11598d.C11599a.Domain, m38324d(str));
        String str3 = "tcp";
        String str4 = map.containsKey(C11598d.C11599a.Protocol) ? map.get(C11598d.C11599a.Protocol) : str3;
        if (!(str4 == null || str4.length() == 0)) {
            str3 = str4;
        }
        hashMap.put(C11598d.C11599a.Protocol, m38324d(str3));
        String str5 = "";
        String str6 = map.containsKey(C11598d.C11599a.Application) ? map.get(C11598d.C11599a.Application) : str5;
        if (str6 == null || str6.length() == 0) {
            str6 = str5;
        }
        hashMap.put(C11598d.C11599a.Application, m38324d(str6));
        String str7 = map.containsKey(C11598d.C11599a.Instance) ? map.get(C11598d.C11599a.Instance) : str5;
        if (str7 == null || str7.length() == 0) {
            str7 = str5;
        }
        hashMap.put(C11598d.C11599a.Instance, m38324d(str7));
        String str8 = map.containsKey(C11598d.C11599a.Subtype) ? map.get(C11598d.C11599a.Subtype) : str5;
        if (!(str8 == null || str8.length() == 0)) {
            str5 = str8;
        }
        hashMap.put(C11598d.C11599a.Subtype, m38324d(str5));
        return hashMap;
    }

    /* renamed from: b */
    public boolean mo38180b(long j) {
        return this.f31105w.mo38009b(j);
    }

    /* renamed from: b */
    private static byte[] m38322b(Map<String, ?> map) {
        String str;
        byte[] bArr = null;
        if (map != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
                for (String next : map.keySet()) {
                    Object obj = map.get(next);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
                    m38321a((OutputStream) byteArrayOutputStream2, next);
                    if (obj != null) {
                        if (obj instanceof String) {
                            byteArrayOutputStream2.write(61);
                            m38321a((OutputStream) byteArrayOutputStream2, (String) obj);
                        } else if (obj instanceof byte[]) {
                            byte[] bArr2 = (byte[]) obj;
                            if (bArr2.length > 0) {
                                byteArrayOutputStream2.write(61);
                                byteArrayOutputStream2.write(bArr2, 0, bArr2.length);
                            } else {
                                obj = null;
                            }
                        } else {
                            throw new IllegalArgumentException("invalid property value: " + obj);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (byteArray.length > 255) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot have individual values larger that 255 chars. Offending value: ");
                        sb.append(next);
                        if (obj != null) {
                            str = "";
                        } else {
                            str = "=" + obj;
                        }
                        sb.append(str);
                        throw new IOException(sb.toString());
                    }
                    byteArrayOutputStream.write((byte) byteArray.length);
                    byteArrayOutputStream.write(byteArray, 0, byteArray.length);
                }
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException("unexpected exception: " + e);
            }
        }
        return (bArr == null || bArr.length <= 0) ? C11620h.f30982n : bArr;
    }

    C11662q(Map<C11598d.C11599a, String> map, int i, int i2, int i3, boolean z, byte[] bArr) {
        Map<C11598d.C11599a, String> a = m38320a(map);
        this.f31089g = a.get(C11598d.C11599a.Domain);
        this.f31090h = a.get(C11598d.C11599a.Protocol);
        this.f31091i = a.get(C11598d.C11599a.Application);
        this.f31092j = a.get(C11598d.C11599a.Instance);
        this.f31093k = a.get(C11598d.C11599a.Subtype);
        this.f31095m = i;
        this.f31096n = i2;
        this.f31097o = i3;
        this.f31098p = bArr;
        mo38175a(false);
        this.f31105w = new C11664b(this);
        this.f31103u = z;
        this.f31100r = Collections.synchronizedSet(new LinkedHashSet());
        this.f31101s = Collections.synchronizedSet(new LinkedHashSet());
    }

    C11662q(C11598d dVar) {
        this.f31100r = Collections.synchronizedSet(new LinkedHashSet());
        this.f31101s = Collections.synchronizedSet(new LinkedHashSet());
        if (dVar != null) {
            this.f31089g = dVar.mo37853c();
            this.f31090h = dVar.mo37861k();
            this.f31091i = dVar.mo37852b();
            this.f31092j = dVar.mo37858h();
            this.f31093k = dVar.mo37864n();
            this.f31095m = dVar.mo37859i();
            this.f31096n = dVar.mo37867s();
            this.f31097o = dVar.mo37860j();
            this.f31098p = dVar.mo37865q();
            this.f31103u = dVar.mo37869w();
            for (Inet6Address add : dVar.mo37856f()) {
                this.f31101s.add(add);
            }
            for (Inet4Address add2 : dVar.mo37855e()) {
                this.f31100r.add(add2);
            }
        }
        this.f31105w = new C11664b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38170a(String str) {
        this.f31092j = str;
        this.f31102t = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38171a(Inet4Address inet4Address) {
        this.f31100r.add(inet4Address);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38172a(Inet6Address inet6Address) {
        this.f31101s.add(inet6Address);
    }

    /* renamed from: a */
    static void m38321a(OutputStream outputStream, String str) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= 1 && charAt <= 127) {
                outputStream.write(charAt);
            } else if (charAt > 2047) {
                outputStream.write(((charAt >> 12) & 15) | 224);
                outputStream.write(((charAt >> 6) & 63) | 128);
                outputStream.write(((charAt >> 0) & 63) | 128);
            } else {
                outputStream.write(((charAt >> 6) & 31) | 192);
                outputStream.write(((charAt >> 0) & 63) | 128);
            }
        }
    }

    /* renamed from: c */
    public String mo37853c() {
        String str = this.f31089g;
        return str != null ? str : "local";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo38168a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte b;
        StringBuffer stringBuffer = new StringBuffer();
        int i5 = i + i2;
        while (i < i5) {
            int i6 = i + 1;
            byte b2 = bArr[i] & 255;
            switch (b2 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 12:
                case 13:
                    if (i6 < i2) {
                        i3 = (b2 & 31) << 6;
                        i4 = i6 + 1;
                        b = bArr[i6] & 63;
                        break;
                    } else {
                        return null;
                    }
                case 14:
                    if (i6 + 2 >= i2) {
                        return null;
                    }
                    int i7 = i6 + 1;
                    byte b3 = ((b2 & 15) << 12) | ((bArr[i6] & 63) << 6);
                    i6 = i7 + 1;
                    b2 = b3 | (bArr[i7] & 63);
                    continue;
                default:
                    i4 = i6 + 1;
                    if (i4 < i2) {
                        i3 = (b2 & 63) << 4;
                        b = bArr[i6] & 15;
                        break;
                    } else {
                        return null;
                    }
            }
            b2 = i3 | b;
            i6 = i4;
            stringBuffer.append((char) b2);
            i = i6;
        }
        return stringBuffer.toString();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public void mo37922a(p368r.p369a.p370g.C11602a r5, long r6, p368r.p369a.p370g.C11603b r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof p368r.p369a.p370g.C11620h
            if (r0 == 0) goto L_0x0140
            boolean r0 = r8.mo37886a((long) r6)
            if (r0 != 0) goto L_0x0140
            int[] r0 = p368r.p369a.p370g.C11662q.C11663a.f31106a
            r.a.g.s.e r1 = r8.mo37895e()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x00fd
            r3 = 2
            if (r0 == r3) goto L_0x00e1
            r3 = 3
            if (r0 == r3) goto L_0x005f
            r5 = 4
            if (r0 == r5) goto L_0x0044
            r5 = 5
            if (r0 == r5) goto L_0x0028
            goto L_0x0119
        L_0x0028:
            java.lang.String r5 = r4.mo37864n()
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0119
            java.lang.String r5 = r8.mo37898f()
            int r5 = r5.length()
            if (r5 == 0) goto L_0x0119
            java.lang.String r5 = r8.mo37898f()
            r4.f31093k = r5
            goto L_0x0118
        L_0x0044:
            java.lang.String r5 = r8.mo37889b()
            java.lang.String r6 = r4.mo37862l()
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x0119
            r.a.g.h$g r8 = (p368r.p369a.p370g.C11620h.C11627g) r8
            byte[] r5 = r8.mo37997t()
            r4.f31098p = r5
            r5 = 0
            r4.f31099q = r5
            goto L_0x0118
        L_0x005f:
            java.lang.String r0 = r8.mo37889b()
            java.lang.String r3 = r4.mo37862l()
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0119
            r.a.g.h$f r8 = (p368r.p369a.p370g.C11620h.C11626f) r8
            java.lang.String r0 = r4.f31094l
            if (r0 == 0) goto L_0x0080
            java.lang.String r3 = r8.mo37995v()
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r0 = 0
            goto L_0x0081
        L_0x0080:
            r0 = 1
        L_0x0081:
            java.lang.String r3 = r8.mo37995v()
            r4.f31094l = r3
            int r3 = r8.mo37993t()
            r4.f31095m = r3
            int r3 = r8.mo37996w()
            r4.f31096n = r3
            int r8 = r8.mo37994u()
            r4.f31097o = r8
            if (r0 == 0) goto L_0x0118
            java.util.Set<java.net.Inet4Address> r8 = r4.f31100r
            r8.clear()
            java.util.Set<java.net.Inet6Address> r8 = r4.f31101s
            r8.clear()
            java.lang.String r8 = r4.f31094l
            r.a.g.s.e r0 = p368r.p369a.p370g.p371s.C11670e.TYPE_A
            r.a.g.s.d r2 = p368r.p369a.p370g.p371s.C11669d.CLASS_IN
            java.util.Collection r8 = r5.mo37877b(r8, r0, r2)
            java.util.Iterator r8 = r8.iterator()
        L_0x00b3:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r0 = r8.next()
            r.a.g.b r0 = (p368r.p369a.p370g.C11603b) r0
            r4.mo37922a((p368r.p369a.p370g.C11602a) r5, (long) r6, (p368r.p369a.p370g.C11603b) r0)
            goto L_0x00b3
        L_0x00c3:
            java.lang.String r8 = r4.f31094l
            r.a.g.s.e r0 = p368r.p369a.p370g.p371s.C11670e.TYPE_AAAA
            r.a.g.s.d r2 = p368r.p369a.p370g.p371s.C11669d.CLASS_IN
            java.util.Collection r8 = r5.mo37877b(r8, r0, r2)
            java.util.Iterator r8 = r8.iterator()
        L_0x00d1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0119
            java.lang.Object r0 = r8.next()
            r.a.g.b r0 = (p368r.p369a.p370g.C11603b) r0
            r4.mo37922a((p368r.p369a.p370g.C11602a) r5, (long) r6, (p368r.p369a.p370g.C11603b) r0)
            goto L_0x00d1
        L_0x00e1:
            java.lang.String r5 = r8.mo37889b()
            java.lang.String r6 = r4.mo37863m()
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x0119
            java.util.Set<java.net.Inet6Address> r5 = r4.f31101s
            r.a.g.h$a r8 = (p368r.p369a.p370g.C11620h.C11621a) r8
            java.net.InetAddress r6 = r8.mo37991t()
            java.net.Inet6Address r6 = (java.net.Inet6Address) r6
            r5.add(r6)
            goto L_0x0118
        L_0x00fd:
            java.lang.String r5 = r8.mo37889b()
            java.lang.String r6 = r4.mo37863m()
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x0119
            java.util.Set<java.net.Inet4Address> r5 = r4.f31100r
            r.a.g.h$a r8 = (p368r.p369a.p370g.C11620h.C11621a) r8
            java.net.InetAddress r6 = r8.mo37991t()
            java.net.Inet4Address r6 = (java.net.Inet4Address) r6
            r5.add(r6)
        L_0x0118:
            r1 = 1
        L_0x0119:
            if (r1 == 0) goto L_0x0137
            boolean r5 = r4.mo37868u()
            if (r5 == 0) goto L_0x0137
            r.a.g.l r5 = r4.mo38186y()
            if (r5 == 0) goto L_0x0137
            r.a.g.p r6 = new r.a.g.p
            java.lang.String r7 = r4.mo37866r()
            java.lang.String r8 = r4.mo37858h()
            r6.<init>(r5, r7, r8, r4)
            r5.mo38095a((p368r.p369a.C11597c) r6)
        L_0x0137:
            monitor-enter(r4)
            r4.notifyAll()     // Catch:{ all -> 0x013d }
            monitor-exit(r4)     // Catch:{ all -> 0x013d }
            goto L_0x0140
        L_0x013d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x013d }
            throw r5
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11662q.mo37922a(r.a.g.a, long, r.a.g.b):void");
    }

    /* renamed from: a */
    public boolean mo37998a(C11675a aVar) {
        return this.f31105w.mo37998a(aVar);
    }

    /* renamed from: a */
    public void mo38174a(C11675a aVar, C11672g gVar) {
        this.f31105w.mo38004a(aVar, gVar);
    }

    /* renamed from: a */
    public boolean mo38177a(long j) {
        return this.f31105w.mo38006a(j);
    }

    /* renamed from: a */
    public Collection<C11620h> mo38169a(C11669d dVar, boolean z, int i, C11636k kVar) {
        C11669d dVar2 = dVar;
        ArrayList arrayList = new ArrayList();
        if (dVar2 == C11669d.CLASS_ANY || dVar2 == C11669d.CLASS_IN) {
            if (mo37864n().length() > 0) {
                arrayList.add(new C11620h.C11625e(mo38161C(), C11669d.CLASS_IN, false, i, mo37862l()));
            }
            arrayList.add(new C11620h.C11625e(mo37866r(), C11669d.CLASS_IN, false, i, mo37862l()));
            String l = mo37862l();
            C11669d dVar3 = C11669d.CLASS_IN;
            int i2 = this.f31097o;
            int i3 = this.f31096n;
            arrayList.add(new C11620h.C11626f(l, dVar3, z, i, i2, i3, this.f31095m, kVar.mo38061g()));
            arrayList.add(new C11620h.C11627g(mo37862l(), C11669d.CLASS_IN, z, i, mo37865q()));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38176a(byte[] bArr) {
        this.f31098p = bArr;
        this.f31099q = null;
    }

    /* renamed from: a */
    public void mo38173a(C11639l lVar) {
        this.f31105w.mo38002a(lVar);
    }

    /* renamed from: a */
    public void mo38175a(boolean z) {
        this.f31104v = z;
        if (z) {
            this.f31105w.mo38012c((C11675a) null);
        }
    }

    /* renamed from: a */
    public boolean mo37851a(C11598d dVar) {
        if (dVar == null) {
            return false;
        }
        if (dVar instanceof C11662q) {
            C11662q qVar = (C11662q) dVar;
            if (this.f31100r.size() != qVar.f31100r.size() || this.f31101s.size() != qVar.f31101s.size() || !this.f31100r.equals(qVar.f31100r) || !this.f31101s.equals(qVar.f31101s)) {
                return false;
            }
            return true;
        }
        InetAddress[] g = mo37857g();
        InetAddress[] g2 = dVar.mo37857g();
        if (g.length != g2.length || !new HashSet(Arrays.asList(g)).equals(new HashSet(Arrays.asList(g2)))) {
            return false;
        }
        return true;
    }
}
