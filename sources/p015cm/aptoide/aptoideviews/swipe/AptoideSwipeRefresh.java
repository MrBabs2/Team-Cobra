package p015cm.aptoide.aptoideviews.swipe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;
import p050l.p106r.p107a.C5189c;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¨\u0006\u0010"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/swipe/AptoideSwipeRefresh;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "retrievePreferences", "", "defStyleAttr", "", "setColors", "progressPrimaryColor", "progressSecondaryColor", "progressBackgroundColor", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.swipe.AptoideSwipeRefresh */
/* compiled from: AptoideSwipeRefresh.kt */
public final class AptoideSwipeRefresh extends C5189c {
    private HashMap _$_findViewCache;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AptoideSwipeRefresh(Context context) {
        this(context, (AttributeSet) null);
        C10202j.m34178b(context, "context");
    }

    private final void retrievePreferences(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1033R.styleable.AptoideSwipeRefresh, i, 0);
        setColors(obtainStyledAttributes.getColor(C1033R.styleable.AptoideSwipeRefresh_progressPrimaryColor, getResources().getColor(C1033R.color.default_progress_bar_color)), obtainStyledAttributes.getColor(C1033R.styleable.AptoideSwipeRefresh_progressSecondaryColor, -1), obtainStyledAttributes.getColor(C1033R.styleable.AptoideSwipeRefresh_progressBackgroundColor, -1));
        obtainStyledAttributes.recycle();
    }

    private final void setColors(int i, int i2, int i3) {
        if (i2 != -1) {
            setColorSchemeColors(i, i2, i, i2);
        } else {
            setColorSchemeColors(i);
        }
        setProgressBackgroundColorSchemeColor(i3);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AptoideSwipeRefresh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C10202j.m34178b(context, "context");
        retrievePreferences(attributeSet, 0);
    }
}
