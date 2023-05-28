package p015cm.aptoide.p016pt.abtesting;

import p015cm.aptoide.p016pt.abtesting.BaseExperiment;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.abtesting.AbTestRepository */
public interface AbTestRepository {
    C5328b cacheExperiment(ExperimentModel experimentModel, String str);

    C5368e<Experiment> getExperiment(String str, BaseExperiment.ExperimentType experimentType);

    C5368e<String> getExperimentId(String str);

    C5368e<Boolean> recordAction(String str, int i, BaseExperiment.ExperimentType experimentType);

    C5368e<Boolean> recordAction(String str, BaseExperiment.ExperimentType experimentType);

    C5368e<Boolean> recordImpression(String str, BaseExperiment.ExperimentType experimentType);
}
