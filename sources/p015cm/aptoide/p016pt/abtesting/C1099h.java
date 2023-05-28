package p015cm.aptoide.p016pt.abtesting;

import p015cm.aptoide.p016pt.abtesting.BaseExperiment;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.abtesting.h */
/* compiled from: lambda */
public final /* synthetic */ class C1099h implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ ABTestService f3502f;

    /* renamed from: g */
    private final /* synthetic */ BaseExperiment.ExperimentType f3503g;

    /* renamed from: h */
    private final /* synthetic */ String f3504h;

    public /* synthetic */ C1099h(ABTestService aBTestService, BaseExperiment.ExperimentType experimentType, String str) {
        this.f3502f = aBTestService;
        this.f3503g = experimentType;
        this.f3504h = str;
    }

    public final Object call(Object obj) {
        return this.f3502f.mo6167b(this.f3503g, this.f3504h, (String) obj);
    }
}
