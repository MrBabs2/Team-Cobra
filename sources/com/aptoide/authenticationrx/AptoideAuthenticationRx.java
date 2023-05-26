package com.aptoide.authenticationrx;

import com.aptoide.authentication.AptoideAuthentication;
import com.aptoide.authentication.model.CodeAuth;
import com.aptoide.authentication.model.OAuth2;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.p395i2.C12253d;
import p120q.p326a.C11496w;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo16641d2 = {"Lcom/aptoide/authenticationrx/AptoideAuthenticationRx;", "", "aptoideAuthentication", "Lcom/aptoide/authentication/AptoideAuthentication;", "(Lcom/aptoide/authentication/AptoideAuthentication;)V", "authenticate", "Lio/reactivex/Single;", "Lcom/aptoide/authentication/model/OAuth2;", "magicCode", "", "state", "agent", "sendMagicLink", "Lcom/aptoide/authentication/model/CodeAuth;", "email", "aptoide-authentication-rx"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: AptoideAuthenticationRx.kt */
public final class AptoideAuthenticationRx {
    /* access modifiers changed from: private */
    public final AptoideAuthentication aptoideAuthentication;

    public AptoideAuthenticationRx(AptoideAuthentication aptoideAuthentication2) {
        C10202j.m34178b(aptoideAuthentication2, "aptoideAuthentication");
        this.aptoideAuthentication = aptoideAuthentication2;
    }

    public final C11496w<OAuth2> authenticate(String str, String str2, String str3) {
        C10202j.m34178b(str, "magicCode");
        C10202j.m34178b(str2, "state");
        C10202j.m34178b(str3, "agent");
        return C12253d.m40405a((C9069g) null, new AptoideAuthenticationRx$authenticate$1(this, str, str2, str3, (C9064d) null), 1, (Object) null);
    }

    public final C11496w<CodeAuth> sendMagicLink(String str) {
        C10202j.m34178b(str, "email");
        return C12253d.m40405a((C9069g) null, new AptoideAuthenticationRx$sendMagicLink$1(this, str, (C9064d) null), 1, (Object) null);
    }
}
