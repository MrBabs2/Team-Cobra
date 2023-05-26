package p015cm.aptoide.p016pt.install;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomInstallation;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.install.InstallationPersistence */
public interface InstallationPersistence {
    C5368e<List<RoomInstallation>> getInstallationsHistory();

    C5328b insert(RoomInstallation roomInstallation);

    C5328b insertAll(List<RoomInstallation> list);
}
