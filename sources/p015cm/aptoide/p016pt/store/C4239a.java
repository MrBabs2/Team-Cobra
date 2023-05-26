package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.store.a */
/* compiled from: lambda */
public final /* synthetic */ class C4239a implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ GetStoreMeta f7324f;

    /* renamed from: g */
    private final /* synthetic */ AptoideAccountManager f7325g;

    /* renamed from: h */
    private final /* synthetic */ String f7326h;

    /* renamed from: i */
    private final /* synthetic */ String f7327i;

    public /* synthetic */ C4239a(GetStoreMeta getStoreMeta, AptoideAccountManager aptoideAccountManager, String str, String str2) {
        this.f7324f = getStoreMeta;
        this.f7325g = aptoideAccountManager;
        this.f7326h = str;
        this.f7327i = str2;
    }

    public final Object call(Object obj) {
        return StoreUtils.m7271a(this.f7324f, this.f7325g, this.f7326h, this.f7327i, (Account) obj);
    }
}
