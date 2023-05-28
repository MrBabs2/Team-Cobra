package p015cm.aptoide.p016pt.ads.data;

import android.view.View;

/* renamed from: cm.aptoide.pt.ads.data.ApplicationAd */
public interface ApplicationAd {

    /* renamed from: cm.aptoide.pt.ads.data.ApplicationAd$Network */
    public enum Network {
        SERVER("Server");
        
        private String name;

        private Network(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    String getAdTitle();

    Payout getAppcPayout();

    String getIconUrl();

    Network getNetwork();

    String getPackageName();

    Integer getStars();

    boolean hasAppcPayout();

    void registerClickableView(View view);

    void setAdView(View view);
}
