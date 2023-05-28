package p368r.p369a.p370g.p372t;

import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.TimerTask;
import p368r.p369a.p370g.C11604c;
import p368r.p369a.p370g.C11609f;
import p368r.p369a.p370g.C11611g;
import p368r.p369a.p370g.C11620h;
import p368r.p369a.p370g.C11639l;

/* renamed from: r.a.g.t.a */
/* compiled from: DNSTask */
public abstract class C11675a extends TimerTask {

    /* renamed from: f */
    private final C11639l f31234f;

    protected C11675a(C11639l lVar) {
        this.f31234f = lVar;
    }

    /* renamed from: a */
    public C11639l mo38214a() {
        return this.f31234f;
    }

    /* renamed from: b */
    public abstract String mo38215b();

    public String toString() {
        return mo38215b();
    }

    /* renamed from: a */
    public C11609f mo38211a(C11609f fVar, C11611g gVar) throws IOException {
        try {
            fVar.mo37948a(gVar);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo37930e();
            boolean o = fVar.mo37940o();
            int x = fVar.mo37955x();
            int f = fVar.mo37931f();
            fVar.mo37925a(e | AdRequest.MAX_CONTENT_URL_LENGTH);
            fVar.mo37927b(f);
            this.f31234f.mo38100a(fVar);
            C11609f fVar2 = new C11609f(e, o, x);
            fVar2.mo37948a(gVar);
            return fVar2;
        }
    }

    /* renamed from: a */
    public C11609f mo38210a(C11609f fVar, C11604c cVar, C11620h hVar) throws IOException {
        try {
            fVar.mo37947a(cVar, hVar);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo37930e();
            boolean o = fVar.mo37940o();
            int x = fVar.mo37955x();
            int f = fVar.mo37931f();
            fVar.mo37925a(e | AdRequest.MAX_CONTENT_URL_LENGTH);
            fVar.mo37927b(f);
            this.f31234f.mo38100a(fVar);
            C11609f fVar2 = new C11609f(e, o, x);
            fVar2.mo37947a(cVar, hVar);
            return fVar2;
        }
    }

    /* renamed from: a */
    public C11609f mo38213a(C11609f fVar, C11620h hVar, long j) throws IOException {
        try {
            fVar.mo37950a(hVar, j);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo37930e();
            boolean o = fVar.mo37940o();
            int x = fVar.mo37955x();
            int f = fVar.mo37931f();
            fVar.mo37925a(e | AdRequest.MAX_CONTENT_URL_LENGTH);
            fVar.mo37927b(f);
            this.f31234f.mo38100a(fVar);
            C11609f fVar2 = new C11609f(e, o, x);
            fVar2.mo37950a(hVar, j);
            return fVar2;
        }
    }

    /* renamed from: a */
    public C11609f mo38212a(C11609f fVar, C11620h hVar) throws IOException {
        try {
            fVar.mo37949a(hVar);
            return fVar;
        } catch (IOException unused) {
            int e = fVar.mo37930e();
            boolean o = fVar.mo37940o();
            int x = fVar.mo37955x();
            int f = fVar.mo37931f();
            fVar.mo37925a(e | AdRequest.MAX_CONTENT_URL_LENGTH);
            fVar.mo37927b(f);
            this.f31234f.mo38100a(fVar);
            C11609f fVar2 = new C11609f(e, o, x);
            fVar2.mo37949a(hVar);
            return fVar2;
        }
    }
}
