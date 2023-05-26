package p015cm.aptoide.p016pt.permission;

import android.annotation.TargetApi;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.view.BackButtonFragment;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.permission.PermissionServiceFragment */
public abstract class PermissionServiceFragment extends BackButtonFragment implements PermissionService {
    @TargetApi(23)
    public void hasDownloadAccess(C5377a aVar, C5377a aVar2) {
        try {
            ((PermissionService) getActivity()).hasDownloadAccess(aVar, aVar2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @TargetApi(23)
    public void requestAccessToAccounts(C5377a aVar, C5377a aVar2) {
        try {
            ((PermissionService) getActivity()).requestAccessToAccounts(aVar, aVar2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @TargetApi(23)
    public void requestAccessToCamera(C5377a aVar, C5377a aVar2) {
        try {
            ((PermissionService) getActivity()).requestAccessToCamera(aVar, aVar2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @TargetApi(23)
    public void requestAccessToExternalFileSystem(C5377a aVar, C5377a aVar2) {
        try {
            ((PermissionService) getActivity()).requestAccessToExternalFileSystem(aVar, aVar2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @TargetApi(23)
    public void requestDownloadAccess(C5377a aVar, C5377a aVar2, boolean z, boolean z2, long j) {
        try {
            ((PermissionService) getActivity()).requestDownloadAccess(aVar, aVar2, z, z2, j);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @TargetApi(23)
    public void requestAccessToAccounts(boolean z, C5377a aVar, C5377a aVar2) {
        try {
            ((PermissionService) getActivity()).requestAccessToAccounts(z, aVar, aVar2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, C5377a aVar, C5377a aVar2) {
        try {
            ((PermissionService) getActivity()).requestAccessToExternalFileSystem(z, aVar, aVar2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }

    @TargetApi(23)
    public void requestAccessToExternalFileSystem(boolean z, int i, C5377a aVar, C5377a aVar2) {
        try {
            ((PermissionService) getActivity()).requestAccessToExternalFileSystem(z, i, aVar, aVar2);
        } catch (ClassCastException unused) {
            throw new IllegalStateException("Containing activity of this fragment must implement " + PermissionService.class.getName());
        }
    }
}
