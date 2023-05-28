package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import p050l.p075h.p083k.C5008h;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p294w.C10620c;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10645k;

/* renamed from: com.google.android.material.datepicker.a */
/* compiled from: CalendarItemStyle */
final class C8487a {

    /* renamed from: a */
    private final Rect f24217a;

    /* renamed from: b */
    private final ColorStateList f24218b;

    /* renamed from: c */
    private final ColorStateList f24219c;

    /* renamed from: d */
    private final ColorStateList f24220d;

    /* renamed from: e */
    private final int f24221e;

    /* renamed from: f */
    private final C10645k f24222f;

    private C8487a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C10645k kVar, Rect rect) {
        C5008h.m8898a(rect.left);
        C5008h.m8898a(rect.top);
        C5008h.m8898a(rect.right);
        C5008h.m8898a(rect.bottom);
        this.f24217a = rect;
        this.f24218b = colorStateList2;
        this.f24219c = colorStateList;
        this.f24220d = colorStateList3;
        this.f24221e = i;
        this.f24222f = kVar;
    }

    /* renamed from: a */
    static C8487a m27640a(Context context, int i) {
        C5008h.m8901a(i != 0, (Object) "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C10584l.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C10584l.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C10584l.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C10584l.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C10584l.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = C10620c.m35957a(context, obtainStyledAttributes, C10584l.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = C10620c.m35957a(context, obtainStyledAttributes, C10584l.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = C10620c.m35957a(context, obtainStyledAttributes, C10584l.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C10584l.MaterialCalendarItem_itemStrokeWidth, 0);
        C10645k a4 = C10645k.m36073a(context, obtainStyledAttributes.getResourceId(C10584l.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C10584l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).mo36302a();
        obtainStyledAttributes.recycle();
        return new C8487a(a, a2, a3, dimensionPixelSize, a4, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo31599b() {
        return this.f24217a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31598a(TextView textView) {
        C10638g gVar = new C10638g();
        C10638g gVar2 = new C10638g();
        gVar.setShapeAppearanceModel(this.f24222f);
        gVar2.setShapeAppearanceModel(this.f24222f);
        gVar.mo36240a(this.f24219c);
        gVar.mo36236a((float) this.f24221e, this.f24220d);
        textView.setTextColor(this.f24218b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f24218b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f24217a;
        C5071v.m9161a((View) textView, (Drawable) new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo31597a() {
        return this.f24217a.bottom;
    }
}
