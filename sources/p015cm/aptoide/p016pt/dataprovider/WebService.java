package p015cm.aptoide.p016pt.dataprovider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.logger.Logger;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/* renamed from: cm.aptoide.pt.dataprovider.WebService */
public abstract class WebService<T, U> {
    public static final String BYPASS_HEADER_KEY = "X-Bypass-Cache";
    public static final String BYPASS_HEADER_VALUE = "true";
    private static Converter.Factory defaultConverterFactory;
    private final String baseHost;
    private final Class<T> clazz;
    protected final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    protected Retrofit retrofit;

    protected WebService(Class<T> cls, OkHttpClient okHttpClient, Converter.Factory factory, String str) {
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.clazz = cls;
        this.baseHost = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: createService */
    public T mo8495a() {
        return getRetrofit(this.httpClient, this.converterFactory, RxJavaCallAdapterFactory.create(), this.baseHost).create(this.clazz);
    }

    private C5368e<T> createServiceObservable() {
        return C5368e.m10240a(new C2170a(this));
    }

    private ErrorRequestListener defaultErrorRequestListener() {
        return C2175d.f4835a;
    }

    public static Converter.Factory getDefaultConverter() {
        if (defaultConverterFactory == null) {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            objectMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
            objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US));
            defaultConverterFactory = JacksonConverterFactory.create(objectMapper);
        }
        return defaultConverterFactory;
    }

    private Retrofit getRetrofit(OkHttpClient okHttpClient, Converter.Factory factory, CallAdapter.Factory factory2, String str) {
        if (this.retrofit == null) {
            this.retrofit = new Retrofit.Builder().baseUrl(str).client(okHttpClient).addCallAdapterFactory(factory2).addConverterFactory(factory).build();
        }
        return this.retrofit;
    }

    private void onLoadDataFromNetwork() {
    }

    /* access modifiers changed from: private */
    /* renamed from: prepareAndLoad */
    public C5368e<U> mo8496a(T t, boolean z) {
        onLoadDataFromNetwork();
        return loadDataFromNetwork(t, z);
    }

    @Deprecated
    public void execute(SuccessRequestListener<U> successRequestListener, boolean z) {
        execute(successRequestListener, defaultErrorRequestListener(), z);
    }

    /* access modifiers changed from: protected */
    public OkHttpClient getHttpClient() {
        return this.httpClient;
    }

    /* access modifiers changed from: protected */
    public boolean isNoNetworkException(Throwable th) {
        return th instanceof UnknownHostException;
    }

    /* access modifiers changed from: protected */
    public abstract C5368e<U> loadDataFromNetwork(T t, boolean z);

    public C5368e<U> observe() {
        return observe(false);
    }

    @Deprecated
    public void execute(SuccessRequestListener<U> successRequestListener, ErrorRequestListener errorRequestListener, boolean z) {
        observe(z).mo18644a(C5376a.m10346b()).mo18655a(successRequestListener, (C5378b<Throwable>) new C2172b(errorRequestListener));
    }

    public C5368e<U> observe(boolean z) {
        return createServiceObservable().mo18687f(new C2173c(this, z)).mo18662b(Schedulers.m10352io());
    }

    /* renamed from: a */
    static /* synthetic */ void m5227a(Throwable th) {
        Logger.getInstance().mo12979e(ErrorRequestListener.class.getName(), "Erro por implementar");
        th.printStackTrace();
    }

    @Deprecated
    public void execute(SuccessRequestListener<U> successRequestListener, ErrorRequestListener errorRequestListener) {
        execute(successRequestListener, errorRequestListener, false);
    }
}
