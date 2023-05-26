package p015cm.aptoide.p016pt;

import androidx.lifecycle.C0521j;
import androidx.lifecycle.C0532s;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, mo16641d2 = {"Lcm/aptoide/pt/AppInBackgroundTracker;", "", "()V", "appLifecycleListener", "cm/aptoide/pt/AppInBackgroundTracker$appLifecycleListener$1", "Lcm/aptoide/pt/AppInBackgroundTracker$appLifecycleListener$1;", "isAppInBackground", "", "initialize", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.AppInBackgroundTracker */
/* compiled from: AppInBackgroundTracker.kt */
public final class AppInBackgroundTracker {
    private final AppInBackgroundTracker$appLifecycleListener$1 appLifecycleListener = new AppInBackgroundTracker$appLifecycleListener$1(this);
    /* access modifiers changed from: private */
    public boolean isAppInBackground;

    public final void initialize() {
        C0521j g = C0532s.m2606g();
        C10202j.m34174a((Object) g, "ProcessLifecycleOwner.get()");
        g.getLifecycle().mo3039a(this.appLifecycleListener);
    }

    public final boolean isAppInBackground() {
        return this.isAppInBackground;
    }
}
