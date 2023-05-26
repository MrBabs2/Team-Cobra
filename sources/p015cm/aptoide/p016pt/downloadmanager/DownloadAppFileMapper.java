package p015cm.aptoide.p016pt.downloadmanager;

import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p015cm.aptoide.p016pt.downloadmanager.DownloadAppFile;

/* renamed from: cm.aptoide.pt.downloadmanager.DownloadAppFileMapper */
public class DownloadAppFileMapper {
    private DownloadAppFile.FileType mapFileType(int i) {
        if (i == 0) {
            return DownloadAppFile.FileType.APK;
        }
        if (i == 1) {
            return DownloadAppFile.FileType.OBB;
        }
        if (i == 2) {
            return DownloadAppFile.FileType.GENERIC;
        }
        if (i == 3) {
            return DownloadAppFile.FileType.SPLIT;
        }
        throw new IllegalStateException("Invalid file type");
    }

    public List<DownloadAppFile> mapFileToDownloadList(List<RoomFileToDownload> list) {
        ArrayList arrayList = new ArrayList();
        for (RoomFileToDownload next : list) {
            arrayList.add(new DownloadAppFile(next.getLink(), next.getAltLink(), next.getMd5(), next.getVersionCode(), next.getPackageName(), next.getFileName(), mapFileType(next.getFileType())));
        }
        return arrayList;
    }
}
