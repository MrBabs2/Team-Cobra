package p015cm.aptoide.p016pt.abtesting;

import p015cm.aptoide.p016pt.abtesting.BaseExperiment;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.abtesting.k */
/* compiled from: lambda */
public final /* synthetic */ class C1102k implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ ABTestService f3507f;

    /* renamed from: g */
    private final /* synthetic */ BaseExperiment.ExperimentType f3508g;

    /* renamed from: h */
    private final /* synthetic */ String f3509h;

    /* renamed from: i */
    private final /* synthetic */ String f3510i;

    public /* synthetic */ C1102k(ABTestService aBTestService, BaseExperiment.ExperimentType experimentType, String str, String str2) {
        this.f3507f = aBTestService;
        this.f3508g = experimentType;
        this.f3509h = str;
        this.f3510i = str2;
    }

    public final Object call(Object obj) {
        return this.f3507f.mo6165a(this.f3508g, this.f3509h, this.f3510i, (String) obj);
    }
}
