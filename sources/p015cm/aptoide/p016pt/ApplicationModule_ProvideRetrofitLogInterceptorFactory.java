package p015cm.aptoide.p016pt;

import okhttp3.Interceptor;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideRetrofitLogInterceptorFactory */
public final class ApplicationModule_ProvideRetrofitLogInterceptorFactory implements C10824b<Interceptor> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideRetrofitLogInterceptorFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideRetrofitLogInterceptorFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideRetrofitLogInterceptorFactory(applicationModule);
    }

    public static Interceptor provideRetrofitLogInterceptor(ApplicationModule applicationModule) {
        Interceptor provideRetrofitLogInterceptor = applicationModule.provideRetrofitLogInterceptor();
        C10825c.m36718a(provideRetrofitLogInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideRetrofitLogInterceptor;
    }

    public Interceptor get() {
        return provideRetrofitLogInterceptor(this.module);
    }
}
