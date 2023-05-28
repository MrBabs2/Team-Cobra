package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C0256i;
import com.google.android.material.internal.C8555e;
import com.google.android.material.internal.C8566j;
import com.google.android.material.theme.p190a.C8648a;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;

public class TextInputEditText extends C0256i {

    /* renamed from: i */
    private final Rect f24600i;

    /* renamed from: j */
    private boolean f24601j;

    public TextInputEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private String m28108a(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !TextUtils.isEmpty(helperText);
        boolean z4 = !TextUtils.isEmpty(error);
        String str = "";
        String charSequence = z2 ? hint.toString() : str;
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        if (z4) {
            helperText = error;
        } else if (!z3) {
            helperText = str;
        }
        sb3.append(helperText);
        String sb4 = sb3.toString();
        if (!z) {
            return !TextUtils.isEmpty(sb4) ? sb4 : str;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(text);
        if (!TextUtils.isEmpty(sb4)) {
            str = ", " + sb4;
        }
        sb5.append(str);
        return sb5.toString();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f24601j && rect != null) {
            textInputLayout.getFocusedRect(this.f24600i);
            rect.bottom = this.f24600i.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.f24601j || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.f24600i, point);
            rect.bottom = this.f24600i.bottom;
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.isProvidingHint()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint() && super.getHint() == null && C8555e.m27959a()) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText(m28108a(textInputLayout));
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f24601j) {
            this.f24600i.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(C10576d.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f24600i, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f24601j = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, 0), attributeSet, i);
        this.f24600i = new Rect();
        TypedArray c = C8566j.m27997c(context, attributeSet, C10584l.TextInputEditText, i, C10583k.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(c.getBoolean(C10584l.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        c.recycle();
    }
}
