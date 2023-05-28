package p015cm.aptoide.p016pt.install.installer;

import java.io.File;
import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.downloadmanager.DownloadPersistence;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p123rx.C5328b;

/* renamed from: cm.aptoide.pt.install.installer.DownloadInstallationAdapter */
public class DownloadInstallationAdapter implements Installation {
    private final RoomDownload download;
    private DownloadPersistence downloadPersistence;
    private RoomInstalled installed;
    private AptoideInstalledAppsRepository ongoingInstallProvider;

    public DownloadInstallationAdapter(RoomDownload roomDownload, DownloadPersistence downloadPersistence2, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, RoomInstalled roomInstalled) {
        this.download = roomDownload;
        this.downloadPersistence = downloadPersistence2;
        this.ongoingInstallProvider = aptoideInstalledAppsRepository;
        this.installed = roomInstalled;
    }

    public File getFile() {
        return new File(this.download.getFilesToDownload().get(0).getFilePath());
    }

    public List<RoomFileToDownload> getFiles() {
        return this.download.getFilesToDownload();
    }

    public String getId() {
        return this.download.getMd5();
    }

    public String getPackageName() {
        return this.download.getFilesToDownload().get(0).getPackageName();
    }

    public int getStatus() {
        return this.installed.getStatus();
    }

    public int getType() {
        return this.installed.getType();
    }

    public int getVersionCode() {
        return this.download.getFilesToDownload().get(0).getVersionCode();
    }

    public String getVersionName() {
        return this.download.getVersionName();
    }

    public C5328b save() {
        return this.ongoingInstallProvider.save(this.installed);
    }

    public C5328b saveFileChanges() {
        return this.downloadPersistence.save(this.download);
    }

    public void setStatus(int i) {
        this.installed.setStatus(i);
    }

    public void setType(int i) {
        this.installed.setType(i);
    }
}
