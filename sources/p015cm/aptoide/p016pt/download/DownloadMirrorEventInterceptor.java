package p015cm.aptoide.p016pt.download;

import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p015cm.aptoide.p016pt.downloadmanager.Constants;
import p015cm.aptoide.p016pt.install.InstallAnalytics;

/* renamed from: cm.aptoide.pt.download.DownloadMirrorEventInterceptor */
public class DownloadMirrorEventInterceptor implements Interceptor {
    private final DownloadAnalytics downloadAnalytics;
    private final InstallAnalytics installAnalytics;

    public DownloadMirrorEventInterceptor(DownloadAnalytics downloadAnalytics2, InstallAnalytics installAnalytics2) {
        this.downloadAnalytics = downloadAnalytics2;
        this.installAnalytics = installAnalytics2;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Headers headers;
        Request request = chain.request();
        String header = request.header(Constants.VERSION_CODE);
        String header2 = request.header(Constants.PACKAGE);
        int parseInt = Integer.parseInt(request.header(Constants.FILE_TYPE));
        Response proceed = chain.proceed(request.newBuilder().removeHeader(Constants.VERSION_CODE).removeHeader(Constants.PACKAGE).removeHeader(Constants.FILE_TYPE).build());
        if (!(proceed == null || (headers = proceed.headers()) == null)) {
            String str = headers.get("X-Mirror");
            String httpUrl = request.url().toString();
            this.downloadAnalytics.updateDownloadEvent(header, header2, parseInt, str, httpUrl);
            this.installAnalytics.updateInstallEvents(Integer.valueOf(header).intValue(), header2, parseInt, httpUrl);
        }
        return proceed;
    }
}
