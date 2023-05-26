package retrofit2;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.p043j.p044a.C9087g;
import kotlinx.coroutines.C12247i;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0003H@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a+\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0003H@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u001a\u0010\b\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\tH\b¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00060\rj\u0002`\u000eH@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo16641d2 = {"await", "T", "", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "awaitResponse", "Lretrofit2/Response;", "create", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "suspendAndThrow", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, mo16642k = 2, mo16643mv = {1, 1, 15})
/* compiled from: KotlinExtensions.kt */
public final class KotlinExtensions {
    public static final <T> Object await(Call<T> call, C9064d<? super T> dVar) {
        C12247i iVar = new C12247i(C9078c.m29783a(dVar), 1);
        iVar.mo38923a(new C12443x19835f10(call));
        call.enqueue(new KotlinExtensions$await$2$2(iVar));
        Object d = iVar.mo38934d();
        if (d == C9081d.m29785a()) {
            C9087g.m29792c(dVar);
        }
        return d;
    }

    public static final <T> Object awaitNullable(Call<T> call, C9064d<? super T> dVar) {
        C12247i iVar = new C12247i(C9078c.m29783a(dVar), 1);
        iVar.mo38923a(new C12444x19835f11(call));
        call.enqueue(new KotlinExtensions$await$4$2(iVar));
        Object d = iVar.mo38934d();
        if (d == C9081d.m29785a()) {
            C9087g.m29792c(dVar);
        }
        return d;
    }

    public static final <T> Object awaitResponse(Call<T> call, C9064d<? super Response<T>> dVar) {
        C12247i iVar = new C12247i(C9078c.m29783a(dVar), 1);
        iVar.mo38923a(new C12445xc95e9eb1(call));
        call.enqueue(new KotlinExtensions$awaitResponse$2$2(iVar));
        Object d = iVar.mo38934d();
        if (d == C9081d.m29785a()) {
            C9087g.m29792c(dVar);
        }
        return d;
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        C10202j.m34178b(retrofit, "$this$create");
        C10202j.m34173a(4, "T");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object suspendAndThrow(java.lang.Exception r4, kotlin.p042a0.C9064d<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.p042a0.p211i.C9081d.m29785a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            java.lang.Exception r4 = (java.lang.Exception) r4
            kotlin.C10225p.m34214a((java.lang.Object) r5)
            goto L_0x005c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.C10225p.m34214a((java.lang.Object) r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.y r5 = kotlinx.coroutines.C12310t0.m40640a()
            kotlin.a0.g r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
            r3.<init>(r0, r4)
            r5.mo38845a(r2, r3)
            java.lang.Object r4 = kotlin.p042a0.p211i.C9081d.m29785a()
            java.lang.Object r5 = kotlin.p042a0.p211i.C9081d.m29785a()
            if (r4 != r5) goto L_0x0059
            kotlin.p042a0.p043j.p044a.C9087g.m29792c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            kotlin.v r4 = kotlin.C10483v.f28357a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Exception, kotlin.a0.d):java.lang.Object");
    }
}
