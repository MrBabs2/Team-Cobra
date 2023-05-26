package p015cm.aptoide.p016pt.install;

import android.content.Context;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/pt/install/ForegroundManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "startDownloadService", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.install.ForegroundManager */
/* compiled from: ForegroundManager.kt */
public final class ForegroundManager {
    private final Context context;

    public ForegroundManager(Context context2) {
        C10202j.m34178b(context2, "context");
        this.context = context2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final void startDownloadService() {
        this.context.startService(DownloadService.newInstanceForDownloads(this.context));
    }
}
