package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.account.view.user.NewsletterManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesNewsletterManagerFactory */
public final class ApplicationModule_ProvidesNewsletterManagerFactory implements C10824b<NewsletterManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesNewsletterManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesNewsletterManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesNewsletterManagerFactory(applicationModule);
    }

    public static NewsletterManager providesNewsletterManager(ApplicationModule applicationModule) {
        NewsletterManager providesNewsletterManager = applicationModule.providesNewsletterManager();
        C10825c.m36718a(providesNewsletterManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesNewsletterManager;
    }

    public NewsletterManager get() {
        return providesNewsletterManager(this.module);
    }
}
