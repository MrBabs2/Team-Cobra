package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0016\u001a\u00020\u0014J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, mo16641d2 = {"Lcm/aptoide/pt/download/view/DownloadStatusModel;", "", "action", "Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "progress", "", "downloadState", "Lcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;", "(Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;ILcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;)V", "getAction", "()Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "getDownloadState", "()Lcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;", "getProgress", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hasError", "hashCode", "isDownloadable", "isDownloading", "isDownloadingOrInstalling", "toString", "", "Action", "DownloadState", "Error", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadStatusModel */
/* compiled from: DownloadStatusModel.kt */
public final class DownloadStatusModel {
    private final Action action;
    private final DownloadState downloadState;
    private final int progress;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "", "(Ljava/lang/String;I)V", "UPDATE", "INSTALL", "DOWNGRADE", "OPEN", "MIGRATE", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.download.view.DownloadStatusModel$Action */
    /* compiled from: DownloadStatusModel.kt */
    public enum Action {
        UPDATE,
        INSTALL,
        DOWNGRADE,
        OPEN,
        MIGRATE
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;", "", "(Ljava/lang/String;I)V", "STANDBY", "IN_QUEUE", "GENERIC_ERROR", "NOT_ENOUGH_STORAGE_ERROR", "PAUSE", "ACTIVE", "INSTALLING", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.download.view.DownloadStatusModel$DownloadState */
    /* compiled from: DownloadStatusModel.kt */
    public enum DownloadState {
        STANDBY,
        IN_QUEUE,
        GENERIC_ERROR,
        NOT_ENOUGH_STORAGE_ERROR,
        PAUSE,
        ACTIVE,
        INSTALLING
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/DownloadStatusModel$Error;", "", "(Ljava/lang/String;I)V", "NETWORK", "GENERIC", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.download.view.DownloadStatusModel$Error */
    /* compiled from: DownloadStatusModel.kt */
    public enum Error {
        NETWORK,
        GENERIC
    }

    public DownloadStatusModel(Action action2, int i, DownloadState downloadState2) {
        C10202j.m34178b(action2, "action");
        C10202j.m34178b(downloadState2, "downloadState");
        this.action = action2;
        this.progress = i;
        this.downloadState = downloadState2;
    }

    public static /* synthetic */ DownloadStatusModel copy$default(DownloadStatusModel downloadStatusModel, Action action2, int i, DownloadState downloadState2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            action2 = downloadStatusModel.action;
        }
        if ((i2 & 2) != 0) {
            i = downloadStatusModel.progress;
        }
        if ((i2 & 4) != 0) {
            downloadState2 = downloadStatusModel.downloadState;
        }
        return downloadStatusModel.copy(action2, i, downloadState2);
    }

    public final Action component1() {
        return this.action;
    }

    public final int component2() {
        return this.progress;
    }

    public final DownloadState component3() {
        return this.downloadState;
    }

    public final DownloadStatusModel copy(Action action2, int i, DownloadState downloadState2) {
        C10202j.m34178b(action2, "action");
        C10202j.m34178b(downloadState2, "downloadState");
        return new DownloadStatusModel(action2, i, downloadState2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadStatusModel)) {
            return false;
        }
        DownloadStatusModel downloadStatusModel = (DownloadStatusModel) obj;
        return C10202j.m34176a((Object) this.action, (Object) downloadStatusModel.action) && this.progress == downloadStatusModel.progress && C10202j.m34176a((Object) this.downloadState, (Object) downloadStatusModel.downloadState);
    }

    public final Action getAction() {
        return this.action;
    }

    public final DownloadState getDownloadState() {
        return this.downloadState;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final boolean hasError() {
        DownloadState downloadState2 = this.downloadState;
        return downloadState2 == DownloadState.GENERIC_ERROR || downloadState2 == DownloadState.NOT_ENOUGH_STORAGE_ERROR;
    }

    public int hashCode() {
        Action action2 = this.action;
        int i = 0;
        int hashCode = (((action2 != null ? action2.hashCode() : 0) * 31) + this.progress) * 31;
        DownloadState downloadState2 = this.downloadState;
        if (downloadState2 != null) {
            i = downloadState2.hashCode();
        }
        return hashCode + i;
    }

    public final boolean isDownloadable() {
        Action action2 = this.action;
        return action2 == Action.INSTALL || action2 == Action.UPDATE || action2 == Action.DOWNGRADE;
    }

    public final boolean isDownloading() {
        DownloadState downloadState2 = this.downloadState;
        return downloadState2 == DownloadState.ACTIVE || downloadState2 == DownloadState.PAUSE || downloadState2 == DownloadState.IN_QUEUE;
    }

    public final boolean isDownloadingOrInstalling() {
        return isDownloading() || this.downloadState == DownloadState.INSTALLING;
    }

    public String toString() {
        return "DownloadStatusModel(action=" + this.action + ", progress=" + this.progress + ", downloadState=" + this.downloadState + ")";
    }
}
