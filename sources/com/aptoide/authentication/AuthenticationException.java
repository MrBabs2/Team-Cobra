package com.aptoide.authentication;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, mo16641d2 = {"Lcom/aptoide/authentication/AuthenticationException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: AuthenticationException.kt */
public final class AuthenticationException extends RuntimeException {
    private final int code;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthenticationException(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }

    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AuthenticationException(String str, int i) {
        super(str + String.valueOf(i));
        C10202j.m34178b(str, "message");
        this.code = i;
    }
}
