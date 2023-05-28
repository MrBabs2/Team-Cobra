package p015cm.aptoide.p016pt;

import android.content.ContentResolver;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideContentResolverFactory */
public final class ApplicationModule_ProvideContentResolverFactory implements C10824b<ContentResolver> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideContentResolverFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideContentResolverFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideContentResolverFactory(applicationModule);
    }

    public static ContentResolver provideContentResolver(ApplicationModule applicationModule) {
        ContentResolver provideContentResolver = applicationModule.provideContentResolver();
        C10825c.m36718a(provideContentResolver, "Cannot return null from a non-@Nullable @Provides method");
        return provideContentResolver;
    }

    public ContentResolver get() {
        return provideContentResolver(this.module);
    }
}
