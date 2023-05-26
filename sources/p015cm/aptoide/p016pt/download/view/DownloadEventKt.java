package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, mo16641d2 = {"toDownloadEvent", "Lcm/aptoide/pt/download/view/DownloadEvent;", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "app_vanillaProdRelease"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadEventKt */
/* compiled from: DownloadEvent.kt */
public final class DownloadEventKt {

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.download.view.DownloadEventKt$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadEventListener.Action.Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DownloadEventListener.Action.Type.CANCEL.ordinal()] = 1;
            $EnumSwitchMapping$0[DownloadEventListener.Action.Type.RESUME.ordinal()] = 2;
            $EnumSwitchMapping$0[DownloadEventListener.Action.Type.PAUSE.ordinal()] = 3;
        }
    }

    public static final DownloadEvent toDownloadEvent(DownloadEventListener.Action action) {
        C10202j.m34178b(action, "$this$toDownloadEvent");
        int i = WhenMappings.$EnumSwitchMapping$0[action.getType().ordinal()];
        if (i == 1) {
            return DownloadEvent.CANCEL;
        }
        if (i == 2) {
            return DownloadEvent.RESUME;
        }
        if (i == 3) {
            return DownloadEvent.PAUSE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
