package p015cm.aptoide.p016pt.app.view.donations.utils;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.asf.appcoins.sdk.contractproxy.AppCoinsAddressProxyBuilder;
import com.asf.appcoins.sdk.contractproxy.AppCoinsAddressProxySdk;
import com.google.android.gms.common.util.Hex;
import com.google.gson.C8668e;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Formatter;
import p120q.p326a.C11496w;
import p120q.p326a.p349h0.C11461a;

/* renamed from: cm.aptoide.pt.app.view.donations.utils.GenericPaymentIntentBuilder */
public class GenericPaymentIntentBuilder {
    private static final int MAIN_NETWORK_ID = 1;
    private static final int ROPSTEN_NETWORK_ID = 3;

    /* renamed from: cm.aptoide.pt.app.view.donations.utils.GenericPaymentIntentBuilder$TransactionData */
    public static class TransactionData {
        public static final String TYPE_DONATION = "DONATION";
        public static final String TYPE_INAPP = "INAPP";
        String domain;
        String payload;
        String skuId;
        String type;

        public TransactionData(String str, String str2, String str3, String str4) {
            this.type = str;
            this.domain = str2;
            this.skuId = str3;
            this.payload = str4;
        }
    }

    public static PendingIntent buildBuyIntent(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        AppCoinsAddressProxySdk createAddressProxySdk = new AppCoinsAddressProxyBuilder().createAddressProxySdk();
        int i = z ? 3 : 1;
        return (PendingIntent) C11496w.m37606a(createAddressProxySdk.getAppCoinsAddress(i).mo37611b(C11461a.m37548b()), createAddressProxySdk.getIabAddress(i).mo37611b(C11461a.m37548b()), new C1515a(context, i, str, str2, str3, str4, str5, str6)).mo37609b();
    }

    /* access modifiers changed from: private */
    public static PendingIntent buildPaymentIntent(Context context, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str2;
        BigDecimal multiply = new BigDecimal(str2).multiply(BigDecimal.TEN.pow(18));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(buildUriString(str3, str4, multiply, str5, str, i, str6, str7, str8)));
        Context context2 = context;
        return PendingIntent.getActivity(context, 0, intent, 134217728);
    }

    private static String buildUriData(String str, String str2, String str3, String str4) throws UnsupportedEncodingException {
        return "0x" + Hex.m16275a(new C8668e().mo32307a((Object) new TransactionData(str3, str2, str, str4)).getBytes("UTF-8")).toLowerCase();
    }

    private static String buildUriString(String str, String str2, BigDecimal bigDecimal, String str3, String str4, int i, String str5, String str6, String str7) {
        StringBuilder sb = new StringBuilder(4);
        try {
            new Formatter(sb).format("ethereum:%s@%d/buy?uint256=%s&address=%s&data=%s&iabContractAddress=%s", new Object[]{str, Integer.valueOf(i), bigDecimal.toString(), str3, buildUriData(str4, str5, str6, str7), str2});
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported!", e);
        }
    }
}
