package p015cm.aptoide.p016pt.networking;

import android.accounts.Account;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.networking.b */
/* compiled from: lambda */
public final /* synthetic */ class C3431b implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AuthenticationPersistence f6401f;

    /* renamed from: g */
    private final /* synthetic */ String f6402g;

    /* renamed from: h */
    private final /* synthetic */ String f6403h;

    /* renamed from: i */
    private final /* synthetic */ String f6404i;

    /* renamed from: j */
    private final /* synthetic */ String f6405j;

    public /* synthetic */ C3431b(AuthenticationPersistence authenticationPersistence, String str, String str2, String str3, String str4) {
        this.f6401f = authenticationPersistence;
        this.f6402g = str;
        this.f6403h = str2;
        this.f6404i = str3;
        this.f6405j = str4;
    }

    public final void call(Object obj) {
        this.f6401f.mo13042a(this.f6402g, this.f6403h, this.f6404i, this.f6405j, (Account) obj);
    }
}
