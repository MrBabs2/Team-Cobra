package p015cm.aptoide.p016pt.app;

/* renamed from: cm.aptoide.pt.app.DownloadModel */
public class DownloadModel {
    private final Action action;
    private final long appSize;
    private final DownloadState downloadState;
    private final int progress;

    /* renamed from: cm.aptoide.pt.app.DownloadModel$Action */
    public enum Action {
        UPDATE,
        INSTALL,
        DOWNGRADE,
        OPEN,
        MIGRATE
    }

    /* renamed from: cm.aptoide.pt.app.DownloadModel$DownloadState */
    public enum DownloadState {
        ACTIVE,
        PAUSE,
        COMPLETE,
        INDETERMINATE,
        ERROR,
        NOT_ENOUGH_STORAGE_ERROR,
        INSTALLING
    }

    /* renamed from: cm.aptoide.pt.app.DownloadModel$Error */
    public enum Error {
        NETWORK,
        GENERIC
    }

    public DownloadModel(Action action2, int i, DownloadState downloadState2, long j) {
        this.action = action2;
        this.progress = i;
        this.downloadState = downloadState2;
        this.appSize = j;
    }

    public Action getAction() {
        return this.action;
    }

    public long getAppSize() {
        return this.appSize;
    }

    public DownloadState getDownloadState() {
        return this.downloadState;
    }

    public int getProgress() {
        return this.progress;
    }

    public boolean hasError() {
        return this.downloadState.equals(DownloadState.ERROR) || this.downloadState.equals(DownloadState.NOT_ENOUGH_STORAGE_ERROR);
    }

    public boolean isDownloadable() {
        return this.action.equals(Action.INSTALL) || this.action.equals(Action.UPDATE) || this.action.equals(Action.DOWNGRADE);
    }

    public boolean isDownloading() {
        return this.downloadState.equals(DownloadState.ACTIVE) || this.downloadState.equals(DownloadState.PAUSE) || this.downloadState.equals(DownloadState.INDETERMINATE);
    }

    public boolean isDownloadingOrInstalling() {
        return isDownloading() || this.downloadState.equals(DownloadState.INSTALLING);
    }
}
