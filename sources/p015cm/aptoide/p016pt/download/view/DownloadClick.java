package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/DownloadClick;", "", "download", "Lcm/aptoide/pt/download/view/Download;", "action", "Lcm/aptoide/pt/download/view/DownloadEvent;", "(Lcm/aptoide/pt/download/view/Download;Lcm/aptoide/pt/download/view/DownloadEvent;)V", "getAction", "()Lcm/aptoide/pt/download/view/DownloadEvent;", "getDownload", "()Lcm/aptoide/pt/download/view/Download;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadClick */
/* compiled from: DownloadClick.kt */
public final class DownloadClick {
    private final DownloadEvent action;
    private final Download download;

    public DownloadClick(Download download2, DownloadEvent downloadEvent) {
        C10202j.m34178b(download2, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        C10202j.m34178b(downloadEvent, "action");
        this.download = download2;
        this.action = downloadEvent;
    }

    public static /* synthetic */ DownloadClick copy$default(DownloadClick downloadClick, Download download2, DownloadEvent downloadEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            download2 = downloadClick.download;
        }
        if ((i & 2) != 0) {
            downloadEvent = downloadClick.action;
        }
        return downloadClick.copy(download2, downloadEvent);
    }

    public final Download component1() {
        return this.download;
    }

    public final DownloadEvent component2() {
        return this.action;
    }

    public final DownloadClick copy(Download download2, DownloadEvent downloadEvent) {
        C10202j.m34178b(download2, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        C10202j.m34178b(downloadEvent, "action");
        return new DownloadClick(download2, downloadEvent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadClick)) {
            return false;
        }
        DownloadClick downloadClick = (DownloadClick) obj;
        return C10202j.m34176a((Object) this.download, (Object) downloadClick.download) && C10202j.m34176a((Object) this.action, (Object) downloadClick.action);
    }

    public final DownloadEvent getAction() {
        return this.action;
    }

    public final Download getDownload() {
        return this.download;
    }

    public int hashCode() {
        Download download2 = this.download;
        int i = 0;
        int hashCode = (download2 != null ? download2.hashCode() : 0) * 31;
        DownloadEvent downloadEvent = this.action;
        if (downloadEvent != null) {
            i = downloadEvent.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "DownloadClick(download=" + this.download + ", action=" + this.action + ")";
    }
}
