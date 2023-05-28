package p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords;

import android.content.SharedPreferences;
import android.os.Build;
import okhttp3.OkHttpClient;
import okhttp3.internal.cache.DiskLruCache;
import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.Aptwords;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v2.aptwords.RegisterAdRefererRequest */
public class RegisterAdRefererRequest extends Aptwords<DefaultResponse> {
    private long adId;
    private long appId;

    /* renamed from: q */
    private final String f4865q;
    private String success;
    private String tracker;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v2.aptwords.RegisterAdRefererRequest$DefaultResponse */
    public static class DefaultResponse {
        private String status;

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String str) {
            this.status = str;
        }
    }

    private RegisterAdRefererRequest(long j, long j2, String str, boolean z, OkHttpClient okHttpClient, Converter.Factory factory, String str2, SharedPreferences sharedPreferences) {
        super(okHttpClient, factory, sharedPreferences);
        this.f4865q = str2;
        this.adId = j;
        this.appId = j2;
        this.success = z ? DiskLruCache.VERSION_1 : "0";
        extractAndSetTracker(str);
    }

    /* renamed from: a */
    static /* synthetic */ void m5235a(DefaultResponse defaultResponse) {
    }

    /* renamed from: b */
    static /* synthetic */ void m5236b(Throwable th) {
    }

    private void extractAndSetTracker(String str) {
        this.tracker = str.substring(0, str.indexOf("/", str.indexOf("//") + 2));
    }

    /* renamed from: of */
    public static RegisterAdRefererRequest m5237of(long j, long j2, String str, boolean z, OkHttpClient okHttpClient, Converter.Factory factory, String str2, SharedPreferences sharedPreferences) {
        return new RegisterAdRefererRequest(j, j2, str, z, okHttpClient, factory, str2, sharedPreferences);
    }

    public void execute() {
        super.execute(C2179c.f4870f, (ErrorRequestListener) C2180d.f4871a);
    }

    /* access modifiers changed from: protected */
    public C5368e<DefaultResponse> loadDataFromNetwork(Aptwords.Interfaces interfaces, boolean z) {
        HashMapNotNull hashMapNotNull = new HashMapNotNull();
        hashMapNotNull.put(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, this.success);
        hashMapNotNull.put("adid", Long.toString(this.adId));
        hashMapNotNull.put("appid", Long.toString(this.appId));
        hashMapNotNull.put("q", this.f4865q);
        hashMapNotNull.put("androidversion", Build.VERSION.RELEASE);
        hashMapNotNull.put("tracker", this.tracker);
        return interfaces.load(hashMapNotNull);
    }
}
