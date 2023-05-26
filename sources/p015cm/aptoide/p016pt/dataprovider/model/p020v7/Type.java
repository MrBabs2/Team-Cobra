package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import android.content.res.Resources;
import android.view.WindowManager;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.Type */
public enum Type {
    _EMPTY(1, true),
    APPS_GROUP(3, false),
    STORES_GROUP(3, false),
    FOLLOW_STORE(3, false),
    DISPLAYS(2, true),
    ADS(3, false),
    HOME_META(1, true),
    COMMENTS_GROUP(1, true),
    APPCOINS_ADS(3, false),
    APPS_TOP_GROUP(3, false),
    APPCOINS_FEATURED(3, false),
    ESKILLS(3, false),
    REVIEWS_GROUP(1, false),
    STORE_META(1, true),
    MY_STORE_META(1, true),
    MY_STORES_SUBSCRIBED(3, false),
    STORES_RECOMMENDED(3, false),
    MY_STORE(1, true),
    ACTION_ITEM(1, true),
    NEWS_ITEM(1, true),
    NEW_APP(1, false),
    NEW_APP_VERSION(1, false),
    IN_GAME_EVENT(1, true),
    APP_COMING_SOON(1, true);
    
    private final int defaultPerLineCount;
    private final boolean fixedPerLineCount;

    private Type(int i, boolean z) {
        this.defaultPerLineCount = i;
        this.fixedPerLineCount = z;
    }

    public int getDefaultPerLineCount() {
        return this.defaultPerLineCount;
    }

    public int getPerLineCount(Resources resources, WindowManager windowManager) {
        int i;
        if (isFixedPerLineCount()) {
            i = getDefaultPerLineCount();
        } else {
            i = (int) ((AptoideUtils.ScreenU.getScreenWidthInDip(windowManager, resources) / 360.0f) * ((float) getDefaultPerLineCount()));
        }
        if (i > 0) {
            return i;
        }
        return 1;
    }

    public boolean isFixedPerLineCount() {
        return this.fixedPerLineCount;
    }
}
