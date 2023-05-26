package p015cm.aptoide.p016pt.abtesting;

/* renamed from: cm.aptoide.pt.abtesting.ExperimentModel */
public class ExperimentModel {
    private Experiment experiment;
    private boolean hasError;

    public ExperimentModel(Experiment experiment2, boolean z) {
        this.experiment = experiment2;
        this.hasError = z;
    }

    public Experiment getExperiment() {
        return this.experiment;
    }

    public boolean hasError() {
        return this.hasError;
    }
}
