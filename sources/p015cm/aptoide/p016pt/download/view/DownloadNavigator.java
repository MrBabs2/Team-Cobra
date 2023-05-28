package p015cm.aptoide.p016pt.download.view;

import android.content.pm.PackageManager;
import androidx.fragment.app.Fragment;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p123rx.C5328b;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/DownloadNavigator;", "", "fragment", "Landroidx/fragment/app/Fragment;", "packageManager", "Landroid/content/pm/PackageManager;", "fragmentNavigator", "Lcm/aptoide/pt/navigator/FragmentNavigator;", "(Landroidx/fragment/app/Fragment;Landroid/content/pm/PackageManager;Lcm/aptoide/pt/navigator/FragmentNavigator;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getFragmentNavigator", "()Lcm/aptoide/pt/navigator/FragmentNavigator;", "getPackageManager", "()Landroid/content/pm/PackageManager;", "openApp", "Lrx/Completable;", "packageName", "", "openOutOfSpaceDialog", "requiredSpace", "", "outOfSpaceDialogResult", "Lrx/Observable;", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigatorWrapper;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadNavigator */
/* compiled from: DownloadNavigator.kt */
public final class DownloadNavigator {
    private final Fragment fragment;
    private final FragmentNavigator fragmentNavigator;
    private final PackageManager packageManager;

    public DownloadNavigator(Fragment fragment2, PackageManager packageManager2, FragmentNavigator fragmentNavigator2) {
        C10202j.m34178b(fragment2, "fragment");
        C10202j.m34178b(packageManager2, "packageManager");
        C10202j.m34178b(fragmentNavigator2, "fragmentNavigator");
        this.fragment = fragment2;
        this.packageManager = packageManager2;
        this.fragmentNavigator = fragmentNavigator2;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final FragmentNavigator getFragmentNavigator() {
        return this.fragmentNavigator;
    }

    public final PackageManager getPackageManager() {
        return this.packageManager;
    }

    public final C5328b openApp(String str) {
        C10202j.m34178b(str, "packageName");
        C5328b d = C5328b.m10169d(new DownloadNavigator$openApp$1(this, str));
        C10202j.m34174a((Object) d, "Completable.fromAction {…, fragment.context)\n    }");
        return d;
    }

    public final C5328b openOutOfSpaceDialog(long j, String str) {
        C10202j.m34178b(str, "packageName");
        C5328b d = C5328b.m10169d(new DownloadNavigator$openOutOfSpaceDialog$1(this, j, str));
        C10202j.m34174a((Object) d, "Completable.fromAction {…SPACE_REQUEST_CODE)\n    }");
        return d;
    }

    public final C5368e<OutOfSpaceNavigatorWrapper> outOfSpaceDialogResult() {
        C5368e<R> j = this.fragmentNavigator.results(1994).mo18694j(DownloadNavigator$outOfSpaceDialogResult$1.INSTANCE);
        C10202j.m34174a((Object) j, "fragmentNavigator.result…kage() else \"\")\n        }");
        return j;
    }
}
