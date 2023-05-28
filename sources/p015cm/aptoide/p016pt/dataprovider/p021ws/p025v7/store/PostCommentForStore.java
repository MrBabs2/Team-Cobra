package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.SharedPreferences;
import com.fasterxml.jackson.annotation.JsonProperty;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.SetComment;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.PostCommentForStore */
public class PostCommentForStore extends C2185V7<SetComment, Body> {
    private PostCommentForStore(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_WRITE_V7_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* renamed from: of */
    public static PostCommentForStore m5378of(long j, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new PostCommentForStore(new Body(j, str), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.PostCommentForStore$Body */
    public static class Body extends BaseBody {
        private String body;
        @JsonProperty("comment_id")
        private Long previousCommentId;
        private long storeId;

        public Body(long j, String str, long j2) {
            this(j, str);
            this.previousCommentId = Long.valueOf(j2);
        }

        public String getBody() {
            return this.body;
        }

        public Long getPreviousCommentId() {
            return this.previousCommentId;
        }

        public long getStoreId() {
            return this.storeId;
        }

        public void setBody(String str) {
            this.body = str;
        }

        public void setPreviousCommentId(Long l) {
            this.previousCommentId = l;
        }

        public void setStoreId(long j) {
            this.storeId = j;
        }

        public Body(long j, String str) {
            this.storeId = j;
            this.body = str;
        }
    }

    /* access modifiers changed from: protected */
    public C5368e<SetComment> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.postStoreComment((Body) this.body, true);
    }

    /* renamed from: of */
    public static PostCommentForStore m5377of(long j, long j2, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new PostCommentForStore(new Body(j, str, j2), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }
}
