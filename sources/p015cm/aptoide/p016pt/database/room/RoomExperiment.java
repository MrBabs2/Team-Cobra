package p015cm.aptoide.p016pt.database.room;

/* renamed from: cm.aptoide.pt.database.room.RoomExperiment */
public class RoomExperiment {
    private String assignment;
    private String experimentName;
    private boolean experimentOver;
    private boolean partOfExperiment;
    private String payload;
    private long requestTime;

    public RoomExperiment(String str, long j, String str2, String str3, boolean z, boolean z2) {
        this.experimentName = str;
        this.requestTime = j;
        this.assignment = str2;
        this.payload = str3;
        this.partOfExperiment = z;
        this.experimentOver = z2;
    }

    public String getAssignment() {
        return this.assignment;
    }

    public String getExperimentName() {
        return this.experimentName;
    }

    public String getPayload() {
        return this.payload;
    }

    public long getRequestTime() {
        return this.requestTime;
    }

    public boolean isExperimentOver() {
        return this.experimentOver;
    }

    public boolean isPartOfExperiment() {
        return this.partOfExperiment;
    }
}
