package p015cm.aptoide.p016pt.download.view;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/DownloadDialogProvider;", "", "fragment", "Landroidx/fragment/app/Fragment;", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "(Landroidx/fragment/app/Fragment;Lcm/aptoide/pt/themes/ThemeManager;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "showDialog", "Lrx/Observable;", "Lcm/aptoide/pt/utils/GenericDialogs$EResponse;", "title", "", "message", "showDowngradeDialog", "", "showDowngradingSnackBar", "", "showGenericError", "Lrx/Completable;", "showOutOfSpaceError", "showRootInstallWarningPopup", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadDialogProvider */
/* compiled from: DownloadDialogProvider.kt */
public final class DownloadDialogProvider {
    private final Fragment fragment;
    private final ThemeManager themeManager;

    public DownloadDialogProvider(Fragment fragment2, ThemeManager themeManager2) {
        C10202j.m34178b(fragment2, "fragment");
        C10202j.m34178b(themeManager2, "themeManager");
        this.fragment = fragment2;
        this.themeManager = themeManager2;
    }

    private final C5368e<GenericDialogs.EResponse> showDialog(String str, String str2) {
        C5368e<GenericDialogs.EResponse> b = GenericDialogs.createGenericOkMessage(this.fragment.getContext(), str, str2, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18662b(C5376a.m10346b());
        C10202j.m34174a((Object) b, "GenericDialogs.createGen…dSchedulers.mainThread())");
        return b;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final C5368e<Boolean> showDowngradeDialog() {
        C5368e<R> j = GenericDialogs.createGenericContinueCancelMessage(this.fragment.requireContext(), (String) null, this.fragment.getResources().getString(C1086R.string.downgrade_warning_dialog), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18694j(DownloadDialogProvider$showDowngradeDialog$1.INSTANCE);
        C10202j.m34174a((Object) j, "GenericDialogs.createGen…icDialogs.EResponse.YES }");
        return j;
    }

    public final void showDowngradingSnackBar() {
        View view = this.fragment.getView();
        if (view != null) {
            Snackbar.m28075a(view, (int) C1086R.string.downgrading_msg, -1).mo31972k();
        }
    }

    public final C5328b showGenericError() {
        String string = this.fragment.getString(C1086R.string.error_occured);
        C10202j.m34174a((Object) string, "fragment.getString(R.string.error_occured)");
        C5328b k = showDialog("", string).mo18696k();
        C10202j.m34174a((Object) k, "showDialog(\"\",\n        f…occured)).toCompletable()");
        return k;
    }

    public final C5328b showOutOfSpaceError() {
        String string = this.fragment.getString(C1086R.string.out_of_space_dialog_title);
        C10202j.m34174a((Object) string, "fragment.getString(R.str…ut_of_space_dialog_title)");
        String string2 = this.fragment.getString(C1086R.string.out_of_space_dialog_message);
        C10202j.m34174a((Object) string2, "fragment.getString(R.str…_of_space_dialog_message)");
        C5328b k = showDialog(string, string2).mo18696k();
        C10202j.m34174a((Object) k, "showDialog(fragment.getS…message)).toCompletable()");
        return k;
    }

    public final C5368e<Boolean> showRootInstallWarningPopup() {
        C5368e<R> j = GenericDialogs.createGenericYesNoCancelMessage(this.fragment.requireContext(), (String) null, this.fragment.getResources().getString(C1086R.string.root_access_dialog), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18694j(DownloadDialogProvider$showRootInstallWarningPopup$1.INSTANCE);
        C10202j.m34174a((Object) j, "GenericDialogs.createGen…icDialogs.EResponse.YES }");
        return j;
    }
}
