package p015cm.aptoide.p016pt.app.migration;

import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.app.migration.AppcMigrationPersistence */
public interface AppcMigrationPersistence {
    void insert(String str);

    C5368e<Boolean> isAppMigrated(String str);
}
