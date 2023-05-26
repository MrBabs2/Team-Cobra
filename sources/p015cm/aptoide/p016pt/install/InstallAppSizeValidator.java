package p015cm.aptoide.p016pt.install;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.utils.FileUtils;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, mo16641d2 = {"Lcm/aptoide/pt/install/InstallAppSizeValidator;", "", "filePathProvider", "Lcm/aptoide/pt/install/FilePathProvider;", "(Lcm/aptoide/pt/install/FilePathProvider;)V", "getFilePathProvider", "()Lcm/aptoide/pt/install/FilePathProvider;", "getAvailableSpace", "", "hasEnoughSpaceToInstallApp", "", "download", "Lcm/aptoide/pt/database/room/RoomDownload;", "isAppAlreadyDownloaded", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.install.InstallAppSizeValidator */
/* compiled from: InstallAppSizeValidator.kt */
public final class InstallAppSizeValidator {
    private final FilePathProvider filePathProvider;

    public InstallAppSizeValidator(FilePathProvider filePathProvider2) {
        C10202j.m34178b(filePathProvider2, "filePathProvider");
        this.filePathProvider = filePathProvider2;
    }

    private final boolean isAppAlreadyDownloaded(RoomDownload roomDownload) {
        if (roomDownload.getFilesToDownload().isEmpty()) {
            return false;
        }
        for (RoomFileToDownload next : roomDownload.getFilesToDownload()) {
            FilePathProvider filePathProvider2 = this.filePathProvider;
            C10202j.m34174a((Object) next, "fileToDownload");
            if (!FileUtils.fileExists(C10202j.m34169a(filePathProvider2.getFilePathFromFileType(next), (Object) next.getFileName()))) {
                return false;
            }
        }
        return true;
    }

    public final long getAvailableSpace() {
        File dataDirectory = Environment.getDataDirectory();
        C10202j.m34174a((Object) dataDirectory, "Environment.getDataDirectory()");
        StatFs statFs = new StatFs(dataDirectory.getPath());
        if (Build.VERSION.SDK_INT < 18) {
            return (long) (statFs.getAvailableBlocks() * statFs.getBlockSize());
        }
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public final FilePathProvider getFilePathProvider() {
        return this.filePathProvider;
    }

    public final boolean hasEnoughSpaceToInstallApp(RoomDownload roomDownload) {
        C10202j.m34178b(roomDownload, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        if (!isAppAlreadyDownloaded(roomDownload) && roomDownload.getSize() > getAvailableSpace()) {
            return false;
        }
        return true;
    }
}
