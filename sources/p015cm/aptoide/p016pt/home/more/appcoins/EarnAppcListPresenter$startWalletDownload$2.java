package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p126m.C5379n;
import p123rx.schedulers.Schedulers;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListPresenter$startWalletDownload$2 */
/* compiled from: EarnAppcListPresenter.kt */
final class EarnAppcListPresenter$startWalletDownload$2<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ C5328b $actionCompletable;
    final /* synthetic */ EarnAppcListPresenter this$0;

    EarnAppcListPresenter$startWalletDownload$2(EarnAppcListPresenter earnAppcListPresenter, C5328b bVar) {
        this.this$0 = earnAppcListPresenter;
        this.$actionCompletable = bVar;
    }

    public final C5368e<Void> call(Void voidR) {
        return this.this$0.permissionManager.requestDownloadAllowingMobileData(this.this$0.permissionService).mo18687f(new C5379n<T, C5368e<? extends R>>(this) {
            final /* synthetic */ EarnAppcListPresenter$startWalletDownload$2 this$0;

            {
                this.this$0 = r1;
            }

            public final C5368e<Void> call(Void voidR) {
                return this.this$0.this$0.permissionManager.requestExternalStoragePermission(this.this$0.this$0.permissionService);
            }
        }).mo18644a(Schedulers.m10352io()).mo18689g(new C5379n<Void, C5328b>(this) {
            final /* synthetic */ EarnAppcListPresenter$startWalletDownload$2 this$0;

            {
                this.this$0 = r1;
            }

            public final C5328b call(Void voidR) {
                return this.this$0.$actionCompletable;
            }
        });
    }
}
