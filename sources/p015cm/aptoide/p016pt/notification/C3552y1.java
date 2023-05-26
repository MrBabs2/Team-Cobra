package p015cm.aptoide.p016pt.notification;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cm.aptoide.pt.notification.y1 */
/* compiled from: lambda */
public final /* synthetic */ class C3552y1 implements Callable {

    /* renamed from: f */
    private final /* synthetic */ Context f6566f;

    /* renamed from: g */
    private final /* synthetic */ int f6567g;

    /* renamed from: h */
    private final /* synthetic */ String f6568h;

    /* renamed from: i */
    private final /* synthetic */ String f6569i;

    public /* synthetic */ C3552y1(Context context, int i, String str, String str2) {
        this.f6566f = context;
        this.f6567g = i;
        this.f6568h = str;
        this.f6569i = str2;
    }

    public final Object call() {
        return SystemNotificationShower.m6599a(this.f6566f, this.f6567g, this.f6568h, this.f6569i);
    }
}
