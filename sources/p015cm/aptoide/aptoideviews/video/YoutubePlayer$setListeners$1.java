package p015cm.aptoide.aptoideviews.video;

import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9102a;
import p015cm.aptoide.aptoideviews.C1033R;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo16641d2 = {"<anonymous>", "", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.video.YoutubePlayer$setListeners$1 */
/* compiled from: YoutubePlayer.kt */
final class YoutubePlayer$setListeners$1 extends C10203k implements C9102a<C10483v> {
    final /* synthetic */ YoutubePlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YoutubePlayer$setListeners$1(YoutubePlayer youtubePlayer) {
        super(0);
        this.this$0 = youtubePlayer;
    }

    public final void invoke() {
        this.this$0.threadHandler.postDelayed(new Runnable(this) {
            final /* synthetic */ YoutubePlayer$setListeners$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                YoutubeWebViewPlayer youtubeWebViewPlayer = (YoutubeWebViewPlayer) this.this$0.this$0._$_findCachedViewById(C1033R.C1035id.webview);
                C10202j.m34174a((Object) youtubeWebViewPlayer, "webview");
                youtubeWebViewPlayer.setVisibility(0);
                ProgressBar progressBar = (ProgressBar) this.this$0.this$0._$_findCachedViewById(C1033R.C1035id.progress_bar);
                C10202j.m34174a((Object) progressBar, "progress_bar");
                progressBar.setVisibility(8);
                TextView textView = (TextView) this.this$0.this$0._$_findCachedViewById(C1033R.C1035id.status_text);
                C10202j.m34174a((Object) textView, "status_text");
                textView.setVisibility(8);
            }
        }, 500);
    }
}
