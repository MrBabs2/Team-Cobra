package p015cm.aptoide.p016pt.download.view.outofspace;

import java.util.List;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0017\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0003H&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005H&¨\u0006\u0014"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogView;", "Lcm/aptoide/pt/presenter/View;", "dismiss", "", "dismissDialogClick", "Lrx/Observable;", "Ljava/lang/Void;", "requiredSpaceToInstall", "removedAppsize", "", "setupViews", "requiredSpace", "(Ljava/lang/Long;)V", "showGeneralOutOfSpaceError", "showInstalledApps", "installedApps", "", "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "uninstallClick", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceDialogView */
/* compiled from: OutOfSpaceDialogView.kt */
public interface OutOfSpaceDialogView extends View {
    void dismiss();

    C5368e<Void> dismissDialogClick();

    void requiredSpaceToInstall(long j);

    void setupViews(Long l);

    void showGeneralOutOfSpaceError();

    void showInstalledApps(List<InstalledApp> list);

    C5368e<String> uninstallClick();
}
