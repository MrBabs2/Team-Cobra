package p015cm.aptoide.p016pt.notification;

import android.app.PendingIntent;
import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cm.aptoide.pt.notification.o1 */
/* compiled from: lambda */
public final /* synthetic */ class C3504o1 implements Callable {

    /* renamed from: f */
    private final /* synthetic */ Context f6497f;

    /* renamed from: g */
    private final /* synthetic */ PendingIntent f6498g;

    /* renamed from: h */
    private final /* synthetic */ String f6499h;

    /* renamed from: i */
    private final /* synthetic */ String f6500i;

    /* renamed from: j */
    private final /* synthetic */ String f6501j;

    /* renamed from: k */
    private final /* synthetic */ PendingIntent f6502k;

    public /* synthetic */ C3504o1(Context context, PendingIntent pendingIntent, String str, String str2, String str3, PendingIntent pendingIntent2) {
        this.f6497f = context;
        this.f6498g = pendingIntent;
        this.f6499h = str;
        this.f6500i = str2;
        this.f6501j = str3;
        this.f6502k = pendingIntent2;
    }

    public final Object call() {
        return SystemNotificationShower.m6598a(this.f6497f, this.f6498g, this.f6499h, this.f6500i, this.f6501j, this.f6502k);
    }
}
