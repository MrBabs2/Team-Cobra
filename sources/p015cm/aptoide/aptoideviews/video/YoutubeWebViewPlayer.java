package p015cm.aptoide.aptoideviews.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015J\u0014\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/video/YoutubeWebViewPlayer;", "Landroid/webkit/WebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "youtubeWebViewClient", "Lcm/aptoide/aptoideviews/video/YoutubeWebViewPlayer$YoutubeWebViewClient;", "loadVideo", "", "videoId", "", "enableSubtitles", "", "setOnErrorAction", "action", "Lkotlin/Function0;", "setOnPageFinishedAction", "YoutubeWebViewClient", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.video.YoutubeWebViewPlayer */
/* compiled from: YoutubeWebViewPlayer.kt */
public final class YoutubeWebViewPlayer extends WebView {
    private HashMap _$_findViewCache;
    private final YoutubeWebViewClient youtubeWebViewClient;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u000f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J&\u0010\u0012\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0014\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\u0019\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u001c\u0010\u001a\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/video/YoutubeWebViewPlayer$YoutubeWebViewClient;", "Landroid/webkit/WebViewClient;", "()V", "hasError", "", "hasLoaded", "onErrorAction", "Lkotlin/Function0;", "", "onPageFinishedAction", "onPageFinished", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "setOnError", "action", "setOnPageFinishedAction", "shouldOverrideUrlLoading", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.video.YoutubeWebViewPlayer$YoutubeWebViewClient */
    /* compiled from: YoutubeWebViewPlayer.kt */
    private static final class YoutubeWebViewClient extends WebViewClient {
        /* access modifiers changed from: private */
        public boolean hasError;
        /* access modifiers changed from: private */
        public boolean hasLoaded;
        private C9102a<C10483v> onErrorAction;
        /* access modifiers changed from: private */
        public C9102a<C10483v> onPageFinishedAction;

        public void onPageFinished(WebView webView, String str) {
            C10202j.m34178b(webView, "view");
            if (Build.VERSION.SDK_INT >= 19) {
                webView.evaluateJavascript("document.getElementsByClassName('ytp-chrome-top')[0].remove();" + "document.getElementsByClassName('ytp-icon-large-play-button-hover')[0].style.background=\"no-repeat url('https://cdn6.aptoide.com/includes/themes/2014/images/vanilla_appcoins_info_video_placeholder.svg')\";" + "document.getElementsByClassName('ytp-icon-large-play-button-hover')[0].style.width=\"75px\";" + "document.getElementsByClassName('ytp-icon-large-play-button-hover')[0].style.height=\"75px\";", new YoutubeWebViewPlayer$YoutubeWebViewClient$onPageFinished$1(this));
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.hasError = false;
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (!this.hasLoaded) {
                C9102a<C10483v> aVar = this.onErrorAction;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.hasError = true;
            }
        }

        public final void setOnError(C9102a<C10483v> aVar) {
            C10202j.m34178b(aVar, "action");
            this.onErrorAction = aVar;
        }

        public final void setOnPageFinishedAction(C9102a<C10483v> aVar) {
            C10202j.m34178b(aVar, "action");
            this.onPageFinishedAction = aVar;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public YoutubeWebViewPlayer(Context context) {
        this(context, (AttributeSet) null);
        C10202j.m34178b(context, "context");
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
        String str2 = z ? "&cc_load_policy=1" : "";
        loadUrl("https://www.youtube.com/embed/" + str + "?rel=0" + str2);
    }

    public final void setOnErrorAction(C9102a<C10483v> aVar) {
        C10202j.m34178b(aVar, "action");
        this.youtubeWebViewClient.setOnError(aVar);
    }

    public final void setOnPageFinishedAction(C9102a<C10483v> aVar) {
        C10202j.m34178b(aVar, "action");
        this.youtubeWebViewClient.setOnPageFinishedAction(aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public YoutubeWebViewPlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C10202j.m34178b(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YoutubeWebViewPlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10202j.m34178b(context, "context");
        this.youtubeWebViewClient = new YoutubeWebViewClient();
        setOnTouchListener(new View.OnTouchListener(this) {
            final /* synthetic */ YoutubeWebViewPlayer this$0;

            {
                this.this$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (Build.VERSION.SDK_INT < 19) {
                    return false;
                }
                YoutubeWebViewPlayer youtubeWebViewPlayer = this.this$0;
                youtubeWebViewPlayer.evaluateJavascript("document.getElementsByClassName('ytp-endscreen-content')[0].remove();" + "document.getElementsByClassName('html5-endscreen')[0].remove();" + "document.getElementsByClassName('ytp-replay-button')[0].style.top=0;" + "document.getElementsByClassName('ytp-pause-overlay')[0].remove();", (ValueCallback) null);
                return false;
            }
        });
        setWebViewClient(this.youtubeWebViewClient);
        setWebChromeClient(new WebChromeClientWithoutPlayerPlaceholder());
        getSettings().setJavaScriptEnabled(true);
    }
}
