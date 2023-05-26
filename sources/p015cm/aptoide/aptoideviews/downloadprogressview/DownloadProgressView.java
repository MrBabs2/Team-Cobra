package p015cm.aptoide.aptoideviews.downloadprogressview;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;
import p015cm.aptoide.aptoideviews.common.AnimatedImageView;
import p015cm.aptoide.aptoideviews.common.Debouncer;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import p015cm.aptoide.aptoideviews.downloadprogressview.Event;
import p015cm.aptoide.aptoideviews.downloadprogressview.State;
import p112n.p319i.C10807a;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007J\b\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020!H\u0014J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020!J\b\u0010%\u001a\u00020!H\u0002J\u001a\u0010&\u001a\u00020!2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0015\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*J\u000e\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\fJ\u0010\u0010-\u001a\u00020!2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010.\u001a\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u000e\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\tJ\u0010\u00101\u001a\u00020!2\b\u00102\u001a\u0004\u0018\u000103J\b\u00104\u001a\u00020!H\u0002J\u0006\u00105\u001a\u00020!J\u0006\u00106\u001a\u00020!R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00180\u001aX\u000e¢\u0006\u0002\n\u0000¨\u00067"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/DownloadProgressView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationsEnabled", "", "currentProgress", "debouncer", "Lcm/aptoide/aptoideviews/common/Debouncer;", "downloadingText", "", "eventListener", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener;", "installingText", "isPausable", "pausedText", "payload", "", "stateMachine", "Lcom/tinder/StateMachine;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "events", "Lrx/Observable;", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "onAttachedToWindow", "", "onDetachedFromWindow", "pauseDownload", "reset", "resetProgress", "retrievePreferences", "setDebounceTime", "time", "", "setDebounceTime$aptoide_views_prodRelease", "setEnableAnimations", "enableAnimations", "setEventListener", "setPayload", "setProgress", "progress", "setProgressDrawable", "progressDrawable", "Landroid/graphics/drawable/Drawable;", "setupClickListeners", "startDownload", "startInstallation", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView */
/* compiled from: DownloadProgressView.kt */
public final class DownloadProgressView extends FrameLayout {
    private HashMap _$_findViewCache;
    private boolean animationsEnabled;
    /* access modifiers changed from: private */
    public int currentProgress;
    /* access modifiers changed from: private */
    public Debouncer debouncer;
    /* access modifiers changed from: private */
    public String downloadingText;
    /* access modifiers changed from: private */
    public DownloadEventListener eventListener;
    /* access modifiers changed from: private */
    public String installingText;
    /* access modifiers changed from: private */
    public boolean isPausable;
    /* access modifiers changed from: private */
    public String pausedText;
    /* access modifiers changed from: private */
    public Object payload;
    /* access modifiers changed from: private */
    public C10807a<State, Event, Object> stateMachine;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DownloadProgressView(Context context) {
        this(context, (AttributeSet) null);
        C10202j.m34178b(context, "context");
    }

    /* access modifiers changed from: private */
    public final void resetProgress() {
        this.currentProgress = 0;
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1033R.C1035id.progressBar);
        C10202j.m34174a((Object) progressBar, "progressBar");
        progressBar.setProgress(this.currentProgress);
        StringBuilder sb = new StringBuilder();
        sb.append(this.currentProgress);
        sb.append('%');
        String sb2 = sb.toString();
        TextView textView = (TextView) _$_findCachedViewById(C1033R.C1035id.downloadProgressNumber);
        C10202j.m34174a((Object) textView, "downloadProgressNumber");
        textView.setText(sb2);
    }

    private final void retrievePreferences(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1033R.styleable.DownloadProgressView, i, 0);
        setProgressDrawable(obtainStyledAttributes.getDrawable(C1033R.styleable.DownloadProgressView_progressDrawable));
        setEnableAnimations(obtainStyledAttributes.getBoolean(C1033R.styleable.DownloadProgressView_enableAnimations, true));
        this.isPausable = obtainStyledAttributes.getBoolean(C1033R.styleable.DownloadProgressView_isPausable, true);
        String string = obtainStyledAttributes.getString(C1033R.styleable.DownloadProgressView_downloadingText);
        if (string == null) {
            string = getContext().getString(C1033R.string.appview_short_downloading);
            C10202j.m34174a((Object) string, "context.getString(\n     …ppview_short_downloading)");
        }
        this.downloadingText = string;
        String string2 = obtainStyledAttributes.getString(C1033R.styleable.DownloadProgressView_pausedText);
        if (string2 == null) {
            string2 = getContext().getString(C1033R.string.apps_short_download_paused);
            C10202j.m34174a((Object) string2, "context.getString(\n     …ps_short_download_paused)");
        }
        this.pausedText = string2;
        String string3 = obtainStyledAttributes.getString(C1033R.styleable.DownloadProgressView_installingText);
        if (string3 == null) {
            string3 = getContext().getString(C1033R.string.apps_short_installing);
            C10202j.m34174a((Object) string3, "context.getString(\n     …ng.apps_short_installing)");
        }
        this.installingText = string3;
        obtainStyledAttributes.recycle();
    }

    private final void setupClickListeners() {
        ((ImageView) _$_findCachedViewById(C1033R.C1035id.cancelButton)).setOnClickListener(new DownloadProgressView$setupClickListeners$1(this));
        ((AnimatedImageView) _$_findCachedViewById(C1033R.C1035id.resumePauseButton)).setOnClickListener(new DownloadProgressView$setupClickListeners$2(this));
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

    public final C5368e<DownloadEventListener.Action> events() {
        C5368e<DownloadEventListener.Action> a = C5368e.m10241a(new DownloadProgressViewEventOnSubscribe(this));
        C10202j.m34174a((Object) a, "Observable.create(Downlo…ewEventOnSubscribe(this))");
        return a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupClickListeners();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ImageView) _$_findCachedViewById(C1033R.C1035id.cancelButton)).setOnClickListener((View.OnClickListener) null);
        ((AnimatedImageView) _$_findCachedViewById(C1033R.C1035id.resumePauseButton)).setOnClickListener((View.OnClickListener) null);
    }

    public final void pauseDownload() {
        this.stateMachine.mo36583a(Event.PauseStart.INSTANCE);
    }

    public final void reset() {
        this.stateMachine.mo36583a(Event.Reset.INSTANCE);
    }

    public final void setDebounceTime$aptoide_views_prodRelease(long j) {
        this.debouncer = new Debouncer(j);
    }

    public final void setEnableAnimations(boolean z) {
        this.animationsEnabled = z;
        ((AnimatedImageView) _$_findCachedViewById(C1033R.C1035id.resumePauseButton)).setAnimationsEnabled(z);
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C1033R.C1035id.rootLayout);
        C10202j.m34174a((Object) constraintLayout, "rootLayout");
        constraintLayout.setLayoutTransition(z ? new LayoutTransition() : null);
    }

    public final void setEventListener(DownloadEventListener downloadEventListener) {
        this.eventListener = downloadEventListener;
        if (downloadEventListener == null) {
            ((ImageView) _$_findCachedViewById(C1033R.C1035id.cancelButton)).setOnClickListener((View.OnClickListener) null);
            ((AnimatedImageView) _$_findCachedViewById(C1033R.C1035id.resumePauseButton)).setOnClickListener((View.OnClickListener) null);
        }
    }

    public final void setPayload(Object obj) {
        this.payload = obj;
    }

    public final void setProgress(int i) {
        if (!C10202j.m34176a((Object) this.stateMachine.mo36582a(), (Object) State.Queue.INSTANCE) && !C10202j.m34176a((Object) this.stateMachine.mo36582a(), (Object) State.Canceled.INSTANCE)) {
            this.currentProgress = Math.min(Math.max(i, 0), 100);
            if (C10202j.m34176a((Object) this.stateMachine.mo36582a(), (Object) State.InProgress.INSTANCE) || C10202j.m34176a((Object) this.stateMachine.mo36582a(), (Object) State.InitialPaused.INSTANCE)) {
                if (Build.VERSION.SDK_INT >= 24) {
                    ((ProgressBar) _$_findCachedViewById(C1033R.C1035id.progressBar)).setProgress(this.currentProgress, this.animationsEnabled);
                } else {
                    ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1033R.C1035id.progressBar);
                    C10202j.m34174a((Object) progressBar, "progressBar");
                    progressBar.setProgress(this.currentProgress);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.currentProgress);
                sb.append('%');
                String sb2 = sb.toString();
                TextView textView = (TextView) _$_findCachedViewById(C1033R.C1035id.downloadProgressNumber);
                C10202j.m34174a((Object) textView, "downloadProgressNumber");
                textView.setText(sb2);
            }
        }
    }

    public final void setProgressDrawable(Drawable drawable) {
        if (drawable != null) {
            ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1033R.C1035id.progressBar);
            C10202j.m34174a((Object) progressBar, "progressBar");
            progressBar.setProgressDrawable(drawable);
        }
    }

    public final void startDownload() {
        this.stateMachine.mo36583a(Event.DownloadStart.INSTANCE);
    }

    public final void startInstallation() {
        this.stateMachine.mo36583a(Event.InstallStart.INSTANCE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DownloadProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C10202j.m34178b(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10202j.m34178b(context, "context");
        this.isPausable = true;
        this.debouncer = new Debouncer(750);
        this.downloadingText = "";
        this.pausedText = "";
        this.installingText = "";
        this.stateMachine = C10807a.f28873c.mo36584a(new DownloadProgressView$stateMachine$1(this));
        FrameLayout.inflate(context, C1033R.layout.download_progress_view, this);
        retrievePreferences(attributeSet, i);
    }
}
