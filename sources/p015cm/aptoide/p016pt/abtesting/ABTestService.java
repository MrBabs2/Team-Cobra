package p015cm.aptoide.p016pt.abtesting;

import p015cm.aptoide.p016pt.abtesting.BaseExperiment;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5378b;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* renamed from: cm.aptoide.pt.abtesting.ABTestService */
public class ABTestService {
    private static final String EXPERIMENT_DRAFT = "EXPERIMENT_IN_DRAFT_STATE";
    private static final String EXPERIMENT_NOT_FOUND = "EXPERIMENT_NOT_FOUND";
    private static final String EXPERIMENT_OVER = "EXPERIMENT_EXPIRED";
    private static final String EXPERIMENT_PAUSED = "EXPERIMENT_PAUSED";
    private static final String IMPRESSION = "IMPRESSION";
    private final ABTestServiceProvider abTestServiceProvider;
    private final IdsRepository idsRepository;
    private final C5373h scheduler;

    /* renamed from: cm.aptoide.pt.abtesting.ABTestService$ABTestingService */
    public interface ABTestingService {
        @GET("assignments/applications/Vanilla/experiments/{experimentName}/users/{aptoideId}")
        C5368e<ABTestImpressionResponse> getExperiment(@Path("experimentName") String str, @Path("aptoideId") String str2);

        @POST("events/applications/Vanilla/experiments/{experimentName}/users/{aptoideId}")
        C5368e<Response<Void>> recordAction(@Path("experimentName") String str, @Path("aptoideId") String str2, @Body ABTestRequestBody aBTestRequestBody);

        @POST("events/applications/Vanilla/experiments/{experimentName}/users/{aptoideId}")
        C5368e<Response<Void>> recordImpression(@Path("experimentName") String str, @Path("aptoideId") String str2, @Body ABTestRequestBody aBTestRequestBody);
    }

    public ABTestService(ABTestServiceProvider aBTestServiceProvider, IdsRepository idsRepository2, C5373h hVar) {
        this.abTestServiceProvider = aBTestServiceProvider;
        this.idsRepository = idsRepository2;
        this.scheduler = hVar;
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m4292d(Response response) {
        return true;
    }

    private C5368e<String> getAptoideId() {
        return this.idsRepository.getUniqueIdentifier().mo18567c();
    }

    private boolean mapExperimentStatus(ABTestImpressionResponse aBTestImpressionResponse) {
        return aBTestImpressionResponse.getStatus().equals(EXPERIMENT_OVER) || aBTestImpressionResponse.getStatus().equals(EXPERIMENT_PAUSED) || aBTestImpressionResponse.getStatus().equals(EXPERIMENT_NOT_FOUND) || aBTestImpressionResponse.getStatus().equals(EXPERIMENT_DRAFT);
    }

    private ExperimentModel mapToExperimentModel(ABTestImpressionResponse aBTestImpressionResponse, boolean z) {
        return new ExperimentModel(new Experiment(System.currentTimeMillis(), aBTestImpressionResponse.getPayload(), aBTestImpressionResponse.getAssignment(), mapExperimentStatus(aBTestImpressionResponse)), z);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6164a(BaseExperiment.ExperimentType experimentType, String str, String str2) {
        return this.abTestServiceProvider.getService(experimentType).getExperiment(str, str2).mo18662b(this.scheduler);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo6167b(BaseExperiment.ExperimentType experimentType, String str, String str2) {
        return this.abTestServiceProvider.getService(experimentType).recordImpression(str, str2, new ABTestRequestBody(IMPRESSION));
    }

    public C5368e<ExperimentModel> getExperiment(String str, BaseExperiment.ExperimentType experimentType) {
        return getAptoideId().mo18687f(new C1105n(this, experimentType, str)).mo18694j(new C1107p(this)).mo18699l(C1097f.f3500f);
    }

    public C5368e<Boolean> recordAction(String str, String str2, BaseExperiment.ExperimentType experimentType) {
        return getAptoideId().mo18687f(new C1102k(this, experimentType, str, str2)).mo18664b(new C1100i(this)).mo18649a((C5378b<? super Throwable>) C1104m.f3512f).mo18694j(C1101j.f3506f);
    }

    public C5368e<Boolean> recordImpression(String str, BaseExperiment.ExperimentType experimentType) {
        return getAptoideId().mo18687f(new C1099h(this, experimentType, str)).mo18664b(new C1098g(this)).mo18649a((C5378b<? super Throwable>) C1103l.f3511f).mo18694j(C1106o.f3516f);
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m4290c(Response response) {
        return true;
    }

    /* renamed from: b */
    public /* synthetic */ void mo6168b(Response response) {
        Logger instance = Logger.getInstance();
        String name = ABTestService.class.getName();
        instance.mo12975d(name, "response : " + response.isSuccessful());
    }

    /* renamed from: a */
    public /* synthetic */ ExperimentModel mo6163a(ABTestImpressionResponse aBTestImpressionResponse) {
        return mapToExperimentModel(aBTestImpressionResponse, false);
    }

    /* renamed from: a */
    static /* synthetic */ ExperimentModel m4288a(Throwable th) {
        return new ExperimentModel(new Experiment(), true);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6165a(BaseExperiment.ExperimentType experimentType, String str, String str2, String str3) {
        return this.abTestServiceProvider.getService(experimentType).recordAction(str, str3, new ABTestRequestBody(str2));
    }

    /* renamed from: a */
    public /* synthetic */ void mo6166a(Response response) {
        Logger instance = Logger.getInstance();
        String name = ABTestService.class.getName();
        instance.mo12975d(name, "response : " + response.isSuccessful());
    }
}
