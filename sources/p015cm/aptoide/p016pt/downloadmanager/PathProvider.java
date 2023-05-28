package p015cm.aptoide.p016pt.downloadmanager;

import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;

/* renamed from: cm.aptoide.pt.downloadmanager.PathProvider */
public interface PathProvider {
    String getFilePathFromFileType(RoomFileToDownload roomFileToDownload);
}
