package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.download.view.DownloadViewActionPresenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/download/view/DownloadClick;", "kotlin.jvm.PlatformType", "it", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$present$3 */
/* compiled from: DownloadViewActionPresenter.kt */
final class DownloadViewActionPresenter$present$3<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ DownloadViewActionPresenter this$0;

    DownloadViewActionPresenter$present$3(DownloadViewActionPresenter downloadViewActionPresenter) {
        this.this$0 = downloadViewActionPresenter;
    }

    public final C5368e<DownloadClick> call(View.LifecycleEvent lifecycleEvent) {
        return this.this$0.getEventObservable().mo18702n(C22911.INSTANCE).mo18689g(new C5379n<DownloadClick, C5328b>(this) {
            final /* synthetic */ DownloadViewActionPresenter$present$3 this$0;

            {
                this.this$0 = r1;
            }

            public final C5328b call(DownloadClick downloadClick) {
                switch (DownloadViewActionPresenter.WhenMappings.$EnumSwitchMapping$0[downloadClick.getAction().ordinal()]) {
                    case 1:
                        DownloadViewActionPresenter downloadViewActionPresenter = this.this$0.this$0;
                        C10202j.m34174a((Object) downloadClick, "event");
                        return downloadViewActionPresenter.installApp(downloadClick);
                    case 2:
                        DownloadViewActionPresenter downloadViewActionPresenter2 = this.this$0.this$0;
                        C10202j.m34174a((Object) downloadClick, "event");
                        return downloadViewActionPresenter2.resumeDownload(downloadClick);
                    case 3:
                        DownloadViewActionPresenter downloadViewActionPresenter3 = this.this$0.this$0;
                        C10202j.m34174a((Object) downloadClick, "event");
                        return downloadViewActionPresenter3.pauseDownload(downloadClick);
                    case 4:
                        DownloadViewActionPresenter downloadViewActionPresenter4 = this.this$0.this$0;
                        C10202j.m34174a((Object) downloadClick, "event");
                        return downloadViewActionPresenter4.cancelDownload(downloadClick);
                    case 5:
                        return this.this$0.this$0.downloadDialogProvider.showGenericError();
                    case 6:
                        DownloadViewActionPresenter downloadViewActionPresenter5 = this.this$0.this$0;
                        C10202j.m34174a((Object) downloadClick, "event");
                        return downloadViewActionPresenter5.handleOutOfSpaceError(downloadClick);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }).mo18686f();
    }
}
