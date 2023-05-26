package p015cm.aptoide.p016pt.notification;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.home.apps.AppMapper;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002 \u0004*.\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002\u0018\u00010\u00010\u00012*\u0010\u0006\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00050\u0002H\n¢\u0006\u0002\b\b"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "", "Lcm/aptoide/pt/home/apps/model/UpdateApp;", "kotlin.jvm.PlatformType", "", "updates", "Lcm/aptoide/pt/database/room/RoomUpdate;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.UpdatesNotificationWorker$doWork$1 */
/* compiled from: UpdatesNotificationWorker.kt */
final class UpdatesNotificationWorker$doWork$1<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ UpdatesNotificationWorker this$0;

    UpdatesNotificationWorker$doWork$1(UpdatesNotificationWorker updatesNotificationWorker) {
        this.this$0 = updatesNotificationWorker;
    }

    public final C5368e<List<UpdateApp>> call(List<RoomUpdate> list) {
        return C5368e.m10234a(list).mo18667b(new C5379n<T, Single<? extends R>>(this) {
            final /* synthetic */ UpdatesNotificationWorker$doWork$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Single<UpdateApp> call(final RoomUpdate roomUpdate) {
                AptoideInstallManager access$getAptoideInstallManager$p = this.this$0.this$0.aptoideInstallManager;
                C10202j.m34174a((Object) roomUpdate, "update");
                String packageName = roomUpdate.getPackageName();
                C10202j.m34174a((Object) packageName, "update.packageName");
                return access$getAptoideInstallManager$p.isInstalledWithAptoide(packageName).mo18569d(new C5379n<T, R>(this) {
                    final /* synthetic */ C34541 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final UpdateApp call(Boolean bool) {
                        AppMapper access$getAppMapper$p = this.this$0.this$0.this$0.appMapper;
                        RoomUpdate roomUpdate = roomUpdate;
                        C10202j.m34174a((Object) bool, "isAptoideInstalled");
                        return access$getAppMapper$p.mapUpdateToUpdateApp(roomUpdate, bool.booleanValue());
                    }
                });
            }
        }, false, 1).mo18653a(C34562.INSTANCE).mo18664b(new C5378b<List<UpdateApp>>(this) {
            final /* synthetic */ UpdatesNotificationWorker$doWork$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void call(List<UpdateApp> list) {
                UpdatesNotificationWorker updatesNotificationWorker = this.this$0.this$0;
                C10202j.m34174a((Object) list, "updates");
                updatesNotificationWorker.handleNotification(list);
            }
        });
    }
}
