package p015cm.aptoide.analytics.implementation.loggers;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p015cm.aptoide.analytics.KnockEventLogger;

/* renamed from: cm.aptoide.analytics.implementation.loggers.HttpKnockEventLogger */
public class HttpKnockEventLogger implements KnockEventLogger {
    private final OkHttpClient client;

    public HttpKnockEventLogger(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public void log(String str) {
        this.client.newCall(new Request.Builder().url(str).build()).enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
            }

            public void onResponse(Call call, Response response) {
                response.body().close();
            }
        });
    }
}
