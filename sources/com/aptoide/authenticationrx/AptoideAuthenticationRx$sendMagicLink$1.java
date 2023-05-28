package com.aptoide.authenticationrx;

import com.aptoide.authentication.AptoideAuthentication;
import com.aptoide.authentication.model.CodeAuth;
import kotlin.C10225p;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.p043j.p044a.C4782e;
import kotlin.p042a0.p043j.p044a.C9091j;
import kotlin.p215c0.p216c.C9117p;
import kotlinx.coroutines.C12191d0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, mo16641d2 = {"<anonymous>", "Lcom/aptoide/authentication/model/CodeAuth;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo16642k = 3, mo16643mv = {1, 1, 16})
@C4782e(mo16621c = "com.aptoide.authenticationrx.AptoideAuthenticationRx$sendMagicLink$1", mo16622f = "AptoideAuthenticationRx.kt", mo16623l = {11}, mo16624m = "invokeSuspend")
/* compiled from: AptoideAuthenticationRx.kt */
final class AptoideAuthenticationRx$sendMagicLink$1 extends C9091j implements C9117p<C12191d0, C9064d<? super CodeAuth>, Object> {
    final /* synthetic */ String $email;
    Object L$0;
    int label;

    /* renamed from: p$ */
    private C12191d0 f10527p$;
    final /* synthetic */ AptoideAuthenticationRx this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AptoideAuthenticationRx$sendMagicLink$1(AptoideAuthenticationRx aptoideAuthenticationRx, String str, C9064d dVar) {
        super(2, dVar);
        this.this$0 = aptoideAuthenticationRx;
        this.$email = str;
    }

    public final C9064d<C10483v> create(Object obj, C9064d<?> dVar) {
        C10202j.m34178b(dVar, "completion");
        AptoideAuthenticationRx$sendMagicLink$1 aptoideAuthenticationRx$sendMagicLink$1 = new AptoideAuthenticationRx$sendMagicLink$1(this.this$0, this.$email, dVar);
        aptoideAuthenticationRx$sendMagicLink$1.f10527p$ = (C12191d0) obj;
        return aptoideAuthenticationRx$sendMagicLink$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AptoideAuthenticationRx$sendMagicLink$1) create(obj, (C9064d) obj2)).invokeSuspend(C10483v.f28357a);
    }

    public final Object invokeSuspend(Object obj) {
        Object a = C9081d.m29785a();
        int i = this.label;
        if (i == 0) {
            C10225p.m34214a(obj);
            C12191d0 d0Var = this.f10527p$;
            AptoideAuthentication access$getAptoideAuthentication$p = this.this$0.aptoideAuthentication;
            String str = this.$email;
            this.L$0 = d0Var;
            this.label = 1;
            obj = access$getAptoideAuthentication$p.sendMagicLink(str, this);
            if (obj == a) {
                return a;
            }
        } else if (i == 1) {
            C12191d0 d0Var2 = (C12191d0) this.L$0;
            C10225p.m34214a(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
