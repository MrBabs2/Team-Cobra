package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.store.b */
/* compiled from: lambda */
public final /* synthetic */ class C4240b implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AptoideAccountManager f7328f;

    /* renamed from: g */
    private final /* synthetic */ String f7329g;

    /* renamed from: h */
    private final /* synthetic */ String f7330h;

    public /* synthetic */ C4240b(AptoideAccountManager aptoideAccountManager, String str, String str2) {
        this.f7328f = aptoideAccountManager;
        this.f7329g = str;
        this.f7330h = str2;
    }

    public final Object call(Object obj) {
        return this.f7328f.accountStatus().mo18669c().mo18700m().mo18568c(new C4239a((GetStoreMeta) obj, this.f7328f, this.f7329g, this.f7330h));
    }
}
