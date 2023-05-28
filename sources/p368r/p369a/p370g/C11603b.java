package p368r.p369a.p370g;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p368r.p369a.C11598d;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11670e;

/* renamed from: r.a.g.b */
/* compiled from: DNSEntry */
public abstract class C11603b {

    /* renamed from: a */
    private final String f30943a;

    /* renamed from: b */
    private final String f30944b;

    /* renamed from: c */
    private final String f30945c;

    /* renamed from: d */
    private final C11670e f30946d;

    /* renamed from: e */
    private final C11669d f30947e;

    /* renamed from: f */
    private final boolean f30948f;

    /* renamed from: g */
    final Map<C11598d.C11599a, String> f30949g;

    C11603b(String str, C11670e eVar, C11669d dVar, boolean z) {
        String str2;
        String str3;
        this.f30944b = str;
        this.f30946d = eVar;
        this.f30947e = dVar;
        this.f30948f = z;
        Map<C11598d.C11599a, String> c = C11662q.m38323c(mo37889b());
        this.f30949g = c;
        String str4 = c.get(C11598d.C11599a.Domain);
        String str5 = this.f30949g.get(C11598d.C11599a.Protocol);
        String str6 = this.f30949g.get(C11598d.C11599a.Application);
        String lowerCase = this.f30949g.get(C11598d.C11599a.Instance).toLowerCase();
        StringBuilder sb = new StringBuilder();
        String str7 = "";
        if (str6.length() > 0) {
            str2 = "_" + str6 + ".";
        } else {
            str2 = str7;
        }
        sb.append(str2);
        if (str5.length() > 0) {
            str3 = "_" + str5 + ".";
        } else {
            str3 = str7;
        }
        sb.append(str3);
        sb.append(str4);
        sb.append(".");
        this.f30945c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        if (lowerCase.length() > 0) {
            str7 = lowerCase + ".";
        }
        sb2.append(str7);
        sb2.append(this.f30945c);
        this.f30943a = sb2.toString().toLowerCase();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37885a(StringBuilder sb) {
    }

    /* renamed from: a */
    public abstract boolean mo37886a(long j);

    /* renamed from: a */
    public boolean mo37887a(C11669d dVar) {
        C11669d dVar2 = C11669d.CLASS_ANY;
        return dVar2 == dVar || dVar2 == mo37893d() || mo37893d().equals(dVar);
    }

    /* renamed from: b */
    public boolean mo37890b(C11603b bVar) {
        return mo37883a().equals(bVar.mo37883a()) && mo37888a(bVar.mo37895e()) && mo37887a(bVar.mo37893d());
    }

    /* renamed from: c */
    public Map<C11598d.C11599a, String> mo37891c() {
        return Collections.unmodifiableMap(this.f30949g);
    }

    /* renamed from: d */
    public C11669d mo37893d() {
        C11669d dVar = this.f30947e;
        return dVar != null ? dVar : C11669d.CLASS_UNKNOWN;
    }

    /* renamed from: e */
    public boolean mo37896e(C11603b bVar) {
        return mo37898f().equals(bVar.mo37898f());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11603b)) {
            return false;
        }
        C11603b bVar = (C11603b) obj;
        if (!mo37883a().equals(bVar.mo37883a()) || !mo37895e().equals(bVar.mo37895e()) || mo37893d() != bVar.mo37893d()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo37898f() {
        String str = mo37891c().get(C11598d.C11599a.Subtype);
        return str != null ? str : "";
    }

    /* renamed from: g */
    public String mo37899g() {
        String str = this.f30945c;
        return str != null ? str : "";
    }

    /* renamed from: h */
    public boolean mo37900h() {
        if (!this.f30949g.get(C11598d.C11599a.Application).equals("dns-sd")) {
            return false;
        }
        String str = this.f30949g.get(C11598d.C11599a.Instance);
        if ("b".equals(str) || "db".equals(str) || "r".equals(str) || "dr".equals(str) || "lb".equals(str)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return mo37883a().hashCode() + mo37895e().mo38196a() + mo37893d().mo38193a();
    }

    /* renamed from: i */
    public boolean mo37902i() {
        return mo37905l() || mo37906m();
    }

    /* renamed from: j */
    public boolean mo37903j() {
        return this.f30949g.get(C11598d.C11599a.Application).equals("dns-sd") && this.f30949g.get(C11598d.C11599a.Instance).equals("_services");
    }

    /* renamed from: k */
    public boolean mo37904k() {
        return this.f30948f;
    }

    /* renamed from: l */
    public boolean mo37905l() {
        return this.f30949g.get(C11598d.C11599a.Domain).endsWith("in-addr.arpa");
    }

    /* renamed from: m */
    public boolean mo37906m() {
        return this.f30949g.get(C11598d.C11599a.Domain).endsWith("ip6.arpa");
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public byte[] mo37907n() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            mo37884a(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" type: ");
        sb2.append(mo37895e());
        sb.append(sb2.toString());
        sb.append(", class: " + mo37893d());
        sb.append(this.f30948f ? "-unique," : ",");
        sb.append(" name: " + this.f30944b);
        mo37885a(sb);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo37888a(C11670e eVar) {
        return mo37895e().equals(eVar);
    }

    /* renamed from: b */
    public String mo37889b() {
        String str = this.f30944b;
        return str != null ? str : "";
    }

    /* renamed from: c */
    public boolean mo37892c(C11603b bVar) {
        return bVar != null && bVar.mo37893d() == mo37893d();
    }

    /* renamed from: d */
    public boolean mo37894d(C11603b bVar) {
        return bVar != null && bVar.mo37895e() == mo37895e();
    }

    /* renamed from: e */
    public C11670e mo37895e() {
        C11670e eVar = this.f30946d;
        return eVar != null ? eVar : C11670e.TYPE_IGNORE;
    }

    /* renamed from: a */
    public String mo37883a() {
        String str = this.f30943a;
        return str != null ? str : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo37884a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(mo37889b().getBytes("UTF8"));
        dataOutputStream.writeShort(mo37895e().mo38196a());
        dataOutputStream.writeShort(mo37893d().mo38193a());
    }

    /* renamed from: a */
    public int mo37882a(C11603b bVar) {
        byte[] n = mo37907n();
        byte[] n2 = bVar.mo37907n();
        int min = Math.min(n.length, n2.length);
        for (int i = 0; i < min; i++) {
            if (n[i] > n2[i]) {
                return 1;
            }
            if (n[i] < n2[i]) {
                return -1;
            }
        }
        return n.length - n2.length;
    }
}
