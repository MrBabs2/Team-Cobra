package p015cm.aptoide.p016pt.notification;

import android.app.PendingIntent;
import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cm.aptoide.pt.notification.w0 */
/* compiled from: lambda */
public final /* synthetic */ class C3545w0 implements Callable {

    /* renamed from: f */
    private final /* synthetic */ Context f6553f;

    /* renamed from: g */
    private final /* synthetic */ PendingIntent f6554g;

    /* renamed from: h */
    private final /* synthetic */ String f6555h;

    /* renamed from: i */
    private final /* synthetic */ String f6556i;

    /* renamed from: j */
    private final /* synthetic */ PendingIntent f6557j;

    /* renamed from: k */
    private final /* synthetic */ int f6558k;

    public /* synthetic */ C3545w0(Context context, PendingIntent pendingIntent, String str, String str2, PendingIntent pendingIntent2, int i) {
        this.f6553f = context;
        this.f6554g = pendingIntent;
        this.f6555h = str;
        this.f6556i = str2;
        this.f6557j = pendingIntent2;
        this.f6558k = i;
    }

    public final Object call() {
        return SystemNotificationShower.m6596a(this.f6553f, this.f6554g, this.f6555h, this.f6556i, this.f6557j, this.f6558k);
    }
}
