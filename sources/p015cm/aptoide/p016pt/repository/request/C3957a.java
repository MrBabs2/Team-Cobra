package p015cm.aptoide.p016pt.repository.request;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListAppCoinsCampaigns;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.repository.request.a */
/* compiled from: lambda */
public final /* synthetic */ class C3957a implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RewardAppCoinsAppsRepository f7047f;

    /* renamed from: g */
    private final /* synthetic */ String f7048g;

    public /* synthetic */ C3957a(RewardAppCoinsAppsRepository rewardAppCoinsAppsRepository, String str) {
        this.f7047f = rewardAppCoinsAppsRepository;
        this.f7048g = str;
    }

    public final Object call(Object obj) {
        return this.f7047f.mo13990a(this.f7048g, (ListAppCoinsCampaigns) obj);
    }
}
