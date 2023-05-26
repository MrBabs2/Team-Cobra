package p015cm.aptoide.p016pt.notification;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.app.aptoideinstall.ComingSoonApp;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.view.app.DetailedApp;
import p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "", "detailedAppResult", "Lcm/aptoide/pt/view/app/DetailedAppRequestResult;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.ComingSoonNotificationWorker$doWork$1 */
/* compiled from: ComingSoonNotificationWorker.kt */
final class ComingSoonNotificationWorker$doWork$1<T> implements C5378b<DetailedAppRequestResult> {
    final /* synthetic */ String $packageName;
    final /* synthetic */ ComingSoonNotificationWorker this$0;

    ComingSoonNotificationWorker$doWork$1(ComingSoonNotificationWorker comingSoonNotificationWorker, String str) {
        this.this$0 = comingSoonNotificationWorker;
        this.$packageName = str;
    }

    public final void call(DetailedAppRequestResult detailedAppRequestResult) {
        if (detailedAppRequestResult != null && detailedAppRequestResult.getDetailedApp() != null) {
            this.this$0.cancelComingSoonVerification(this.$packageName);
            ComingSoonNotificationWorker comingSoonNotificationWorker = this.this$0;
            DetailedApp detailedApp = detailedAppRequestResult.getDetailedApp();
            C10202j.m34174a((Object) detailedApp, "detailedAppResult.detailedApp");
            String name = detailedApp.getName();
            C10202j.m34174a((Object) name, "detailedAppResult.detailedApp.name");
            DetailedApp detailedApp2 = detailedAppRequestResult.getDetailedApp();
            C10202j.m34174a((Object) detailedApp2, "detailedAppResult.detailedApp");
            String icon = detailedApp2.getIcon();
            C10202j.m34174a((Object) icon, "detailedAppResult.detailedApp.icon");
            DetailedApp detailedApp3 = detailedAppRequestResult.getDetailedApp();
            C10202j.m34174a((Object) detailedApp3, "detailedAppResult.detailedApp");
            String md5 = detailedApp3.getMd5();
            C10202j.m34174a((Object) md5, "detailedAppResult.detailedApp.md5");
            DetailedApp detailedApp4 = detailedAppRequestResult.getDetailedApp();
            C10202j.m34174a((Object) detailedApp4, "detailedAppResult.detailedApp");
            Store store = detailedApp4.getStore();
            C10202j.m34174a((Object) store, "detailedAppResult.detailedApp.store");
            String name2 = store.getName();
            C10202j.m34174a((Object) name2, "detailedAppResult.detailedApp.store.name");
            DetailedApp detailedApp5 = detailedAppRequestResult.getDetailedApp();
            C10202j.m34174a((Object) detailedApp5, "detailedAppResult.detailedApp");
            String packageName = detailedApp5.getPackageName();
            C10202j.m34174a((Object) packageName, "detailedAppResult.detailedApp.packageName");
            comingSoonNotificationWorker.handleAppArrived(new ComingSoonApp(name, icon, md5, name2, packageName));
        }
    }
}
