package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AdultContent;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAccountSettingsBodyInterceptorPoolV7Factory */
public final class C1075xe98d65dc implements C10824b<BodyInterceptor<BaseBody>> {
    private final Provider<AdultContent> adultContentProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorProvider;
    private final ApplicationModule module;

    public C1075xe98d65dc(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<AdultContent> provider2) {
        this.module = applicationModule;
        this.bodyInterceptorProvider = provider;
        this.adultContentProvider = provider2;
    }

    public static C1075xe98d65dc create(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<AdultContent> provider2) {
        return new C1075xe98d65dc(applicationModule, provider, provider2);
    }

    public static BodyInterceptor<BaseBody> provideAccountSettingsBodyInterceptorPoolV7(ApplicationModule applicationModule, BodyInterceptor<BaseBody> bodyInterceptor, AdultContent adultContent) {
        BodyInterceptor<BaseBody> provideAccountSettingsBodyInterceptorPoolV7 = applicationModule.provideAccountSettingsBodyInterceptorPoolV7(bodyInterceptor, adultContent);
        C10825c.m36718a(provideAccountSettingsBodyInterceptorPoolV7, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccountSettingsBodyInterceptorPoolV7;
    }

    public BodyInterceptor<BaseBody> get() {
        return provideAccountSettingsBodyInterceptorPoolV7(this.module, this.bodyInterceptorProvider.get(), this.adultContentProvider.get());
    }
}
