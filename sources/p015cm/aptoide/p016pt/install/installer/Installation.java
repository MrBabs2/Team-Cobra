package p015cm.aptoide.p016pt.install.installer;

import java.io.File;
import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p123rx.C5328b;

/* renamed from: cm.aptoide.pt.install.installer.Installation */
public interface Installation {
    File getFile();

    List<RoomFileToDownload> getFiles();

    String getId();

    String getPackageName();

    int getStatus();

    int getType();

    int getVersionCode();

    String getVersionName();

    C5328b save();

    C5328b saveFileChanges();

    void setStatus(int i);

    void setType(int i);
}
