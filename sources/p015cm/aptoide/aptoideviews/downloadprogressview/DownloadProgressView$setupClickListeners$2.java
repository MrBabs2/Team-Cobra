package p015cm.aptoide.aptoideviews.downloadprogressview;

import android.view.View;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;
import p015cm.aptoide.aptoideviews.downloadprogressview.Event;
import p015cm.aptoide.aptoideviews.downloadprogressview.State;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$setupClickListeners$2 */
/* compiled from: DownloadProgressView.kt */
final class DownloadProgressView$setupClickListeners$2 implements View.OnClickListener {
    final /* synthetic */ DownloadProgressView this$0;

    DownloadProgressView$setupClickListeners$2(DownloadProgressView downloadProgressView) {
        this.this$0 = downloadProgressView;
    }

    public final void onClick(View view) {
        this.this$0.debouncer.execute(new C9102a<C10483v>(this) {
            final /* synthetic */ DownloadProgressView$setupClickListeners$2 this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                if (!this.this$0.this$0.isPausable) {
                    return;
                }
                if (C10202j.m34176a((Object) (State) this.this$0.this$0.stateMachine.mo36582a(), (Object) State.InProgress.INSTANCE)) {
                    this.this$0.this$0.stateMachine.mo36583a(Event.PauseClick.INSTANCE);
                } else {
                    this.this$0.this$0.stateMachine.mo36583a(Event.ResumeClick.INSTANCE);
                }
            }
        });
    }
}
