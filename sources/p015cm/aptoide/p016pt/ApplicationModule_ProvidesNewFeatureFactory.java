package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.themes.NewFeature;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesNewFeatureFactory */
public final class ApplicationModule_ProvidesNewFeatureFactory implements C10824b<NewFeature> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesNewFeatureFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesNewFeatureFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesNewFeatureFactory(applicationModule);
    }

    public static NewFeature providesNewFeature(ApplicationModule applicationModule) {
        NewFeature providesNewFeature = applicationModule.providesNewFeature();
        C10825c.m36718a(providesNewFeature, "Cannot return null from a non-@Nullable @Provides method");
        return providesNewFeature;
    }

    public NewFeature get() {
        return providesNewFeature(this.module);
    }
}
