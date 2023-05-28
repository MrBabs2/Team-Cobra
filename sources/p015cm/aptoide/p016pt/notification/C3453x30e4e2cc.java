package p015cm.aptoide.p016pt.notification;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.C0373i;
import java.util.concurrent.Callable;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo16641d2 = {"<anonymous>", "Landroid/app/Notification;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.ReadyToInstallNotificationManager$buildSingleReadyToInstallNotification$1 */
/* compiled from: ReadyToInstallNotificationManager.kt */
final class C3453x30e4e2cc<V> implements Callable<T> {
    final /* synthetic */ String $appName;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $icon;
    final /* synthetic */ String $url;
    final /* synthetic */ ReadyToInstallNotificationManager this$0;

    C3453x30e4e2cc(ReadyToInstallNotificationManager readyToInstallNotificationManager, Context context, String str, String str2, String str3) {
        this.this$0 = readyToInstallNotificationManager;
        this.$context = context;
        this.$appName = str;
        this.$url = str2;
        this.$icon = str3;
    }

    public final Notification call() {
        String string = this.$context.getString(C1086R.string.notification_install_ready_singular_title);
        String string2 = this.$context.getString(C1086R.string.notification_install_ready_singular_body, new Object[]{this.$appName});
        C0373i.C0377d dVar = new C0373i.C0377d(this.$context);
        dVar.mo2242a(this.this$0.getSingleAppPressIntentAction(this.$url, this.$context));
        dVar.mo2251b(this.this$0.getOnDismissAction(this.$context));
        dVar.mo2254c((int) C1086R.C1087drawable.ic_stat_aptoide_notification);
        dVar.mo2252b((CharSequence) string);
        dVar.mo2246a((CharSequence) string2);
        dVar.mo2243a(ImageLoader.with(this.$context).loadBitmap(this.$icon));
        C0373i.C0375b bVar = new C0373i.C0375b();
        bVar.mo2234a((CharSequence) string2);
        dVar.mo2245a((C0373i.C0378e) bVar);
        dVar.mo2248a(true);
        dVar.mo2256c(true);
        dVar.mo2247a(ReadyToInstallNotificationManager.CHANNEL_ID);
        dVar.mo2257d(true);
        return dVar.mo2237a();
    }
}
