package p015cm.aptoide.p016pt;

import java.text.DecimalFormat;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDecimalFormatFactory */
public final class ApplicationModule_ProvidesDecimalFormatFactory implements C10824b<DecimalFormat> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesDecimalFormatFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesDecimalFormatFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesDecimalFormatFactory(applicationModule);
    }

    public static DecimalFormat providesDecimalFormat(ApplicationModule applicationModule) {
        DecimalFormat providesDecimalFormat = applicationModule.providesDecimalFormat();
        C10825c.m36718a(providesDecimalFormat, "Cannot return null from a non-@Nullable @Provides method");
        return providesDecimalFormat;
    }

    public DecimalFormat get() {
        return providesDecimalFormat(this.module);
    }
}
