package p015cm.aptoide.p016pt.actions;

import android.annotation.TargetApi;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.actions.PermissionService */
public interface PermissionService {
    @TargetApi(23)
    void hasDownloadAccess(C5377a aVar, C5377a aVar2);

    @TargetApi(23)
    void requestAccessToAccounts(C5377a aVar, C5377a aVar2);

    @TargetApi(23)
    void requestAccessToAccounts(boolean z, C5377a aVar, C5377a aVar2);

    @TargetApi(23)
    void requestAccessToCamera(C5377a aVar, C5377a aVar2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(C5377a aVar, C5377a aVar2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(boolean z, int i, C5377a aVar, C5377a aVar2);

    @TargetApi(23)
    void requestAccessToExternalFileSystem(boolean z, C5377a aVar, C5377a aVar2);

    @TargetApi(23)
    void requestDownloadAccess(C5377a aVar, C5377a aVar2, boolean z, boolean z2, long j);
}
