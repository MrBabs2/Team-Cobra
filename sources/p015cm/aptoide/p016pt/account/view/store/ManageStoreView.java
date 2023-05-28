package p015cm.aptoide.p016pt.account.view.store;

import p015cm.aptoide.p016pt.account.view.ImagePickerView;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.store.ManageStoreView */
public interface ManageStoreView extends ImagePickerView {
    C5368e<ManageStoreViewModel> cancelClick();

    void dismissWaitProgressBar();

    void loadImageStateless(String str);

    C5368e<ManageStoreViewModel> saveDataClick();

    void showError(String str);

    void showSuccessMessage();

    void showWaitProgressBar();
}
