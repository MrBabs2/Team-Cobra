package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzk;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;

/* renamed from: com.google.android.gms.internal.ads.k3 */
final class C7644k3 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ String f15808f;

    /* renamed from: g */
    private final /* synthetic */ String f15809g;

    /* renamed from: h */
    private final /* synthetic */ zzapu f15810h;

    C7644k3(zzapu zzapu, String str, String str2) {
        this.f15810h = zzapu;
        this.f15808f = str;
        this.f15809g = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f15810h.f18280d.getSystemService(DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        try {
            String str = this.f15808f;
            String str2 = this.f15809g;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzk.zzli();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f15810h.mo27556a("Could not store picture.");
        }
    }
}
