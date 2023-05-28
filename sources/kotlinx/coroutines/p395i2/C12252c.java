package kotlinx.coroutines.p395i2;

import kotlin.p042a0.C9069g;
import kotlinx.coroutines.C12174a;
import p120q.p326a.C11497x;

/* renamed from: kotlinx.coroutines.i2.c */
/* compiled from: RxSingle.kt */
final class C12252c<T> extends C12174a<T> {

    /* renamed from: i */
    private final C11497x<T> f32031i;

    public C12252c(C9069g gVar, C11497x<T> xVar) {
        super(gVar, true);
        this.f32031i = xVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38811a(Throwable th, boolean z) {
        try {
            if (!this.f32031i.mo37082a(th)) {
                C12251b.m40401a(th, getContext());
            }
        } catch (Throwable th2) {
            C12251b.m40401a(th2, getContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo38818f(T t) {
        try {
            this.f32031i.onSuccess(t);
        } catch (Throwable th) {
            C12251b.m40401a(th, getContext());
        }
    }
}
