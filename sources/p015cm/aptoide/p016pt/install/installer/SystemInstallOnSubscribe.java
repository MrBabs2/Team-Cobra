package p015cm.aptoide.p016pt.install.installer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.RemoteException;
import p015cm.aptoide.p016pt.install.exception.InstallationException;
import p037k.p038a.p039a.C4775a;
import p123rx.C12475j;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.install.installer.SystemInstallOnSubscribe */
public class SystemInstallOnSubscribe implements C5368e.C5370a<Void> {
    private static final int INSTALL_REPLACE_EXISTING = 2;
    private static final int INSTALL_SUCCEEDED = 1;
    private final Context context;
    private final PackageManager packageManager;
    private final Uri packageUri;

    public SystemInstallOnSubscribe(Context context2, PackageManager packageManager2, Uri uri) {
        this.context = context2;
        this.packageManager = packageManager2;
        this.packageUri = uri;
    }

    private boolean isSystem(Context context2) {
        try {
            if ((this.packageManager.getApplicationInfo(context2.getPackageName(), 0).flags & 1) == 1) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            throw new AssertionError("Aptoide application not found by package manager.");
        }
    }

    public void call(final C12475j<? super Void> jVar) {
        C32931 r0 = new C4775a.C4776a() {
            public void packageInstalled(String str, int i) throws RemoteException {
                if (i == 1) {
                    if (!jVar.isUnsubscribed()) {
                        jVar.onNext(null);
                        jVar.onCompleted();
                    }
                } else if (!jVar.isUnsubscribed()) {
                    C12475j jVar = jVar;
                    jVar.onError(new InstallationException("Package not installed with error code: " + i));
                }
            }
        };
        if (isSystem(this.context)) {
            try {
                this.packageManager.getClass().getMethod("installPackage", new Class[]{Uri.class, C4775a.class, Integer.TYPE, String.class}).invoke(this.packageManager, new Object[]{this.packageUri, r0, 2, ""});
            } catch (Exception e) {
                if (!jVar.isUnsubscribed()) {
                    jVar.onError(new InstallationException((Throwable) e));
                }
            }
        } else if (!jVar.isUnsubscribed()) {
            jVar.onError(new InstallationException("Aptoide does not hold system privilege!"));
        }
    }
}
