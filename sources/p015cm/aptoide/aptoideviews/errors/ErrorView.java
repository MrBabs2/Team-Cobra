package p015cm.aptoide.aptoideviews.errors;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;
import p015cm.aptoide.aptoideviews.C1033R;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0007¨\u0006\u0016"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/errors/ErrorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "retryClick", "Lrx/Observable;", "Ljava/lang/Void;", "setError", "", "error", "Lcm/aptoide/aptoideviews/errors/ErrorView$Error;", "setRetryAction", "action", "Lkotlin/Function0;", "Error", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.errors.ErrorView */
/* compiled from: ErrorView.kt */
public final class ErrorView extends FrameLayout {
    private HashMap _$_findViewCache;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/errors/ErrorView$Error;", "", "(Ljava/lang/String;I)V", "GENERIC", "NO_NETWORK", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.errors.ErrorView$Error */
    /* compiled from: ErrorView.kt */
    public enum Error {
        GENERIC,
        NO_NETWORK
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.errors.ErrorView$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Error.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Error.GENERIC.ordinal()] = 1;
            $EnumSwitchMapping$0[Error.NO_NETWORK.ordinal()] = 2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context) {
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

    public final C5368e<Void> retryClick() {
        C5368e<Void> a = C10695a.m36221a((TextView) _$_findCachedViewById(C1033R.C1035id.retry));
        C10202j.m34174a((Object) a, "RxView.clicks(retry)");
        return a;
    }

    public final void setError(Error error) {
        C10202j.m34178b(error, "error");
        int i = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
        if (i == 1) {
            ((ImageView) _$_findCachedViewById(C1033R.C1035id.error_image)).setImageResource(C1033R.C1034drawable.generic_error);
            ((TextView) _$_findCachedViewById(C1033R.C1035id.error_text)).setText(C1033R.string.error503);
        } else if (i == 2) {
            ((ImageView) _$_findCachedViewById(C1033R.C1035id.error_image)).setImageResource(C1033R.C1034drawable.no_connection_error);
            ((TextView) _$_findCachedViewById(C1033R.C1035id.error_text)).setText(C1033R.string.could_not_connect_internet);
        }
    }

    public final void setRetryAction(C9102a<C10483v> aVar) {
        C10202j.m34178b(aVar, "action");
        ((TextView) _$_findCachedViewById(C1033R.C1035id.retry)).setOnClickListener(new ErrorView$setRetryAction$1(aVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C10202j.m34178b(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10202j.m34178b(context, "context");
        FrameLayout.inflate(context, C1033R.layout.error_view, this);
        setError(Error.GENERIC);
    }
}
