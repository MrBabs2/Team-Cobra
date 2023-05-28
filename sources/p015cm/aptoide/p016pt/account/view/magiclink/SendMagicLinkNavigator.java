package p015cm.aptoide.p016pt.account.view.magiclink;

import android.content.Context;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.link.CustomTabsHelper;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.themes.ThemeManager;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/magiclink/SendMagicLinkNavigator;", "", "fragmentNavigator", "Lcm/aptoide/pt/navigator/FragmentNavigator;", "context", "Landroid/content/Context;", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "(Lcm/aptoide/pt/navigator/FragmentNavigator;Landroid/content/Context;Lcm/aptoide/pt/themes/ThemeManager;)V", "getContext", "()Landroid/content/Context;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "navigateToBlog", "", "navigateToCheckYourEmail", "email", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.magiclink.SendMagicLinkNavigator */
/* compiled from: SendMagicLinkNavigator.kt */
public final class SendMagicLinkNavigator {
    private final Context context;
    private final FragmentNavigator fragmentNavigator;
    private final ThemeManager themeManager;

    public SendMagicLinkNavigator(FragmentNavigator fragmentNavigator2, Context context2, ThemeManager themeManager2) {
        C10202j.m34178b(fragmentNavigator2, "fragmentNavigator");
        C10202j.m34178b(context2, "context");
        C10202j.m34178b(themeManager2, "themeManager");
        this.fragmentNavigator = fragmentNavigator2;
        this.context = context2;
        this.themeManager = themeManager2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final void navigateToBlog() {
        CustomTabsHelper.getInstance().openInChromeCustomTab("https://blog.aptoide.com/aptoide-new-authentication-system-no-user-data-storage/", this.context, this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).resourceId);
    }

    public final void navigateToCheckYourEmail(String str) {
        C10202j.m34178b(str, "email");
        this.fragmentNavigator.navigateTo(CheckYourEmailFragment.Companion.newInstance(str), true);
    }
}
