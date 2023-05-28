package p015cm.aptoide.analytics.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.analytics.AnalyticsLogger;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.data.Event;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.analytics.implementation.AptoideBiAnalytics */
public class AptoideBiAnalytics {
    private static final String TAG = "AptoideBiAnalytics";
    private final CrashLogger crashReport;
    private final AnalyticsLogger debugLogger;
    private final long initialDelay;
    private final EventsPersistence persistence;
    private final long sendInterval;
    private final AptoideBiEventService service;
    private final SessionPersistence sessionPersistence;
    private final C5383b subscriptions;
    private final C5373h timerScheduler;

    public AptoideBiAnalytics(EventsPersistence eventsPersistence, SessionPersistence sessionPersistence2, AptoideBiEventService aptoideBiEventService, C5383b bVar, C5373h hVar, long j, long j2, CrashLogger crashLogger, AnalyticsLogger analyticsLogger) {
        this.persistence = eventsPersistence;
        this.sessionPersistence = sessionPersistence2;
        this.service = aptoideBiEventService;
        this.subscriptions = bVar;
        this.timerScheduler = hVar;
        this.sendInterval = j2;
        this.initialDelay = j;
        this.crashReport = crashLogger;
        this.debugLogger = analyticsLogger;
    }

    /* renamed from: a */
    static /* synthetic */ Iterable m4188a(List list, List list2) {
        return list;
    }

    /* renamed from: a */
    static /* synthetic */ void m4191a() {
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m4194e(List list) {
        return Boolean.valueOf(list.size() > 0);
    }

    private C5328b sendEvents(List<Event> list) {
        return this.persistence.remove(list).mo18582a(list).mo18567c().mo18691h(new C1021j(list)).mo18694j(new C1013b(this)).mo18698l().mo18687f(C1022k.f3411f).mo18698l().mo18681d(C1020i.f3409f).mo18689g(new C1018g(this)).mo18696k();
    }

    /* renamed from: a */
    public /* synthetic */ void mo5139a(Throwable th) {
        AnalyticsLogger analyticsLogger = this.debugLogger;
        String str = TAG;
        analyticsLogger.logWarningDebug(str, "cannot save the event due to " + th.getMessage());
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo5140b(List list) {
        return sendEvents(new ArrayList(list));
    }

    public long getTimestamp() {
        return this.sessionPersistence.getTimestamp();
    }

    public void log(String str, Map<String, Object> map, AnalyticsManager.Action action, String str2) {
        this.persistence.save(new Event(str, map, action, str2, System.currentTimeMillis())).mo18594a((C5377a) C1014c.f3403f, (C5378b<? super Throwable>) new C1016e(this));
    }

    public void saveTimestamp(long j) {
        this.sessionPersistence.saveSessionTimestamp(j);
    }

    public void setup() {
        this.subscriptions.mo18721a(C5368e.m10233a(this.initialDelay, this.sendInterval, TimeUnit.MILLISECONDS, this.timerScheduler).mo18687f(new C1023l(this)).mo18681d(C1012a.f3401f).mo18689g(new C1015d(this)).mo18649a((C5378b<? super Throwable>) new C1025m(this)).mo18686f().mo18693i());
    }

    /* renamed from: b */
    public /* synthetic */ void mo5141b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo5138a(Long l) {
        return this.persistence.getAll().mo18669c();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo5137a(Event event) {
        return this.service.send(event).mo18610e().mo18687f(C1019h.f3408f).mo18638a(Event.class).mo18697k(new C1017f(event));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo5136a(List list) {
        return this.persistence.save((List<Event>) list);
    }
}
