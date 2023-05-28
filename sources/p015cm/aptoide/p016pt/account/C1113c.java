package p015cm.aptoide.p016pt.account;

import com.aptoide.authentication.model.OAuth2;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.c */
/* compiled from: lambda */
public final /* synthetic */ class C1113c implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AccountServiceV3 f3525f;

    /* renamed from: g */
    private final /* synthetic */ String f3526g;

    /* renamed from: h */
    private final /* synthetic */ String f3527h;

    public /* synthetic */ C1113c(AccountServiceV3 accountServiceV3, String str, String str2) {
        this.f3525f = accountServiceV3;
        this.f3526g = str;
        this.f3527h = str2;
    }

    public final Object call(Object obj) {
        return this.f3525f.mo6230a(this.f3526g, this.f3527h, (OAuth2) obj);
    }
}
