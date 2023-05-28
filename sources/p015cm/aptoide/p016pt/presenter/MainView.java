package p015cm.aptoide.p016pt.presenter;

import android.content.Intent;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.presenter.MainView */
public interface MainView extends View {
    void dismissAutoUpdateDialog();

    void dismissInstallationError();

    C5368e<Void> getInstallErrorsDismiss();

    Intent getIntentAfterCreate();

    void hideLoadingView();

    C5368e<String> onAuthenticationIntent();

    void showGenericErrorMessage();

    void showInstallationError(int i);

    void showInstallationSuccessMessage();

    void showLoadingView();

    void showUnknownErrorMessage();

    void showUpdatesBadge(int i);
}
