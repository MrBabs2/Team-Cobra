package androidx.work.impl.utils;

import androidx.work.C0964l;
import androidx.work.C0974p;
import androidx.work.impl.C0839b;
import androidx.work.impl.C0860d;
import androidx.work.impl.C0861e;
import androidx.work.impl.C0868h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012l.C0899b;
import androidx.work.impl.p012l.C0914k;
import java.util.LinkedList;

/* renamed from: androidx.work.impl.utils.a */
/* compiled from: CancelWorkRunnable */
public abstract class C0931a implements Runnable {

    /* renamed from: f */
    private final C0839b f3243f = new C0839b();

    /* renamed from: androidx.work.impl.utils.a$a */
    /* compiled from: CancelWorkRunnable */
    static class C0932a extends C0931a {

        /* renamed from: g */
        final /* synthetic */ C0868h f3244g;

        /* renamed from: h */
        final /* synthetic */ String f3245h;

        C0932a(C0868h hVar, String str) {
            this.f3244g = hVar;
            this.f3245h = str;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4921b() {
            WorkDatabase f = this.f3244g.mo4808f();
            f.beginTransaction();
            try {
                for (String a : f.mo4734d().mo4906f(this.f3245h)) {
                    mo4920a(this.f3244g, a);
                }
                f.setTransactionSuccessful();
                f.endTransaction();
                mo4919a(this.f3244g);
            } catch (Throwable th) {
                f.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.a$b */
    /* compiled from: CancelWorkRunnable */
    static class C0933b extends C0931a {

        /* renamed from: g */
        final /* synthetic */ C0868h f3246g;

        /* renamed from: h */
        final /* synthetic */ String f3247h;

        /* renamed from: i */
        final /* synthetic */ boolean f3248i;

        C0933b(C0868h hVar, String str, boolean z) {
            this.f3246g = hVar;
            this.f3247h = str;
            this.f3248i = z;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4921b() {
            WorkDatabase f = this.f3246g.mo4808f();
            f.beginTransaction();
            try {
                for (String a : f.mo4734d().mo4898b(this.f3247h)) {
                    mo4920a(this.f3246g, a);
                }
                f.setTransactionSuccessful();
                f.endTransaction();
                if (this.f3248i) {
                    mo4919a(this.f3246g);
                }
            } catch (Throwable th) {
                f.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public C0964l mo4918a() {
        return this.f3243f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo4921b();

    public void run() {
        try {
            mo4921b();
            this.f3243f.mo4737a(C0964l.f3320a);
        } catch (Throwable th) {
            this.f3243f.mo4737a(new C0964l.C0966b.C0967a(th));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4920a(C0868h hVar, String str) {
        m4054a(hVar.mo4808f(), str);
        hVar.mo4805d().mo4781d(str);
        for (C0860d cancel : hVar.mo4807e()) {
            cancel.cancel(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4919a(C0868h hVar) {
        C0861e.m3833a(hVar.mo4801b(), hVar.mo4808f(), hVar.mo4807e());
    }

    /* renamed from: a */
    private void m4054a(WorkDatabase workDatabase, String str) {
        C0914k d = workDatabase.mo4734d();
        C0899b a = workDatabase.mo4731a();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C0974p c = d.mo4900c(str2);
            if (!(c == C0974p.SUCCEEDED || c == C0974p.FAILED)) {
                d.mo4890a(C0974p.CANCELLED, str2);
            }
            linkedList.addAll(a.mo4866a(str2));
        }
    }

    /* renamed from: a */
    public static C0931a m4052a(String str, C0868h hVar) {
        return new C0932a(hVar, str);
    }

    /* renamed from: a */
    public static C0931a m4053a(String str, C0868h hVar, boolean z) {
        return new C0933b(hVar, str, z);
    }
}
