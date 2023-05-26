package p015cm.aptoide.p016pt.account;

import java.util.concurrent.Callable;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.account.p0 */
/* compiled from: lambda */
public final /* synthetic */ class C1140p0 implements Callable {

    /* renamed from: f */
    private final /* synthetic */ FacebookLoginResult f3566f;

    public /* synthetic */ C1140p0(FacebookLoginResult facebookLoginResult) {
        this.f3566f = facebookLoginResult;
    }

    public final Object call() {
        return Single.m10120a((Throwable) new FacebookSignUpException(99, this.f3566f.getError().getMessage()));
    }
}
