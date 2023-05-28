package kotlinx.coroutines;

import kotlin.C10483v;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.p393g2.C12228m;
import kotlinx.coroutines.p393g2.C12234s;

/* renamed from: kotlinx.coroutines.d2 */
/* compiled from: Builders.common.kt */
final class C12193d2<T> extends C12228m<T> {
    public C12193d2(C9069g gVar, C9064d<? super T> dVar) {
        super(gVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo38817e(Object obj) {
        Object a = C12306s.m40632a(obj, this.f32002i);
        C9069g context = this.f32002i.getContext();
        Object b = C12234s.m40334b(context, (Object) null);
        try {
            this.f32002i.resumeWith(a);
            C10483v vVar = C10483v.f28357a;
        } finally {
            C12234s.m40333a(context, b);
        }
    }
}
