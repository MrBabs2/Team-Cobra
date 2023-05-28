package p015cm.aptoide.analytics.implementation.network;

/* renamed from: cm.aptoide.analytics.implementation.network.AnalyticsBaseBody */
public class AnalyticsBaseBody {
    private String accessToken;
    private String aptoideMd5sum;
    private String aptoidePackage;
    private String aptoideUid;
    private int aptoideVercode;
    private String lang;
    private boolean mature;

    /* renamed from: q */
    private String f3414q;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAptoideMd5sum() {
        return this.aptoideMd5sum;
    }

    public String getAptoidePackage() {
        return this.aptoidePackage;
    }

    public String getAptoideUid() {
        return this.aptoideUid;
    }

    public int getAptoideVercode() {
        return this.aptoideVercode;
    }

    public String getLang() {
        return this.lang;
    }

    public String getQ() {
        return this.f3414q;
    }

    public boolean isMature() {
        return this.mature;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAptoideMd5sum(String str) {
        this.aptoideMd5sum = str;
    }

    public void setAptoidePackage(String str) {
        this.aptoidePackage = str;
    }

    public void setAptoideUid(String str) {
        this.aptoideUid = str;
    }

    public void setAptoideVercode(int i) {
        this.aptoideVercode = i;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setMature(boolean z) {
        this.mature = z;
    }

    public void setQ(String str) {
        this.f3414q = str;
    }
}
