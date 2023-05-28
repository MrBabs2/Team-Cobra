package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.app.DownloadModel;

/* renamed from: cm.aptoide.pt.editorial.EditorialDownloadModel */
public class EditorialDownloadModel extends DownloadModel {
    private final int position;

    public EditorialDownloadModel(DownloadModel.Action action, int i, DownloadModel.DownloadState downloadState, int i2, long j) {
        super(action, i, downloadState, j);
        this.position = i2;
    }

    public int getPosition() {
        return this.position;
    }
}
