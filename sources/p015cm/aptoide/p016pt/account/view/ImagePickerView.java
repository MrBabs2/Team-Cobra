package p015cm.aptoide.p016pt.account.view;

import android.content.DialogInterface;
import p015cm.aptoide.p016pt.account.view.exception.InvalidImageException;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.ImagePickerView */
public interface ImagePickerView extends View {
    C5368e<DialogInterface> dialogCameraSelected();

    C5368e<DialogInterface> dialogGallerySelected();

    void dismissLoadImageDialog();

    void loadImage(String str);

    C5368e<Void> selectStoreImageClick();

    void showIconPropertiesError(InvalidImageException invalidImageException);

    void showImagePickerDialog();
}
