package p015cm.aptoide.p016pt.install;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p015cm.aptoide.p016pt.downloadmanager.PathProvider;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, mo16641d2 = {"Lcm/aptoide/pt/install/FilePathProvider;", "Lcm/aptoide/pt/downloadmanager/PathProvider;", "apkPath", "", "obbPath", "cachePath", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApkPath", "()Ljava/lang/String;", "getCachePath", "getObbPath", "getFilePathFromFileType", "fileToDownload", "Lcm/aptoide/pt/database/room/RoomFileToDownload;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.install.FilePathProvider */
/* compiled from: FilePathProvider.kt */
public final class FilePathProvider implements PathProvider {
    private final String apkPath;
    private final String cachePath;
    private final String obbPath;

    public FilePathProvider(String str, String str2, String str3) {
        C10202j.m34178b(str, "apkPath");
        C10202j.m34178b(str2, "obbPath");
        C10202j.m34178b(str3, "cachePath");
        this.apkPath = str;
        this.obbPath = str2;
        this.cachePath = str3;
    }

    public final String getApkPath() {
        return this.apkPath;
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public String getFilePathFromFileType(RoomFileToDownload roomFileToDownload) {
        C10202j.m34178b(roomFileToDownload, "fileToDownload");
        int fileType = roomFileToDownload.getFileType();
        if (fileType == 0) {
            return this.apkPath;
        }
        if (fileType == 1) {
            return this.obbPath + roomFileToDownload.getPackageName() + "/";
        } else if (fileType == 2) {
            return this.cachePath;
        } else {
            if (fileType != 3) {
                return this.cachePath;
            }
            return this.apkPath + roomFileToDownload.getPackageName() + "-splits/";
        }
    }

    public final String getObbPath() {
        return this.obbPath;
    }
}
