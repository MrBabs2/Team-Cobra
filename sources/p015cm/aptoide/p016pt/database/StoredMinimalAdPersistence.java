package p015cm.aptoide.p016pt.database;

import p015cm.aptoide.p016pt.database.room.RoomStoredMinimalAd;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.database.StoredMinimalAdPersistence */
public interface StoredMinimalAdPersistence {
    C5368e<RoomStoredMinimalAd> get(String str);

    void insert(RoomStoredMinimalAd roomStoredMinimalAd);

    void remove(RoomStoredMinimalAd roomStoredMinimalAd);
}
