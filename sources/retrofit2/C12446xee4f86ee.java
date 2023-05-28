package retrofit2;

import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.C4789l;
import kotlin.p042a0.C9064d;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo16641d2 = {"<anonymous>", "", "run", "retrofit2/KotlinExtensions$suspendAndThrow$2$1"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* renamed from: retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 */
/* compiled from: KotlinExtensions.kt */
final class C12446xee4f86ee implements Runnable {
    final /* synthetic */ C9064d $continuation;
    final /* synthetic */ Exception $this_suspendAndThrow$inlined;

    C12446xee4f86ee(C9064d dVar, Exception exc) {
        this.$continuation = dVar;
        this.$this_suspendAndThrow$inlined = exc;
    }

    public final void run() {
        C9064d a = C9078c.m29783a(this.$continuation);
        Exception exc = this.$this_suspendAndThrow$inlined;
        C10222o.C10223a aVar = C10222o.f27863f;
        Object a2 = C10225p.m34213a((Throwable) exc);
        C10222o.m34210a(a2);
        a.resumeWith(a2);
    }
}
