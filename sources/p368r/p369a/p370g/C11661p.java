package p368r.p369a.p370g;

import p368r.p369a.C11592a;
import p368r.p369a.C11597c;
import p368r.p369a.C11598d;

/* renamed from: r.a.g.p */
/* compiled from: ServiceEventImpl */
public class C11661p extends C11597c {

    /* renamed from: f */
    private final String f31085f;

    /* renamed from: g */
    private final String f31086g;

    /* renamed from: h */
    private final C11598d f31087h;

    public C11661p(C11639l lVar, String str, String str2, C11598d dVar) {
        super(lVar);
        this.f31085f = str;
        this.f31086g = str2;
        this.f31087h = dVar;
    }

    /* renamed from: b */
    public C11592a mo37846b() {
        return (C11592a) getSource();
    }

    /* renamed from: c */
    public C11598d mo37847c() {
        return this.f31087h;
    }

    /* renamed from: e */
    public String mo37849e() {
        return this.f31086g;
    }

    /* renamed from: f */
    public String mo37850f() {
        return this.f31085f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + C11661p.class.getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("\n\tname: '");
        sb.append(mo37849e());
        sb.append("' type: '");
        sb.append(mo37850f());
        sb.append("' info: '");
        sb.append(mo37847c());
        sb.append("']");
        return sb.toString();
    }

    public C11661p clone() {
        return new C11661p((C11639l) mo37846b(), mo37850f(), mo37849e(), new C11662q(mo37847c()));
    }
}
