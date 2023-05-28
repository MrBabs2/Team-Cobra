package p015cm.aptoide.p016pt;

import android.content.res.Resources;
import android.view.WindowManager;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideQManagerFactory */
public final class ApplicationModule_ProvideQManagerFactory implements C10824b<QManager> {
    private final ApplicationModule module;
    private final Provider<Resources> resourcesProvider;
    private final Provider<WindowManager> windowManagerProvider;

    public ApplicationModule_ProvideQManagerFactory(ApplicationModule applicationModule, Provider<Resources> provider, Provider<WindowManager> provider2) {
        this.module = applicationModule;
        this.resourcesProvider = provider;
        this.windowManagerProvider = provider2;
    }

    public static ApplicationModule_ProvideQManagerFactory create(ApplicationModule applicationModule, Provider<Resources> provider, Provider<WindowManager> provider2) {
        return new ApplicationModule_ProvideQManagerFactory(applicationModule, provider, provider2);
    }

    public static QManager provideQManager(ApplicationModule applicationModule, Resources resources, WindowManager windowManager) {
        QManager provideQManager = applicationModule.provideQManager(resources, windowManager);
        C10825c.m36718a(provideQManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideQManager;
    }

    public QManager get() {
        return provideQManager(this.module, this.resourcesProvider.get(), this.windowManagerProvider.get());
    }
}
