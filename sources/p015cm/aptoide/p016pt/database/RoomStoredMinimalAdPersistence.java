package p015cm.aptoide.p016pt.database;

import p015cm.aptoide.p016pt.database.room.RoomStoredMinimalAd;
import p015cm.aptoide.p016pt.database.room.StoredMinimalAdDAO;
import p120q.p326a.C10837a;
import p120q.p326a.p349h0.C11461a;
import p123rx.C5368e;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomStoredMinimalAdPersistence */
public class RoomStoredMinimalAdPersistence implements StoredMinimalAdPersistence {
    private final StoredMinimalAdDAO storedMinimalAdDAO;

    public RoomStoredMinimalAdPersistence(StoredMinimalAdDAO storedMinimalAdDAO2) {
        this.storedMinimalAdDAO = storedMinimalAdDAO2;
    }

    /* renamed from: a */
    static /* synthetic */ RoomStoredMinimalAd m5211a(Throwable th) throws Exception {
        return null;
    }

    public C5368e<RoomStoredMinimalAd> get(String str) {
        return C10832d.m36729a(this.storedMinimalAdDAO.get(str).subscribeOn(C11461a.m37548b()).onErrorReturn(C2048e1.f4730f).doOnError(C2034a.f4707f), C10837a.BUFFER);
    }

    public void insert(RoomStoredMinimalAd roomStoredMinimalAd) {
        this.storedMinimalAdDAO.insert(roomStoredMinimalAd);
    }

    public void remove(RoomStoredMinimalAd roomStoredMinimalAd) {
        this.storedMinimalAdDAO.delete(roomStoredMinimalAd);
    }
}
