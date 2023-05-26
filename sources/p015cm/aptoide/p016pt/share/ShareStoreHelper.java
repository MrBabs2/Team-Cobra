package p015cm.aptoide.p016pt.share;

import android.content.Context;
import android.content.Intent;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;

/* renamed from: cm.aptoide.pt.share.ShareStoreHelper */
public class ShareStoreHelper {
    private final Context context;
    private final MarketResourceFormatter marketResourceFormatter;

    public ShareStoreHelper(Context context2, MarketResourceFormatter marketResourceFormatter2) {
        this.context = context2;
        this.marketResourceFormatter = marketResourceFormatter2;
    }

    public void shareStore(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.marketResourceFormatter.formatString(this.context, C1086R.string.hello_follow_me_on_aptoide, new String[0]) + " " + str);
        Context context2 = this.context;
        context2.startActivity(Intent.createChooser(intent, context2.getString(C1086R.string.share)));
    }
}
