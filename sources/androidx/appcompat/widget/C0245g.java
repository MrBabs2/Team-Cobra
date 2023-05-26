package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0414a;
import androidx.core.widget.C0430c;

/* renamed from: androidx.appcompat.widget.g */
/* compiled from: AppCompatCompoundButtonHelper */
class C0245g {

    /* renamed from: a */
    private final CompoundButton f1066a;

    /* renamed from: b */
    private ColorStateList f1067b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1068c = null;

    /* renamed from: d */
    private boolean f1069d = false;

    /* renamed from: e */
    private boolean f1070e = false;

    /* renamed from: f */
    private boolean f1071f;

    C0245g(CompoundButton compoundButton) {
        this.f1066a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043 A[SYNTHETIC, Splitter:B:12:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[Catch:{ all -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d A[Catch:{ all -> 0x0092 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1548a(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f1066a
            android.content.Context r0 = r0.getContext()
            int[] r1 = p050l.p051a.C4799j.CompoundButton
            r2 = 0
            androidx.appcompat.widget.q0 r0 = androidx.appcompat.widget.C0278q0.m1271a(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f1066a
            android.content.Context r4 = r3.getContext()
            int[] r5 = p050l.p051a.C4799j.CompoundButton
            android.content.res.TypedArray r7 = r0.mo1714a()
            r9 = 0
            r6 = r11
            r8 = r12
            p050l.p075h.p084l.C5071v.m9157a(r3, r4, r5, r6, r7, r8, r9)
            int r11 = p050l.p051a.C4799j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.mo1730g(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0040
            int r11 = p050l.p051a.C4799j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0092 }
            int r11 = r0.mo1729g(r11, r2)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0040
            android.widget.CompoundButton r12 = r10.f1066a     // Catch:{ NotFoundException -> 0x0040 }
            android.widget.CompoundButton r1 = r10.f1066a     // Catch:{ NotFoundException -> 0x0040 }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x0040 }
            android.graphics.drawable.Drawable r11 = p050l.p051a.p052k.p053a.C4800a.m7936c(r1, r11)     // Catch:{ NotFoundException -> 0x0040 }
            r12.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0040 }
            r11 = 1
            goto L_0x0041
        L_0x0040:
            r11 = 0
        L_0x0041:
            if (r11 != 0) goto L_0x0062
            int r11 = p050l.p051a.C4799j.CompoundButton_android_button     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.mo1730g(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0062
            int r11 = p050l.p051a.C4799j.CompoundButton_android_button     // Catch:{ all -> 0x0092 }
            int r11 = r0.mo1729g(r11, r2)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0062
            android.widget.CompoundButton r12 = r10.f1066a     // Catch:{ all -> 0x0092 }
            android.widget.CompoundButton r1 = r10.f1066a     // Catch:{ all -> 0x0092 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0092 }
            android.graphics.drawable.Drawable r11 = p050l.p051a.p052k.p053a.C4800a.m7936c(r1, r11)     // Catch:{ all -> 0x0092 }
            r12.setButtonDrawable(r11)     // Catch:{ all -> 0x0092 }
        L_0x0062:
            int r11 = p050l.p051a.C4799j.CompoundButton_buttonTint     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.mo1730g(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x0075
            android.widget.CompoundButton r11 = r10.f1066a     // Catch:{ all -> 0x0092 }
            int r12 = p050l.p051a.C4799j.CompoundButton_buttonTint     // Catch:{ all -> 0x0092 }
            android.content.res.ColorStateList r12 = r0.mo1713a(r12)     // Catch:{ all -> 0x0092 }
            androidx.core.widget.C0430c.m2128a((android.widget.CompoundButton) r11, (android.content.res.ColorStateList) r12)     // Catch:{ all -> 0x0092 }
        L_0x0075:
            int r11 = p050l.p051a.C4799j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0092 }
            boolean r11 = r0.mo1730g(r11)     // Catch:{ all -> 0x0092 }
            if (r11 == 0) goto L_0x008e
            android.widget.CompoundButton r11 = r10.f1066a     // Catch:{ all -> 0x0092 }
            int r12 = p050l.p051a.C4799j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0092 }
            r1 = -1
            int r12 = r0.mo1723d(r12, r1)     // Catch:{ all -> 0x0092 }
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.widget.C0301y.m1449a(r12, r1)     // Catch:{ all -> 0x0092 }
            androidx.core.widget.C0430c.m2129a((android.widget.CompoundButton) r11, (android.graphics.PorterDuff.Mode) r12)     // Catch:{ all -> 0x0092 }
        L_0x008e:
            r0.mo1720b()
            return
        L_0x0092:
            r11 = move-exception
            r0.mo1720b()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0245g.mo1548a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo1549b() {
        return this.f1067b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo1550c() {
        return this.f1068c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1551d() {
        if (this.f1071f) {
            this.f1071f = false;
            return;
        }
        this.f1071f = true;
        mo1545a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1546a(ColorStateList colorStateList) {
        this.f1067b = colorStateList;
        this.f1069d = true;
        mo1545a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1547a(PorterDuff.Mode mode) {
        this.f1068c = mode;
        this.f1070e = true;
        mo1545a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1545a() {
        Drawable a = C0430c.m2127a(this.f1066a);
        if (a == null) {
            return;
        }
        if (this.f1069d || this.f1070e) {
            Drawable mutate = C0414a.m2029i(a).mutate();
            if (this.f1069d) {
                C0414a.m2014a(mutate, this.f1067b);
            }
            if (this.f1070e) {
                C0414a.m2017a(mutate, this.f1068c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1066a.getDrawableState());
            }
            this.f1066a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.C0430c.m2127a(r2.f1066a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo1544a(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f1066a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.C0430c.m2127a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0245g.mo1544a(int):int");
    }
}
