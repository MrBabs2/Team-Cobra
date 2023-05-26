package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.TermsAndConditionsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.GetTermsAndConditionsStatusRequest */
public class GetTermsAndConditionsStatusRequest extends C2181V3<TermsAndConditionsResponse> {
    private GetTermsAndConditionsStatusRequest(BaseBody baseBody, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: of */
    public static GetTermsAndConditionsStatusRequest m5240of(BodyInterceptor<BaseBody> bodyInterceptor, Converter.Factory factory, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetTermsAndConditionsStatusRequest(new BaseBody(), okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<TermsAndConditionsResponse> loadDataFromNetwork(Service service, boolean z) {
        return service.getTermsAndConditionsStatus(this.map, z);
    }
}
