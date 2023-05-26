package p015cm.aptoide.p016pt.abtesting;

/* renamed from: cm.aptoide.pt.abtesting.BaseExperiment */
interface BaseExperiment {

    /* renamed from: cm.aptoide.pt.abtesting.BaseExperiment$ExperimentType */
    public enum ExperimentType {
        RAKAM,
        WASABI
    }

    ExperimentType getType();
}
