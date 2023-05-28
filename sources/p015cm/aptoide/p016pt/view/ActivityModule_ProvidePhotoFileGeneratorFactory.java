package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.account.view.PhotoFileGenerator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidePhotoFileGeneratorFactory */
public final class ActivityModule_ProvidePhotoFileGeneratorFactory implements C10824b<PhotoFileGenerator> {
    private final ActivityModule module;

    public ActivityModule_ProvidePhotoFileGeneratorFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvidePhotoFileGeneratorFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvidePhotoFileGeneratorFactory(activityModule);
    }

    public static PhotoFileGenerator providePhotoFileGenerator(ActivityModule activityModule) {
        PhotoFileGenerator providePhotoFileGenerator = activityModule.providePhotoFileGenerator();
        C10825c.m36718a(providePhotoFileGenerator, "Cannot return null from a non-@Nullable @Provides method");
        return providePhotoFileGenerator;
    }

    public PhotoFileGenerator get() {
        return providePhotoFileGenerator(this.module);
    }
}
