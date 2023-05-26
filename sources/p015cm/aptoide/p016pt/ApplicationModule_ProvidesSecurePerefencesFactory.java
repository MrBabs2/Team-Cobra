package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.preferences.SecurePreferences;
import p015cm.aptoide.p016pt.preferences.secure.SecureCoderDecoder;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSecurePerefencesFactory */
public final class ApplicationModule_ProvidesSecurePerefencesFactory implements C10824b<SecurePreferences> {
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final ApplicationModule module;
    private final Provider<SecureCoderDecoder> secureCoderDecoderProvider;

    public ApplicationModule_ProvidesSecurePerefencesFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<SecureCoderDecoder> provider2) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
        this.secureCoderDecoderProvider = provider2;
    }

    public static ApplicationModule_ProvidesSecurePerefencesFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<SecureCoderDecoder> provider2) {
        return new ApplicationModule_ProvidesSecurePerefencesFactory(applicationModule, provider, provider2);
    }

    public static SecurePreferences providesSecurePerefences(ApplicationModule applicationModule, SharedPreferences sharedPreferences, SecureCoderDecoder secureCoderDecoder) {
        SecurePreferences providesSecurePerefences = applicationModule.providesSecurePerefences(sharedPreferences, secureCoderDecoder);
        C10825c.m36718a(providesSecurePerefences, "Cannot return null from a non-@Nullable @Provides method");
        return providesSecurePerefences;
    }

    public SecurePreferences get() {
        return providesSecurePerefences(this.module, this.defaultSharedPreferencesProvider.get(), this.secureCoderDecoderProvider.get());
    }
}
