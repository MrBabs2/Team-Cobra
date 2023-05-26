package p015cm.aptoide.p016pt.actions;

import p123rx.C12475j;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.actions.RequestDownloadAccessOnSubscribe */
public class RequestDownloadAccessOnSubscribe implements C5368e.C5370a<Void> {
    private final boolean allowDownloadOnMobileData;
    private final boolean canBypassWifi;
    private final PermissionService permissionRequest;
    private final long size;

    public RequestDownloadAccessOnSubscribe(PermissionService permissionService, boolean z, boolean z2, long j) {
        this.permissionRequest = permissionService;
        this.allowDownloadOnMobileData = z;
        this.canBypassWifi = z2;
        this.size = j;
    }

    /* renamed from: a */
    static /* synthetic */ void m4503a(C12475j jVar) {
        if (!jVar.isUnsubscribed()) {
            jVar.onNext(null);
            jVar.onCompleted();
        }
    }

    public void call(C12475j<? super Void> jVar) {
        this.permissionRequest.requestDownloadAccess(new C1332e(jVar), new C1333f(jVar), this.allowDownloadOnMobileData, this.canBypassWifi, this.size);
    }
}
