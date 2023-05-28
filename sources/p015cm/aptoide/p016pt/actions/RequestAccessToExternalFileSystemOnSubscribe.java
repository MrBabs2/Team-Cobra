package p015cm.aptoide.p016pt.actions;

import p123rx.C12475j;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.actions.RequestAccessToExternalFileSystemOnSubscribe */
public class RequestAccessToExternalFileSystemOnSubscribe implements C5368e.C5370a<Void> {
    private final PermissionService permissionService;

    public RequestAccessToExternalFileSystemOnSubscribe(PermissionService permissionService2) {
        this.permissionService = permissionService2;
    }

    /* renamed from: a */
    static /* synthetic */ void m4501a(C12475j jVar) {
        if (!jVar.isUnsubscribed()) {
            jVar.onNext(null);
            jVar.onCompleted();
        }
    }

    public void call(C12475j<? super Void> jVar) {
        this.permissionService.requestAccessToExternalFileSystem(new C1330c(jVar), new C1331d(jVar));
    }
}
