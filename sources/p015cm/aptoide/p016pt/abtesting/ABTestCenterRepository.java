package p015cm.aptoide.p016pt.abtesting;

import java.util.HashMap;
import p015cm.aptoide.p016pt.abtesting.BaseExperiment;
import p015cm.aptoide.p016pt.database.RoomExperimentPersistence;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.abtesting.ABTestCenterRepository */
public class ABTestCenterRepository implements AbTestRepository {
    private AbTestCacheValidator cacheValidator;
    private HashMap<String, ExperimentModel> localCache;
    private RoomExperimentPersistence persistence;
    private ABTestService service;

    public ABTestCenterRepository(ABTestService aBTestService, HashMap<String, ExperimentModel> hashMap, RoomExperimentPersistence roomExperimentPersistence, AbTestCacheValidator abTestCacheValidator) {
        this.service = aBTestService;
        this.localCache = hashMap;
        this.persistence = roomExperimentPersistence;
        this.cacheValidator = abTestCacheValidator;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6136a(String str, BaseExperiment.ExperimentType experimentType, ExperimentModel experimentModel) {
        if (experimentModel.hasError() || experimentModel.getExperiment().isExpired()) {
            return this.service.getExperiment(str, experimentType).mo18687f(new C1093b(this, str));
        }
        if (!this.localCache.containsKey(str)) {
            this.localCache.put(str, experimentModel);
        }
        return C5368e.m10257c(experimentModel.getExperiment());
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo6138b(String str, ExperimentModel experimentModel) {
        return cacheExperiment(experimentModel, str).mo18593a(C5368e.m10257c(experimentModel.getExperiment()));
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo6139c(String str, ExperimentModel experimentModel) {
        return cacheExperiment(experimentModel, str).mo18593a(C5368e.m10257c(experimentModel.getExperiment()));
    }

    public C5328b cacheExperiment(ExperimentModel experimentModel, String str) {
        return C5328b.m10169d(new C1096e(this, str, experimentModel)).mo18587a(this.persistence.save(str, experimentModel.getExperiment()));
    }

    public C5368e<Experiment> getExperiment(String str, BaseExperiment.ExperimentType experimentType) {
        if (!this.localCache.containsKey(str)) {
            return this.persistence.get(str).mo18567c().mo18644a(Schedulers.m10352io()).mo18687f(new C1095d(this, str, experimentType));
        }
        if (this.cacheValidator.isExperimentValid(str)) {
            return C5368e.m10257c(this.localCache.get(str).getExperiment());
        }
        return this.service.getExperiment(str, experimentType).mo18687f(new C1092a(this, str));
    }

    public C5368e<String> getExperimentId(String str) {
        return C5368e.m10257c(str);
    }

    public C5368e<Boolean> recordAction(String str, BaseExperiment.ExperimentType experimentType) {
        if (this.cacheValidator.isCacheValid(str)) {
            return getExperiment(str, (BaseExperiment.ExperimentType) null).mo18687f(new C1094c(this, str, experimentType));
        }
        return C5368e.m10257c(false);
    }

    public C5368e<Boolean> recordImpression(String str, BaseExperiment.ExperimentType experimentType) {
        if (this.cacheValidator.isCacheValid(str)) {
            return this.service.recordImpression(str, experimentType);
        }
        return C5368e.m10257c(false);
    }

    public C5368e<Boolean> recordAction(String str, int i, BaseExperiment.ExperimentType experimentType) {
        return recordAction(str, experimentType);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo6135a(String str, BaseExperiment.ExperimentType experimentType, Experiment experiment) {
        return this.service.recordAction(str, experiment.getAssignment(), experimentType);
    }

    /* renamed from: a */
    public /* synthetic */ void mo6137a(String str, ExperimentModel experimentModel) {
        this.localCache.put(str, experimentModel);
    }
}
