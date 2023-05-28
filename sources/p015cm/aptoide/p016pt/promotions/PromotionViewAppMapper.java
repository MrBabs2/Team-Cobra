package p015cm.aptoide.p016pt.promotions;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.install.Install;

/* renamed from: cm.aptoide.pt.promotions.PromotionViewAppMapper */
public class PromotionViewAppMapper {
    private final DownloadStateParser downloadStateParser;

    public PromotionViewAppMapper(DownloadStateParser downloadStateParser2) {
        this.downloadStateParser = downloadStateParser2;
    }

    private DownloadModel getDownloadModel(Install.InstallationType installationType, int i, Install.InstallationStatus installationStatus, boolean z, long j) {
        return new DownloadModel(this.downloadStateParser.parseDownloadType(installationType, false), i, this.downloadStateParser.parseDownloadState(installationStatus, z), j);
    }

    public PromotionViewApp mapInstallToPromotionApp(Install install, PromotionApp promotionApp) {
        return new PromotionViewApp(getDownloadModel(install.getType(), install.getProgress(), install.getState(), install.isIndeterminate(), install.getAppSize()), promotionApp.getName(), promotionApp.getPackageName(), promotionApp.getAppId(), promotionApp.getDownloadPath(), promotionApp.getAlternativePath(), promotionApp.getAppIcon(), promotionApp.isClaimed(), promotionApp.getDescription(), promotionApp.getSize(), promotionApp.getRating(), promotionApp.getNumberOfDownloads(), promotionApp.getMd5(), promotionApp.getVersionCode(), promotionApp.getVersionName(), promotionApp.getObb(), promotionApp.getAppcValue(), promotionApp.getSignature(), promotionApp.hasAppc(), promotionApp.getSplits(), promotionApp.getRequiredSplits(), promotionApp.getRank(), promotionApp.getStoreName(), promotionApp.getFiatValue(), promotionApp.getFiatSymbol());
    }
}
