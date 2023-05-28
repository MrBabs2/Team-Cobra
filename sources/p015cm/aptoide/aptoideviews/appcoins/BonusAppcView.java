package p015cm.aptoide.aptoideviews.appcoins;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import java.util.HashMap;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\tH\u0003J\u001a\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\fH\u0002¨\u0006\u001c"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/appcoins/BonusAppcView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "applyPreferences", "", "preferences", "Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Preferences;", "dpToPx", "", "dp", "retrievePreferences", "setPercentage", "percentage", "setSide", "side", "Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Side;", "setupViews", "Preferences", "Side", "Size", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.appcoins.BonusAppcView */
/* compiled from: BonusAppcView.kt */
public final class BonusAppcView extends FrameLayout {
    private HashMap _$_findViewCache;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Preferences;", "", "enableCardPadding", "", "side", "Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Side;", "size", "Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Size;", "(ZLcm/aptoide/aptoideviews/appcoins/BonusAppcView$Side;Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Size;)V", "getEnableCardPadding", "()Z", "getSide", "()Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Side;", "getSize", "()Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Size;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.appcoins.BonusAppcView$Preferences */
    /* compiled from: BonusAppcView.kt */
    public static final class Preferences {
        private final boolean enableCardPadding;
        private final Side side;
        private final Size size;

        public Preferences(boolean z, Side side2, Size size2) {
            C10202j.m34178b(side2, "side");
            C10202j.m34178b(size2, "size");
            this.enableCardPadding = z;
            this.side = side2;
            this.size = size2;
        }

        public static /* synthetic */ Preferences copy$default(Preferences preferences, boolean z, Side side2, Size size2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = preferences.enableCardPadding;
            }
            if ((i & 2) != 0) {
                side2 = preferences.side;
            }
            if ((i & 4) != 0) {
                size2 = preferences.size;
            }
            return preferences.copy(z, side2, size2);
        }

        public final boolean component1() {
            return this.enableCardPadding;
        }

        public final Side component2() {
            return this.side;
        }

        public final Size component3() {
            return this.size;
        }

        public final Preferences copy(boolean z, Side side2, Size size2) {
            C10202j.m34178b(side2, "side");
            C10202j.m34178b(size2, "size");
            return new Preferences(z, side2, size2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Preferences)) {
                return false;
            }
            Preferences preferences = (Preferences) obj;
            return this.enableCardPadding == preferences.enableCardPadding && C10202j.m34176a((Object) this.side, (Object) preferences.side) && C10202j.m34176a((Object) this.size, (Object) preferences.size);
        }

        public final boolean getEnableCardPadding() {
            return this.enableCardPadding;
        }

        public final Side getSide() {
            return this.side;
        }

        public final Size getSize() {
            return this.size;
        }

        public int hashCode() {
            boolean z = this.enableCardPadding;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            Side side2 = this.side;
            int i2 = 0;
            int hashCode = (i + (side2 != null ? side2.hashCode() : 0)) * 31;
            Size size2 = this.size;
            if (size2 != null) {
                i2 = size2.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "Preferences(enableCardPadding=" + this.enableCardPadding + ", side=" + this.side + ", size=" + this.size + ")";
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Side;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.appcoins.BonusAppcView$Side */
    /* compiled from: BonusAppcView.kt */
    public enum Side {
        LEFT,
        RIGHT
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/appcoins/BonusAppcView$Size;", "", "(Ljava/lang/String;I)V", "REGULAR", "COMPACT", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.appcoins.BonusAppcView$Size */
    /* compiled from: BonusAppcView.kt */
    public enum Size {
        REGULAR,
        COMPACT
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.appcoins.BonusAppcView$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Side.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Side.LEFT.ordinal()] = 1;
            $EnumSwitchMapping$0[Side.RIGHT.ordinal()] = 2;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BonusAppcView(Context context) {
        this(context, (AttributeSet) null);
        C10202j.m34178b(context, "context");
    }

    private final void applyPreferences(Preferences preferences) {
        if (preferences.getSize() == Size.REGULAR) {
            if (!preferences.getEnableCardPadding()) {
                MaterialCardView materialCardView = (MaterialCardView) _$_findCachedViewById(C1033R.C1035id.card_view);
                C10202j.m34174a((Object) materialCardView, "card_view");
                ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
                layoutParams.width = (int) dpToPx(66);
                layoutParams.height = (int) dpToPx(72);
                MaterialCardView materialCardView2 = (MaterialCardView) _$_findCachedViewById(C1033R.C1035id.card_view);
                C10202j.m34174a((Object) materialCardView2, "card_view");
                materialCardView2.setLayoutParams(layoutParams);
            }
        } else if (preferences.getSize() == Size.COMPACT) {
            MaterialCardView materialCardView3 = (MaterialCardView) _$_findCachedViewById(C1033R.C1035id.card_view);
            C10202j.m34174a((Object) materialCardView3, "card_view");
            ViewGroup.LayoutParams layoutParams2 = materialCardView3.getLayoutParams();
            layoutParams2.width = (int) dpToPx(62);
            layoutParams2.height = (int) dpToPx(56);
            MaterialCardView materialCardView4 = (MaterialCardView) _$_findCachedViewById(C1033R.C1035id.card_view);
            C10202j.m34174a((Object) materialCardView4, "card_view");
            materialCardView4.setLayoutParams(layoutParams2);
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C1033R.C1035id.root_layout);
            C10202j.m34174a((Object) constraintLayout, "root_layout");
            ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
            layoutParams3.width = (int) dpToPx(62);
            layoutParams3.height = (int) dpToPx(56);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(C1033R.C1035id.root_layout);
            C10202j.m34174a((Object) constraintLayout2, "root_layout");
            constraintLayout2.setLayoutParams(layoutParams3);
            TextView textView = (TextView) _$_findCachedViewById(C1033R.C1035id.up_to_textview);
            C10202j.m34174a((Object) textView, "up_to_textview");
            textView.setTranslationY(dpToPx(2));
            TextView textView2 = (TextView) _$_findCachedViewById(C1033R.C1035id.bonus_textview);
            C10202j.m34174a((Object) textView2, "bonus_textview");
            textView2.setTranslationY(dpToPx(-2));
        }
        setSide(preferences.getSide());
    }

    private final float dpToPx(int i) {
        Resources resources = getResources();
        C10202j.m34174a((Object) resources, "resources");
        return TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }

    private final Preferences retrievePreferences(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1033R.styleable.BonusAppcView, i, 0);
        Preferences preferences = new Preferences(obtainStyledAttributes.getBoolean(C1033R.styleable.BonusAppcView_enable_card_padding, true), Side.values()[obtainStyledAttributes.getInt(C1033R.styleable.BonusAppcView_side, 0)], Size.values()[obtainStyledAttributes.getInt(C1033R.styleable.BonusAppcView_size, 0)]);
        obtainStyledAttributes.recycle();
        return preferences;
    }

    private final void setupViews() {
        TextView textView = (TextView) _$_findCachedViewById(C1033R.C1035id.up_to_textview);
        C10202j.m34174a((Object) textView, "up_to_textview");
        String obj = getContext().getText(C1033R.string.incentives_badge_up_to).toString();
        if (obj != null) {
            String lowerCase = obj.toLowerCase();
            C10202j.m34174a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            textView.setText(lowerCase);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
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

    public final void setPercentage(int i) {
        TextView textView = (TextView) _$_findCachedViewById(C1033R.C1035id.percentage_number_textview);
        C10202j.m34174a((Object) textView, "percentage_number_textview");
        textView.setText(String.valueOf(i));
    }

    public final void setSide(Side side) {
        C10202j.m34178b(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$0[side.ordinal()];
        if (i == 1) {
            ((ConstraintLayout) _$_findCachedViewById(C1033R.C1035id.root_layout)).setBackgroundResource(C1033R.C1034drawable.appc_gradient_right_rounded);
        } else if (i == 2) {
            ((ConstraintLayout) _$_findCachedViewById(C1033R.C1035id.root_layout)).setBackgroundResource(C1033R.C1034drawable.appc_gradient_left_rounded);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BonusAppcView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C10202j.m34178b(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonusAppcView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        C10202j.m34178b(context, "context");
        Preferences retrievePreferences = retrievePreferences(attributeSet, i);
        if (retrievePreferences.getSide() == Side.RIGHT) {
            i2 = C1033R.style.BonusAppcViewCardStyle_BorderRight;
        } else {
            i2 = C1033R.style.BonusAppcViewCardStyle_BorderLeft;
        }
        FrameLayout.inflate(new ContextThemeWrapper(context, i2), C1033R.layout.bonus_appc_view, this);
        setupViews();
        applyPreferences(retrievePreferences);
        setSaveEnabled(true);
    }
}
