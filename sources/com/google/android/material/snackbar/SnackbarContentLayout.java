package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p288q.C10609a;

public class SnackbarContentLayout extends LinearLayout implements C8599a {

    /* renamed from: f */
    private TextView f24586f;

    /* renamed from: g */
    private Button f24587g;

    /* renamed from: h */
    private int f24588h;

    /* renamed from: i */
    private int f24589i;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32017a(float f) {
        if (f != 1.0f) {
            this.f24587g.setTextColor(C10609a.m35923a(C10609a.m35926a((View) this, C10574b.colorSurface), this.f24587g.getCurrentTextColor(), f));
        }
    }

    /* renamed from: b */
    public void mo32019b(int i, int i2) {
        this.f24586f.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f24586f.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f24587g.getVisibility() == 0) {
            this.f24587g.setAlpha(1.0f);
            this.f24587g.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f24587g;
    }

    public TextView getMessageView() {
        return this.f24586f;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24586f = (TextView) findViewById(C10578f.snackbar_text);
        this.f24587g = (Button) findViewById(C10578f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m28086a(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m28086a(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f24588h
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f24588h
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = p112n.p277e.p279b.p282b.C10576d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = p112n.p277e.p279b.p282b.C10576d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f24586f
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f24589i
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f24587g
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f24589i
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m28086a((int) r4, (int) r0, (int) r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m28086a((int) r3, (int) r0, (int) r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f24589i = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10584l.SnackbarLayout);
        this.f24588h = obtainStyledAttributes.getDimensionPixelSize(C10584l.SnackbarLayout_android_maxWidth, -1);
        this.f24589i = obtainStyledAttributes.getDimensionPixelSize(C10584l.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private boolean m28086a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f24586f.getPaddingTop() == i2 && this.f24586f.getPaddingBottom() == i3) {
            return z;
        }
        m28085a((View) this.f24586f, i2, i3);
        return true;
    }

    /* renamed from: a */
    private static void m28085a(View view, int i, int i2) {
        if (C5071v.m9142G(view)) {
            C5071v.m9156a(view, C5071v.m9209u(view), i, C5071v.m9208t(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    public void mo32018a(int i, int i2) {
        this.f24586f.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f24586f.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f24587g.getVisibility() == 0) {
            this.f24587g.setAlpha(0.0f);
            this.f24587g.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
