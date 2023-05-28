package p015cm.aptoide.aptoideviews.video;

import android.webkit.ValueCallback;
import kotlin.C4789l;
import kotlin.p215c0.p216c.C9102a;
import p015cm.aptoide.aptoideviews.video.YoutubeWebViewPlayer;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onReceiveValue"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.video.YoutubeWebViewPlayer$YoutubeWebViewClient$onPageFinished$1 */
/* compiled from: YoutubeWebViewPlayer.kt */
final class YoutubeWebViewPlayer$YoutubeWebViewClient$onPageFinished$1<T> implements ValueCallback<String> {
    final /* synthetic */ YoutubeWebViewPlayer.YoutubeWebViewClient this$0;

    YoutubeWebViewPlayer$YoutubeWebViewClient$onPageFinished$1(YoutubeWebViewPlayer.YoutubeWebViewClient youtubeWebViewClient) {
        this.this$0 = youtubeWebViewClient;
    }

    public final void onReceiveValue(String str) {
        if (!this.this$0.hasError) {
            this.this$0.hasLoaded = true;
            C9102a access$getOnPageFinishedAction$p = this.this$0.onPageFinishedAction;
            if (access$getOnPageFinishedAction$p != null) {
                access$getOnPageFinishedAction$p.invoke();
            }
        }
    }
}
