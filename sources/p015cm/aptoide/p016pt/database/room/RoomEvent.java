package p015cm.aptoide.p016pt.database.room;

/* renamed from: cm.aptoide.pt.database.room.RoomEvent */
public class RoomEvent {
    private int action;
    private String context;
    private String data;
    private String eventName;
    private long timestamp;

    public RoomEvent(long j, String str, int i, String str2, String str3) {
        this.timestamp = j;
        this.eventName = str;
        this.action = i;
        this.context = str2;
        this.data = str3;
    }

    public int getAction() {
        return this.action;
    }

    public String getContext() {
        return this.context;
    }

    public String getData() {
        return this.data;
    }

    public String getEventName() {
        return this.eventName;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setAction(int i) {
        this.action = i;
    }

    public void setContext(String str) {
        this.context = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setEventName(String str) {
        this.eventName = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }
}
