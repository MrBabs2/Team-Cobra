package p015cm.aptoide.p016pt;

import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0520i;
import androidx.lifecycle.C0531r;
import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0007J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0005"}, mo16641d2 = {"cm/aptoide/pt/AppInBackgroundTracker$appLifecycleListener$1", "Landroidx/lifecycle/LifecycleObserver;", "onMoveToBackground", "", "onMoveToForeground", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.AppInBackgroundTracker$appLifecycleListener$1 */
/* compiled from: AppInBackgroundTracker.kt */
public final class AppInBackgroundTracker$appLifecycleListener$1 implements C0520i {
    final /* synthetic */ AppInBackgroundTracker this$0;

    AppInBackgroundTracker$appLifecycleListener$1(AppInBackgroundTracker appInBackgroundTracker) {
        this.this$0 = appInBackgroundTracker;
    }

    @C0531r(C0514f.C0515a.ON_STOP)
    public final void onMoveToBackground() {
        this.this$0.isAppInBackground = true;
    }

    @C0531r(C0514f.C0515a.ON_START)
    public final void onMoveToForeground() {
        this.this$0.isAppInBackground = false;
    }
}
