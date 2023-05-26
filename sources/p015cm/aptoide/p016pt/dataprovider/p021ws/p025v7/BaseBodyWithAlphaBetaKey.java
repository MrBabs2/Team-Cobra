package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.BaseBodyWithAlphaBetaKey */
public class BaseBodyWithAlphaBetaKey extends BaseBody {
    private String notApkTags;

    protected BaseBodyWithAlphaBetaKey(SharedPreferences sharedPreferences) {
        if (ManagerPreferences.getUpdatesFilterAlphaBetaKey(sharedPreferences)) {
            this.notApkTags = "alpha,beta";
        }
    }

    public String getNotApkTags() {
        return this.notApkTags;
    }

    public boolean shouldIncludeTag() {
        return true;
    }
}
