package p015cm.aptoide.p016pt.download.view.outofspace;

import java.util.List;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002 \u0004*.\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002\u0018\u00010\u00010\u00012*\u0010\u0006\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00050\u0002H\n¢\u0006\u0002\b\b"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "", "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "kotlin.jvm.PlatformType", "", "it", "Lcm/aptoide/pt/database/room/RoomInstalled;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceManager$getInstalledApps$1 */
/* compiled from: OutOfSpaceManager.kt */
final class OutOfSpaceManager$getInstalledApps$1<T, R> implements C5379n<T, C5368e<? extends R>> {
    public static final OutOfSpaceManager$getInstalledApps$1 INSTANCE = new OutOfSpaceManager$getInstalledApps$1();

    OutOfSpaceManager$getInstalledApps$1() {
    }

    public final C5368e<List<InstalledApp>> call(List<RoomInstalled> list) {
        return C5368e.m10234a(list).mo18681d(C22951.INSTANCE).mo18694j(C22962.INSTANCE).mo18698l();
    }
}
