package p015cm.aptoide.p016pt.actions;

import p123rx.C12475j;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.actions.HasDownloadAccessOnSubscribe */
public class HasDownloadAccessOnSubscribe implements C5368e.C5370a<Boolean> {
    private final PermissionService permissionService;

    public HasDownloadAccessOnSubscribe(PermissionService permissionService2) {
        this.permissionService = permissionService2;
    }

    /* renamed from: a */
    static /* synthetic */ void m4499a(C12475j jVar) {
        if (!jVar.isUnsubscribed()) {
            jVar.onNext(true);
            jVar.onCompleted();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m4500b(C12475j jVar) {
        if (!jVar.isUnsubscribed()) {
            jVar.onNext(false);
            jVar.onCompleted();
        }
    }

    public void call(C12475j<? super Boolean> jVar) {
        this.permissionService.hasDownloadAccess(new C1329b(jVar), new C1328a(jVar));
    }
}
