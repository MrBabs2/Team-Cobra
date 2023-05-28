package p015cm.aptoide.p016pt.app.view;

import android.util.Pair;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.app.view.OfficialAppDisplayable */
public class OfficialAppDisplayable extends Displayable {
    private boolean isAppInstalled;
    private final Pair<String, GetAppMeta> messageGetApp;
    private int primaryColor;
    private int raisedButtonDrawable;

    public OfficialAppDisplayable() {
        this.messageGetApp = null;
        this.primaryColor = C1086R.color.default_orange_gradient_start;
        this.raisedButtonDrawable = C1086R.C1087drawable.aptoide_gradient_rounded;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public Pair<String, GetAppMeta> getMessageGetApp() {
        return this.messageGetApp;
    }

    public int getPrimaryColor() {
        return this.primaryColor;
    }

    public int getRaisedButtonDrawable() {
        return this.raisedButtonDrawable;
    }

    public int getViewLayout() {
        return C1086R.layout.official_app_displayable_layout;
    }

    public boolean isAppInstalled() {
        return this.isAppInstalled;
    }

    public OfficialAppDisplayable(Pair<String, GetAppMeta> pair, int i, int i2, boolean z) {
        this.messageGetApp = pair;
        this.primaryColor = i;
        this.raisedButtonDrawable = i2;
        this.isAppInstalled = z;
    }
}
