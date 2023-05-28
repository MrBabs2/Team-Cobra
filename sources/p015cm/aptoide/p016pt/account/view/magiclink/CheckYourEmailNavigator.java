package p015cm.aptoide.p016pt.account.view.magiclink;

import android.content.Intent;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.navigator.ActivityNavigator;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailNavigator;", "", "activityNavigator", "Lcm/aptoide/pt/navigator/ActivityNavigator;", "(Lcm/aptoide/pt/navigator/ActivityNavigator;)V", "navigateToEmailApp", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.magiclink.CheckYourEmailNavigator */
/* compiled from: CheckYourEmailNavigator.kt */
public final class CheckYourEmailNavigator {
    private final ActivityNavigator activityNavigator;

    public CheckYourEmailNavigator(ActivityNavigator activityNavigator2) {
        this.activityNavigator = activityNavigator2;
    }

    public final void navigateToEmailApp() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        intent.addFlags(268435456);
        ActivityNavigator activityNavigator2 = this.activityNavigator;
        if (activityNavigator2 != null) {
            activityNavigator2.navigateWithIntent(intent);
        }
    }
}
