package p015cm.aptoide.analytics.implementation.data;

import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;

/* renamed from: cm.aptoide.analytics.implementation.data.Event */
public class Event {
    private final AnalyticsManager.Action action;
    private final String context;
    private final Map<String, Object> data;
    private final String eventName;
    private final long timeStamp;

    public Event(String str, Map<String, Object> map, AnalyticsManager.Action action2, String str2, long j) {
        this.eventName = str;
        this.data = map;
        this.action = action2;
        this.context = str2;
        this.timeStamp = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (this.timeStamp != event.timeStamp || !this.eventName.equals(event.eventName)) {
            return false;
        }
        Map<String, Object> map = this.data;
        if (map == null ? event.data != null : !map.equals(event.data)) {
            return false;
        }
        if (this.action != event.action) {
            return false;
        }
        return this.context.equals(event.context);
    }

    public AnalyticsManager.Action getAction() {
        return this.action;
    }

    public String getContext() {
        return this.context;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public String getEventName() {
        return this.eventName;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        int hashCode = this.eventName.hashCode() * 31;
        Map<String, Object> map = this.data;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j = this.timeStamp;
        return ((((((hashCode + hashCode2) * 31) + this.action.hashCode()) * 31) + this.context.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
