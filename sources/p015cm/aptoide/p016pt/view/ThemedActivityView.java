package p015cm.aptoide.p016pt.view;

import android.os.Bundle;
import javax.inject.Inject;
import p015cm.aptoide.p016pt.themes.ThemeManager;

/* renamed from: cm.aptoide.pt.view.ThemedActivityView */
public abstract class ThemedActivityView extends ActivityView {
    @Inject
    public ThemeManager themeManager;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivityComponent().inject(this);
        this.themeManager.resetToBaseTheme();
    }
}
