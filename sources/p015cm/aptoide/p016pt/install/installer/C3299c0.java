package p015cm.aptoide.p016pt.install.installer;

import android.net.Uri;
import java.util.concurrent.Callable;

/* renamed from: cm.aptoide.pt.install.installer.c0 */
/* compiled from: lambda */
public final /* synthetic */ class C3299c0 implements Callable {

    /* renamed from: f */
    private final /* synthetic */ DefaultInstaller f6232f;

    /* renamed from: g */
    private final /* synthetic */ String f6233g;

    /* renamed from: h */
    private final /* synthetic */ Uri f6234h;

    public /* synthetic */ C3299c0(DefaultInstaller defaultInstaller, String str, Uri uri) {
        this.f6232f = defaultInstaller;
        this.f6233g = str;
        this.f6234h = uri;
    }

    public final Object call() {
        return this.f6232f.mo12831a(this.f6233g, this.f6234h);
    }
}
