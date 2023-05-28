package p015cm.aptoide.p016pt.account;

import android.accounts.Account;
import java.util.List;
import p015cm.aptoide.p016pt.networking.Authentication;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.g0 */
/* compiled from: lambda */
public final /* synthetic */ class C1122g0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AndroidAccountManagerPersistence f3542f;

    /* renamed from: g */
    private final /* synthetic */ String f3543g;

    /* renamed from: h */
    private final /* synthetic */ List f3544h;

    /* renamed from: i */
    private final /* synthetic */ Account f3545i;

    /* renamed from: j */
    private final /* synthetic */ boolean f3546j;

    /* renamed from: k */
    private final /* synthetic */ boolean f3547k;

    public /* synthetic */ C1122g0(AndroidAccountManagerPersistence androidAccountManagerPersistence, String str, List list, Account account, boolean z, boolean z2) {
        this.f3542f = androidAccountManagerPersistence;
        this.f3543g = str;
        this.f3544h = list;
        this.f3545i = account;
        this.f3546j = z;
        this.f3547k = z2;
    }

    public final Object call(Object obj) {
        return this.f3542f.mo6241a(this.f3543g, this.f3544h, this.f3545i, this.f3546j, this.f3547k, (Authentication) obj);
    }
}
