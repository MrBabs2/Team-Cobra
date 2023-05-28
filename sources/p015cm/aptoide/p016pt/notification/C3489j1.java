package p015cm.aptoide.p016pt.notification;

import android.app.PendingIntent;
import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cm.aptoide.pt.notification.j1 */
/* compiled from: lambda */
public final /* synthetic */ class C3489j1 implements Callable {

    /* renamed from: f */
    private final /* synthetic */ Context f6476f;

    /* renamed from: g */
    private final /* synthetic */ PendingIntent f6477g;

    /* renamed from: h */
    private final /* synthetic */ String f6478h;

    /* renamed from: i */
    private final /* synthetic */ String f6479i;

    /* renamed from: j */
    private final /* synthetic */ PendingIntent f6480j;

    /* renamed from: k */
    private final /* synthetic */ String f6481k;

    public /* synthetic */ C3489j1(Context context, PendingIntent pendingIntent, String str, String str2, PendingIntent pendingIntent2, String str3) {
        this.f6476f = context;
        this.f6477g = pendingIntent;
        this.f6478h = str;
        this.f6479i = str2;
        this.f6480j = pendingIntent2;
        this.f6481k = str3;
    }

    public final Object call() {
        return SystemNotificationShower.m6597a(this.f6476f, this.f6477g, this.f6478h, this.f6479i, this.f6480j, this.f6481k);
    }
}
