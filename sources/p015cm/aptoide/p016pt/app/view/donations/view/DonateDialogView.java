package p015cm.aptoide.p016pt.app.view.donations.view;

import p015cm.aptoide.p016pt.app.view.donations.model.DonationsDialogResult;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.app.view.donations.view.DonateDialogView */
public interface DonateDialogView {
    C5368e<DonationsDialogResult> cancelClick();

    void dismissDialog();

    C5368e<DonationsDialogResult> donateClick();

    C5368e<Void> noWalletContinueClick();

    void sendWalletIntent(float f, String str, String str2, String str3);

    void showErrorMessage();

    void showLoading();

    void showNoWalletView();
}
