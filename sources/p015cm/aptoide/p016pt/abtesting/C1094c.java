package p015cm.aptoide.p016pt.abtesting;

import p015cm.aptoide.p016pt.abtesting.BaseExperiment;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.abtesting.c */
/* compiled from: lambda */
public final /* synthetic */ class C1094c implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ ABTestCenterRepository f3491f;

    /* renamed from: g */
    private final /* synthetic */ String f3492g;

    /* renamed from: h */
    private final /* synthetic */ BaseExperiment.ExperimentType f3493h;

    public /* synthetic */ C1094c(ABTestCenterRepository aBTestCenterRepository, String str, BaseExperiment.ExperimentType experimentType) {
        this.f3491f = aBTestCenterRepository;
        this.f3492g = str;
        this.f3493h = experimentType;
    }

    public final Object call(Object obj) {
        return this.f3491f.mo6135a(this.f3492g, this.f3493h, (Experiment) obj);
    }
}
