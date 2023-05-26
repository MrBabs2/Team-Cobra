package p015cm.aptoide.p016pt.promotions;

import android.text.Editable;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.presenter.View;
import p112n.p118g.p301a.p311d.C10708b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.promotions.ClaimPromotionDialogView */
public interface ClaimPromotionDialogView extends View {
    C5368e<ClaimPromotionsClickWrapper> continueWalletClick();

    void dismissDialog();

    C5368e<Void> dismissGenericErrorClick();

    C5368e<ClaimDialogResultWrapper> dismissGenericMessage();

    C5368e<C10708b> editTextChanges();

    void fetchWalletAddressByClipboard();

    void fetchWalletAddressByIntent();

    C5368e<Result> getActivityResults();

    C5368e<String> getWalletClick();

    void handleEmptyEditText(Editable editable);

    C5368e<Void> onCancelWalletUpdate();

    C5368e<Void> onUpdateWalletClick();

    void sendWalletIntent();

    void showCanceledVerificationError();

    void showClaimSuccess();

    void showGenericError();

    void showInvalidWalletAddress();

    void showLoading();

    void showPromotionAlreadyClaimed();

    void showUpdateWalletDialog();

    void updateWalletText(String str);

    void verifyWallet();

    C5368e<String> walletCancelClick();
}
