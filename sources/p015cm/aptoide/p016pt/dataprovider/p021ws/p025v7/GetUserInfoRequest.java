package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetUserInfo;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetUserInfoRequest */
public class GetUserInfoRequest extends C2185V7<GetUserInfo, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetUserInfoRequest$Body */
    public static class Body extends BaseBody {
        private List<String> nodes;

        public Body(List<String> list) {
            this.nodes = list;
        }

        public List<String> getNodes() {
            return this.nodes;
        }

        public void setNodes(List<String> list) {
            this.nodes = list;
        }
    }

    protected GetUserInfoRequest(Body body, String str, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        super(body, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost() {
        return "https://ws75.aptoide.com/api/7/";
    }

    /* renamed from: of */
    public static GetUserInfoRequest m5257of(OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("meta");
        arrayList.add("settings");
        return new GetUserInfoRequest(new Body(arrayList), getHost(), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetUserInfo> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        ((Body) this.body).setRefresh(z);
        return interfaces.getUserInfo((Body) this.body, z);
    }
}
