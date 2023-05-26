package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetMySubscribedStoresResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetMySubscribedStoresRequest */
public class GetMySubscribedStoresRequest extends C2185V7<GetMySubscribedStoresResponse, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetMySubscribedStoresRequest$Body */
    public static class Body extends BaseBody implements Endless {
        private Integer limit;
        private int offset;
        private Order order;
        private boolean refresh;
        Sort sort;

        /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetMySubscribedStoresRequest$Body$Sort */
        public enum Sort {
            added,
            latest,
            alpha,
            downloads,
            trending
        }

        public Integer getLimit() {
            return this.limit;
        }

        public int getOffset() {
            return this.offset;
        }

        public Order getOrder() {
            return this.order;
        }

        public Sort getSort() {
            return this.sort;
        }

        public void setLimit(Integer num) {
            this.limit = num;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public void setOrder(Order order2) {
            this.order = order2;
        }

        public void setRefresh(boolean z) {
            this.refresh = z;
        }

        public void setSort(Sort sort2) {
            this.sort = sort2;
        }
    }

    public GetMySubscribedStoresRequest(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(new Body(), C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetMySubscribedStoresResponse> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getMySubscribedStores(z, (Body) this.body);
    }
}
