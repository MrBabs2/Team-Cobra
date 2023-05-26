package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import android.content.SharedPreferences;
import android.text.TextUtils;
import okhttp3.internal.cache.DiskLruCache;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.networking.BodyInterceptorV3;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.PushNotificationsRequest */
public class PushNotificationsRequest extends C2181V3<GetPushNotificationsResponse> {
    protected PushNotificationsRequest(BaseBody baseBody, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator) {
        super("https://webservices.aptoide.com/webservices/3/", baseBody, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static PushNotificationsRequest m5243of(SharedPreferences sharedPreferences, String str, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, int i, int i2, String str2) {
        BaseBody baseBody = new BaseBody();
        baseBody.put("oem_id", str);
        baseBody.put("mode", BodyInterceptorV3.RESPONSE_MODE_JSON);
        baseBody.put("limit", DiskLruCache.VERSION_1);
        baseBody.put("lang", str2);
        if (ManagerPreferences.isDebug(sharedPreferences)) {
            String notificationType = ManagerPreferences.getNotificationType(sharedPreferences);
            if (TextUtils.isEmpty(notificationType)) {
                notificationType = "aptoide_tests";
            }
            baseBody.put("notification_type", notificationType);
        } else {
            baseBody.put("notification_type", "aptoide_vanilla");
        }
        baseBody.put(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, String.valueOf(i2));
        baseBody.put("aptoide_vercode", Integer.toString(i));
        return new PushNotificationsRequest(baseBody, bodyInterceptor, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetPushNotificationsResponse> loadDataFromNetwork(Service service, boolean z) {
        return service.getPushNotifications(this.map, z);
    }
}
