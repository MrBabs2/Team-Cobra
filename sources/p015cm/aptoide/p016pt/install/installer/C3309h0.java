package p015cm.aptoide.p016pt.install.installer;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: cm.aptoide.pt.install.installer.h0 */
/* compiled from: lambda */
public final /* synthetic */ class C3309h0 implements Callable {

    /* renamed from: f */
    private final /* synthetic */ DefaultInstaller f6247f;

    /* renamed from: g */
    private final /* synthetic */ Installation f6248g;

    /* renamed from: h */
    private final /* synthetic */ boolean f6249h;

    /* renamed from: i */
    private final /* synthetic */ Context f6250i;

    public /* synthetic */ C3309h0(DefaultInstaller defaultInstaller, Installation installation, boolean z, Context context) {
        this.f6247f = defaultInstaller;
        this.f6248g = installation;
        this.f6249h = z;
        this.f6250i = context;
    }

    public final Object call() {
        return this.f6247f.mo12830a(this.f6248g, this.f6249h, this.f6250i);
    }
}
