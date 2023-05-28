package p015cm.aptoide.p016pt.util;

import android.content.Context;
import p015cm.aptoide.p016pt.dataprovider.util.referrer.SimpleTimedFuture;

/* renamed from: cm.aptoide.pt.util.g */
/* compiled from: lambda */
public final /* synthetic */ class C4445g implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Context f7636f;

    /* renamed from: g */
    private final /* synthetic */ String[] f7637g;

    /* renamed from: h */
    private final /* synthetic */ String f7638h;

    /* renamed from: i */
    private final /* synthetic */ SimpleTimedFuture f7639i;

    public /* synthetic */ C4445g(Context context, String[] strArr, String str, SimpleTimedFuture simpleTimedFuture) {
        this.f7636f = context;
        this.f7637g = strArr;
        this.f7638h = str;
        this.f7639i = simpleTimedFuture;
    }

    public final void run() {
        ReferrerUtils.m7445a(this.f7636f, this.f7637g, this.f7638h, this.f7639i);
    }
}
