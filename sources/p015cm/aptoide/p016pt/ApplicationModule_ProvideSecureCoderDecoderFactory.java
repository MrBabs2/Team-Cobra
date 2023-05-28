package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.preferences.secure.SecureCoderDecoder;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideSecureCoderDecoderFactory */
public final class ApplicationModule_ProvideSecureCoderDecoderFactory implements C10824b<SecureCoderDecoder> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvideSecureCoderDecoderFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvideSecureCoderDecoderFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvideSecureCoderDecoderFactory(applicationModule, provider);
    }

    public static SecureCoderDecoder provideSecureCoderDecoder(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        SecureCoderDecoder provideSecureCoderDecoder = applicationModule.provideSecureCoderDecoder(sharedPreferences);
        C10825c.m36718a(provideSecureCoderDecoder, "Cannot return null from a non-@Nullable @Provides method");
        return provideSecureCoderDecoder;
    }

    public SecureCoderDecoder get() {
        return provideSecureCoderDecoder(this.module, this.sharedPreferencesProvider.get());
    }
}
