package p015cm.aptoide.p016pt.account.view.user;

import p015cm.aptoide.p016pt.account.view.ImagePickerView;
import p015cm.aptoide.p016pt.account.view.user.ManageUserFragment;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.user.ManageUserView */
public interface ManageUserView extends ImagePickerView {
    C5368e<Void> cancelButtonClick();

    void hideProgressDialog();

    void loadImageStateless(String str);

    C5368e<ManageUserFragment.ViewModel> saveUserDataButtonClick();

    void setUserName(String str);

    C5328b showErrorMessage(String str);

    void showProgressDialog();
}
