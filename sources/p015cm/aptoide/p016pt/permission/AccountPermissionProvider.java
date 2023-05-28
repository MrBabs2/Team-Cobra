package p015cm.aptoide.p016pt.permission;

import java.util.List;
import p015cm.aptoide.p016pt.permission.PermissionProvider;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.permission.AccountPermissionProvider */
public class AccountPermissionProvider {
    private final PermissionProvider permissionProvider;

    public AccountPermissionProvider(PermissionProvider permissionProvider2) {
        this.permissionProvider = permissionProvider2;
    }

    public C5368e<List<PermissionProvider.Permission>> permissionResultCamera(int i) {
        return this.permissionProvider.permissionResults(i);
    }

    public void requestCameraPermission(int i) {
        this.permissionProvider.providePermissions(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, i);
    }

    public void requestGalleryPermission(int i) {
        this.permissionProvider.providePermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, i);
    }
}
