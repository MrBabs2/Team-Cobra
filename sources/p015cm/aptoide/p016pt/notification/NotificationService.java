package p015cm.aptoide.p016pt.notification;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.LinkedList;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.dataprovider.model.p017v1.GetPullNotificationsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p022v1.notification.PullCampaignNotificationsRequest;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p123rx.C5368e;
import p123rx.Single;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.notification.NotificationService */
public class NotificationService {
    private final AptoideAccountManager accountManager;
    private final String applicationId;
    private final Converter.Factory converterFactory;
    private final String extraId;
    private final OkHttpClient httpClient;
    private final IdsRepository idsRepository;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final String versionName;

    public NotificationService(String str, OkHttpClient okHttpClient, Converter.Factory factory, IdsRepository idsRepository2, String str2, String str3, SharedPreferences sharedPreferences2, Resources resources2, AptoideAccountManager aptoideAccountManager) {
        this.applicationId = str;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.idsRepository = idsRepository2;
        this.versionName = str2;
        this.extraId = str3;
        this.sharedPreferences = sharedPreferences2;
        this.resources = resources2;
        this.accountManager = aptoideAccountManager;
    }

    private List<AptoideNotification> convertCampaignNotifications(List<GetPullNotificationsResponse> list, String str) {
        String str2;
        String str3;
        LinkedList linkedList = new LinkedList();
        for (GetPullNotificationsResponse next : list) {
            if (next.getAttr() != null) {
                String appName = next.getAttr().getAppName();
                str2 = next.getAttr().getAppGraphic();
                str3 = appName;
            } else {
                str3 = null;
                str2 = null;
            }
            linkedList.add(new AptoideNotification(next.getBody(), next.getImg(), next.getTitle(), next.getUrl(), 0, str3, str2, -1, str, next.getUrlTrack(), next.getUrlTrackNc(), false, System.currentTimeMillis(), next.getExpire(), next.getAbTestingGroup(), next.getCampaignId(), next.getLang(), -1, next.getWhitelistedPackages()));
        }
        return linkedList;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13185a(String str) {
        return PullCampaignNotificationsRequest.m5230of(str, this.versionName, this.applicationId, this.httpClient, this.converterFactory, this.extraId, this.sharedPreferences, this.resources).observe();
    }

    public Single<List<AptoideNotification>> getCampaignNotifications() {
        return this.idsRepository.getUniqueIdentifier().mo18568c(new C3523u(this)).mo18687f(new C3516s(this)).mo18669c().mo18700m();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13186a(List list) {
        return this.accountManager.accountStatus().mo18669c().mo18694j(new C3520t(this, list));
    }

    /* renamed from: a */
    public /* synthetic */ List mo13184a(List list, Account account) {
        return convertCampaignNotifications(list, account.getId());
    }
}
