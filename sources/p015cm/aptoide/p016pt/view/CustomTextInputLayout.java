package p015cm.aptoide.p016pt.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import p015cm.aptoide.p016pt.C1086R;
import p050l.p075h.p084l.C5012a0;
import p050l.p075h.p084l.C5016b0;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.C5086z;
import p050l.p091k.p092a.p093a.C5109b;

/* renamed from: cm.aptoide.pt.view.CustomTextInputLayout */
public class CustomTextInputLayout extends TextInputLayout {
    static final Interpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new C5109b();
    private boolean errorEnabled = false;
    private CharSequence helperText;
    private int helperTextAppearance;
    private ColorStateList helperTextColor;
    private boolean helperTextEnabled = false;
    /* access modifiers changed from: private */
    public TextView helperView;

    public CustomTextInputLayout(Context context) {
        super(context);
    }

    public void setErrorEnabled(boolean z) {
        if (this.errorEnabled != z) {
            this.errorEnabled = z;
            if (z && this.helperTextEnabled) {
                setHelperTextEnabled(false);
            }
            super.setErrorEnabled(z);
            if (!z && !TextUtils.isEmpty(this.helperText)) {
                setHelperText(this.helperText);
            }
        }
    }

    public void setHelperText(CharSequence charSequence) {
        this.helperText = charSequence;
        if (!this.helperTextEnabled) {
            if (!TextUtils.isEmpty(charSequence)) {
                setHelperTextEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.helperView.setText(charSequence);
            this.helperView.setVisibility(0);
            C5071v.m9153a((View) this.helperView, 0.0f);
            C5086z a = C5071v.m9151a(this.helperView);
            a.mo17637a(1.0f);
            a.mo17638a(200);
            a.mo17639a(FAST_OUT_SLOW_IN_INTERPOLATOR);
            a.mo17640a((C5012a0) null);
            a.mo17646c();
        } else if (this.helperView.getVisibility() == 0) {
            C5086z a2 = C5071v.m9151a(this.helperView);
            a2.mo17637a(0.0f);
            a2.mo17638a(200);
            a2.mo17639a(FAST_OUT_SLOW_IN_INTERPOLATOR);
            a2.mo17640a((C5012a0) new C5016b0() {
                public void onAnimationEnd(View view) {
                    CustomTextInputLayout.this.helperView.setText((CharSequence) null);
                    CustomTextInputLayout.this.helperView.setVisibility(4);
                }
            });
            a2.mo17646c();
        }
        sendAccessibilityEvent(RecyclerView.C0638l.FLAG_MOVED);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.helperTextColor = colorStateList;
    }

    public void setHelperTextEnabled(boolean z) {
        if (this.helperTextEnabled != z) {
            if (z && this.errorEnabled) {
                setErrorEnabled(false);
            }
            if (this.helperTextEnabled != z) {
                if (z) {
                    TextView textView = new TextView(getContext());
                    this.helperView = textView;
                    textView.setTextSize(2, 12.0f);
                    this.helperView.setTextAppearance(getContext(), this.helperTextAppearance);
                    ColorStateList colorStateList = this.helperTextColor;
                    if (colorStateList != null) {
                        this.helperView.setTextColor(colorStateList);
                    }
                    this.helperView.setText(this.helperText);
                    this.helperView.setVisibility(0);
                    addView(this.helperView);
                    if (!(this.helperView == null || getEditText() == null)) {
                        C5071v.m9156a(this.helperView, C5071v.m9209u(getEditText()), 0, C5071v.m9208t(getEditText()), getEditText().getPaddingBottom());
                    }
                } else {
                    removeView(this.helperView);
                    this.helperView = null;
                }
                this.helperTextEnabled = z;
            }
        }
    }

    public CustomTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1086R.styleable.CustomTextInputLayout, 0, 0);
        try {
            this.helperTextColor = obtainStyledAttributes.getColorStateList(1);
            this.helperText = obtainStyledAttributes.getText(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
