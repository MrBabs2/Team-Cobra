package p015cm.aptoide.p016pt.util;

import android.content.Context;

/* renamed from: cm.aptoide.pt.util.MarketResourceFormatter */
public class MarketResourceFormatter {
    private String marketName;

    public MarketResourceFormatter(String str) {
        this.marketName = str;
    }

    public String formatString(Context context, int i, String... strArr) {
        return context.getString(i);
    }
}
