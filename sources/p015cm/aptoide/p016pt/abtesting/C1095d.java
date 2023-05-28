package p015cm.aptoide.p016pt.abtesting;

import p015cm.aptoide.p016pt.abtesting.BaseExperiment;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.abtesting.d */
/* compiled from: lambda */
public final /* synthetic */ class C1095d implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ ABTestCenterRepository f3494f;

    /* renamed from: g */
    private final /* synthetic */ String f3495g;

    /* renamed from: h */
    private final /* synthetic */ BaseExperiment.ExperimentType f3496h;

    public /* synthetic */ C1095d(ABTestCenterRepository aBTestCenterRepository, String str, BaseExperiment.ExperimentType experimentType) {
        this.f3494f = aBTestCenterRepository;
        this.f3495g = str;
        this.f3496h = experimentType;
    }

    public final Object call(Object obj) {
        return this.f3494f.mo6136a(this.f3495g, this.f3496h, (ExperimentModel) obj);
    }
}
