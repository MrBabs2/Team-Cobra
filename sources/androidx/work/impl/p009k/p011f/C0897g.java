package androidx.work.impl.p009k.p011f;

import android.content.Context;
import androidx.work.impl.utils.p014k.C0956a;

/* renamed from: androidx.work.impl.k.f.g */
/* compiled from: Trackers */
public class C0897g {

    /* renamed from: e */
    private static C0897g f3185e;

    /* renamed from: a */
    private C0887a f3186a;

    /* renamed from: b */
    private C0888b f3187b;

    /* renamed from: c */
    private C0893e f3188c;

    /* renamed from: d */
    private C0896f f3189d;

    private C0897g(Context context, C0956a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3186a = new C0887a(applicationContext, aVar);
        this.f3187b = new C0888b(applicationContext, aVar);
        this.f3188c = new C0893e(applicationContext, aVar);
        this.f3189d = new C0896f(applicationContext, aVar);
    }

    /* renamed from: a */
    public static synchronized C0897g m3966a(Context context, C0956a aVar) {
        C0897g gVar;
        synchronized (C0897g.class) {
            if (f3185e == null) {
                f3185e = new C0897g(context, aVar);
            }
            gVar = f3185e;
        }
        return gVar;
    }

    /* renamed from: b */
    public C0888b mo4863b() {
        return this.f3187b;
    }

    /* renamed from: c */
    public C0893e mo4864c() {
        return this.f3188c;
    }

    /* renamed from: d */
    public C0896f mo4865d() {
        return this.f3189d;
    }

    /* renamed from: a */
    public C0887a mo4862a() {
        return this.f3186a;
    }
}
