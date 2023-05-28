package p015cm.aptoide.p016pt.database;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.data.Event;
import p015cm.aptoide.p016pt.database.room.RoomEvent;

/* renamed from: cm.aptoide.pt.database.RoomEventMapper */
public class RoomEventMapper {
    private final ObjectMapper objectMapper;

    public RoomEventMapper(ObjectMapper objectMapper2) {
        this.objectMapper = objectMapper2;
    }

    public RoomEvent map(Event event) throws JsonProcessingException {
        return new RoomEvent(event.getTimeStamp(), event.getEventName(), event.getAction().ordinal(), event.getContext(), this.objectMapper.writeValueAsString(event.getData()));
    }

    public List<Event> map(List<RoomEvent> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (RoomEvent next : list) {
            arrayList.add(new Event(next.getEventName(), (Map) this.objectMapper.readValue(next.getData(), (TypeReference) new TypeReference<Map<String, Object>>() {
            }), AnalyticsManager.Action.values()[next.getAction()], next.getContext(), next.getTimestamp()));
        }
        return arrayList;
    }
}
