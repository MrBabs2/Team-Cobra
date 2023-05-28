package p050l.p075h.p081i;

import android.util.Base64;
import java.util.List;
import p050l.p075h.p083k.C5008h;

/* renamed from: l.h.i.a */
/* compiled from: FontRequest */
public final class C4970a {

    /* renamed from: a */
    private final String f8773a;

    /* renamed from: b */
    private final String f8774b;

    /* renamed from: c */
    private final String f8775c;

    /* renamed from: d */
    private final List<List<byte[]>> f8776d;

    /* renamed from: e */
    private final int f8777e = 0;

    /* renamed from: f */
    private final String f8778f = (this.f8773a + "-" + this.f8774b + "-" + this.f8775c);

    public C4970a(String str, String str2, String str3, List<List<byte[]>> list) {
        C5008h.m8899a(str);
        this.f8773a = str;
        C5008h.m8899a(str2);
        this.f8774b = str2;
        C5008h.m8899a(str3);
        this.f8775c = str3;
        C5008h.m8899a(list);
        this.f8776d = list;
    }

    /* renamed from: a */
    public List<List<byte[]>> mo17384a() {
        return this.f8776d;
    }

    /* renamed from: b */
    public int mo17385b() {
        return this.f8777e;
    }

    /* renamed from: c */
    public String mo17386c() {
        return this.f8778f;
    }

    /* renamed from: d */
    public String mo17387d() {
        return this.f8773a;
    }

    /* renamed from: e */
    public String mo17388e() {
        return this.f8774b;
    }

    /* renamed from: f */
    public String mo17389f() {
        return this.f8775c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f8773a + ", mProviderPackage: " + this.f8774b + ", mQuery: " + this.f8775c + ", mCertificates:");
        for (int i = 0; i < this.f8776d.size(); i++) {
            sb.append(" [");
            List list = this.f8776d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f8777e);
        return sb.toString();
    }
}
