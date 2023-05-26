package kotlinx.coroutines.p393g2;

import kotlin.p042a0.C9069g;

/* renamed from: kotlinx.coroutines.g2.v */
/* compiled from: ThreadContext.kt */
final class C12241v {

    /* renamed from: a */
    private Object[] f32016a;

    /* renamed from: b */
    private int f32017b;

    /* renamed from: c */
    private final C9069g f32018c;

    public C12241v(C9069g gVar, int i) {
        this.f32018c = gVar;
        this.f32016a = new Object[i];
    }

    /* renamed from: a */
    public final C9069g mo38919a() {
        return this.f32018c;
    }

    /* renamed from: b */
    public final void mo38921b() {
        this.f32017b = 0;
    }

    /* renamed from: c */
    public final Object mo38922c() {
        Object[] objArr = this.f32016a;
        int i = this.f32017b;
        this.f32017b = i + 1;
        return objArr[i];
    }

    /* renamed from: a */
    public final void mo38920a(Object obj) {
        Object[] objArr = this.f32016a;
        int i = this.f32017b;
        this.f32017b = i + 1;
        objArr[i] = obj;
    }
}
