package com.flurry.sdk;

import com.flurry.sdk.C6865i1;
import com.flurry.sdk.C6868i2;
import com.flurry.sdk.C6897k1;
import com.flurry.sdk.C6997r0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.p0 */
public abstract class C6962p0 extends C6916l2 {

    /* renamed from: n */
    protected final String f13072n;

    /* renamed from: o */
    protected String f13073o;

    /* renamed from: p */
    protected C6950o0 f13074p;

    /* renamed from: q */
    Set<String> f13075q = new HashSet();

    /* renamed from: r */
    public C6997r0 f13076r;

    /* renamed from: s */
    private C7056w f13077s = C6812e7.m14513a().f12697b;

    /* renamed from: t */
    private C6823f7<C7045v> f13078t;

    /* renamed from: com.flurry.sdk.p0$a */
    class C6963a implements C6823f7<C7045v> {
        C6963a() {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23539a(Object obj) {
            C7045v vVar = (C7045v) obj;
            String str = C6962p0.this.f13072n;
            C6792d1.m14485c(str, "NetworkAvailabilityChanged : NetworkAvailable = " + vVar.f13244a);
            if (vVar.f13244a) {
                C6962p0.this.mo23681b();
            }
        }
    }

    /* renamed from: com.flurry.sdk.p0$b */
    class C6964b extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ byte[] f13080h;

        /* renamed from: i */
        final /* synthetic */ String f13081i;

        /* renamed from: j */
        final /* synthetic */ String f13082j;

        C6964b(byte[] bArr, String str, String str2) {
            this.f13080h = bArr;
            this.f13081i = str;
            this.f13082j = str2;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6962p0.this.mo23682b(this.f13080h, this.f13081i, this.f13082j);
        }
    }

    /* renamed from: com.flurry.sdk.p0$c */
    class C6965c extends C6816f2 {
        C6965c() {
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6962p0.this.mo23683c();
        }
    }

    /* renamed from: com.flurry.sdk.p0$d */
    class C6966d implements C6865i1.C6867b<byte[], String> {

        /* renamed from: a */
        final /* synthetic */ String f13085a;

        /* renamed from: b */
        final /* synthetic */ String f13086b;

        /* renamed from: c */
        final /* synthetic */ String f13087c;

        /* renamed from: com.flurry.sdk.p0$d$a */
        class C6967a extends C6816f2 {

            /* renamed from: h */
            final /* synthetic */ int f13089h;

            /* renamed from: i */
            final /* synthetic */ String f13090i;

            C6967a(int i, String str) {
                this.f13089h = i;
                this.f13090i = str;
            }

            /* renamed from: a */
            public final void mo23531a() throws Exception {
                C6962p0.this.mo23678a(this.f13089h, C6962p0.m14787a(this.f13090i), C6966d.this.f13085a);
            }
        }

        C6966d(String str, String str2, String str3) {
            this.f13085a = str;
            this.f13086b = str2;
            this.f13087c = str3;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo23611a(C6865i1 i1Var, Object obj) {
            String str = (String) obj;
            int i = i1Var.f12919w;
            if (i != 200) {
                Future unused = C6962p0.this.mo23563c(new C6967a(i, str));
            }
            if ((i < 200 || i >= 300) && i != 400) {
                String str2 = C6962p0.this.f13072n;
                C6792d1.m14488e(str2, "Analytics report sent with error " + this.f13086b);
                C6962p0 p0Var = C6962p0.this;
                p0Var.mo23563c(new C6969f(this.f13085a));
                return;
            }
            String str3 = C6962p0.this.f13072n;
            C6792d1.m14488e(str3, "Analytics report sent to " + this.f13086b);
            String str4 = C6962p0.this.f13072n;
            C6792d1.m14476a(3, str4, "FlurryDataSender: report " + this.f13085a + " sent. HTTP response: " + i);
            String str5 = C6962p0.this.f13072n;
            StringBuilder sb = new StringBuilder("FlurryDataSender:");
            sb.append(C6962p0.m14787a(str));
            C6792d1.m14476a(3, str5, sb.toString());
            if (str != null) {
                C6792d1.m14476a(3, C6962p0.this.f13072n, "HTTP response: ".concat(String.valueOf(str)));
            }
            C6962p0 p0Var2 = C6962p0.this;
            p0Var2.mo23563c(new C6968e(i, this.f13085a, this.f13087c));
            C6962p0.this.mo23681b();
        }
    }

    /* renamed from: com.flurry.sdk.p0$e */
    class C6968e extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ int f13092h;

        /* renamed from: i */
        final /* synthetic */ String f13093i;

        /* renamed from: j */
        final /* synthetic */ String f13094j;

        C6968e(int i, String str, String str2) {
            this.f13092h = i;
            this.f13093i = str;
            this.f13094j = str2;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6950o0 o0Var = C6962p0.this.f13074p;
            if (o0Var != null) {
                if (this.f13092h == 200) {
                    o0Var.mo23626a();
                } else {
                    o0Var.mo23627b();
                }
            }
            if (!C6962p0.this.f13076r.mo23706a(this.f13093i, this.f13094j)) {
                String str = C6962p0.this.f13072n;
                C6792d1.m14476a(6, str, "Internal error. Block wasn't deleted with id = " + this.f13093i);
            }
            if (!C6962p0.this.f13075q.remove(this.f13093i)) {
                String str2 = C6962p0.this.f13072n;
                C6792d1.m14476a(6, str2, "Internal error. Block with id = " + this.f13093i + " was not in progress state");
            }
        }
    }

    /* renamed from: com.flurry.sdk.p0$f */
    class C6969f extends C6816f2 {

        /* renamed from: h */
        final /* synthetic */ String f13096h;

        C6969f(String str) {
            this.f13096h = str;
        }

        /* renamed from: a */
        public final void mo23531a() {
            C6950o0 o0Var = C6962p0.this.f13074p;
            if (o0Var != null) {
                o0Var.mo23627b();
            }
            if (!C6962p0.this.f13075q.remove(this.f13096h)) {
                String str = C6962p0.this.f13072n;
                C6792d1.m14476a(6, str, "Internal error. Block with id = " + this.f13096h + " was not in progress state");
            }
        }
    }

    public C6962p0(String str, String str2) {
        super(str2, C6868i2.m14604a(C6868i2.C6870b.REPORTS));
        C6963a aVar = new C6963a();
        this.f13078t = aVar;
        this.f13072n = str2;
        this.f13073o = "AnalyticsData_";
        this.f13077s.mo23582a((C6823f7<C7045v>) aVar);
        this.f13076r = new C6997r0(str);
    }

    /* renamed from: e */
    private boolean m14789e() {
        return m14790f() <= 5;
    }

    /* renamed from: f */
    private int m14790f() {
        return this.f13075q.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo23678a(int i, String str, String str2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23681b() {
        mo23563c(new C6965c());
    }

    /* JADX WARNING: type inference failed for: r6v8, types: [byte[], RequestObjectType] */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo23683c() {
        if (!C7075x0.m15016a()) {
            C6792d1.m14476a(5, this.f13072n, "Reports were not sent! No Internet connection!");
            return;
        }
        List<String> a = this.f13076r.mo23703a();
        if (a.isEmpty()) {
            C6792d1.m14476a(4, this.f13072n, "No more reports to send.");
            return;
        }
        for (String next : a) {
            if (m14789e()) {
                List<String> d = this.f13076r.mo23709d(next);
                String str = this.f13072n;
                C6792d1.m14476a(4, str, "Number of not sent blocks = " + d.size());
                for (String next2 : d) {
                    if (!this.f13075q.contains(next2)) {
                        if (!m14789e()) {
                            break;
                        }
                        C6980q0 a2 = C6980q0.m14829b(next2).mo23567a();
                        if (a2 == null) {
                            C6792d1.m14476a(6, this.f13072n, "Internal ERROR! Cannot read!");
                            this.f13076r.mo23706a(next2, next);
                        } else {
                            ? r6 = a2.f13121b;
                            if (r6 == 0 || r6.length == 0) {
                                C6792d1.m14476a(6, this.f13072n, "Internal ERROR! Report is empty!");
                                this.f13076r.mo23706a(next2, next);
                            } else {
                                C6792d1.m14476a(5, this.f13072n, "Reading block info ".concat(String.valueOf(next2)));
                                this.f13075q.add(next2);
                                String d2 = mo23684d();
                                String str2 = this.f13072n;
                                C6792d1.m14476a(4, str2, "FlurryDataSender: start upload data with id = " + next2 + " to " + d2);
                                C6865i1 i1Var = new C6865i1();
                                i1Var.f12908l = d2;
                                i1Var.f12783h = 100000;
                                i1Var.f12909m = C6897k1.C6900c.kPost;
                                i1Var.mo23632a("Content-Type", "application/octet-stream");
                                i1Var.mo23632a("X-Flurry-Api-Key", C6896k0.m14646c().mo23630a());
                                i1Var.f12845F = new C7003r1();
                                i1Var.f12846G = new C7066w1();
                                i1Var.f12843D = r6;
                                C6778d dVar = C6812e7.m14513a().f12703h;
                                i1Var.f12922z = dVar != null && dVar.f12620q;
                                i1Var.f12842C = new C6966d(next2, d2, next);
                                C7088y0.m15035a().mo23549a(this, i1Var);
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo23684d();

    /* renamed from: a */
    public final void mo23570a() {
        C6997r0 r0Var = this.f13076r;
        String str = r0Var.f13146a;
        ArrayList<String> arrayList = new ArrayList<>();
        File fileStreamPath = C6747b0.m14386a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        C6792d1.m14476a(5, "FlurryDataSenderIndex", "isOldIndexFilePresent: for " + str + fileStreamPath.exists());
        if (fileStreamPath.exists()) {
            List<String> a = r0Var.mo23704a(str);
            if (a != null && a.size() > 0) {
                arrayList.addAll(a);
                for (String b : arrayList) {
                    r0Var.mo23707b(b);
                }
            }
            C6997r0.m14854e(str);
        } else {
            List<C7012s0> list = (List) new C6777c7(C6747b0.m14386a().getFileStreamPath(C6997r0.m14855f(r0Var.f13146a)), str, 1, new C6997r0.C6998a(r0Var)).mo23567a();
            if (list == null) {
                C6792d1.m14485c("FlurryDataSenderIndex", "New main file also not found. returning..");
                mo23681b();
            }
            for (C7012s0 s0Var : list) {
                arrayList.add(s0Var.f13155a);
            }
        }
        for (String str2 : arrayList) {
            List<String> c = r0Var.mo23708c(str2);
            if (c != null && !c.isEmpty()) {
                r0Var.f13147b.put(str2, c);
            }
        }
        mo23681b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23682b(byte[] bArr, String str, String str2) {
        String str3 = this.f13073o + str + "_" + str2;
        C6980q0 q0Var = new C6980q0(bArr);
        String str4 = q0Var.f13120a;
        C6980q0.m14829b(str4).mo23568a(q0Var);
        C6792d1.m14476a(5, this.f13072n, "Saving Block File " + str4 + " at " + C6747b0.m14386a().getFileStreamPath(C6980q0.m14828a(str4)));
        this.f13076r.mo23705a(q0Var, str3);
    }

    /* renamed from: a */
    public final void mo23679a(C6950o0 o0Var) {
        this.f13074p = o0Var;
    }

    /* renamed from: a */
    public final void mo23680a(byte[] bArr, String str, String str2) {
        if (bArr == null || bArr.length == 0) {
            C6792d1.m14476a(6, this.f13072n, "Report that has to be sent is EMPTY or NULL");
            return;
        }
        mo23563c(new C6964b(bArr, str, str2));
        mo23681b();
    }

    /* renamed from: a */
    static /* synthetic */ String m14787a(String str) {
        if (str != null && str.contains("<body>") && str.contains("</body>")) {
            return str.substring(str.indexOf("<body>") + 6, str.indexOf("</body>"));
        }
        StringBuilder sb = new StringBuilder("Can not parse http error message: ");
        if (str == null) {
            str = "NULL";
        }
        sb.append(str);
        return sb.toString();
    }
}
