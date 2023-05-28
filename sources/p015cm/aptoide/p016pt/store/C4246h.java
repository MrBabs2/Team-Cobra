package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.h */
/* compiled from: lambda */
public final /* synthetic */ class C4246h implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AptoideAccountManager f7338f;

    /* renamed from: g */
    private final /* synthetic */ String f7339g;

    /* renamed from: h */
    private final /* synthetic */ StoreCredentialsProvider f7340h;

    public /* synthetic */ C4246h(AptoideAccountManager aptoideAccountManager, String str, StoreCredentialsProvider storeCredentialsProvider) {
        this.f7338f = aptoideAccountManager;
        this.f7339g = str;
        this.f7340h = storeCredentialsProvider;
    }

    public final void call(Object obj) {
        StoreUtils.m7273a(this.f7338f, this.f7339g, this.f7340h, (Boolean) obj);
    }
}
