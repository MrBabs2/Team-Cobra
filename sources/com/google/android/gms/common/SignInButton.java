package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonCreator;
import com.google.android.gms.common.internal.SignInButtonImpl;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: f */
    private int f13627f;

    /* renamed from: g */
    private int f13628g;

    /* renamed from: h */
    private View f13629h;

    /* renamed from: i */
    private View.OnClickListener f13630i;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    /* renamed from: a */
    public final void mo24881a(int i, int i2) {
        this.f13627f = i;
        this.f13628g = i2;
        Context context = getContext();
        View view = this.f13629h;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f13629h = SignInButtonCreator.m16060a(context, this.f13627f, this.f13628g);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i3 = this.f13627f;
            int i4 = this.f13628g;
            SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context);
            signInButtonImpl.mo25390a(context.getResources(), i3, i4);
            this.f13629h = signInButtonImpl;
        }
        addView(this.f13629h);
        this.f13629h.setEnabled(isEnabled());
        this.f13629h.setOnClickListener(this);
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f13630i;
        if (onClickListener != null && view == this.f13629h) {
            onClickListener.onClick(this);
        }
    }

    public final void setColorScheme(int i) {
        mo24881a(this.f13627f, i);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f13629h.setEnabled(z);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13630i = onClickListener;
        View view = this.f13629h;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        mo24881a(this.f13627f, this.f13628g);
    }

    public final void setSize(int i) {
        mo24881a(i, this.f13628g);
    }
}
