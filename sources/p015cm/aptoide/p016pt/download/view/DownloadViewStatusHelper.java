package p015cm.aptoide.p016pt.download.view;

import android.content.Context;
import android.widget.Button;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.view.DownloadStatusModel;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J,\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J,\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001b"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/DownloadViewStatusHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setDownloadButtonText", "", "action", "Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "installButton", "Landroid/widget/Button;", "setDownloadState", "downloadProgressView", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "progress", "", "downloadState", "Lcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;", "setDownloadStatus", "download", "Lcm/aptoide/pt/download/view/Download;", "downloadClickSubject", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/download/view/DownloadClick;", "setupListeners", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewStatusHelper */
/* compiled from: DownloadViewStatusHelper.kt */
public final class DownloadViewStatusHelper {
    private final Context context;

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.download.view.DownloadViewStatusHelper$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[DownloadEventListener.Action.Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DownloadEventListener.Action.Type.CANCEL.ordinal()] = 1;
            $EnumSwitchMapping$0[DownloadEventListener.Action.Type.RESUME.ordinal()] = 2;
            $EnumSwitchMapping$0[DownloadEventListener.Action.Type.PAUSE.ordinal()] = 3;
            int[] iArr2 = new int[DownloadStatusModel.Action.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[DownloadStatusModel.Action.UPDATE.ordinal()] = 1;
            $EnumSwitchMapping$1[DownloadStatusModel.Action.INSTALL.ordinal()] = 2;
            $EnumSwitchMapping$1[DownloadStatusModel.Action.OPEN.ordinal()] = 3;
            $EnumSwitchMapping$1[DownloadStatusModel.Action.DOWNGRADE.ordinal()] = 4;
            $EnumSwitchMapping$1[DownloadStatusModel.Action.MIGRATE.ordinal()] = 5;
            int[] iArr3 = new int[DownloadStatusModel.DownloadState.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[DownloadStatusModel.DownloadState.ACTIVE.ordinal()] = 1;
            $EnumSwitchMapping$2[DownloadStatusModel.DownloadState.INSTALLING.ordinal()] = 2;
            $EnumSwitchMapping$2[DownloadStatusModel.DownloadState.PAUSE.ordinal()] = 3;
            $EnumSwitchMapping$2[DownloadStatusModel.DownloadState.IN_QUEUE.ordinal()] = 4;
            $EnumSwitchMapping$2[DownloadStatusModel.DownloadState.STANDBY.ordinal()] = 5;
            $EnumSwitchMapping$2[DownloadStatusModel.DownloadState.GENERIC_ERROR.ordinal()] = 6;
            $EnumSwitchMapping$2[DownloadStatusModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR.ordinal()] = 7;
        }
    }

    public DownloadViewStatusHelper(Context context2) {
        C10202j.m34178b(context2, "context");
        this.context = context2;
    }

    private final void setDownloadButtonText(DownloadStatusModel.Action action, Button button) {
        int i = WhenMappings.$EnumSwitchMapping$1[action.ordinal()];
        if (i == 1) {
            button.setText(this.context.getString(C1086R.string.appview_button_update));
        } else if (i == 2) {
            button.setText(this.context.getString(C1086R.string.appview_button_install));
        } else if (i == 3) {
            button.setText(this.context.getString(C1086R.string.appview_button_open));
        } else if (i == 4) {
            button.setText(this.context.getString(C1086R.string.appview_button_downgrade));
        } else if (i == 5) {
            button.setText(this.context.getString(C1086R.string.promo_update2appc_appview_update_button));
        }
    }

    private final void setDownloadState(DownloadProgressView downloadProgressView, int i, DownloadStatusModel.DownloadState downloadState) {
        int i2 = WhenMappings.$EnumSwitchMapping$2[downloadState.ordinal()];
        if (i2 == 1) {
            downloadProgressView.startDownload();
        } else if (i2 == 2) {
            downloadProgressView.startInstallation();
        } else if (i2 == 3) {
            downloadProgressView.pauseDownload();
        } else if (i2 == 4 || i2 == 5) {
            downloadProgressView.reset();
        }
        downloadProgressView.setProgress(i);
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setDownloadStatus(Download download, Button button, DownloadProgressView downloadProgressView, C12871b<DownloadClick> bVar) {
        C10202j.m34178b(download, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        C10202j.m34178b(button, "installButton");
        C10202j.m34178b(downloadProgressView, "downloadProgressView");
        C10202j.m34178b(bVar, "downloadClickSubject");
        DownloadStatusModel downloadModel = download.getDownloadModel();
        if (downloadModel != null) {
            if (downloadModel.getDownloadState() == DownloadStatusModel.DownloadState.GENERIC_ERROR) {
                bVar.onNext(new DownloadClick(download, DownloadEvent.GENERIC_ERROR));
            } else if (downloadModel.getDownloadState() == DownloadStatusModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
                bVar.onNext(new DownloadClick(download, DownloadEvent.OUT_OF_SPACE_ERROR));
            }
        }
        DownloadStatusModel downloadModel2 = download.getDownloadModel();
        if (downloadModel2 == null) {
            return;
        }
        if (downloadModel2.isDownloadingOrInstalling()) {
            setDownloadState(downloadProgressView, downloadModel2.getProgress(), downloadModel2.getDownloadState());
            button.setVisibility(8);
            downloadProgressView.setVisibility(0);
            return;
        }
        setDownloadButtonText(downloadModel2.getAction(), button);
        downloadProgressView.setVisibility(8);
        button.setVisibility(0);
    }

    public final void setupListeners(Download download, C12871b<DownloadClick> bVar, Button button, DownloadProgressView downloadProgressView) {
        C10202j.m34178b(download, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        C10202j.m34178b(bVar, "downloadClickSubject");
        C10202j.m34178b(button, "installButton");
        C10202j.m34178b(downloadProgressView, "downloadProgressView");
        button.setOnClickListener(new DownloadViewStatusHelper$setupListeners$1(bVar, download));
        downloadProgressView.setEventListener(new DownloadViewStatusHelper$setupListeners$2(bVar, download));
    }
}
