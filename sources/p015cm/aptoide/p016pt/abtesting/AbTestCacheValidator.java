package p015cm.aptoide.p016pt.abtesting;

import java.util.HashMap;

/* renamed from: cm.aptoide.pt.abtesting.AbTestCacheValidator */
public class AbTestCacheValidator {
    private HashMap<String, ExperimentModel> localCache;

    public AbTestCacheValidator(HashMap<String, ExperimentModel> hashMap) {
        this.localCache = hashMap;
    }

    public boolean isCacheValid(String str) {
        return this.localCache.containsKey(str) && !this.localCache.get(str).hasError() && !this.localCache.get(str).getExperiment().isExperimentOver() && this.localCache.get(str).getExperiment().isPartOfExperiment();
    }

    public boolean isExperimentValid(String str) {
        ExperimentModel experimentModel = this.localCache.get(str);
        return !experimentModel.getExperiment().isExpired() && !experimentModel.hasError() && !experimentModel.getExperiment().isExperimentOver() && experimentModel.getExperiment().isPartOfExperiment();
    }
}
