package p015cm.aptoide.p016pt.install;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.install.InstalledPersistence */
public interface InstalledPersistence {
    C5368e<RoomInstalled> get(String str, int i);

    C5368e<List<RoomInstalled>> getAll();

    C5368e<List<RoomInstalled>> getAllAsList(String str);

    C5368e<List<RoomInstalled>> getAllInstalled();

    C5368e<List<RoomInstalled>> getAllInstalledSorted();

    C5368e<List<RoomInstalled>> getAllInstalling();

    C5368e<List<RoomInstalled>> getAsList(String str, int i);

    C5368e<RoomInstalled> getInstalled(String str);

    C5368e<List<RoomInstalled>> getInstalledFilteringSystemApps();

    C5328b insert(RoomInstalled roomInstalled);

    Single<Boolean> isInstalled(String str, int i);

    C5368e<Boolean> isInstalled(String str);

    C5328b remove(String str, int i);

    C5328b replaceAllBy(List<RoomInstalled> list);
}
