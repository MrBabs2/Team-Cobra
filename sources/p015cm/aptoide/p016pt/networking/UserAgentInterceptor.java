package p015cm.aptoide.p016pt.networking;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p015cm.aptoide.p016pt.crashreports.CrashReport;

/* renamed from: cm.aptoide.pt.networking.UserAgentInterceptor */
public class UserAgentInterceptor implements Interceptor {
    private final DisplayMetrics displayMetrics;
    private final IdsRepository idsRepository;
    private final String oemid;
    private final String terminalInfo;
    private final String versionName;

    public UserAgentInterceptor(IdsRepository idsRepository2, String str, DisplayMetrics displayMetrics2, String str2, String str3) {
        this.idsRepository = idsRepository2;
        this.oemid = str;
        this.displayMetrics = displayMetrics2;
        this.terminalInfo = str2;
        this.versionName = str3;
    }

    private String getDefaultUserAgent() {
        StringBuilder sb = new StringBuilder(this.versionName + ";" + this.terminalInfo + ";" + (this.displayMetrics.widthPixels + "x" + this.displayMetrics.heightPixels) + ";id:");
        String a = this.idsRepository.getUniqueIdentifier().mo18562a().mo41082a();
        if (a != null) {
            sb.append(a);
        }
        sb.append(";");
        sb.append(";");
        if (!TextUtils.isEmpty(this.oemid)) {
            sb.append(this.oemid);
        }
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
            if (!TextUtils.isEmpty(str)) {
                return chain.proceed(request.newBuilder().header("User-Agent", str).build());
            }
            return chain.proceed(request);
        } catch (IOException e2) {
            CrashReport.getInstance().log(e2);
            throw e2;
        }
    }
}
