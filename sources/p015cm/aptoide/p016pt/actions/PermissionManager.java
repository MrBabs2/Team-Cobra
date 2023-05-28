package p015cm.aptoide.p016pt.actions;

import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.actions.PermissionManager */
public class PermissionManager {
    public C5368e<Boolean> hasDownloadAccess(PermissionService permissionService) {
        return C5368e.m10241a(new HasDownloadAccessOnSubscribe(permissionService));
    }

    public C5368e<Void> requestDownloadAccess(PermissionService permissionService) {
        return C5368e.m10241a(new RequestDownloadAccessOnSubscribe(permissionService, false, false, -1));
    }

    public C5368e<Void> requestDownloadAccessWithWifiBypass(PermissionService permissionService, long j) {
        return C5368e.m10241a(new RequestDownloadAccessOnSubscribe(permissionService, false, true, j));
    }

    public C5368e<Void> requestDownloadAllowingMobileData(PermissionService permissionService) {
        return C5368e.m10241a(new RequestDownloadAccessOnSubscribe(permissionService, true, false, -1));
    }

    public C5368e<Void> requestExternalStoragePermission(PermissionService permissionService) {
        return C5368e.m10241a(new RequestAccessToExternalFileSystemOnSubscribe(permissionService));
    }
}
