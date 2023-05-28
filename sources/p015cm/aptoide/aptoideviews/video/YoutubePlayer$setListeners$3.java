package p015cm.aptoide.aptoideviews.video;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.aptoideviews.C1033R;
import p015cm.aptoide.aptoideviews.ExtensionsKt;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.video.YoutubePlayer$setListeners$3 */
/* compiled from: YoutubePlayer.kt */
final class YoutubePlayer$setListeners$3 implements View.OnClickListener {
    final /* synthetic */ YoutubePlayer this$0;

    YoutubePlayer$setListeners$3(YoutubePlayer youtubePlayer) {
        this.this$0 = youtubePlayer;
    }

    public final void onClick(View view) {
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C1033R.C1035id.progress_bar);
        C10202j.m34174a((Object) progressBar, "progress_bar");
        progressBar.setVisibility(0);
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C1033R.C1035id.status_text);
        C10202j.m34174a((Object) textView, "status_text");
        textView.setVisibility(8);
        ExtensionsKt.safeLet(this.this$0.currentVideoId, this.this$0.currentEnableSubtitles, new C9117p<String, Boolean, C10483v>(this) {
            final /* synthetic */ YoutubePlayer$setListeners$3 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, ((Boolean) obj2).booleanValue());
                return C10483v.f28357a;
            }

            public final void invoke(String str, boolean z) {
                C10202j.m34178b(str, "videoId");
                ((YoutubeWebViewPlayer) this.this$0.this$0._$_findCachedViewById(C1033R.C1035id.webview)).loadVideo(str, z);
            }
        });
    }
}
