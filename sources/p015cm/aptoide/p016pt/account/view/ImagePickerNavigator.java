package p015cm.aptoide.p016pt.account.view;

import android.net.Uri;
import android.provider.MediaStore;
import p015cm.aptoide.p016pt.navigator.ActivityNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.ImagePickerNavigator */
public class ImagePickerNavigator {
    private final ActivityNavigator activityNavigator;

    public ImagePickerNavigator(ActivityNavigator activityNavigator2) {
        this.activityNavigator = activityNavigator2;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m4352a(Result result) {
        return Boolean.valueOf(result.getResultCode() == -1);
    }

    /* renamed from: b */
    static /* synthetic */ Void m4353b(Result result) {
        return null;
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m4354c(Result result) {
        return Boolean.valueOf(result.getResultCode() == -1);
    }

    public C5368e<Void> navigateToCameraWithImageUri(int i, Uri uri) {
        return this.activityNavigator.navigateForResultWithOutput("android.media.action.IMAGE_CAPTURE", uri, i).mo18681d(C1176h.f3602f).mo18694j(C1172f.f3597f);
    }

    public C5368e<String> navigateToGalleryForImageUri(int i) {
        return this.activityNavigator.navigateForResult("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI, i).mo18681d(C1178i.f3604f).mo18694j(C1174g.f3600f);
    }
}
