package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p050l.p051a.C4799j;
import p050l.p051a.p058o.C4821b;

/* renamed from: androidx.appcompat.app.a */
/* compiled from: ActionBar */
public abstract class C0069a {

    /* renamed from: androidx.appcompat.app.a$b */
    /* compiled from: ActionBar */
    public interface C0071b {
        /* renamed from: a */
        void mo199a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* compiled from: ActionBar */
    public static abstract class C0072c {
        /* renamed from: a */
        public abstract CharSequence mo200a();

        /* renamed from: b */
        public abstract View mo201b();

        /* renamed from: c */
        public abstract Drawable mo202c();

        /* renamed from: d */
        public abstract CharSequence mo203d();

        /* renamed from: e */
        public abstract void mo204e();
    }

    /* renamed from: a */
    public C4821b mo180a(C4821b.C4822a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo181a(Configuration configuration) {
    }

    /* renamed from: a */
    public abstract void mo182a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo183a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    public boolean mo184a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo185b(CharSequence charSequence);

    /* renamed from: b */
    public abstract void mo186b(boolean z);

    /* renamed from: c */
    public abstract void mo187c(boolean z);

    /* renamed from: d */
    public abstract void mo188d(boolean z);

    /* renamed from: e */
    public abstract void mo189e(boolean z);

    /* renamed from: e */
    public boolean mo190e() {
        return false;
    }

    /* renamed from: f */
    public abstract void mo191f(boolean z);

    /* renamed from: f */
    public abstract boolean mo192f();

    /* renamed from: g */
    public abstract int mo193g();

    /* renamed from: g */
    public abstract void mo194g(boolean z);

    /* renamed from: h */
    public abstract Context mo195h();

    /* renamed from: i */
    public boolean mo196i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo197j() {
    }

    /* renamed from: k */
    public boolean mo198k() {
        return false;
    }

    /* renamed from: androidx.appcompat.app.a$a */
    /* compiled from: ActionBar */
    public static class C0070a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f215a;

        public C0070a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f215a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4799j.ActionBarLayout);
            this.f215a = obtainStyledAttributes.getInt(C4799j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0070a(int i, int i2) {
            super(i, i2);
            this.f215a = 0;
            this.f215a = 8388627;
        }

        public C0070a(C0070a aVar) {
            super(aVar);
            this.f215a = 0;
            this.f215a = aVar.f215a;
        }

        public C0070a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f215a = 0;
        }
    }
}
