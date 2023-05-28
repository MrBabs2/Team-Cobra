package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.wallet.WalletAppProvider;
import p015cm.aptoide.p016pt.wallet.WalletInstallManager;
import p123rx.C5328b;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0011J\u0006\u0010\u0016\u001a\u00020\u000eJ\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListManager;", "", "walletAppProvider", "Lcm/aptoide/pt/wallet/WalletAppProvider;", "walletInstallManager", "Lcm/aptoide/pt/wallet/WalletInstallManager;", "(Lcm/aptoide/pt/wallet/WalletAppProvider;Lcm/aptoide/pt/wallet/WalletInstallManager;)V", "cachedWalletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "allowRootInstall", "", "answer", "", "cancelWalletDownload", "Lrx/Completable;", "downloadApp", "getWalletApp", "Lrx/Observable;", "loadWalletDownloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "observeWalletApp", "onWalletInstalled", "pauseWalletDownload", "resumeWalletDownload", "shouldShowRootInstallWarningPopup", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListManager */
/* compiled from: EarnAppcListManager.kt */
public final class EarnAppcListManager {
    /* access modifiers changed from: private */
    public WalletApp cachedWalletApp;
    private final WalletAppProvider walletAppProvider;
    /* access modifiers changed from: private */
    public final WalletInstallManager walletInstallManager;

    public EarnAppcListManager(WalletAppProvider walletAppProvider2, WalletInstallManager walletInstallManager2) {
        C10202j.m34178b(walletAppProvider2, "walletAppProvider");
        C10202j.m34178b(walletInstallManager2, "walletInstallManager");
        this.walletAppProvider = walletAppProvider2;
        this.walletInstallManager = walletInstallManager2;
    }

    public final void allowRootInstall(boolean z) {
        this.walletInstallManager.allowRootInstall(z);
    }

    public final C5328b cancelWalletDownload() {
        C5328b k = getWalletApp().mo18689g(new EarnAppcListManager$cancelWalletDownload$1(this)).mo18696k();
        C10202j.m34174a((Object) k, "getWalletApp()\n        .…\n        .toCompletable()");
        return k;
    }

    public final C5328b downloadApp() {
        C5328b k = getWalletApp().mo18689g(new EarnAppcListManager$downloadApp$1(this)).mo18696k();
        C10202j.m34174a((Object) k, "getWalletApp()\n        .…\n        .toCompletable()");
        return k;
    }

    public final C5368e<WalletApp> getWalletApp() {
        WalletApp walletApp = this.cachedWalletApp;
        if (walletApp != null) {
            C5368e<WalletApp> c = C5368e.m10257c(walletApp);
            C10202j.m34174a((Object) c, "Observable.just(cachedWalletApp)");
            return c;
        }
        C5368e<WalletApp> b = this.walletAppProvider.getWalletApp().mo18664b(new EarnAppcListManager$getWalletApp$1(this));
        C10202j.m34174a((Object) b, "walletAppProvider.getWal…edWalletApp = walletApp }");
        return b;
    }

    public final C5368e<DownloadModel> loadWalletDownloadModel() {
        C5368e<R> f = getWalletApp().mo18687f(new EarnAppcListManager$loadWalletDownloadModel$1(this));
        C10202j.m34174a((Object) f, "getWalletApp()\n        .….loadDownloadModel(app) }");
        return f;
    }

    public final C5368e<WalletApp> observeWalletApp() {
        return this.walletAppProvider.getWalletApp();
    }

    public final C5368e<Boolean> onWalletInstalled() {
        return this.walletInstallManager.onWalletInstalled();
    }

    public final C5328b pauseWalletDownload() {
        C5328b k = getWalletApp().mo18689g(new EarnAppcListManager$pauseWalletDownload$1(this)).mo18696k();
        C10202j.m34174a((Object) k, "getWalletApp()\n        .…\n        .toCompletable()");
        return k;
    }

    public final C5328b resumeWalletDownload() {
        C5328b k = getWalletApp().mo18689g(new EarnAppcListManager$resumeWalletDownload$1(this)).mo18696k();
        C10202j.m34174a((Object) k, "getWalletApp()\n        .…\n        .toCompletable()");
        return k;
    }

    public final boolean shouldShowRootInstallWarningPopup() {
        return this.walletInstallManager.shouldShowRootInstallWarningPopup();
    }
}
