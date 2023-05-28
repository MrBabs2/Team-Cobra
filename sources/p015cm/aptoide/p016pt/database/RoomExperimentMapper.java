package p015cm.aptoide.p016pt.database;

import p015cm.aptoide.p016pt.abtesting.Experiment;
import p015cm.aptoide.p016pt.database.room.RoomExperiment;

/* renamed from: cm.aptoide.pt.database.RoomExperimentMapper */
public class RoomExperimentMapper {
    public RoomExperiment map(String str, Experiment experiment) {
        return new RoomExperiment(str, experiment.getRequestTime(), experiment.getAssignment(), experiment.getPayload(), experiment.isPartOfExperiment(), experiment.isExperimentOver());
    }

    public Experiment map(RoomExperiment roomExperiment) {
        return new Experiment(roomExperiment.getRequestTime(), roomExperiment.getAssignment(), roomExperiment.getPayload(), roomExperiment.isPartOfExperiment(), roomExperiment.isExperimentOver());
    }
}
