package p015cm.aptoide.p016pt.account.view.user;

import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.user.ProfileStepTwoView */
interface ProfileStepTwoView extends View {
    C5368e<Boolean> continueButtonClick();

    void dismissWaitDialog();

    C5368e<Boolean> makePrivateProfileButtonClick();

    C5328b showGenericErrorMessage();

    void showWaitDialog();
}
