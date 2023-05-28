package p015cm.aptoide.p016pt.account;

import android.accounts.Account;
import java.util.List;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.c0 */
/* compiled from: lambda */
public final /* synthetic */ class C1114c0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AndroidAccountManagerPersistence f3528f;

    /* renamed from: g */
    private final /* synthetic */ String f3529g;

    /* renamed from: h */
    private final /* synthetic */ Account f3530h;

    /* renamed from: i */
    private final /* synthetic */ boolean f3531i;

    /* renamed from: j */
    private final /* synthetic */ boolean f3532j;

    public /* synthetic */ C1114c0(AndroidAccountManagerPersistence androidAccountManagerPersistence, String str, Account account, boolean z, boolean z2) {
        this.f3528f = androidAccountManagerPersistence;
        this.f3529g = str;
        this.f3530h = account;
        this.f3531i = z;
        this.f3532j = z2;
    }

    public final Object call(Object obj) {
        return this.f3528f.mo6240a(this.f3529g, this.f3530h, this.f3531i, this.f3532j, (List) obj);
    }
}
