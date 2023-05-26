package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.analyticsbody;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.analyticsbody.DownloadInstallAnalyticsBaseBody */
public class DownloadInstallAnalyticsBaseBody extends AnalyticsBaseBody {
    private final Data data;

    public DownloadInstallAnalyticsBaseBody(String str, Data data2) {
        super(str);
        this.data = data2;
    }

    public Data getData() {
        return this.data;
    }
}
