package p015cm.aptoide.p016pt.install;

import p123rx.Single;

/* renamed from: cm.aptoide.pt.install.AptoideInstallPersistence */
public interface AptoideInstallPersistence {
    void insert(String str);

    Single<Boolean> isInstalledWithAptoide(String str);
}
