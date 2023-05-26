package com.aptoide.authentication.mock;

import com.aptoide.authentication.service.AuthenticationService;
import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo16641d2 = {"Lcom/aptoide/authentication/mock/MockAuthenticationService;", "Lcom/aptoide/authentication/service/AuthenticationService;", "()V", "authenticate", "Lcom/aptoide/authentication/model/OAuth2;", "magicToken", "", "state", "agent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMagicLink", "Lcom/aptoide/authentication/model/CodeAuth;", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: MockAuthenticationService.kt */
public final class MockAuthenticationService implements AuthenticationService {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object authenticate(java.lang.String r7, java.lang.String r8, java.lang.String r9, kotlin.p042a0.C9064d<? super com.aptoide.authentication.model.OAuth2> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.aptoide.authentication.mock.MockAuthenticationService$authenticate$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.aptoide.authentication.mock.MockAuthenticationService$authenticate$1 r0 = (com.aptoide.authentication.mock.MockAuthenticationService$authenticate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.aptoide.authentication.mock.MockAuthenticationService$authenticate$1 r0 = new com.aptoide.authentication.mock.MockAuthenticationService$authenticate$1
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.p042a0.p211i.C9081d.m29785a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r7 = r0.L$3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            com.aptoide.authentication.mock.MockAuthenticationService r7 = (com.aptoide.authentication.mock.MockAuthenticationService) r7
            kotlin.C10225p.m34214a((java.lang.Object) r10)
            goto L_0x0057
        L_0x0039:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0041:
            kotlin.C10225p.m34214a((java.lang.Object) r10)
            r4 = 200(0xc8, double:9.9E-322)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.C12287n0.m40508a(r4, r0)
            if (r7 != r1) goto L_0x0057
            return r1
        L_0x0057:
            com.aptoide.authentication.model.OAuth2 r7 = new com.aptoide.authentication.model.OAuth2
            r8 = 0
            com.aptoide.authentication.model.OAuth2$Data r9 = new com.aptoide.authentication.model.OAuth2$Data
            r2 = 3000(0xbb8, float:4.204E-42)
            r5 = 0
            java.lang.String r1 = "accesst0k3nF4k3"
            java.lang.String r3 = "r3fr3shT0k3nF4k3"
            java.lang.String r4 = "Bearer"
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r10 = "OAUTH2"
            r7.<init>(r10, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aptoide.authentication.mock.MockAuthenticationService.authenticate(java.lang.String, java.lang.String, java.lang.String, kotlin.a0.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object sendMagicLink(java.lang.String r10, kotlin.p042a0.C9064d<? super com.aptoide.authentication.model.CodeAuth> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.aptoide.authentication.mock.MockAuthenticationService$sendMagicLink$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.aptoide.authentication.mock.MockAuthenticationService$sendMagicLink$1 r0 = (com.aptoide.authentication.mock.MockAuthenticationService$sendMagicLink$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.aptoide.authentication.mock.MockAuthenticationService$sendMagicLink$1 r0 = new com.aptoide.authentication.mock.MockAuthenticationService$sendMagicLink$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.p042a0.p211i.C9081d.m29785a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.L$0
            com.aptoide.authentication.mock.MockAuthenticationService r10 = (com.aptoide.authentication.mock.MockAuthenticationService) r10
            kotlin.C10225p.m34214a((java.lang.Object) r11)
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            kotlin.C10225p.m34214a((java.lang.Object) r11)
            r4 = 200(0xc8, double:9.9E-322)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r3
            java.lang.Object r10 = kotlinx.coroutines.C12287n0.m40508a(r4, r0)
            if (r10 != r1) goto L_0x004b
            return r1
        L_0x004b:
            com.aptoide.authentication.model.CodeAuth r10 = new com.aptoide.authentication.model.CodeAuth
            r6 = 0
            com.aptoide.authentication.model.CodeAuth$Data r7 = new com.aptoide.authentication.model.CodeAuth$Data
            java.lang.String r11 = "TOKEN"
            java.lang.String r0 = "EMAIL"
            r7.<init>(r11, r0)
            java.lang.String r3 = "code"
            java.lang.String r4 = "estado de arte"
            java.lang.String r5 = "agente da pejota"
            java.lang.String r8 = "filipo@emailo.como"
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aptoide.authentication.mock.MockAuthenticationService.sendMagicLink(java.lang.String, kotlin.a0.d):java.lang.Object");
    }
}
