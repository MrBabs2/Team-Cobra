package p015cm.aptoide.p016pt.abtesting;

import p015cm.aptoide.p016pt.abtesting.BaseExperiment;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.abtesting.ABTestManager */
public class ABTestManager {
    private AbTestRepository abTestRepository;

    public ABTestManager(AbTestRepository abTestRepository2) {
        this.abTestRepository = abTestRepository2;
    }

    public C5368e<Experiment> getExperiment(String str, BaseExperiment.ExperimentType experimentType) {
        return this.abTestRepository.getExperiment(str, experimentType).mo18669c();
    }

    public C5368e<String> getExperimentId(String str) {
        return this.abTestRepository.getExperimentId(str);
    }

    public C5368e<Boolean> recordAction(String str, BaseExperiment.ExperimentType experimentType) {
        return this.abTestRepository.recordAction(str, experimentType);
    }

    public C5368e<Boolean> recordImpression(String str, BaseExperiment.ExperimentType experimentType) {
        return this.abTestRepository.recordImpression(str, experimentType);
    }

    public C5368e<Boolean> recordAction(String str, int i, BaseExperiment.ExperimentType experimentType) {
        return this.abTestRepository.recordAction(str, i, experimentType);
    }
}
