package p015cm.aptoide.p016pt.util.schedulers;

import p123rx.C5373h;
import p123rx.p124l.p125c.C5376a;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.util.schedulers.ConcreteSchedulerProvider */
public class ConcreteSchedulerProvider implements SchedulerProvider {
    private static ConcreteSchedulerProvider INSTANCE;

    private ConcreteSchedulerProvider() {
    }

    public static synchronized ConcreteSchedulerProvider getInstance() {
        ConcreteSchedulerProvider concreteSchedulerProvider;
        synchronized (ConcreteSchedulerProvider.class) {
            if (INSTANCE == null) {
                INSTANCE = new ConcreteSchedulerProvider();
            }
            concreteSchedulerProvider = INSTANCE;
        }
        return concreteSchedulerProvider;
    }

    public C5373h computation() {
        return Schedulers.computation();
    }

    /* renamed from: io */
    public C5373h mo15029io() {
        return Schedulers.m10352io();
    }

    /* renamed from: ui */
    public C5373h mo15030ui() {
        return C5376a.m10346b();
    }
}
