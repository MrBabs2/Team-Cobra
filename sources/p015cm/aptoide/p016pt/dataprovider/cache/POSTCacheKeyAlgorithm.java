package p015cm.aptoide.p016pt.dataprovider.cache;

import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p413s.C12905f;

/* renamed from: cm.aptoide.pt.dataprovider.cache.POSTCacheKeyAlgorithm */
public class POSTCacheKeyAlgorithm implements KeyAlgorithm<Request, String> {
    public String getKeyFrom(Request request) {
        Request build = request.newBuilder().build();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("URL:%s\n", new Object[]{build.url().toString()}));
        Headers headers = build.headers();
        if (headers.size() > 0) {
            sb.append("Headers:\n");
            for (String next : headers.names()) {
                sb.append(String.format("\t%s: %s\n", new Object[]{next, AptoideUtils.StringU.join((Iterable<?>) headers.values(next), ", ")}));
            }
        }
        try {
            if (build.body() != null && build.body().contentLength() > 0) {
                sb.append("Body:\n");
                C12905f fVar = new C12905f();
                build.body().writeTo(fVar);
                sb.append(fVar.mo41186q());
            }
            return AptoideUtils.AlgorithmU.computeSha1(sb.toString());
        } catch (IOException e) {
            CrashReport.getInstance().log(e);
            return null;
        }
    }
}
