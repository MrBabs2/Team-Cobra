package p015cm.aptoide.p016pt.account;

import com.facebook.AccessToken;
import java.util.concurrent.Callable;

/* renamed from: cm.aptoide.pt.account.q0 */
/* compiled from: lambda */
public final /* synthetic */ class C1142q0 implements Callable {

    /* renamed from: f */
    private final /* synthetic */ AccessToken f3568f;

    public /* synthetic */ C1142q0(AccessToken accessToken) {
        this.f3568f = accessToken;
    }

    public final Object call() {
        return FacebookSignUpAdapter.m4341a(this.f3568f);
    }
}
