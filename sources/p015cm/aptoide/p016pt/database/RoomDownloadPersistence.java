package p015cm.aptoide.p016pt.database;

import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.database.room.DownloadDAO;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.downloadmanager.DownloadPersistence;
import p120q.p326a.C10837a;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomDownloadPersistence */
public class RoomDownloadPersistence implements DownloadPersistence {
    private final DownloadDAO downloadDAO;

    public RoomDownloadPersistence(DownloadDAO downloadDAO2) {
        this.downloadDAO = downloadDAO2;
    }

    /* renamed from: b */
    static /* synthetic */ RoomDownload m5165b(Throwable th) {
        return null;
    }

    /* renamed from: c */
    static /* synthetic */ RoomDownload m5166c(Throwable th) {
        return null;
    }

    /* renamed from: d */
    static /* synthetic */ List m5167d(Throwable th) {
        return new ArrayList();
    }

    /* renamed from: e */
    static /* synthetic */ List m5168e(Throwable th) {
        return new ArrayList();
    }

    /* renamed from: f */
    static /* synthetic */ List m5169f(Throwable th) {
        return new ArrayList();
    }

    /* renamed from: g */
    static /* synthetic */ List m5170g(Throwable th) {
        return new ArrayList();
    }

    /* renamed from: a */
    public /* synthetic */ void mo8004a(String str) {
        this.downloadDAO.remove(str);
    }

    public C5328b delete(String str) {
        return C5328b.m10169d(new C2061j(this, str)).mo18600b(Schedulers.m10352io());
    }

    public C5368e<List<RoomDownload>> getAll() {
        return C10832d.m36729a(this.downloadDAO.getAll(), C10837a.BUFFER).mo18639a(new ArrayList()).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomDownload>> getAsList(String str) {
        return C10832d.m36729a(this.downloadDAO.getAsList(str), C10837a.BUFFER).mo18639a(new ArrayList()).mo18699l(C2064k.f4752f).mo18662b(Schedulers.m10352io());
    }

    public C5368e<RoomDownload> getAsObservable(String str) {
        return C10832d.m36729a(this.downloadDAO.getAsObservable(str), C10837a.BUFFER).mo18699l(C2084r.f4777f).mo18662b(Schedulers.m10352io());
    }

    public Single<RoomDownload> getAsSingle(String str) {
        return C10832d.m36727a(this.downloadDAO.getAsSingle(str)).mo18571f(C2070m.f4758f).mo18563b(Schedulers.m10352io());
    }

    public C5368e<List<RoomDownload>> getInQueueSortedDownloads() {
        return C10832d.m36729a(this.downloadDAO.getInQueueSortedDownloads(), C10837a.BUFFER).mo18699l(C2073n.f4761f).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomDownload>> getOutOfSpaceDownloads() {
        return C10832d.m36729a(this.downloadDAO.getOutOfSpaceDownloads(), C10837a.BUFFER).mo18699l(C2076o.f4765f).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomDownload>> getRunningDownloads() {
        return C10832d.m36729a(this.downloadDAO.getRunningDownloads(), C10837a.BUFFER).mo18699l(C2067l.f4755f).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomDownload>> getUnmovedFilesDownloads() {
        return C10832d.m36729a(this.downloadDAO.getUnmovedFilesDownloads(), C10837a.BUFFER).mo18699l(C2151s.f4780f).mo18662b(Schedulers.m10352io());
    }

    public C5328b save(RoomDownload roomDownload) {
        return C5328b.m10169d(new C2082q(this, roomDownload)).mo18600b(Schedulers.m10352io());
    }

    /* renamed from: a */
    public /* synthetic */ void mo8003a(RoomDownload roomDownload) {
        this.downloadDAO.insert(roomDownload);
    }

    /* renamed from: a */
    static /* synthetic */ List m5164a(Throwable th) {
        return new ArrayList();
    }

    public C5328b delete(String str, int i) {
        return C5328b.m10169d(new C2079p(this, str, i));
    }

    /* renamed from: a */
    public /* synthetic */ void mo8005a(String str, int i) {
        this.downloadDAO.remove(str, i);
    }
}
