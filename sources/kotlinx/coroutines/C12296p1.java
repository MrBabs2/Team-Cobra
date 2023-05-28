package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlinx.coroutines.C12277k1;

/* renamed from: kotlinx.coroutines.p1 */
/* compiled from: JobSupport.kt */
public abstract class C12296p1<J extends C12277k1> extends C12315v implements C12313u0, C12201f1 {

    /* renamed from: i */
    public final J f32112i;

    public C12296p1(J j) {
        this.f32112i = j;
    }

    /* renamed from: b */
    public boolean mo38848b() {
        return true;
    }

    /* renamed from: c */
    public C12311t1 mo38849c() {
        return null;
    }

    public void dispose() {
        J j = this.f32112i;
        if (j != null) {
            ((C12299q1) j).mo39006a((C12296p1<?>) this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    }
}
