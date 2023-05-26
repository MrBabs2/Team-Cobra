package p015cm.aptoide.p016pt.util.schedulers;

import p123rx.C5373h;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.util.schedulers.ImmediateSchedulerProvider */
public class ImmediateSchedulerProvider implements SchedulerProvider {
    public C5373h computation() {
        return Schedulers.immediate();
    }

    /* renamed from: io */
    public C5373h mo15029io() {
        return Schedulers.immediate();
    }

    /* renamed from: ui */
    public C5373h mo15030ui() {
        return Schedulers.immediate();
    }
}
