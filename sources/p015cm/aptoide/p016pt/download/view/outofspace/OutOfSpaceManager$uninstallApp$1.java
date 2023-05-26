package p015cm.aptoide.p016pt.download.view.outofspace;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Single;", "", "kotlin.jvm.PlatformType", "appSize", "call", "(Ljava/lang/Long;)Lrx/Single;"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceManager$uninstallApp$1 */
/* compiled from: OutOfSpaceManager.kt */
final class OutOfSpaceManager$uninstallApp$1<T, R> implements C5379n<T, Single<? extends R>> {
    final /* synthetic */ String $packageName;
    final /* synthetic */ OutOfSpaceManager this$0;

    OutOfSpaceManager$uninstallApp$1(OutOfSpaceManager outOfSpaceManager, String str) {
        this.this$0 = outOfSpaceManager;
        this.$packageName = str;
    }

    public final Single<Long> call(final Long l) {
        return this.this$0.installManager.uninstallApp(this.$packageName).mo18583a(Single.m10119a(l)).mo18564b(new C5378b<Long>(this) {
            final /* synthetic */ OutOfSpaceManager$uninstallApp$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void call(Long l) {
                long access$getRequiredSpace$p = this.this$0.this$0.requiredSpace;
                Long l2 = l;
                C10202j.m34174a((Object) l2, "appSize");
                if (access$getRequiredSpace$p <= l2.longValue()) {
                    this.this$0.this$0.uninstalledEnoughApps.onNext(null);
                    return;
                }
                OutOfSpaceManager outOfSpaceManager = this.this$0.this$0;
                long access$getRequiredSpace$p2 = outOfSpaceManager.requiredSpace;
                Long l3 = l;
                C10202j.m34174a((Object) l3, "appSize");
                outOfSpaceManager.requiredSpace = access$getRequiredSpace$p2 - l3.longValue();
            }
        });
    }
}
