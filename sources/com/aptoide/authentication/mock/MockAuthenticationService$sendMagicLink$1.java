package com.aptoide.authentication.mock;

import kotlin.C4789l;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.p043j.p044a.C4782e;
import kotlin.p042a0.p043j.p044a.C9084c;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@"}, mo16641d2 = {"sendMagicLink", "", "email", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/aptoide/authentication/model/CodeAuth;"}, mo16642k = 3, mo16643mv = {1, 1, 16})
@C4782e(mo16621c = "com.aptoide.authentication.mock.MockAuthenticationService", mo16622f = "MockAuthenticationService.kt", mo16623l = {11}, mo16624m = "sendMagicLink")
/* compiled from: MockAuthenticationService.kt */
final class MockAuthenticationService$sendMagicLink$1 extends C9084c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MockAuthenticationService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MockAuthenticationService$sendMagicLink$1(MockAuthenticationService mockAuthenticationService, C9064d dVar) {
        super(dVar);
        this.this$0 = mockAuthenticationService;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendMagicLink((String) null, this);
    }
}
