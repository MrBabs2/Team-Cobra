package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.utils.FileUtils;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideFileUtilsFactory */
public final class ApplicationModule_ProvideFileUtilsFactory implements C10824b<FileUtils> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideFileUtilsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideFileUtilsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideFileUtilsFactory(applicationModule);
    }

    public static FileUtils provideFileUtils(ApplicationModule applicationModule) {
        FileUtils provideFileUtils = applicationModule.provideFileUtils();
        C10825c.m36718a(provideFileUtils, "Cannot return null from a non-@Nullable @Provides method");
        return provideFileUtils;
    }

    public FileUtils get() {
        return provideFileUtils(this.module);
    }
}
