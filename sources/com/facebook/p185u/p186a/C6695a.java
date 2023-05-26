package com.facebook.p185u.p186a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.C4716f;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6475w;
import com.facebook.internal.C6476x;
import com.google.zxing.C8806a;
import com.google.zxing.C8808c;
import com.google.zxing.C8812d;
import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8825b;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.u.a.a */
/* compiled from: DeviceRequestsHelper */
public class C6695a {

    /* renamed from: a */
    private static final String f12496a = "com.facebook.u.a.a";

    /* renamed from: b */
    private static HashMap<String, NsdManager.RegistrationListener> f12497b = new HashMap<>();

    /* renamed from: com.facebook.u.a.a$a */
    /* compiled from: DeviceRequestsHelper */
    static class C6696a implements NsdManager.RegistrationListener {

        /* renamed from: a */
        final /* synthetic */ String f12498a;

        /* renamed from: b */
        final /* synthetic */ String f12499b;

        C6696a(String str, String str2) {
            this.f12498a = str;
            this.f12499b = str2;
        }

        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            C6695a.m14346a(this.f12499b);
        }

        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            if (!this.f12498a.equals(nsdServiceInfo.getServiceName())) {
                C6695a.m14346a(this.f12499b);
            }
        }

        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        }

        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }
    }

    /* renamed from: a */
    public static String m14345a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public static boolean m14348b() {
        C6446m c = C6448n.m13386c(C4716f.m7697f());
        return Build.VERSION.SDK_INT >= 16 && c != null && c.mo20998k().contains(C6475w.Enabled);
    }

    /* renamed from: c */
    public static Bitmap m14349c(String str) {
        EnumMap enumMap = new EnumMap(C8808c.class);
        enumMap.put(C8808c.MARGIN, 2);
        try {
            C8825b a = new C8812d().mo32558a(str, C8806a.QR_CODE, 200, 200, enumMap);
            int c = a.mo32601c();
            int e = a.mo32603e();
            int[] iArr = new int[(c * e)];
            for (int i = 0; i < c; i++) {
                int i2 = i * e;
                for (int i3 = 0; i3 < e; i3++) {
                    iArr[i2 + i3] = a.mo32598a(i3, i) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(e, c, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, e, 0, 0, e, c);
            return createBitmap;
        } catch (WriterException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m14350d(String str) {
        if (m14348b()) {
            return m14351e(str);
        }
        return false;
    }

    @TargetApi(16)
    /* renamed from: e */
    private static boolean m14351e(String str) {
        if (f12497b.containsKey(str)) {
            return true;
        }
        String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{"android", C4716f.m7710s().replace('.', '|')}), str});
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(format);
        nsdServiceInfo.setPort(80);
        C6696a aVar = new C6696a(format, str);
        f12497b.put(str, aVar);
        ((NsdManager) C4716f.m7696e().getSystemService("servicediscovery")).registerService(nsdServiceInfo, 1, aVar);
        return true;
    }

    @TargetApi(16)
    /* renamed from: b */
    private static void m14347b(String str) {
        NsdManager.RegistrationListener registrationListener = f12497b.get(str);
        if (registrationListener != null) {
            try {
                ((NsdManager) C4716f.m7696e().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException e) {
                C6476x.m13507a(f12496a, (Exception) e);
            }
            f12497b.remove(str);
        }
    }

    /* renamed from: a */
    public static void m14346a(String str) {
        m14347b(str);
    }
}
