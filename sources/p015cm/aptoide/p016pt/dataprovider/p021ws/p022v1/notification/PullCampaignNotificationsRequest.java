package p015cm.aptoide.p016pt.dataprovider.p021ws.p022v1.notification;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.model.p017v1.GetPullNotificationsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p022v1.PnpV1WebService;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p022v1.Service;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v1.notification.PullCampaignNotificationsRequest */
public class PullCampaignNotificationsRequest extends PnpV1WebService<List<GetPullNotificationsResponse>> {

    /* renamed from: id */
    private final String f4863id;
    private final Map<String, String> options;

    protected PullCampaignNotificationsRequest(String str, Map<String, String> map, OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences) {
        super(okHttpClient, factory, sharedPreferences);
        this.options = map;
        this.f4863id = str;
    }

    /* renamed from: of */
    public static PullCampaignNotificationsRequest m5230of(String str, String str2, String str3, OkHttpClient okHttpClient, Converter.Factory factory, String str4, SharedPreferences sharedPreferences, Resources resources) {
        HashMap hashMap = new HashMap();
        hashMap.put("language", AptoideUtils.SystemU.getCountryCode(resources));
        hashMap.put("aptoide_version", str2);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("oem_id", str4);
        }
        hashMap.put("aptoide_package", str3);
        if (ToolboxManager.isDebug(sharedPreferences)) {
            hashMap.put("debug", "true");
        }
        return new PullCampaignNotificationsRequest(str, hashMap, okHttpClient, factory, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<List<GetPullNotificationsResponse>> loadDataFromNetwork(Service service, boolean z) {
        return service.getPullCampaignNotifications(this.f4863id, this.options, true);
    }
}
