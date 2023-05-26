package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.BaseBody */
public class BaseBody extends HashMapNotNull<String, Object> {
    public void setAccessToken(String str) {
        put("access_token", str);
        put("oauthToken", str);
    }

    public void setAndroidVersion(int i) {
        put("android_version", Integer.valueOf(i));
    }

    public void setAptoideMd5sum(String str) {
        put("aptoide_md5sum", str);
    }

    public void setAptoidePackage(String str) {
        put("aptoide_package", str);
    }

    public void setAptoideUid(String str) {
        put("aptoide_uid", str);
    }

    public void setAuthMode(String str) {
        put("authMode", str);
    }

    public void setMobileCountryCode(String str) {
        put("mcc", str);
    }

    public void setMobileNetworkCode(String str) {
        put("mnc", str);
    }

    public void setQ(String str) {
        put("q", str);
    }

    public void setResponseMode(String str) {
        put("mode", str);
    }

    public void setSimCountryISOCode(String str) {
        put("simcc", str);
    }
}
