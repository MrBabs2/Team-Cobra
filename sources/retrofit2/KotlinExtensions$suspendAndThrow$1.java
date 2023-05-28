package retrofit2;

import kotlin.C4789l;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.p043j.p044a.C4782e;
import kotlin.p042a0.p043j.p044a.C9084c;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, mo16641d2 = {"suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo16642k = 3, mo16643mv = {1, 1, 15})
@C4782e(mo16621c = "retrofit2.KotlinExtensions", mo16622f = "KotlinExtensions.kt", mo16623l = {113}, mo16624m = "suspendAndThrow")
/* compiled from: KotlinExtensions.kt */
final class KotlinExtensions$suspendAndThrow$1 extends C9084c {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    KotlinExtensions$suspendAndThrow$1(C9064d dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KotlinExtensions.suspendAndThrow((Exception) null, this);
    }
}
