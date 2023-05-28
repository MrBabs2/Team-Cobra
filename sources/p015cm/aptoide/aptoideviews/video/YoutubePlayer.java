package p015cm.aptoide.aptoideviews.video;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\fJ\b\u0010\u0016\u001a\u00020\u0013H\u0002R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/video/YoutubePlayer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentEnableSubtitles", "", "Ljava/lang/Boolean;", "currentVideoId", "", "threadHandler", "Landroid/os/Handler;", "loadVideo", "", "videoId", "enableSubtitles", "setListeners", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.video.YoutubePlayer */
/* compiled from: YoutubePlayer.kt */
public final class YoutubePlayer extends FrameLayout {
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public Boolean currentEnableSubtitles;
    /* access modifiers changed from: private */
    public String currentVideoId;
    /* access modifiers changed from: private */
    public final Handler threadHandler;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public YoutubePlayer(Context context) {
        this(context, (AttributeSet) null);
        C10202j.m34178b(context, "context");
    }

    private final void setListeners() {
        ((YoutubeWebViewPlayer) _$_findCachedViewById(C1033R.C1035id.webview)).setOnPageFinishedAction(new YoutubePlayer$setListeners$1(this));
        ((YoutubeWebViewPlayer) _$_findCachedViewById(C1033R.C1035id.webview)).setOnErrorAction(new YoutubePlayer$setListeners$2(this));
        ((TextView) _$_findCachedViewById(C1033R.C1035id.status_text)).setOnClickListener(new YoutubePlayer$setListeners$3(this));
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void loadVideo(String str, boolean z) {
        C10202j.m34178b(str, "videoId");
        this.currentVideoId = str;
        this.currentEnableSubtitles = Boolean.valueOf(z);
        ((YoutubeWebViewPlayer) _$_findCachedViewById(C1033R.C1035id.webview)).loadVideo(str, z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public YoutubePlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C10202j.m34178b(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YoutubePlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10202j.m34178b(context, "context");
        this.threadHandler = new Handler();
        setLayoutTransition(new LayoutTransition());
        FrameLayout.inflate(context, C1033R.layout.youtube_player, this);
        setListeners();
    }
}
