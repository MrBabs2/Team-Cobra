package p015cm.aptoide.p016pt.abtesting;

import p015cm.aptoide.p016pt.abtesting.BaseExperiment;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.abtesting.n */
/* compiled from: lambda */
public final /* synthetic */ class C1105n implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ ABTestService f3513f;

    /* renamed from: g */
    private final /* synthetic */ BaseExperiment.ExperimentType f3514g;

    /* renamed from: h */
    private final /* synthetic */ String f3515h;

    public /* synthetic */ C1105n(ABTestService aBTestService, BaseExperiment.ExperimentType experimentType, String str) {
        this.f3513f = aBTestService;
        this.f3514g = experimentType;
        this.f3515h = str;
    }

    public final Object call(Object obj) {
        return this.f3513f.mo6164a(this.f3514g, this.f3515h, (String) obj);
    }
}
