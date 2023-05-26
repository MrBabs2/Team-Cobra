package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p123rx.C5328b;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcNavigator;", "", "fragmentNavigator", "Lcm/aptoide/pt/navigator/FragmentNavigator;", "(Lcm/aptoide/pt/navigator/FragmentNavigator;)V", "getFragmentNavigator", "()Lcm/aptoide/pt/navigator/FragmentNavigator;", "openOutOfSpaceDialog", "Lrx/Completable;", "requiredSpace", "", "packageName", "", "outOfSpaceDialogResult", "Lrx/Observable;", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigatorWrapper;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcNavigator */
/* compiled from: EarnAppcNavigator.kt */
public final class EarnAppcNavigator {
    private final FragmentNavigator fragmentNavigator;

    public EarnAppcNavigator(FragmentNavigator fragmentNavigator2) {
        C10202j.m34178b(fragmentNavigator2, "fragmentNavigator");
        this.fragmentNavigator = fragmentNavigator2;
    }

    public final FragmentNavigator getFragmentNavigator() {
        return this.fragmentNavigator;
    }

    public final C5328b openOutOfSpaceDialog(long j, String str) {
        C10202j.m34178b(str, "packageName");
        C5328b d = C5328b.m10169d(new EarnAppcNavigator$openOutOfSpaceDialog$1(this, j, str));
        C10202j.m34174a((Object) d, "Completable.fromAction {…SPACE_REQUEST_CODE)\n    }");
        return d;
    }

    public final C5368e<OutOfSpaceNavigatorWrapper> outOfSpaceDialogResult() {
        C5368e<R> j = this.fragmentNavigator.results(1994).mo18694j(EarnAppcNavigator$outOfSpaceDialogResult$1.INSTANCE);
        C10202j.m34174a((Object) j, "fragmentNavigator.result…kage() else \"\")\n        }");
        return j;
    }
}
