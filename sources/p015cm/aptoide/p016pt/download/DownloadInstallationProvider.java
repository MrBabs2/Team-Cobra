package p015cm.aptoide.p016pt.download;

import p015cm.aptoide.p016pt.ads.MinimalAdMapper;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.database.room.RoomStoredMinimalAd;
import p015cm.aptoide.p016pt.dataprovider.ads.AdNetworkUtils;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.downloadmanager.DownloadPersistence;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.exception.InstallationException;
import p015cm.aptoide.p016pt.install.installer.DownloadInstallationAdapter;
import p015cm.aptoide.p016pt.install.installer.Installation;
import p015cm.aptoide.p016pt.install.installer.InstallationProvider;
import p015cm.aptoide.p016pt.logger.Logger;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.download.DownloadInstallationProvider */
public class DownloadInstallationProvider implements InstallationProvider {
    private static final String TAG = "DownloadInstallationPro";
    private final MinimalAdMapper adMapper;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final AptoideDownloadManager downloadManager;
    private final DownloadPersistence downloadPersistence;
    private final RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence;

    public DownloadInstallationProvider(AptoideDownloadManager aptoideDownloadManager, DownloadPersistence downloadPersistence2, AptoideInstalledAppsRepository aptoideInstalledAppsRepository2, MinimalAdMapper minimalAdMapper, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence2) {
        this.downloadManager = aptoideDownloadManager;
        this.downloadPersistence = downloadPersistence2;
        this.adMapper = minimalAdMapper;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
        this.roomStoredMinimalAdPersistence = roomStoredMinimalAdPersistence2;
    }

    /* renamed from: b */
    static /* synthetic */ void m5379b(RoomStoredMinimalAd roomStoredMinimalAd) {
    }

    private RoomInstalled convertDownloadToInstalled(RoomDownload roomDownload) {
        RoomInstalled roomInstalled = new RoomInstalled();
        roomInstalled.setPackageAndVersionCode(roomDownload.getPackageName() + roomDownload.getVersionCode());
        roomInstalled.setVersionCode(roomDownload.getVersionCode());
        roomInstalled.setVersionName(roomDownload.getVersionName());
        roomInstalled.setAppSize(Long.valueOf(roomDownload.getSize()));
        roomInstalled.setStatus(1);
        roomInstalled.setType(-1);
        roomInstalled.setPackageName(roomDownload.getPackageName());
        return roomInstalled;
    }

    private C5378b<RoomStoredMinimalAd> handleCpd() {
        return new C2274a(this);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10606a(RoomDownload roomDownload) {
        if (roomDownload.getOverallDownloadStatus() == 1) {
            return this.aptoideInstalledAppsRepository.get(roomDownload.getPackageName(), roomDownload.getVersionCode()).mo18694j(new C2276c(this, roomDownload)).mo18664b(new C2275b(this));
        }
        return C5368e.m10238a((Throwable) new InstallationException("Installation file not available. download is " + roomDownload.getMd5() + " and the state is : " + roomDownload.getOverallDownloadStatus()));
    }

    public C5368e<Installation> getInstallation(String str) {
        Logger instance = Logger.getInstance();
        instance.mo12975d(TAG, "Getting the installation " + str);
        return this.downloadManager.getDownloadAsSingle(str).mo18567c().mo18687f(new C2278e(this));
    }

    /* renamed from: a */
    public /* synthetic */ DownloadInstallationAdapter mo10605a(RoomDownload roomDownload, RoomInstalled roomInstalled) {
        if (roomInstalled == null) {
            roomInstalled = convertDownloadToInstalled(roomDownload);
        }
        return new DownloadInstallationAdapter(roomDownload, this.downloadPersistence, this.aptoideInstalledAppsRepository, roomInstalled);
    }

    /* renamed from: a */
    public /* synthetic */ void mo10608a(DownloadInstallationAdapter downloadInstallationAdapter) {
        this.roomStoredMinimalAdPersistence.get(downloadInstallationAdapter.getPackageName()).mo18664b(handleCpd()).mo18662b(Schedulers.m10352io()).mo18655a(C2277d.f4986f, (C5378b<Throwable>) C2283j.f4993f);
    }

    /* renamed from: a */
    public /* synthetic */ void mo10607a(RoomStoredMinimalAd roomStoredMinimalAd) {
        if (roomStoredMinimalAd != null && roomStoredMinimalAd.getCpdUrl() != null) {
            AdNetworkUtils.knockCpd(this.adMapper.map(roomStoredMinimalAd));
            roomStoredMinimalAd.setCpdUrl((String) null);
            this.roomStoredMinimalAdPersistence.insert(roomStoredMinimalAd);
        }
    }
}
