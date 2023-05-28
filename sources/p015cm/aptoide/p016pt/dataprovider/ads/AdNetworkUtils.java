package p015cm.aptoide.p016pt.dataprovider.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.IOException;
import java.util.Date;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p015cm.aptoide.p016pt.dataprovider.model.MinimalAdInterface;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;

/* renamed from: cm.aptoide.pt.dataprovider.ads.AdNetworkUtils */
public class AdNetworkUtils {
    public static boolean isGooglePlayServicesAvailable(Context context) {
        return GoogleApiAvailability.m15256a().mo24869c(context) == 0;
    }

    private static boolean isImpressionUrlPresent(GetAdsResponse.C2176Ad ad) {
        return (ad == null || ad.getPartner() == null || ad.getPartner().getData() == null || ad.getPartner().getData().getImpressionUrl() == null) ? false : true;
    }

    public static void knock(String str) {
        if (str != null) {
            new OkHttpClient().newCall(new Request.Builder().url(str).build()).enqueue(new Callback() {
                public void onFailure(Call call, IOException iOException) {
                }

                public void onResponse(Call call, Response response) throws IOException {
                    response.body().close();
                }
            });
        }
    }

    public static void knockCpc(MinimalAdInterface minimalAdInterface) {
        knock(minimalAdInterface.getCpcUrl());
    }

    public static void knockCpd(MinimalAdInterface minimalAdInterface) {
        knock(minimalAdInterface.getCpdUrl());
    }

    public static void knockCpi(MinimalAdInterface minimalAdInterface) {
        knock(minimalAdInterface.getCpiUrl());
    }

    public static void knockImpression(GetAdsResponse.C2176Ad ad) {
        if (isImpressionUrlPresent(ad)) {
            knock(ad.getPartner().getData().getImpressionUrl());
        }
    }

    public static String parseMacros(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2)) {
            str = str.replace("[USER_ANDROID_ID]", str2);
        }
        return str.replace("[USER_UDID]", str3).replace("[USER_AAID]", str4).replace("[TIME_STAMP]", String.valueOf(new Date().getTime()));
    }
}
