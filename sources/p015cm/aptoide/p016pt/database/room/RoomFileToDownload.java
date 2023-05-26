package p015cm.aptoide.p016pt.database.room;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p015cm.aptoide.p016pt.utils.IdUtils;

/* renamed from: cm.aptoide.pt.database.room.RoomFileToDownload */
public class RoomFileToDownload {
    public static final int APK = 0;
    public static final int ASSET = 12;
    public static final int BASE = 10;
    public static final int FEATURE = 11;
    public static final int GENERIC = 2;
    public static final int MAIN = 13;
    public static final int OBB = 1;
    public static final int PATCH = 14;
    public static final int SPLIT = 3;
    public static final int SUBTYPE_APK = 15;
    private String altLink;
    private int downloadId;
    private String fileName;
    private int fileType = 2;
    private String link;
    private String md5;
    private String packageName;
    private String path;
    private int progress;
    private int status;
    private int subFileType = 10;
    private int versionCode;
    private String versionName;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: cm.aptoide.pt.database.room.RoomFileToDownload$FileSubType */
    public @interface FileSubType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: cm.aptoide.pt.database.room.RoomFileToDownload$FileType */
    public @interface FileType {
    }

    public static RoomFileToDownload createFileToDownload(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, String str7, int i3) {
        RoomFileToDownload roomFileToDownload = new RoomFileToDownload();
        roomFileToDownload.setLink(str);
        roomFileToDownload.setMd5(str3);
        roomFileToDownload.setAltLink(str2);
        roomFileToDownload.versionCode = i2;
        roomFileToDownload.versionName = str6;
        roomFileToDownload.setFileType(i);
        roomFileToDownload.setSubFileType(i3);
        roomFileToDownload.setPath(str7);
        if (!TextUtils.isEmpty(str4)) {
            if (i == 0 || i == 3) {
                roomFileToDownload.setFileName(str4 + ".apk");
            } else {
                roomFileToDownload.setFileName(str4);
            }
        }
        roomFileToDownload.setPackageName(str5);
        return roomFileToDownload;
    }

    private void setAltLink(String str) {
        this.altLink = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RoomFileToDownload.class != obj.getClass()) {
            return false;
        }
        RoomFileToDownload roomFileToDownload = (RoomFileToDownload) obj;
        if (getDownloadId() != roomFileToDownload.getDownloadId() || getFileType() != roomFileToDownload.getFileType() || getSubFileType() != roomFileToDownload.getSubFileType() || getProgress() != roomFileToDownload.getProgress() || getStatus() != roomFileToDownload.getStatus() || getVersionCode() != roomFileToDownload.getVersionCode() || !getMd5().equals(roomFileToDownload.getMd5())) {
            return false;
        }
        if (getAltLink() == null ? roomFileToDownload.getAltLink() != null : !getAltLink().equals(roomFileToDownload.getAltLink())) {
            return false;
        }
        if (getLink() == null ? roomFileToDownload.getLink() != null : !getLink().equals(roomFileToDownload.getLink())) {
            return false;
        }
        if (getPackageName() == null ? roomFileToDownload.getPackageName() != null : !getPackageName().equals(roomFileToDownload.getPackageName())) {
            return false;
        }
        if (getPath() == null ? roomFileToDownload.getPath() != null : !getPath().equals(roomFileToDownload.getPath())) {
            return false;
        }
        if (getFileName() == null ? roomFileToDownload.getFileName() != null : !getFileName().equals(roomFileToDownload.getFileName())) {
            return false;
        }
        if (getVersionName() != null) {
            return getVersionName().equals(roomFileToDownload.getVersionName());
        }
        if (roomFileToDownload.getVersionName() == null) {
            return true;
        }
        return false;
    }

    public String getAltLink() {
        return this.altLink;
    }

    public int getDownloadId() {
        return this.downloadId;
    }

    public String getFileName() {
        if (TextUtils.isEmpty(this.fileName)) {
            return TextUtils.isEmpty(getMd5()) ? IdUtils.randomString() : getMd5();
        }
        return this.fileName;
    }

    public String getFilePath() {
        return getPath() + getFileName();
    }

    public int getFileType() {
        return this.fileType;
    }

    public String getLink() {
        return this.link;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPath() {
        return this.path;
    }

    public int getProgress() {
        return this.progress;
    }

    public int getStatus() {
        return this.status;
    }

    public int getSubFileType() {
        return this.subFileType;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((getMd5().hashCode() * 31) + getDownloadId()) * 31) + (getAltLink() != null ? getAltLink().hashCode() : 0)) * 31) + (getLink() != null ? getLink().hashCode() : 0)) * 31) + (getPackageName() != null ? getPackageName().hashCode() : 0)) * 31) + (getPath() != null ? getPath().hashCode() : 0)) * 31) + getFileType()) * 31) + getSubFileType()) * 31) + getProgress()) * 31) + getStatus()) * 31) + (getFileName() != null ? getFileName().hashCode() : 0)) * 31) + getVersionCode()) * 31;
        if (getVersionName() != null) {
            i = getVersionName().hashCode();
        }
        return hashCode + i;
    }

    public void setDownloadId(int i) {
        this.downloadId = i;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setFileType(int i) {
        this.fileType = i;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setProgress(int i) {
        this.progress = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setSubFileType(int i) {
        this.subFileType = i;
    }
}
