package com.aptoide.authentication;

import com.aptoide.authentication.model.CodeAuth;
import com.aptoide.authentication.model.OAuth2;
import com.aptoide.authentication.service.AuthenticationService;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo16641d2 = {"Lcom/aptoide/authentication/AptoideAuthentication;", "", "service", "Lcom/aptoide/authentication/service/AuthenticationService;", "(Lcom/aptoide/authentication/service/AuthenticationService;)V", "authenticate", "Lcom/aptoide/authentication/model/OAuth2;", "magicCode", "", "state", "agent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMagicLink", "Lcom/aptoide/authentication/model/CodeAuth;", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: AptoideAuthentication.kt */
public final class AptoideAuthentication {
    private final AuthenticationService service;

    public AptoideAuthentication(AuthenticationService authenticationService) {
        C10202j.m34178b(authenticationService, "service");
        this.service = authenticationService;
    }

    public final Object authenticate(String str, String str2, String str3, C9064d<? super OAuth2> dVar) {
        return this.service.authenticate(str, str2, str3, dVar);
    }

    public final Object sendMagicLink(String str, C9064d<? super CodeAuth> dVar) {
        if (!C12130v.m40047a((CharSequence) str)) {
            return this.service.sendMagicLink(str, dVar);
        }
        throw new AuthenticationException("Email is blank", 0, 2, (DefaultConstructorMarker) null);
    }
}
