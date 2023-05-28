package p015cm.aptoide.p016pt.view;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.editorialList.EditorialCardListService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesEditorialServiceFactory */
public final class FragmentModule_ProvidesEditorialServiceFactory implements C10824b<EditorialCardListService> {
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final FragmentModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public FragmentModule_ProvidesEditorialServiceFactory(FragmentModule fragmentModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<TokenInvalidator> provider3, Provider<SharedPreferences> provider4) {
        this.module = fragmentModule;
        this.bodyInterceptorPoolV7Provider = provider;
        this.okHttpClientProvider = provider2;
        this.tokenInvalidatorProvider = provider3;
        this.sharedPreferencesProvider = provider4;
    }

    public static FragmentModule_ProvidesEditorialServiceFactory create(FragmentModule fragmentModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<TokenInvalidator> provider3, Provider<SharedPreferences> provider4) {
        return new FragmentModule_ProvidesEditorialServiceFactory(fragmentModule, provider, provider2, provider3, provider4);
    }

    public static EditorialCardListService providesEditorialService(FragmentModule fragmentModule, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        EditorialCardListService providesEditorialService = fragmentModule.providesEditorialService(bodyInterceptor, okHttpClient, tokenInvalidator, sharedPreferences);
        C10825c.m36718a(providesEditorialService, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialService;
    }

    public EditorialCardListService get() {
        return providesEditorialService(this.module, this.bodyInterceptorPoolV7Provider.get(), this.okHttpClientProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get());
    }
}
