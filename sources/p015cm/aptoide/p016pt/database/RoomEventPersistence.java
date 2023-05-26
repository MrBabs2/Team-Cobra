package p015cm.aptoide.p016pt.database;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.List;
import p015cm.aptoide.analytics.implementation.EventsPersistence;
import p015cm.aptoide.analytics.implementation.data.Event;
import p015cm.aptoide.p016pt.database.room.EventDAO;
import p015cm.aptoide.p016pt.database.room.RoomEvent;
import p120q.p326a.C10837a;
import p120q.p326a.C10839b;
import p120q.p326a.C10846c;
import p120q.p326a.C11447e;
import p120q.p326a.C11450f;
import p120q.p326a.C11482n;
import p120q.p326a.C11488s;
import p120q.p326a.p349h0.C11461a;
import p123rx.C5328b;
import p123rx.C5368e;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomEventPersistence */
public class RoomEventPersistence implements EventsPersistence {
    private final EventDAO eventDAO;
    private final RoomEventMapper mapper;

    public RoomEventPersistence(EventDAO eventDAO2, RoomEventMapper roomEventMapper) {
        this.eventDAO = eventDAO2;
        this.mapper = roomEventMapper;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8021a(Event event, C10846c cVar) throws Exception {
        try {
            this.eventDAO.insert(this.mapper.map(event));
            cVar.onComplete();
        } catch (JsonProcessingException e) {
            cVar.onError(e);
        }
    }

    /* renamed from: b */
    public /* synthetic */ C11450f mo8023b(Event event) throws Exception {
        return C10832d.m36725a(save(event));
    }

    public C5368e<List<Event>> getAll() {
        return C10832d.m36729a(this.eventDAO.getAll().subscribeOn(C11461a.m37548b()).flatMap(new C2157v(this)), C10837a.BUFFER);
    }

    public C5328b remove(List<Event> list) {
        return C10832d.m36728a((C11450f) C11482n.fromIterable(list).flatMap(new C2159w(this)).subscribeOn(C11461a.m37548b()).doOnNext(new C2155u(this)).toList().mo37612c());
    }

    public C5328b save(Event event) {
        return C10832d.m36728a((C11450f) C10839b.m36737a((C11447e) new C2161x(this, event)).mo36639a(C11461a.m37548b()));
    }

    /* renamed from: a */
    public /* synthetic */ C11488s mo8020a(List list) throws Exception {
        try {
            return C11482n.just(this.mapper.map((List<RoomEvent>) list));
        } catch (IOException e) {
            return C11482n.error((Throwable) e);
        }
    }

    public C5328b save(List<Event> list) {
        return C10832d.m36728a((C11450f) C11482n.fromIterable(list).flatMapCompletable(new C2153t(this)));
    }

    /* renamed from: a */
    public /* synthetic */ C11488s mo8019a(Event event) throws Exception {
        try {
            return C11482n.just(this.mapper.map(event));
        } catch (JsonProcessingException e) {
            return C11482n.error((Throwable) e);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo8022a(RoomEvent roomEvent) throws Exception {
        this.eventDAO.delete(roomEvent);
    }
}
