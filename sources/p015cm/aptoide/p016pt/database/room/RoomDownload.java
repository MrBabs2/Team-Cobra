package p015cm.aptoide.p016pt.database.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cm.aptoide.pt.database.room.RoomDownload */
public class RoomDownload {
    public static final int ACTION_DOWNGRADE = 2;
    public static final int ACTION_INSTALL = 0;
    public static final int ACTION_UPDATE = 1;
    public static final int BLOCK_COMPLETE = 2;
    public static final int COMPLETED = 1;
    public static final int CONNECTED = 3;
    public static final String DOWNLOAD_ID = "appId";
    public static final int ERROR = 9;
    public static final int FILE_MISSING = 10;
    public static final int GENERIC_ERROR = 1;
    public static final int INVALID_STATUS = 0;
    public static final int IN_QUEUE = 13;
    public static final String MD5 = "md5";
    public static final int NOT_DOWNLOADED = 12;
    public static final int NOT_ENOUGH_SPACE_ERROR = 2;
    public static final int NO_ERROR = 0;
    public static final int PAUSED = 6;
    public static final int PENDING = 4;
    public static final int PROGRESS = 5;
    public static final int RETRY = 11;
    public static final int STARTED = 8;
    public static String TAG = "RoomDownload";
    public static final int VERIFYING_FILE_INTEGRITY = 15;
    public static final int WAITING_TO_MOVE_FILES = 14;
    public static final int WARN = 7;
    private String Icon;
    private int action;
    private String appName;
    private String attributionId;
    private int downloadError;
    private int downloadSpeed;
    List<RoomFileToDownload> filesToDownload;
    private boolean hasAppc;
    private String md5;
    int overallDownloadStatus = 0;
    int overallProgress = 0;
    private String packageName;
    private long size;
    private String storeName;
    private long timeStamp;
    private String trustedBadge;
    private int versionCode;
    private String versionName;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: cm.aptoide.pt.database.room.RoomDownload$DownloadError */
    public @interface DownloadError {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: cm.aptoide.pt.database.room.RoomDownload$DownloadState */
    public @interface DownloadState {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RoomDownload.class != obj.getClass()) {
            return false;
        }
        RoomDownload roomDownload = (RoomDownload) obj;
        if (getOverallDownloadStatus() != roomDownload.getOverallDownloadStatus() || getOverallProgress() != roomDownload.getOverallProgress() || getTimeStamp() != roomDownload.getTimeStamp() || getDownloadSpeed() != roomDownload.getDownloadSpeed() || getVersionCode() != roomDownload.getVersionCode() || getAction() != roomDownload.getAction() || getDownloadError() != roomDownload.getDownloadError() || !getMd5().equals(roomDownload.getMd5())) {
            return false;
        }
        if (getAppName() == null ? roomDownload.getAppName() != null : !getAppName().equals(roomDownload.getAppName())) {
            return false;
        }
        if (getIcon() == null ? roomDownload.getIcon() != null : !getIcon().equals(roomDownload.getIcon())) {
            return false;
        }
        if (getPackageName() == null ? roomDownload.getPackageName() != null : !getPackageName().equals(roomDownload.getPackageName())) {
            return false;
        }
        if (getVersionName() != null) {
            return getVersionName().equals(roomDownload.getVersionName());
        }
        if (roomDownload.getVersionName() == null) {
            return true;
        }
        return false;
    }

    public int getAction() {
        return this.action;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAttributionId() {
        return this.attributionId;
    }

    public int getDownloadError() {
        return this.downloadError;
    }

    public int getDownloadSpeed() {
        return this.downloadSpeed;
    }

    public List<RoomFileToDownload> getFilesToDownload() {
        return this.filesToDownload;
    }

    public String getIcon() {
        return this.Icon;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getOverallDownloadStatus() {
        return this.overallDownloadStatus;
    }

    public int getOverallProgress() {
        return this.overallProgress;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public long getSize() {
        return this.size;
    }

    public List<RoomFileToDownload> getSplits() {
        ArrayList arrayList = new ArrayList();
        for (RoomFileToDownload next : this.filesToDownload) {
            if (next.getFileType() == 3) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public String getTrustedBadge() {
        return this.trustedBadge;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public boolean hasAppc() {
        return this.hasAppc;
    }

    public boolean hasObbs() {
        for (RoomFileToDownload fileType : this.filesToDownload) {
            if (fileType.getFileType() == 1) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSplits() {
        for (RoomFileToDownload fileType : this.filesToDownload) {
            if (fileType.getFileType() == 3) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int overallDownloadStatus2 = ((((((((((((((((((getOverallDownloadStatus() * 31) + getOverallProgress()) * 31) + getMd5().hashCode()) * 31) + (getAppName() != null ? getAppName().hashCode() : 0)) * 31) + (getIcon() != null ? getIcon().hashCode() : 0)) * 31) + ((int) (getTimeStamp() ^ (getTimeStamp() >>> 32)))) * 31) + getDownloadSpeed()) * 31) + (getPackageName() != null ? getPackageName().hashCode() : 0)) * 31) + getVersionCode()) * 31) + getAction()) * 31;
        if (getVersionName() != null) {
            i = getVersionName().hashCode();
        }
        return ((overallDownloadStatus2 + i) * 31) + getDownloadError();
    }

    public void setAction(int i) {
        this.action = i;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAttributionId(String str) {
        this.attributionId = str;
    }

    public void setDownloadError(int i) {
        this.downloadError = i;
    }

    public void setDownloadSpeed(int i) {
        this.downloadSpeed = i;
    }

    public void setFilesToDownload(List<RoomFileToDownload> list) {
        this.filesToDownload = list;
    }

    public void setHasAppc(boolean z) {
        this.hasAppc = z;
    }

    public void setIcon(String str) {
        this.Icon = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setOverallDownloadStatus(int i) {
        this.overallDownloadStatus = i;
    }

    public void setOverallProgress(int i) {
        this.overallProgress = i;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setStoreName(String str) {
        this.storeName = str;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public void setTrustedBadge(String str) {
        this.trustedBadge = str;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }
}
