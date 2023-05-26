package p015cm.aptoide.p016pt.navigator;

import android.content.Context;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.link.CustomTabsHelper;
import p015cm.aptoide.p016pt.themes.ThemeManager;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo16641d2 = {"Lcm/aptoide/pt/navigator/ExternalNavigator;", "", "context", "Landroid/content/Context;", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "(Landroid/content/Context;Lcm/aptoide/pt/themes/ThemeManager;)V", "getContext", "()Landroid/content/Context;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "navigateToExternalWebsite", "", "url", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.navigator.ExternalNavigator */
/* compiled from: ExternalNavigator.kt */
public class ExternalNavigator {
    private final Context context;
    private final ThemeManager themeManager;

    public ExternalNavigator(Context context2, ThemeManager themeManager2) {
        C10202j.m34178b(context2, "context");
        C10202j.m34178b(themeManager2, "themeManager");
        this.context = context2;
        this.themeManager = themeManager2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final void navigateToExternalWebsite(String str) {
        C10202j.m34178b(str, "url");
        CustomTabsHelper.getInstance().openInChromeCustomTab(str, this.context, this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).resourceId);
    }
}
