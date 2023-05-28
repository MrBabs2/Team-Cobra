package retrofit2;

import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo16641d2 = {"<anonymous>", "", "T", "", "it", "", "invoke", "retrofit2/KotlinExtensions$await$4$1"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* renamed from: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2 */
/* compiled from: KotlinExtensions.kt */
final class C12444x19835f11 extends C10203k implements C9113l<Throwable, C10483v> {
    final /* synthetic */ Call $this_await$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C12444x19835f11(Call call) {
        super(1);
        this.$this_await$inlined = call;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C10483v.f28357a;
    }

    public final void invoke(Throwable th) {
        this.$this_await$inlined.cancel();
    }
}
