package p123rx.p401n.p404c;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12889e;
import p123rx.p128t.C5383b;
import p123rx.p401n.p406e.C12771g;
import p123rx.p401n.p406e.C12773i;
import p123rx.p401n.p406e.C12791l;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.c.h */
/* compiled from: NewThreadWorker */
public class C12730h extends C5373h.C5374a implements C5375k {

    /* renamed from: h */
    private static final boolean f32880h;

    /* renamed from: i */
    public static final int f32881i = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();

    /* renamed from: j */
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f32882j = new ConcurrentHashMap<>();

    /* renamed from: k */
    private static final AtomicReference<ScheduledExecutorService> f32883k = new AtomicReference<>();

    /* renamed from: l */
    private static volatile Object f32884l;

    /* renamed from: m */
    private static final Object f32885m = new Object();

    /* renamed from: f */
    private final ScheduledExecutorService f32886f;

    /* renamed from: g */
    volatile boolean f32887g;

    /* renamed from: rx.n.c.h$a */
    /* compiled from: NewThreadWorker */
    static class C12731a implements Runnable {
        C12731a() {
        }

        public void run() {
            C12730h.m41218c();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int a = C12771g.m41264a();
        f32880h = !z && (a == 0 || a >= 21);
    }

    public C12730h(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!m41219c(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            m41216a((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.f32886f = newScheduledThreadPool;
    }

    /* renamed from: a */
    public static void m41216a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            if (f32883k.get() != null) {
                break;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C12773i("RxSchedulerPurge-"));
            if (f32883k.compareAndSet((Object) null, newScheduledThreadPool)) {
                C12731a aVar = new C12731a();
                int i = f32881i;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, (long) i, (long) i, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f32882j.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    /* renamed from: b */
    static Method m41217b(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    static void m41218c() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = f32882j.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (!next.isShutdown()) {
                    next.purge();
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            C12472a.m40945c(th);
            C12844c.m41417b(th);
        }
    }

    public boolean isUnsubscribed() {
        return this.f32887g;
    }

    public void unsubscribe() {
        this.f32887g = true;
        this.f32886f.shutdownNow();
        m41215a(this.f32886f);
    }

    /* renamed from: b */
    public C12735j mo40864b(C5377a aVar, long j, TimeUnit timeUnit) {
        Future future;
        C12735j jVar = new C12735j(C12844c.m41412a(aVar));
        if (j <= 0) {
            future = this.f32886f.submit(jVar);
        } else {
            future = this.f32886f.schedule(jVar, j, timeUnit);
        }
        jVar.mo40868a((Future<?>) future);
        return jVar;
    }

    /* renamed from: a */
    public static void m41215a(ScheduledExecutorService scheduledExecutorService) {
        f32882j.remove(scheduledExecutorService);
    }

    /* renamed from: a */
    public C5375k mo18710a(C5377a aVar) {
        return mo18712a(aVar, 0, (TimeUnit) null);
    }

    /* renamed from: a */
    public C5375k mo18712a(C5377a aVar, long j, TimeUnit timeUnit) {
        if (this.f32887g) {
            return C12889e.m41502b();
        }
        return mo40864b(aVar, j, timeUnit);
    }

    /* renamed from: c */
    public static boolean m41219c(ScheduledExecutorService scheduledExecutorService) {
        Method method;
        Object obj;
        if (f32880h) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj2 = f32884l;
                if (obj2 == f32885m) {
                    return false;
                }
                if (obj2 == null) {
                    method = m41217b(scheduledExecutorService);
                    if (method != null) {
                        obj = method;
                    } else {
                        obj = f32885m;
                    }
                    f32884l = obj;
                } else {
                    method = (Method) obj2;
                }
            } else {
                method = m41217b(scheduledExecutorService);
            }
            if (method != null) {
                try {
                    method.invoke(scheduledExecutorService, new Object[]{true});
                    return true;
                } catch (InvocationTargetException e) {
                    C12844c.m41417b((Throwable) e);
                } catch (IllegalAccessException e2) {
                    C12844c.m41417b((Throwable) e2);
                } catch (IllegalArgumentException e3) {
                    C12844c.m41417b((Throwable) e3);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C12735j mo40863a(C5377a aVar, long j, TimeUnit timeUnit, C5383b bVar) {
        Future future;
        C12735j jVar = new C12735j(C12844c.m41412a(aVar), bVar);
        bVar.mo18721a((C5375k) jVar);
        if (j <= 0) {
            future = this.f32886f.submit(jVar);
        } else {
            future = this.f32886f.schedule(jVar, j, timeUnit);
        }
        jVar.mo40868a((Future<?>) future);
        return jVar;
    }

    /* renamed from: a */
    public C12735j mo40862a(C5377a aVar, long j, TimeUnit timeUnit, C12791l lVar) {
        Future future;
        C12735j jVar = new C12735j(C12844c.m41412a(aVar), lVar);
        lVar.mo40914a((C5375k) jVar);
        if (j <= 0) {
            future = this.f32886f.submit(jVar);
        } else {
            future = this.f32886f.schedule(jVar, j, timeUnit);
        }
        jVar.mo40868a((Future<?>) future);
        return jVar;
    }
}
