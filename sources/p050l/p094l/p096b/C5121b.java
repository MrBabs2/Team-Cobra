package p050l.p094l.p096b;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p050l.p075h.p083k.C5001a;

/* renamed from: l.l.b.b */
/* compiled from: Loader */
public class C5121b<D> {

    /* renamed from: a */
    int f9039a;

    /* renamed from: b */
    C5123b<D> f9040b;

    /* renamed from: c */
    C5122a<D> f9041c;

    /* renamed from: d */
    boolean f9042d = false;

    /* renamed from: e */
    boolean f9043e = false;

    /* renamed from: f */
    boolean f9044f = true;

    /* renamed from: g */
    boolean f9045g = false;

    /* renamed from: h */
    boolean f9046h = false;

    /* renamed from: l.l.b.b$a */
    /* compiled from: Loader */
    public interface C5122a<D> {
        /* renamed from: a */
        void mo17785a(C5121b<D> bVar);
    }

    /* renamed from: l.l.b.b$b */
    /* compiled from: Loader */
    public interface C5123b<D> {
        /* renamed from: a */
        void mo17735a(C5121b<D> bVar, D d);
    }

    public C5121b(Context context) {
        context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo17767a(int i, C5123b<D> bVar) {
        if (this.f9040b == null) {
            this.f9040b = bVar;
            this.f9039a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: b */
    public void mo17769b(D d) {
        C5123b<D> bVar = this.f9040b;
        if (bVar != null) {
            bVar.mo17735a(this, d);
        }
    }

    /* renamed from: c */
    public void mo17771c() {
        this.f9046h = false;
    }

    /* renamed from: d */
    public void mo17772d() {
        C5122a<D> aVar = this.f9041c;
        if (aVar != null) {
            aVar.mo17785a(this);
        }
    }

    /* renamed from: e */
    public void mo17773e() {
        mo17755j();
    }

    /* renamed from: f */
    public boolean mo17774f() {
        return this.f9043e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo17775g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo17754h() {
        throw null;
    }

    /* renamed from: i */
    public void mo17776i() {
        if (this.f9042d) {
            mo17773e();
        } else {
            this.f9045g = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo17755j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo17777k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo17778l() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo17779m() {
    }

    /* renamed from: n */
    public void mo17780n() {
        mo17777k();
        this.f9044f = true;
        this.f9042d = false;
        this.f9043e = false;
        this.f9045g = false;
        this.f9046h = false;
    }

    /* renamed from: o */
    public void mo17781o() {
        if (this.f9046h) {
            mo17776i();
        }
    }

    /* renamed from: p */
    public final void mo17782p() {
        this.f9042d = true;
        this.f9044f = false;
        this.f9043e = false;
        mo17778l();
    }

    /* renamed from: q */
    public void mo17783q() {
        this.f9042d = false;
        mo17779m();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C5001a.m8886a(this, sb);
        sb.append(" id=");
        sb.append(this.f9039a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: b */
    public boolean mo17770b() {
        return mo17754h();
    }

    /* renamed from: a */
    public void mo17768a(C5123b<D> bVar) {
        C5123b<D> bVar2 = this.f9040b;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f9040b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: a */
    public void mo17766a() {
        this.f9043e = true;
        mo17775g();
    }

    /* renamed from: a */
    public String mo17765a(D d) {
        StringBuilder sb = new StringBuilder(64);
        C5001a.m8886a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public void mo17750a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f9039a);
        printWriter.print(" mListener=");
        printWriter.println(this.f9040b);
        if (this.f9042d || this.f9045g || this.f9046h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f9042d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f9045g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f9046h);
        }
        if (this.f9043e || this.f9044f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f9043e);
            printWriter.print(" mReset=");
            printWriter.println(this.f9044f);
        }
    }
}
