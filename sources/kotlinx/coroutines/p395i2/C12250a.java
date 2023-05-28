package kotlinx.coroutines.p395i2;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C12277k1;
import p120q.p326a.p328c0.C10852f;

/* renamed from: kotlinx.coroutines.i2.a */
/* compiled from: RxCancellable.kt */
public final class C12250a implements C10852f {

    /* renamed from: a */
    private final C12277k1 f32030a;

    public C12250a(C12277k1 k1Var) {
        this.f32030a = k1Var;
    }

    public void cancel() {
        C12277k1.C12278a.m40497a(this.f32030a, (CancellationException) null, 1, (Object) null);
    }
}
