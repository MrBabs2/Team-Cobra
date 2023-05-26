package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.GenericResponseV2;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.app.FlagManager */
public class FlagManager {
    private final FlagService flagService;

    public FlagManager(FlagService flagService2) {
        this.flagService = flagService2;
    }

    public Single<GenericResponseV2> flagApk(String str, String str2, String str3) {
        return this.flagService.doApkFlagRequest(str, str2, str3);
    }
}
