package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.account.view.UriToPathResolver;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideUriToPathResolverFactory */
public final class ActivityModule_ProvideUriToPathResolverFactory implements C10824b<UriToPathResolver> {
    private final ActivityModule module;

    public ActivityModule_ProvideUriToPathResolverFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideUriToPathResolverFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideUriToPathResolverFactory(activityModule);
    }

    public static UriToPathResolver provideUriToPathResolver(ActivityModule activityModule) {
        UriToPathResolver provideUriToPathResolver = activityModule.provideUriToPathResolver();
        C10825c.m36718a(provideUriToPathResolver, "Cannot return null from a non-@Nullable @Provides method");
        return provideUriToPathResolver;
    }

    public UriToPathResolver get() {
        return provideUriToPathResolver(this.module);
    }
}
