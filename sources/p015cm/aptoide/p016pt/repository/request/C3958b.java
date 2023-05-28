package p015cm.aptoide.p016pt.repository.request;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListAppCoinsCampaigns;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.repository.request.b */
/* compiled from: lambda */
public final /* synthetic */ class C3958b implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RewardAppCoinsAppsRepository f7049f;

    /* renamed from: g */
    private final /* synthetic */ String f7050g;

    public /* synthetic */ C3958b(RewardAppCoinsAppsRepository rewardAppCoinsAppsRepository, String str) {
        this.f7049f = rewardAppCoinsAppsRepository;
        this.f7050g = str;
    }

    public final Object call(Object obj) {
        return this.f7049f.mo13991b(this.f7050g, (ListAppCoinsCampaigns) obj);
    }
}
