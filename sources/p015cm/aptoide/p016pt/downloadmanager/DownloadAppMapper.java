package p015cm.aptoide.p016pt.downloadmanager;

import p015cm.aptoide.p016pt.database.room.RoomDownload;

/* renamed from: cm.aptoide.pt.downloadmanager.DownloadAppMapper */
public class DownloadAppMapper {
    private DownloadAppFileMapper downloadAppFileMapper;

    public DownloadAppMapper(DownloadAppFileMapper downloadAppFileMapper2) {
        this.downloadAppFileMapper = downloadAppFileMapper2;
    }

    public DownloadApp mapDownload(RoomDownload roomDownload) {
        return new DownloadApp(roomDownload.getPackageName(), roomDownload.getVersionCode(), this.downloadAppFileMapper.mapFileToDownloadList(roomDownload.getFilesToDownload()), roomDownload.getMd5(), roomDownload.getSize(), roomDownload.getAttributionId());
    }
}
