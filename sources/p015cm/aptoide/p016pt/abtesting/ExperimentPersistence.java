package p015cm.aptoide.p016pt.abtesting;

import p123rx.C5328b;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.abtesting.ExperimentPersistence */
public interface ExperimentPersistence {
    Single<ExperimentModel> get(String str);

    C5328b save(String str, Experiment experiment);
}
