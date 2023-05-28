package p015cm.aptoide.p016pt.notification;

import android.app.Notification;
import android.content.Context;
import android.graphics.BitmapFactory;
import androidx.core.app.C0373i;
import java.util.concurrent.Callable;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.C1086R;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo16641d2 = {"<anonymous>", "Landroid/app/Notification;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.ReadyToInstallNotificationManager$buildMultiReadyToInstallNotification$1 */
/* compiled from: ReadyToInstallNotificationManager.kt */
final class C3452xb165d63f<V> implements Callable<T> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReadyToInstallNotificationManager this$0;

    C3452xb165d63f(ReadyToInstallNotificationManager readyToInstallNotificationManager, Context context) {
        this.this$0 = readyToInstallNotificationManager;
        this.$context = context;
    }

    public final Notification call() {
        String string = this.$context.getString(C1086R.string.notification_install_ready_plural_title);
        String string2 = this.$context.getString(C1086R.string.notification_install_ready_plural_body);
        C0373i.C0377d dVar = new C0373i.C0377d(this.$context);
        dVar.mo2242a(this.this$0.getMultiAppPressIntentAction(this.$context));
        dVar.mo2251b(this.this$0.getOnDismissAction(this.$context));
        dVar.mo2254c((int) C1086R.C1087drawable.ic_stat_aptoide_notification);
        dVar.mo2243a(BitmapFactory.decodeResource(this.$context.getResources(), C1086R.mipmap.ic_launcher));
        dVar.mo2252b((CharSequence) string);
        dVar.mo2246a((CharSequence) string2);
        C0373i.C0375b bVar = new C0373i.C0375b();
        bVar.mo2234a((CharSequence) string2);
        dVar.mo2245a((C0373i.C0378e) bVar);
        dVar.mo2248a(true);
        dVar.mo2247a(ReadyToInstallNotificationManager.CHANNEL_ID);
        dVar.mo2257d(true);
        dVar.mo2256c(true);
        return dVar.mo2237a();
    }
}
