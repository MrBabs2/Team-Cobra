package kotlinx.coroutines.p393g2;

import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.p043j.p044a.C9085d;
import kotlinx.coroutines.C12174a;
import kotlinx.coroutines.C12295p0;
import kotlinx.coroutines.C12306s;

/* renamed from: kotlinx.coroutines.g2.m */
/* compiled from: Scopes.kt */
public class C12228m<T> extends C12174a<T> implements C9085d {

    /* renamed from: i */
    public final C9064d<T> f32002i;

    public C12228m(C9069g gVar, C9064d<? super T> dVar) {
        super(gVar, true);
        this.f32002i = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38900a(Object obj) {
        C12295p0.m40532a(C9078c.m29783a(this.f32002i), C12306s.m40632a(obj, this.f32002i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo38817e(Object obj) {
        C9064d<T> dVar = this.f32002i;
        dVar.resumeWith(C12306s.m40632a(obj, dVar));
    }

    public final C9085d getCallerFrame() {
        return (C9085d) this.f32002i;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo38901j() {
        return true;
    }
}
