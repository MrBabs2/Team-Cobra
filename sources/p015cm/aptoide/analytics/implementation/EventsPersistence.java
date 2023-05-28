package p015cm.aptoide.analytics.implementation;

import java.util.List;
import p015cm.aptoide.analytics.implementation.data.Event;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.analytics.implementation.EventsPersistence */
public interface EventsPersistence {
    C5368e<List<Event>> getAll();

    C5328b remove(List<Event> list);

    C5328b save(Event event);

    C5328b save(List<Event> list);
}
