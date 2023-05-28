package p015cm.aptoide.p016pt.downloadmanager;

import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.downloadmanager.n */
/* compiled from: lambda */
public final /* synthetic */ class C2343n implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AppDownloadManager f5071f;

    /* renamed from: g */
    private final /* synthetic */ RetryFileDownloader f5072g;

    public /* synthetic */ C2343n(AppDownloadManager appDownloadManager, RetryFileDownloader retryFileDownloader) {
        this.f5071f = appDownloadManager;
        this.f5072g = retryFileDownloader;
    }

    public final void call(Object obj) {
        this.f5071f.mo10870a(this.f5072g, (FileDownloadCallback) obj);
    }
}
