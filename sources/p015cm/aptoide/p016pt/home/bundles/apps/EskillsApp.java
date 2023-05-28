package p015cm.aptoide.p016pt.home.bundles.apps;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.view.app.Application;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/apps/EskillsApp;", "Lcm/aptoide/pt/view/app/Application;", "appName", "", "appIcon", "ratingAverage", "", "downloadsNumber", "", "packageName", "appId", "", "tag", "hasBilling", "", "featureGraphic", "(Ljava/lang/String;Ljava/lang/String;FILjava/lang/String;JLjava/lang/String;ZLjava/lang/String;)V", "getFeatureGraphic", "()Ljava/lang/String;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.apps.EskillsApp */
/* compiled from: EskillsApp.kt */
public final class EskillsApp extends Application {
    private final String featureGraphic;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EskillsApp(String str, String str2, float f, int i, String str3, long j, String str4, boolean z, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, f, i, str3, j, str4, z, (i2 & 256) != 0 ? "" : str5);
    }

    public final String getFeatureGraphic() {
        return this.featureGraphic;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EskillsApp(String str, String str2, float f, int i, String str3, long j, String str4, boolean z, String str5) {
        super(str, str2, f, i, str3, j, str4, z);
        C10202j.m34178b(str, "appName");
        C10202j.m34178b(str2, "appIcon");
        C10202j.m34178b(str3, "packageName");
        C10202j.m34178b(str4, StoreTabGridRecyclerFragment.BundleCons.TAG);
        this.featureGraphic = str5;
    }
}
