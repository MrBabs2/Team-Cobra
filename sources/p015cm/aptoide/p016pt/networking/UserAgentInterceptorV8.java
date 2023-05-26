package p015cm.aptoide.p016pt.networking;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;

/* renamed from: cm.aptoide.pt.networking.UserAgentInterceptorV8 */
public class UserAgentInterceptorV8 implements Interceptor {
    private final String androidVersion;
    private final int apiLevel;
    private final AptoideMd5Manager aptoideMd5Manager;
    private final String aptoidePackage;
    private final int aptoideVersionCode;
    private final String architecture;
    private final AuthenticationPersistence authenticationPersistence;
    private final DisplayMetrics displayMetrics;
    private final IdsRepository idsRepository;
    private final String model;
    private final String productCode;
    private final String versionName;

    public UserAgentInterceptorV8(IdsRepository idsRepository2, String str, int i, String str2, String str3, String str4, DisplayMetrics displayMetrics2, String str5, String str6, AptoideMd5Manager aptoideMd5Manager2, int i2, AuthenticationPersistence authenticationPersistence2) {
        this.idsRepository = idsRepository2;
        this.androidVersion = str;
        this.apiLevel = i;
        this.model = str2;
        this.productCode = str3;
        this.architecture = str4;
        this.displayMetrics = displayMetrics2;
        this.versionName = str5;
        this.aptoidePackage = str6;
        this.aptoideMd5Manager = aptoideMd5Manager2;
        this.aptoideVersionCode = i2;
        this.authenticationPersistence = authenticationPersistence2;
    }

    public String getDefaultUserAgent() {
        StringBuilder sb = new StringBuilder("Aptoide/" + this.versionName + " (Linux; Android " + this.androidVersion + "; " + this.apiLevel + "; " + this.model + " Build/" + this.productCode + "; " + this.architecture + "; " + this.aptoidePackage + "; " + this.aptoideVersionCode + "; " + this.aptoideMd5Manager.getAptoideMd5() + "; " + (this.displayMetrics.widthPixels + "x" + this.displayMetrics.heightPixels) + "; ");
        String a = this.idsRepository.getUniqueIdentifier().mo18562a().mo41082a();
        if (a != null) {
            sb.append(a);
        }
        sb.append(")");
        return sb.toString();
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        String str;
        Request request = chain.request();
        try {
            str = getDefaultUserAgent();
        } catch (Exception e) {
            CrashReport.getInstance().log(e);
            str = null;
        }
        try {
            Authentication a = this.authenticationPersistence.getAuthentication().mo18562a().mo41082a();
            Request.Builder newBuilder = request.newBuilder();
            if (!a.isAuthenticated()) {
                if (TextUtils.isEmpty(str)) {
                    return chain.proceed(request);
                }
            }
            if (a.isAuthenticated()) {
                newBuilder.header("AUTHORIZATION", a.getAccessToken());
            }
            if (!TextUtils.isEmpty(str)) {
                newBuilder.header("User-Agent", str);
            }
            return chain.proceed(newBuilder.build());
        } catch (IOException e2) {
            CrashReport.getInstance().log(e2);
            throw e2;
        }
    }
}
