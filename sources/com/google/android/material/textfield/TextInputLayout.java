package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0253h;
import androidx.appcompat.widget.C0286t;
import androidx.appcompat.widget.C0301y;
import androidx.core.content.C0394a;
import androidx.core.graphics.drawable.C0414a;
import androidx.core.widget.C0436i;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.C8549a;
import com.google.android.material.internal.C8552b;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p082j.C4985a;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5054g;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10575c;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.C10582j;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.p283m.C10585a;
import p112n.p277e.p279b.p282b.p288q.C10609a;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10645k;

public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEF_STYLE_RES = C10583k.Widget_Design_TextInputLayout;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private ValueAnimator animator;
    private C10638g boxBackground;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private final int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private C10638g boxUnderline;
    final C8549a collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<C8611f> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final LinkedHashSet<C8612g> endIconChangedListeners;
    private final SparseArray<C8637e> endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    /* access modifiers changed from: private */
    public final CheckableImageButton endIconView;
    private final LinearLayout endLayout;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private final CheckableImageButton errorIconView;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean hasEndIconTintList;
    private boolean hasEndIconTintMode;
    private boolean hasStartIconTintList;
    private boolean hasStartIconTintMode;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final C8638f indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    /* access modifiers changed from: private */
    public boolean placeholderEnabled;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private CharSequence prefixText;
    private final TextView prefixTextView;
    /* access modifiers changed from: private */
    public boolean restoringSavedState;
    private C10645k shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final LinearLayout startLayout;
    private ColorStateList strokeErrorColor;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8605a();

        /* renamed from: h */
        CharSequence f24602h;

        /* renamed from: i */
        boolean f24603i;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        static class C8605a implements Parcelable.ClassLoaderCreator<SavedState> {
            C8605a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.f24602h + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f24602h, parcel, i);
            parcel.writeInt(this.f24603i ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24602h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f24603i = parcel.readInt() != 1 ? false : true;
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    class C8606a implements TextWatcher {
        C8606a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.counterEnabled) {
                textInputLayout2.updateCounter(editable.length());
            }
            if (TextInputLayout.this.placeholderEnabled) {
                TextInputLayout.this.updatePlaceholderText(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class C8607b implements Runnable {
        C8607b() {
        }

        public void run() {
            TextInputLayout.this.endIconView.performClick();
            TextInputLayout.this.endIconView.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class C8608c implements Runnable {
        C8608c() {
        }

        public void run() {
            TextInputLayout.this.editText.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    class C8609d implements ValueAnimator.AnimatorUpdateListener {
        C8609d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.collapsingTextHelper.mo31889b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C8610e extends C5010a {

        /* renamed from: d */
        private final TextInputLayout f24608d;

        public C8610e(TextInputLayout textInputLayout) {
            this.f24608d = textInputLayout;
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            String str;
            String str2;
            super.mo2445a(view, cVar);
            EditText editText = this.f24608d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f24608d.getHint();
            CharSequence helperText = this.f24608d.getHelperText();
            CharSequence error = this.f24608d.getError();
            int counterMaxLength = this.f24608d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f24608d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z2) {
                str = hint.toString();
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if ((z4 || z3) && !TextUtils.isEmpty(str)) {
                str2 = ", ";
            } else {
                str2 = "";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = "";
            }
            sb3.append(helperText);
            String sb4 = sb3.toString();
            if (z) {
                cVar.mo17544h((CharSequence) text);
            } else if (!TextUtils.isEmpty(sb4)) {
                cVar.mo17544h((CharSequence) sb4);
            }
            if (!TextUtils.isEmpty(sb4)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.mo17531d((CharSequence) sb4);
                } else {
                    if (z) {
                        sb4 = text + ", " + sb4;
                    }
                    cVar.mo17544h((CharSequence) sb4);
                }
                cVar.mo17553l(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.mo17517b(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.mo17527c(error);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C8611f {
        /* renamed from: a */
        void mo32216a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C8612g {
        /* renamed from: a */
        void mo32217a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void applyBoxAttributes() {
        C10638g gVar = this.boxBackground;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.shapeAppearanceModel);
            if (canDrawOutlineStroke()) {
                this.boxBackground.mo36235a((float) this.boxStrokeWidthPx, this.boxStrokeColor);
            }
            int calculateBoxBackgroundColor = calculateBoxBackgroundColor();
            this.boxBackgroundColor = calculateBoxBackgroundColor;
            this.boxBackground.mo36240a(ColorStateList.valueOf(calculateBoxBackgroundColor));
            if (this.endIconMode == 3) {
                this.editText.getBackground().invalidateSelf();
            }
            applyBoxUnderlineAttributes();
            invalidate();
        }
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderline != null) {
            if (canDrawStroke()) {
                this.boxUnderline.mo36240a(ColorStateList.valueOf(this.boxStrokeColor));
            }
            invalidate();
        }
    }

    private void applyCutoutPadding(RectF rectF) {
        float f = rectF.left;
        int i = this.boxLabelCutoutPaddingPx;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    private void applyEndIconTint() {
        applyIconTint(this.endIconView, this.hasEndIconTintList, this.endIconTintList, this.hasEndIconTintMode, this.endIconTintMode);
    }

    private void applyIconTint(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0414a.m2029i(drawable).mutate();
            if (z) {
                C0414a.m2014a(drawable, colorStateList);
            }
            if (z2) {
                C0414a.m2017a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void applyStartIconTint() {
        applyIconTint(this.startIconView, this.hasStartIconTintList, this.startIconTintList, this.hasStartIconTintMode, this.startIconTintMode);
    }

    private void assignBoxBackgroundByMode() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.boxBackground = null;
            this.boxUnderline = null;
        } else if (i == 1) {
            this.boxBackground = new C10638g(this.shapeAppearanceModel);
            this.boxUnderline = new C10638g();
        } else if (i == 2) {
            if (!this.hintEnabled || (this.boxBackground instanceof C8624c)) {
                this.boxBackground = new C10638g(this.shapeAppearanceModel);
            } else {
                this.boxBackground = new C8624c(this.shapeAppearanceModel);
            }
            this.boxUnderline = null;
        } else {
            throw new IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    private int calculateBoxBackgroundColor() {
        return this.boxBackgroundMode == 1 ? C10609a.m35922a(C10609a.m35927a((View) this, C10574b.colorSurface, 0), this.boxBackgroundColor) : this.boxBackgroundColor;
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            boolean z = C5071v.m9204p(this) == 1;
            rect2.bottom = rect.bottom;
            int i = this.boxBackgroundMode;
            if (i == 1) {
                rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, z);
                rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
                rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, z);
                return rect2;
            } else {
                rect2.left = rect.left + this.editText.getPaddingLeft();
                rect2.top = rect.top - calculateLabelMarginTop();
                rect2.right = rect.right - this.editText.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f) {
        if (isSingleLineFilledTextField()) {
            return (int) (((float) rect2.top) + f);
        }
        return rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(Rect rect, float f) {
        if (isSingleLineFilledTextField()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return rect.top + this.editText.getCompoundPaddingTop();
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            float h = this.collapsingTextHelper.mo31905h();
            rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
            rect2.top = calculateExpandedLabelTop(rect, h);
            rect2.right = rect.right - this.editText.getCompoundPaddingRight();
            rect2.bottom = calculateExpandedLabelBottom(rect, rect2, h);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int calculateLabelMarginTop() {
        float d;
        if (!this.hintEnabled) {
            return 0;
        }
        int i = this.boxBackgroundMode;
        if (i == 0 || i == 1) {
            d = this.collapsingTextHelper.mo31899d();
        } else if (i != 2) {
            return 0;
        } else {
            d = this.collapsingTextHelper.mo31899d() / 2.0f;
        }
        return (int) d;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((C8624c) this.boxBackground).mo31547v();
        }
    }

    private void collapseHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (!z || !this.hintAnimationEnabled) {
            this.collapsingTextHelper.mo31889b(1.0f);
        } else {
            animateToExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        showPlaceholderText();
        updatePrefixTextVisibility();
        updateSuffixTextVisibility();
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof C8624c);
    }

    private void dispatchOnEditTextAttached() {
        Iterator it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            ((C8611f) it.next()).mo32216a(this);
        }
    }

    private void dispatchOnEndIconChanged(int i) {
        Iterator it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            ((C8612g) it.next()).mo32217a(this, i);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        C10638g gVar = this.boxUnderline;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.boxStrokeWidthPx;
            this.boxUnderline.draw(canvas);
        }
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.mo31882a(canvas);
        }
    }

    private void expandHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (!z || !this.hintAnimationEnabled) {
            this.collapsingTextHelper.mo31889b(0.0f);
        } else {
            animateToExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((C8624c) this.boxBackground).mo31544u()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        updatePrefixTextVisibility();
        updateSuffixTextVisibility();
    }

    private C8637e getEndIconDelegate() {
        C8637e eVar = this.endIconDelegates.get(this.endIconMode);
        return eVar != null ? eVar : this.endIconDelegates.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.errorIconView.getVisibility() == 0) {
            return this.errorIconView;
        }
        if (!hasEndIcon() || !isEndIconVisible()) {
            return null;
        }
        return this.endIconView;
    }

    private int getLabelLeftBoundAlightWithPrefix(int i, boolean z) {
        int compoundPaddingLeft = i + this.editText.getCompoundPaddingLeft();
        return (this.prefixText == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.prefixTextView.getMeasuredWidth()) + this.prefixTextView.getPaddingLeft();
    }

    private int getLabelRightBoundAlignedWithSuffix(int i, boolean z) {
        int compoundPaddingRight = i - this.editText.getCompoundPaddingRight();
        return (this.prefixText == null || !z) ? compoundPaddingRight : compoundPaddingRight + this.prefixTextView.getMeasuredWidth() + this.prefixTextView.getPaddingRight();
    }

    private boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView != null && this.placeholderEnabled) {
            textView.setText((CharSequence) null);
            this.placeholderTextView.setVisibility(4);
        }
    }

    private boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    private boolean isSingleLineFilledTextField() {
        if (this.boxBackgroundMode != 1 || (Build.VERSION.SDK_INT >= 16 && this.editText.getMinLines() > 1)) {
            return false;
        }
        return true;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        setEditTextBoxBackground();
        updateTextInputBoxState();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            RectF rectF = this.tmpRectF;
            this.collapsingTextHelper.mo31884a(rectF, this.editText.getWidth(), this.editText.getGravity());
            applyCutoutPadding(rectF);
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((C8624c) this.boxBackground).mo32230a(rectF);
        }
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z);
            }
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setEditText(EditText editText2) {
        if (this.editText == null) {
            if (this.endIconMode != 3 && !(editText2 instanceof TextInputEditText)) {
                Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.editText = editText2;
            onApplyBoxBackgroundMode();
            setTextInputAccessibilityDelegate(new C8610e(this));
            this.collapsingTextHelper.mo31898c(this.editText.getTypeface());
            this.collapsingTextHelper.mo31877a(this.editText.getTextSize());
            int gravity = this.editText.getGravity();
            this.collapsingTextHelper.mo31890b((gravity & -113) | 48);
            this.collapsingTextHelper.mo31900d(gravity);
            this.editText.addTextChangedListener(new C8606a());
            if (this.defaultHintTextColor == null) {
                this.defaultHintTextColor = this.editText.getHintTextColors();
            }
            if (this.hintEnabled) {
                if (TextUtils.isEmpty(this.hint)) {
                    CharSequence hint2 = this.editText.getHint();
                    this.originalHint = hint2;
                    setHint(hint2);
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.counterView != null) {
                updateCounter(this.editText.getText().length());
            }
            updateEditTextBackground();
            this.indicatorViewController.mo32243a();
            this.startLayout.bringToFront();
            this.endLayout.bringToFront();
            this.endIconFrame.bringToFront();
            this.errorIconView.bringToFront();
            dispatchOnEditTextAttached();
            updatePrefixTextViewPadding();
            updateSuffixTextViewPadding();
            if (!isEnabled()) {
                editText2.setEnabled(false);
            }
            updateLabelState(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setEditTextBoxBackground() {
        if (shouldUseEditTextBackgroundForBoxBackground()) {
            C5071v.m9161a((View) this.editText, (Drawable) this.boxBackground);
        }
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.errorIconView.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.endIconFrame;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        updateSuffixTextViewPadding();
        if (!hasEndIcon()) {
            updateDummyDrawables();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.hint)) {
            this.hint = charSequence;
            this.collapsingTextHelper.mo31886a(charSequence);
            if (!this.hintExpanded) {
                openCutout();
            }
        }
    }

    private static void setIconClickable(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z = C5071v.m9214z(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        boolean z3 = onLongClickListener != null;
        if (z || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(z);
        checkableImageButton.setPressable(z);
        checkableImageButton.setLongClickable(z3);
        if (!z2) {
            i = 2;
        }
        C5071v.m9195h(checkableImageButton, i);
    }

    private static void setIconOnClickListener(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private static void setIconOnLongClickListener(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.placeholderEnabled != z) {
            if (z) {
                C0286t tVar = new C0286t(getContext());
                this.placeholderTextView = tVar;
                tVar.setId(C10578f.textinput_placeholder);
                C5071v.m9193g(this.placeholderTextView, 1);
                setPlaceholderTextAppearance(this.placeholderTextAppearance);
                setPlaceholderTextColor(this.placeholderTextColor);
                addPlaceholderTextView();
            } else {
                removePlaceholderTextView();
                this.placeholderTextView = null;
            }
            this.placeholderEnabled = z;
        }
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.errorIconView.getVisibility() == 0 || ((hasEndIcon() && isEndIconVisible()) || this.suffixText != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return !(getStartIconDrawable() == null && this.prefixText == null) && this.startLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUseEditTextBackgroundForBoxBackground() {
        EditText editText2 = this.editText;
        return (editText2 == null || this.boxBackground == null || editText2.getBackground() != null || this.boxBackgroundMode == 0) ? false : true;
    }

    private void showPlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView != null && this.placeholderEnabled) {
            textView.setText(this.placeholderText);
            this.placeholderTextView.setVisibility(0);
            this.placeholderTextView.bringToFront();
        }
    }

    private void tintEndIconOnError(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            applyEndIconTint();
            return;
        }
        Drawable mutate = C0414a.m2029i(getEndIconDrawable()).mutate();
        C0414a.m2022b(mutate, this.indicatorViewController.mo32261f());
        this.endIconView.setImageDrawable(mutate);
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        C10638g gVar = this.boxUnderline;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.boxStrokeWidthFocusedPx, rect.right, i);
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText2 = this.editText;
            updateCounter(editText2 == null ? 0 : editText2.getText().length());
        }
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C10582j.character_counter_overflowed_content_description : C10582j.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (this.counterOverflowed && (colorStateList = this.counterOverflowTextColor) != null) {
                this.counterView.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean updateDummyDrawables() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.editText
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.shouldUpdateStartDummyDrawable()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.startLayout
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.editText
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.startDummyDrawable
            if (r6 == 0) goto L_0x0025
            int r6 = r10.startDummyDrawableWidth
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.startDummyDrawable = r6
            r10.startDummyDrawableWidth = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.editText
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0436i.m2152a((android.widget.TextView) r0)
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.startDummyDrawable
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.editText
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0436i.m2149a(r6, r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.startDummyDrawable
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.editText
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0436i.m2152a((android.widget.TextView) r0)
            android.widget.EditText r6 = r10.editText
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            androidx.core.widget.C0436i.m2149a(r6, r2, r7, r8, r0)
            r10.startDummyDrawable = r2
        L_0x0060:
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            boolean r6 = r10.shouldUpdateEndDummyDrawable()
            if (r6 == 0) goto L_0x00d5
            android.widget.TextView r2 = r10.suffixTextView
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.editText
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r2 = r2 + r7
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            int r6 = p050l.p075h.p084l.C5054g.m9091b(r6)
            int r2 = r2 + r6
        L_0x008c:
            android.widget.EditText r6 = r10.editText
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0436i.m2152a((android.widget.TextView) r6)
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.endDummyDrawableWidth
            if (r8 == r2) goto L_0x00ad
            r10.endDummyDrawableWidth = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.endDummyDrawable
            r3 = r6[r3]
            androidx.core.widget.C0436i.m2149a(r0, r1, r2, r4, r3)
            goto L_0x00f6
        L_0x00ad:
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r7 != 0) goto L_0x00bd
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.endDummyDrawable = r7
            r10.endDummyDrawableWidth = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bd:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r2 == r7) goto L_0x00d3
            r0 = r6[r4]
            r10.originalEditTextEndDrawable = r0
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            androidx.core.widget.C0436i.m2149a(r0, r1, r2, r7, r3)
            goto L_0x00f6
        L_0x00d3:
            r5 = r0
            goto L_0x00f6
        L_0x00d5:
            android.graphics.drawable.Drawable r6 = r10.endDummyDrawable
            if (r6 == 0) goto L_0x00f7
            android.widget.EditText r6 = r10.editText
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0436i.m2152a((android.widget.TextView) r6)
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r4 != r7) goto L_0x00f3
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.originalEditTextEndDrawable
            r3 = r6[r3]
            androidx.core.widget.C0436i.m2149a(r0, r1, r4, r7, r3)
            goto L_0x00f4
        L_0x00f3:
            r5 = r0
        L_0x00f4:
            r10.endDummyDrawable = r2
        L_0x00f6:
            r0 = r5
        L_0x00f7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.updateDummyDrawables():boolean");
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int max;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (max = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(max);
        return true;
    }

    private void updateIconColorOnState(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = C0414a.m2029i(drawable).mutate();
            C0414a.m2014a(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int calculateLabelMarginTop = calculateLabelMarginTop();
            if (calculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = calculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText2;
        if (this.placeholderTextView != null && (editText2 = this.editText) != null) {
            this.placeholderTextView.setGravity(editText2.getGravity());
            this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
        }
    }

    private void updatePlaceholderText() {
        EditText editText2 = this.editText;
        updatePlaceholderText(editText2 == null ? 0 : editText2.getText().length());
    }

    private void updatePrefixTextViewPadding() {
        if (this.editText != null) {
            this.prefixTextView.setPadding(isStartIconVisible() ? 0 : this.editText.getPaddingLeft(), this.editText.getCompoundPaddingTop(), this.prefixTextView.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
        }
    }

    private void updatePrefixTextVisibility() {
        this.prefixTextView.setVisibility((this.prefixText == null || isHintExpanded()) ? 8 : 0);
        updateDummyDrawables();
    }

    private void updateStrokeErrorColor(boolean z, boolean z2) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.boxStrokeColor = colorForState2;
        } else if (z2) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    private void updateSuffixTextViewPadding() {
        if (this.editText != null) {
            TextView textView = this.suffixTextView;
            textView.setPadding(textView.getPaddingLeft(), this.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : this.editText.getPaddingRight(), this.editText.getPaddingBottom());
        }
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i = 0;
        boolean z = this.suffixText != null && !isHintExpanded();
        TextView textView = this.suffixTextView;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.suffixTextView.getVisibility()) {
            getEndIconDelegate().mo32219a(z);
        }
        updateDummyDrawables();
    }

    public void addOnEditTextAttachedListener(C8611f fVar) {
        this.editTextAttachedListeners.add(fVar);
        if (this.editText != null) {
            fVar.mo32216a(this);
        }
    }

    public void addOnEndIconChangedListener(C8612g gVar) {
        this.endIconChangedListeners.add(gVar);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.inputFrame.addView(view, layoutParams2);
            this.inputFrame.setLayoutParams(layoutParams);
            updateInputLayoutMargins();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void animateToExpansionFraction(float f) {
        if (this.collapsingTextHelper.mo31907j() != f) {
            if (this.animator == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.animator = valueAnimator;
                valueAnimator.setInterpolator(C10585a.f28457b);
                this.animator.setDuration(167);
                this.animator.addUpdateListener(new C8609d());
            }
            this.animator.setFloatValues(new float[]{this.collapsingTextHelper.mo31907j(), f});
            this.animator.start();
        }
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    /* access modifiers changed from: package-private */
    public boolean cutoutIsOpen() {
        return cutoutEnabled() && ((C8624c) this.boxBackground).mo31544u();
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText2;
        if (this.originalHint == null || (editText2 = this.editText) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.isProvidingHint;
        this.isProvidingHint = false;
        CharSequence hint2 = editText2.getHint();
        this.editText.setHint(this.originalHint);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.editText.setHint(hint2);
            this.isProvidingHint = z;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.inDrawableStateChanged) {
            boolean z = true;
            this.inDrawableStateChanged = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C8549a aVar = this.collapsingTextHelper;
            boolean a = aVar != null ? aVar.mo31887a(drawableState) | false : false;
            if (this.editText != null) {
                if (!C5071v.m9140E(this) || !isEnabled()) {
                    z = false;
                }
                updateLabelState(z);
            }
            updateEditTextBackground();
            updateTextInputBoxState();
            if (a) {
                invalidate();
            }
            this.inDrawableStateChanged = false;
        }
    }

    public int getBaseline() {
        EditText editText2 = this.editText;
        if (editText2 != null) {
            return editText2.getBaseline() + getPaddingTop() + calculateLabelMarginTop();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C10638g getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.boxBackground.mo36244b();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.boxBackground.mo36248c();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.boxBackground.mo36268o();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.boxBackground.mo36267n();
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.counterEnabled || !this.counterOverflowed || (textView = this.counterView) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public CharSequence getError() {
        if (this.indicatorViewController.mo32268m()) {
            return this.indicatorViewController.mo32260e();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.mo32259d();
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.mo32261f();
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.indicatorViewController.mo32261f();
    }

    public CharSequence getHelperText() {
        if (this.indicatorViewController.mo32269n()) {
            return this.indicatorViewController.mo32263h();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.mo32264i();
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.mo31899d();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.mo31903f();
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.mo31844a();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.mo32268m();
    }

    /* access modifiers changed from: package-private */
    public final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.mo32265j();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.mo32269n();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    /* access modifiers changed from: package-private */
    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.mo31844a();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText2 = this.editText;
        if (editText2 != null) {
            Rect rect = this.tmpRect;
            C8552b.m27952a((ViewGroup) this, (View) editText2, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.mo31877a(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.mo31890b((gravity & -113) | 48);
                this.collapsingTextHelper.mo31900d(gravity);
                this.collapsingTextHelper.mo31883a(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.mo31894b(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.mo31912o();
                if (cutoutEnabled() && !this.hintExpanded) {
                    openCutout();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean updateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean updateDummyDrawables = updateDummyDrawables();
        if (updateEditTextHeightBasedOnIcon || updateDummyDrawables) {
            this.editText.post(new C8608c());
        }
        updatePlaceholderMeasurementsBasedOnEditText();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2480a());
        setError(savedState.f24602h);
        if (savedState.f24603i) {
            this.endIconView.post(new C8607b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.indicatorViewController.mo32258c()) {
            savedState.f24602h = getError();
        }
        savedState.f24603i = hasEndIcon() && this.endIconView.isChecked();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void removeOnEditTextAttachedListener(C8611f fVar) {
        this.editTextAttachedListeners.remove(fVar);
    }

    public void removeOnEndIconChangedListener(C8612g gVar) {
        this.endIconChangedListeners.remove(gVar);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            this.focusedFilledBackgroundColor = i;
            this.hoveredFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0394a.m1909a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.boxBackgroundMode) {
            this.boxBackgroundMode = i;
            if (this.editText != null) {
                onApplyBoxBackgroundMode();
            }
        }
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        C10638g gVar = this.boxBackground;
        if (gVar == null || gVar.mo36267n() != f || this.boxBackground.mo36268o() != f2 || this.boxBackground.mo36248c() != f4 || this.boxBackground.mo36244b() != f3) {
            C10645k.C10647b m = this.shapeAppearanceModel.mo36297m();
            m.mo36311d(f);
            m.mo36315e(f2);
            m.mo36307c(f4);
            m.mo36303b(f3);
            this.shapeAppearanceModel = m.mo36302a();
            applyBoxAttributes();
        }
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.boxStrokeWidthDefaultPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.boxStrokeWidthFocusedPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.counterEnabled != z) {
            if (z) {
                C0286t tVar = new C0286t(getContext());
                this.counterView = tVar;
                tVar.setId(C10578f.textinput_counter);
                Typeface typeface2 = this.typeface;
                if (typeface2 != null) {
                    this.counterView.setTypeface(typeface2);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.mo32246a(this.counterView, 2);
                C5054g.m9090a((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(C10576d.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.mo32253b(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C4800a.m7936c(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.endIconMode;
        this.endIconMode = i;
        dispatchOnEndIconChanged(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo32231a(this.boxBackgroundMode)) {
            getEndIconDelegate().mo32218a();
            applyEndIconTint();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.boxBackgroundMode + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            this.hasEndIconTintList = true;
            applyEndIconTint();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            this.hasEndIconTintMode = true;
            applyEndIconTint();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (isEndIconVisible() != z) {
            this.endIconView.setVisibility(z ? 0 : 8);
            updateSuffixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.indicatorViewController.mo32268m()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.mo32254b(charSequence);
        } else {
            this.indicatorViewController.mo32266k();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.indicatorViewController.mo32247a(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.indicatorViewController.mo32248a(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C4800a.m7936c(getContext(), i) : null);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.errorIconTintList = colorStateList;
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = C0414a.m2029i(drawable).mutate();
            C0414a.m2014a(drawable, colorStateList);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = C0414a.m2029i(drawable).mutate();
            C0414a.m2017a(drawable, mode);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.indicatorViewController.mo32251b(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.mo32244a(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.mo32257c(charSequence);
        } else if (isHelperTextEnabled()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.mo32252b(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.indicatorViewController.mo32255b(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.indicatorViewController.mo32256c(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.C0638l.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (!z) {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint2 = this.editText.getHint();
                if (!TextUtils.isEmpty(hint2)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint2);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.collapsingTextHelper.mo31878a(i);
        this.focusedTextColor = this.collapsingTextHelper.mo31888b();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.mo31881a(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C4800a.m7936c(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        this.hasEndIconTintList = true;
        applyEndIconTint();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        this.hasEndIconTintMode = true;
        applyEndIconTint();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.placeholderEnabled || !TextUtils.isEmpty(charSequence)) {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.placeholderTextAppearance = i;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            C0436i.m2158d(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updatePrefixTextVisibility();
    }

    public void setPrefixTextAppearance(int i) {
        C0436i.m2158d(this.prefixTextView, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C4800a.m7936c(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            this.hasStartIconTintList = true;
            applyStartIconTint();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            this.hasStartIconTintMode = true;
            applyStartIconTint();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (isStartIconVisible() != z) {
            this.startIconView.setVisibility(z ? 0 : 8);
            updatePrefixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(int i) {
        C0436i.m2158d(this.suffixTextView, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    /* access modifiers changed from: package-private */
    public void setTextAppearanceCompatWithErrorFallback(TextView textView, int i) {
        boolean z = true;
        try {
            C0436i.m2158d(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0436i.m2158d(textView, C10583k.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C0394a.m1909a(getContext(), C10575c.design_error));
        }
    }

    public void setTextInputAccessibilityDelegate(C8610e eVar) {
        EditText editText2 = this.editText;
        if (editText2 != null) {
            C5071v.m9165a((View) editText2, (C5010a) eVar);
        }
    }

    public void setTypeface(Typeface typeface2) {
        if (typeface2 != this.typeface) {
            this.typeface = typeface2;
            this.collapsingTextHelper.mo31898c(typeface2);
            this.indicatorViewController.mo32245a(typeface2);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText2 = this.editText;
        if (editText2 != null && this.boxBackgroundMode == 0 && (background = editText2.getBackground()) != null) {
            if (C0301y.m1450a(background)) {
                background = background.mutate();
            }
            if (this.indicatorViewController.mo32258c()) {
                background.setColorFilter(C0253h.m1182a(this.indicatorViewController.mo32261f(), PorterDuff.Mode.SRC_IN));
            } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
                C0414a.m2021b(background);
                this.editText.refreshDrawableState();
            } else {
                background.setColorFilter(C0253h.m1182a(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.editText;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateTextInputBoxState() {
        /*
            r6 = this;
            n.e.b.b.z.g r0 = r6.boxBackground
            if (r0 == 0) goto L_0x00fa
            int r0 = r6.boxBackgroundMode
            if (r0 != 0) goto L_0x000a
            goto L_0x00fa
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.editText
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.editText
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.disabledColor
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x003f:
            com.google.android.material.textfield.f r4 = r6.indicatorViewController
            boolean r4 = r4.mo32258c()
            if (r4 == 0) goto L_0x0058
            android.content.res.ColorStateList r4 = r6.strokeErrorColor
            if (r4 == 0) goto L_0x004f
            r6.updateStrokeErrorColor(r0, r3)
            goto L_0x0081
        L_0x004f:
            com.google.android.material.textfield.f r4 = r6.indicatorViewController
            int r4 = r4.mo32261f()
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x0058:
            boolean r4 = r6.counterOverflowed
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r6.counterView
            if (r4 == 0) goto L_0x006f
            android.content.res.ColorStateList r5 = r6.strokeErrorColor
            if (r5 == 0) goto L_0x0068
            r6.updateStrokeErrorColor(r0, r3)
            goto L_0x0081
        L_0x0068:
            int r4 = r4.getCurrentTextColor()
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x006f:
            if (r0 == 0) goto L_0x0076
            int r4 = r6.focusedStrokeColor
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x0076:
            if (r3 == 0) goto L_0x007d
            int r4 = r6.hoveredStrokeColor
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x007d:
            int r4 = r6.defaultStrokeColor
            r6.boxStrokeColor = r4
        L_0x0081:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.f r4 = r6.indicatorViewController
            boolean r4 = r4.mo32268m()
            if (r4 == 0) goto L_0x0098
            com.google.android.material.textfield.f r4 = r6.indicatorViewController
            boolean r4 = r4.mo32258c()
            if (r4 == 0) goto L_0x0098
            r1 = 1
        L_0x0098:
            r6.setErrorIconVisible(r1)
            com.google.android.material.internal.CheckableImageButton r1 = r6.errorIconView
            android.content.res.ColorStateList r4 = r6.errorIconTintList
            r6.updateIconColorOnState(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.startIconView
            android.content.res.ColorStateList r4 = r6.startIconTintList
            r6.updateIconColorOnState(r1, r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.endIconView
            android.content.res.ColorStateList r4 = r6.endIconTintList
            r6.updateIconColorOnState(r1, r4)
            com.google.android.material.textfield.e r1 = r6.getEndIconDelegate()
            boolean r1 = r1.mo32232b()
            if (r1 == 0) goto L_0x00c3
            com.google.android.material.textfield.f r1 = r6.indicatorViewController
            boolean r1 = r1.mo32258c()
            r6.tintEndIconOnError(r1)
        L_0x00c3:
            if (r0 == 0) goto L_0x00d0
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00d0
            int r1 = r6.boxStrokeWidthFocusedPx
            r6.boxStrokeWidthPx = r1
            goto L_0x00d4
        L_0x00d0:
            int r1 = r6.boxStrokeWidthDefaultPx
            r6.boxStrokeWidthPx = r1
        L_0x00d4:
            int r1 = r6.boxBackgroundMode
            if (r1 != r2) goto L_0x00f7
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00e3
            int r0 = r6.disabledFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto L_0x00f7
        L_0x00e3:
            if (r3 == 0) goto L_0x00ec
            if (r0 != 0) goto L_0x00ec
            int r0 = r6.hoveredFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto L_0x00f7
        L_0x00ec:
            if (r0 == 0) goto L_0x00f3
            int r0 = r6.focusedFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto L_0x00f7
        L_0x00f3:
            int r0 = r6.defaultFilledBackgroundColor
            r6.boxBackgroundColor = r0
        L_0x00f7:
            r6.applyBoxAttributes()
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.updateTextInputBoxState():void");
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.textInputStyle);
    }

    private void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText2 = this.editText;
        boolean z3 = editText2 != null && !TextUtils.isEmpty(editText2.getText());
        EditText editText3 = this.editText;
        boolean z4 = editText3 != null && editText3.hasFocus();
        boolean c = this.indicatorViewController.mo32258c();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.mo31881a(colorStateList2);
            this.collapsingTextHelper.mo31893b(this.defaultHintTextColor);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor;
            this.collapsingTextHelper.mo31881a(ColorStateList.valueOf(colorForState));
            this.collapsingTextHelper.mo31893b(ColorStateList.valueOf(colorForState));
        } else if (c) {
            this.collapsingTextHelper.mo31881a(this.indicatorViewController.mo32262g());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.mo31881a(textView.getTextColors());
        } else if (z4 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.mo31881a(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || c))) {
            if (z2 || this.hintExpanded) {
                collapseHint(z);
            }
        } else if (z2 || !this.hintExpanded) {
            expandHint(z);
        }
    }

    /* access modifiers changed from: private */
    public void updatePlaceholderText(int i) {
        if (i != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.indicatorViewController.mo32268m());
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            applyStartIconTint();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            int r1 = DEF_STYLE_RES
            r2 = r21
            android.content.Context r1 = com.google.android.material.theme.p190a.C8648a.m28241b(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            com.google.android.material.textfield.f r1 = new com.google.android.material.textfield.f
            r1.<init>(r0)
            r0.indicatorViewController = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpRect = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpBoundsRect = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.tmpRectF = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.editTextAttachedListeners = r1
            r9 = 0
            r0.endIconMode = r9
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.endIconDelegates = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.endIconChangedListeners = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.collapsingTextHelper = r1
            android.content.Context r10 = r20.getContext()
            r11 = 1
            r0.setOrientation(r11)
            r0.setWillNotDraw(r9)
            r0.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.inputFrame = r1
            r1.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = r0.inputFrame
            r0.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            r0.startLayout = r1
            r1.setOrientation(r9)
            android.widget.LinearLayout r1 = r0.startLayout
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r12 = -2
            r13 = -1
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r2.<init>(r12, r13, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.inputFrame
            android.widget.LinearLayout r2 = r0.startLayout
            r1.addView(r2)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            r0.endLayout = r1
            r1.setOrientation(r9)
            android.widget.LinearLayout r1 = r0.endLayout
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388613(0x800005, float:1.175495E-38)
            r2.<init>(r12, r13, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.inputFrame
            android.widget.LinearLayout r2 = r0.endLayout
            r1.addView(r2)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.endIconFrame = r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r12, r13)
            r1.setLayoutParams(r2)
            com.google.android.material.internal.a r1 = r0.collapsingTextHelper
            android.animation.TimeInterpolator r2 = p112n.p277e.p279b.p282b.p283m.C10585a.f28456a
            r1.mo31892b((android.animation.TimeInterpolator) r2)
            com.google.android.material.internal.a r1 = r0.collapsingTextHelper
            android.animation.TimeInterpolator r2 = p112n.p277e.p279b.p282b.p283m.C10585a.f28456a
            r1.mo31880a((android.animation.TimeInterpolator) r2)
            com.google.android.material.internal.a r1 = r0.collapsingTextHelper
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo31890b((int) r2)
            int[] r3 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout
            int r5 = DEF_STYLE_RES
            r1 = 5
            int[] r6 = new int[r1]
            int r1 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_counterTextAppearance
            r6[r9] = r1
            int r1 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_counterOverflowTextAppearance
            r6[r11] = r1
            int r1 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorTextAppearance
            r14 = 2
            r6[r14] = r1
            int r1 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_helperTextTextAppearance
            r15 = 3
            r6[r15] = r1
            int r1 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_hintTextAppearance
            r2 = 4
            r6[r2] = r1
            r1 = r10
            r2 = r22
            r4 = r23
            androidx.appcompat.widget.q0 r1 = com.google.android.material.internal.C8566j.m27998d(r1, r2, r3, r4, r5, r6)
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_hintEnabled
            boolean r2 = r1.mo1716a((int) r2, (boolean) r11)
            r0.hintEnabled = r2
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.mo1726e(r2)
            r0.setHint(r2)
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.mo1716a((int) r2, (boolean) r11)
            r0.hintAnimationEnabled = r2
            int r2 = DEF_STYLE_RES
            n.e.b.b.z.k$b r2 = p112n.p277e.p279b.p282b.p297z.C10645k.m36076a((android.content.Context) r10, (android.util.AttributeSet) r7, (int) r8, (int) r2)
            n.e.b.b.z.k r2 = r2.mo36302a()
            r0.shapeAppearanceModel = r2
            android.content.res.Resources r2 = r10.getResources()
            int r3 = p112n.p277e.p279b.p282b.C10576d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.boxLabelCutoutPaddingPx = r2
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxCollapsedPaddingTop
            int r2 = r1.mo1718b((int) r2, (int) r9)
            r0.boxCollapsedPaddingTopPx = r2
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r10.getResources()
            int r4 = p112n.p277e.p279b.p282b.C10576d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo1721c(r2, r3)
            r0.boxStrokeWidthDefaultPx = r2
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r10.getResources()
            int r4 = p112n.p277e.p279b.p282b.C10576d.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.mo1721c(r2, r3)
            r0.boxStrokeWidthFocusedPx = r2
            int r2 = r0.boxStrokeWidthDefaultPx
            r0.boxStrokeWidthPx = r2
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.mo1711a((int) r2, (float) r3)
            int r4 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.mo1711a((int) r4, (float) r3)
            int r5 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.mo1711a((int) r5, (float) r3)
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.mo1711a((int) r6, (float) r3)
            n.e.b.b.z.k r6 = r0.shapeAppearanceModel
            n.e.b.b.z.k$b r6 = r6.mo36297m()
            r7 = 0
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 < 0) goto L_0x017c
            r6.mo36311d((float) r2)
        L_0x017c:
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0183
            r6.mo36315e((float) r4)
        L_0x0183:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x018a
            r6.mo36307c((float) r5)
        L_0x018a:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0191
            r6.mo36303b((float) r3)
        L_0x0191:
            n.e.b.b.z.k r2 = r6.mo36302a()
            r0.shapeAppearanceModel = r2
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = p112n.p277e.p279b.p282b.p294w.C10620c.m35958a((android.content.Context) r10, (androidx.appcompat.widget.C0278q0) r1, (int) r2)
            if (r2 == 0) goto L_0x01f3
            int r3 = r2.getDefaultColor()
            r0.defaultFilledBackgroundColor = r3
            r0.boxBackgroundColor = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01d1
            int[] r3 = new int[r11]
            r3[r9] = r4
            int r3 = r2.getColorForState(r3, r13)
            r0.disabledFilledBackgroundColor = r3
            int[] r3 = new int[r14]
            r3 = {16842908, 16842910} // fill-array
            int r3 = r2.getColorForState(r3, r13)
            r0.focusedFilledBackgroundColor = r3
            int[] r3 = new int[r14]
            r3 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r3, r13)
            r0.hoveredFilledBackgroundColor = r2
            goto L_0x01fd
        L_0x01d1:
            int r2 = r0.defaultFilledBackgroundColor
            r0.focusedFilledBackgroundColor = r2
            int r2 = p112n.p277e.p279b.p282b.C10575c.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = p050l.p051a.p052k.p053a.C4800a.m7935b(r10, r2)
            int[] r3 = new int[r11]
            r3[r9] = r4
            int r3 = r2.getColorForState(r3, r13)
            r0.disabledFilledBackgroundColor = r3
            int[] r3 = new int[r11]
            r4 = 16843623(0x1010367, float:2.3696E-38)
            r3[r9] = r4
            int r2 = r2.getColorForState(r3, r13)
            r0.hoveredFilledBackgroundColor = r2
            goto L_0x01fd
        L_0x01f3:
            r0.boxBackgroundColor = r9
            r0.defaultFilledBackgroundColor = r9
            r0.disabledFilledBackgroundColor = r9
            r0.focusedFilledBackgroundColor = r9
            r0.hoveredFilledBackgroundColor = r9
        L_0x01fd:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_android_textColorHint
            boolean r2 = r1.mo1730g(r2)
            if (r2 == 0) goto L_0x020f
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r2 = r1.mo1713a(r2)
            r0.focusedTextColor = r2
            r0.defaultHintTextColor = r2
        L_0x020f:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r2 = p112n.p277e.p279b.p282b.p294w.C10620c.m35958a((android.content.Context) r10, (androidx.appcompat.widget.C0278q0) r1, (int) r2)
            int r3 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxStrokeColor
            int r3 = r1.mo1712a((int) r3, (int) r9)
            r0.focusedStrokeColor = r3
            int r3 = p112n.p277e.p279b.p282b.C10575c.mtrl_textinput_default_box_stroke_color
            int r3 = androidx.core.content.C0394a.m1909a((android.content.Context) r10, (int) r3)
            r0.defaultStrokeColor = r3
            int r3 = p112n.p277e.p279b.p282b.C10575c.mtrl_textinput_disabled_color
            int r3 = androidx.core.content.C0394a.m1909a((android.content.Context) r10, (int) r3)
            r0.disabledColor = r3
            int r3 = p112n.p277e.p279b.p282b.C10575c.mtrl_textinput_hovered_box_stroke_color
            int r3 = androidx.core.content.C0394a.m1909a((android.content.Context) r10, (int) r3)
            r0.hoveredStrokeColor = r3
            if (r2 == 0) goto L_0x023a
            r0.setBoxStrokeColorStateList(r2)
        L_0x023a:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxStrokeErrorColor
            boolean r2 = r1.mo1730g(r2)
            if (r2 == 0) goto L_0x024b
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxStrokeErrorColor
            android.content.res.ColorStateList r2 = p112n.p277e.p279b.p282b.p294w.C10620c.m35958a((android.content.Context) r10, (androidx.appcompat.widget.C0278q0) r1, (int) r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x024b:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_hintTextAppearance
            int r2 = r1.mo1729g(r2, r13)
            if (r2 == r13) goto L_0x025c
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_hintTextAppearance
            int r2 = r1.mo1729g(r2, r9)
            r0.setHintTextAppearance(r2)
        L_0x025c:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorTextAppearance
            int r2 = r1.mo1729g(r2, r9)
            int r3 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorContentDescription
            java.lang.CharSequence r3 = r1.mo1726e(r3)
            int r4 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorEnabled
            boolean r4 = r1.mo1716a((int) r4, (boolean) r9)
            android.content.Context r5 = r20.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r6 = p112n.p277e.p279b.p282b.C10580h.design_text_input_end_icon
            android.widget.LinearLayout r7 = r0.endLayout
            android.view.View r5 = r5.inflate(r6, r7, r9)
            com.google.android.material.internal.CheckableImageButton r5 = (com.google.android.material.internal.CheckableImageButton) r5
            r0.errorIconView = r5
            r6 = 8
            r5.setVisibility(r6)
            int r5 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorIconDrawable
            boolean r5 = r1.mo1730g(r5)
            if (r5 == 0) goto L_0x0298
            int r5 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorIconDrawable
            android.graphics.drawable.Drawable r5 = r1.mo1719b(r5)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r5)
        L_0x0298:
            int r5 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorIconTint
            boolean r5 = r1.mo1730g(r5)
            if (r5 == 0) goto L_0x02a9
            int r5 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorIconTint
            android.content.res.ColorStateList r5 = p112n.p277e.p279b.p282b.p294w.C10620c.m35958a((android.content.Context) r10, (androidx.appcompat.widget.C0278q0) r1, (int) r5)
            r0.setErrorIconTintList(r5)
        L_0x02a9:
            int r5 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorIconTintMode
            boolean r5 = r1.mo1730g(r5)
            r7 = 0
            if (r5 == 0) goto L_0x02bf
            int r5 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorIconTintMode
            int r5 = r1.mo1723d(r5, r13)
            android.graphics.PorterDuff$Mode r5 = com.google.android.material.internal.C8567k.m28001a((int) r5, (android.graphics.PorterDuff.Mode) r7)
            r0.setErrorIconTintMode(r5)
        L_0x02bf:
            com.google.android.material.internal.CheckableImageButton r5 = r0.errorIconView
            android.content.res.Resources r8 = r20.getResources()
            int r12 = p112n.p277e.p279b.p282b.C10582j.error_icon_content_description
            java.lang.CharSequence r8 = r8.getText(r12)
            r5.setContentDescription(r8)
            com.google.android.material.internal.CheckableImageButton r5 = r0.errorIconView
            p050l.p075h.p084l.C5071v.m9195h(r5, r14)
            com.google.android.material.internal.CheckableImageButton r5 = r0.errorIconView
            r5.setClickable(r9)
            com.google.android.material.internal.CheckableImageButton r5 = r0.errorIconView
            r5.setPressable(r9)
            com.google.android.material.internal.CheckableImageButton r5 = r0.errorIconView
            r5.setFocusable(r9)
            int r5 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_helperTextTextAppearance
            int r5 = r1.mo1729g(r5, r9)
            int r8 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_helperTextEnabled
            boolean r8 = r1.mo1716a((int) r8, (boolean) r9)
            int r12 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_helperText
            java.lang.CharSequence r12 = r1.mo1726e(r12)
            int r15 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_placeholderTextAppearance
            int r15 = r1.mo1729g(r15, r9)
            int r14 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_placeholderText
            java.lang.CharSequence r14 = r1.mo1726e(r14)
            int r11 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_prefixTextAppearance
            int r11 = r1.mo1729g(r11, r9)
            int r7 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_prefixText
            java.lang.CharSequence r7 = r1.mo1726e(r7)
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_suffixTextAppearance
            int r6 = r1.mo1729g(r6, r9)
            int r13 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_suffixText
            java.lang.CharSequence r13 = r1.mo1726e(r13)
            r16 = r6
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_counterEnabled
            boolean r6 = r1.mo1716a((int) r6, (boolean) r9)
            int r9 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_counterMaxLength
            r17 = r6
            r6 = -1
            int r9 = r1.mo1723d(r9, r6)
            r0.setCounterMaxLength(r9)
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_counterTextAppearance
            r9 = 0
            int r6 = r1.mo1729g(r6, r9)
            r0.counterTextAppearance = r6
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_counterOverflowTextAppearance
            int r6 = r1.mo1729g(r6, r9)
            r0.counterOverflowTextAppearance = r6
            android.content.Context r6 = r20.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r18 = r13
            int r13 = p112n.p277e.p279b.p282b.C10580h.design_text_input_start_icon
            r19 = r11
            android.widget.LinearLayout r11 = r0.startLayout
            android.view.View r6 = r6.inflate(r13, r11, r9)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.startIconView = r6
            r9 = 8
            r6.setVisibility(r9)
            r6 = 0
            r0.setStartIconOnClickListener(r6)
            r0.setStartIconOnLongClickListener(r6)
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_startIconDrawable
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x038d
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_startIconDrawable
            android.graphics.drawable.Drawable r6 = r1.mo1719b(r6)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r6)
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_startIconContentDescription
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x0383
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_startIconContentDescription
            java.lang.CharSequence r6 = r1.mo1726e(r6)
            r0.setStartIconContentDescription((java.lang.CharSequence) r6)
        L_0x0383:
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_startIconCheckable
            r9 = 1
            boolean r6 = r1.mo1716a((int) r6, (boolean) r9)
            r0.setStartIconCheckable(r6)
        L_0x038d:
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_startIconTint
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x039e
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_startIconTint
            android.content.res.ColorStateList r6 = p112n.p277e.p279b.p282b.p294w.C10620c.m35958a((android.content.Context) r10, (androidx.appcompat.widget.C0278q0) r1, (int) r6)
            r0.setStartIconTintList(r6)
        L_0x039e:
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_startIconTintMode
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x03b5
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_startIconTintMode
            r9 = -1
            int r6 = r1.mo1723d(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.C8567k.m28001a((int) r6, (android.graphics.PorterDuff.Mode) r9)
            r0.setStartIconTintMode(r6)
        L_0x03b5:
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_boxBackgroundMode
            r9 = 0
            int r6 = r1.mo1723d(r6, r9)
            r0.setBoxBackgroundMode(r6)
            android.content.Context r6 = r20.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r11 = p112n.p277e.p279b.p282b.C10580h.design_text_input_end_icon
            android.widget.FrameLayout r13 = r0.endIconFrame
            android.view.View r6 = r6.inflate(r11, r13, r9)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.endIconView = r6
            android.widget.FrameLayout r9 = r0.endIconFrame
            r9.addView(r6)
            com.google.android.material.internal.CheckableImageButton r6 = r0.endIconView
            r9 = 8
            r6.setVisibility(r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.endIconDelegates
            com.google.android.material.textfield.b r9 = new com.google.android.material.textfield.b
            r9.<init>(r0)
            r11 = -1
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.endIconDelegates
            com.google.android.material.textfield.h r9 = new com.google.android.material.textfield.h
            r9.<init>(r0)
            r11 = 0
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.endIconDelegates
            com.google.android.material.textfield.i r9 = new com.google.android.material.textfield.i
            r9.<init>(r0)
            r11 = 1
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.endIconDelegates
            com.google.android.material.textfield.a r9 = new com.google.android.material.textfield.a
            r9.<init>(r0)
            r11 = 2
            r6.append(r11, r9)
            android.util.SparseArray<com.google.android.material.textfield.e> r6 = r0.endIconDelegates
            com.google.android.material.textfield.d r9 = new com.google.android.material.textfield.d
            r9.<init>(r0)
            r11 = 3
            r6.append(r11, r9)
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconMode
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x0455
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconMode
            r9 = 0
            int r6 = r1.mo1723d(r6, r9)
            r0.setEndIconMode(r6)
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconDrawable
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x0439
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconDrawable
            android.graphics.drawable.Drawable r6 = r1.mo1719b(r6)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r6)
        L_0x0439:
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconContentDescription
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x044a
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconContentDescription
            java.lang.CharSequence r6 = r1.mo1726e(r6)
            r0.setEndIconContentDescription((java.lang.CharSequence) r6)
        L_0x044a:
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconCheckable
            r9 = 1
            boolean r6 = r1.mo1716a((int) r6, (boolean) r9)
            r0.setEndIconCheckable(r6)
            goto L_0x04a1
        L_0x0455:
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_passwordToggleEnabled
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x04a1
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_passwordToggleEnabled
            r9 = 0
            boolean r6 = r1.mo1716a((int) r6, (boolean) r9)
            r0.setEndIconMode(r6)
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r6 = r1.mo1719b(r6)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r6)
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r6 = r1.mo1726e(r6)
            r0.setEndIconContentDescription((java.lang.CharSequence) r6)
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_passwordToggleTint
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x048a
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_passwordToggleTint
            android.content.res.ColorStateList r6 = p112n.p277e.p279b.p282b.p294w.C10620c.m35958a((android.content.Context) r10, (androidx.appcompat.widget.C0278q0) r1, (int) r6)
            r0.setEndIconTintList(r6)
        L_0x048a:
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_passwordToggleTintMode
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x04a1
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_passwordToggleTintMode
            r9 = -1
            int r6 = r1.mo1723d(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.C8567k.m28001a((int) r6, (android.graphics.PorterDuff.Mode) r9)
            r0.setEndIconTintMode(r6)
        L_0x04a1:
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_passwordToggleEnabled
            boolean r6 = r1.mo1730g(r6)
            if (r6 != 0) goto L_0x04d1
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconTint
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x04ba
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconTint
            android.content.res.ColorStateList r6 = p112n.p277e.p279b.p282b.p294w.C10620c.m35958a((android.content.Context) r10, (androidx.appcompat.widget.C0278q0) r1, (int) r6)
            r0.setEndIconTintList(r6)
        L_0x04ba:
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconTintMode
            boolean r6 = r1.mo1730g(r6)
            if (r6 == 0) goto L_0x04d1
            int r6 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_endIconTintMode
            r9 = -1
            int r6 = r1.mo1723d(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = com.google.android.material.internal.C8567k.m28001a((int) r6, (android.graphics.PorterDuff.Mode) r9)
            r0.setEndIconTintMode(r6)
        L_0x04d1:
            androidx.appcompat.widget.t r6 = new androidx.appcompat.widget.t
            r6.<init>(r10)
            r0.prefixTextView = r6
            int r9 = p112n.p277e.p279b.p282b.C10578f.textinput_prefix_text
            r6.setId(r9)
            android.widget.TextView r6 = r0.prefixTextView
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r11 = -2
            r9.<init>(r11, r11)
            r6.setLayoutParams(r9)
            android.widget.TextView r6 = r0.prefixTextView
            r9 = 1
            p050l.p075h.p084l.C5071v.m9193g(r6, r9)
            android.widget.LinearLayout r6 = r0.startLayout
            com.google.android.material.internal.CheckableImageButton r9 = r0.startIconView
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.startLayout
            android.widget.TextView r9 = r0.prefixTextView
            r6.addView(r9)
            androidx.appcompat.widget.t r6 = new androidx.appcompat.widget.t
            r6.<init>(r10)
            r0.suffixTextView = r6
            int r9 = p112n.p277e.p279b.p282b.C10578f.textinput_suffix_text
            r6.setId(r9)
            android.widget.TextView r6 = r0.suffixTextView
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r10 = 80
            r11 = -2
            r9.<init>(r11, r11, r10)
            r6.setLayoutParams(r9)
            android.widget.TextView r6 = r0.suffixTextView
            r9 = 1
            p050l.p075h.p084l.C5071v.m9193g(r6, r9)
            android.widget.LinearLayout r6 = r0.endLayout
            android.widget.TextView r9 = r0.suffixTextView
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.endLayout
            com.google.android.material.internal.CheckableImageButton r9 = r0.errorIconView
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.endLayout
            android.widget.FrameLayout r9 = r0.endIconFrame
            r6.addView(r9)
            r0.setHelperTextEnabled(r8)
            r0.setHelperText(r12)
            r0.setHelperTextTextAppearance(r5)
            r0.setErrorEnabled(r4)
            r0.setErrorTextAppearance(r2)
            r0.setErrorContentDescription(r3)
            int r2 = r0.counterTextAppearance
            r0.setCounterTextAppearance(r2)
            int r2 = r0.counterOverflowTextAppearance
            r0.setCounterOverflowTextAppearance(r2)
            r0.setPlaceholderText(r14)
            r0.setPlaceholderTextAppearance(r15)
            r0.setPrefixText(r7)
            r2 = r19
            r0.setPrefixTextAppearance(r2)
            r2 = r18
            r0.setSuffixText(r2)
            r2 = r16
            r0.setSuffixTextAppearance(r2)
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorTextColor
            boolean r2 = r1.mo1730g(r2)
            if (r2 == 0) goto L_0x0575
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r2 = r1.mo1713a(r2)
            r0.setErrorTextColor(r2)
        L_0x0575:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_helperTextTextColor
            boolean r2 = r1.mo1730g(r2)
            if (r2 == 0) goto L_0x0586
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r2 = r1.mo1713a(r2)
            r0.setHelperTextColor(r2)
        L_0x0586:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_hintTextColor
            boolean r2 = r1.mo1730g(r2)
            if (r2 == 0) goto L_0x0597
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r2 = r1.mo1713a(r2)
            r0.setHintTextColor(r2)
        L_0x0597:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_counterTextColor
            boolean r2 = r1.mo1730g(r2)
            if (r2 == 0) goto L_0x05a8
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r2 = r1.mo1713a(r2)
            r0.setCounterTextColor(r2)
        L_0x05a8:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_counterOverflowTextColor
            boolean r2 = r1.mo1730g(r2)
            if (r2 == 0) goto L_0x05b9
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r2 = r1.mo1713a(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05b9:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_placeholderTextColor
            boolean r2 = r1.mo1730g(r2)
            if (r2 == 0) goto L_0x05ca
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_placeholderTextColor
            android.content.res.ColorStateList r2 = r1.mo1713a(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05ca:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_prefixTextColor
            boolean r2 = r1.mo1730g(r2)
            if (r2 == 0) goto L_0x05db
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_prefixTextColor
            android.content.res.ColorStateList r2 = r1.mo1713a(r2)
            r0.setPrefixTextColor(r2)
        L_0x05db:
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_suffixTextColor
            boolean r2 = r1.mo1730g(r2)
            if (r2 == 0) goto L_0x05ec
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_suffixTextColor
            android.content.res.ColorStateList r2 = r1.mo1713a(r2)
            r0.setSuffixTextColor(r2)
        L_0x05ec:
            r2 = r17
            r0.setCounterEnabled(r2)
            int r2 = p112n.p277e.p279b.p282b.C10584l.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.mo1716a((int) r2, (boolean) r3)
            r0.setEnabled(r2)
            r1.mo1720b()
            r1 = 2
            p050l.p075h.p084l.C5071v.m9195h(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void updateCounter(int i) {
        boolean z = this.counterOverflowed;
        int i2 = this.counterMaxLength;
        if (i2 == -1) {
            this.counterView.setText(String.valueOf(i));
            this.counterView.setContentDescription((CharSequence) null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = i > i2;
            updateCounterContentDescription(getContext(), this.counterView, i, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(C4985a.m8840b().mo17414a(getContext().getString(C10582j.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.counterMaxLength)})));
        }
        if (this.editText != null && z != this.counterOverflowed) {
            updateLabelState(false);
            updateTextInputBoxState();
            updateEditTextBackground();
        }
    }
}
