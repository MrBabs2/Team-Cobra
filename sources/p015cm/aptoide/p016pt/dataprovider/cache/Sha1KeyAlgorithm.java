package p015cm.aptoide.p016pt.dataprovider.cache;

import java.io.IOException;
import okhttp3.Request;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p413s.C12905f;

/* renamed from: cm.aptoide.pt.dataprovider.cache.Sha1KeyAlgorithm */
public class Sha1KeyAlgorithm implements KeyAlgorithm<Request, String> {
    private static final String TAG = "cm.aptoide.pt.dataprovider.cache.Sha1KeyAlgorithm";

    public String getKeyFrom(Request request) {
        String str;
        try {
            C12905f fVar = new C12905f();
            Request build = request.newBuilder().build();
            if (build.body() == null || build.body().contentLength() <= 0) {
                str = build.url().toString();
            } else {
                build.body().writeTo(fVar);
                str = build.url().toString() + fVar.mo41186q();
            }
            return AptoideUtils.AlgorithmU.computeSha1(str);
        } catch (IOException e) {
            CrashReport.getInstance().log(e);
            return null;
        }
    }
}
