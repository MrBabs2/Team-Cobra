package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p050l.p051a.C4790a;
import p050l.p051a.p058o.C4821b;
import p050l.p075h.p084l.C5030e;

/* renamed from: androidx.appcompat.app.h */
/* compiled from: AppCompatDialog */
public class C0104h extends Dialog implements C0077e {

    /* renamed from: f */
    private C0078f f318f;

    /* renamed from: g */
    private final C5030e.C5031a f319g = new C0105a();

    /* renamed from: androidx.appcompat.app.h$a */
    /* compiled from: AppCompatDialog */
    class C0105a implements C5030e.C5031a {
        C0105a() {
        }

        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return C0104h.this.mo381a(keyEvent);
        }
    }

    public C0104h(Context context, int i) {
        super(context, m395a(context, i));
        C0078f a = mo379a();
        a.mo301d(m395a(context, i));
        a.mo286a((Bundle) null);
    }

    /* renamed from: a */
    public boolean mo380a(int i) {
        return mo379a().mo296b(i);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo379a().mo288a(view, layoutParams);
    }

    public void dismiss() {
        super.dismiss();
        mo379a().mo305h();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C5030e.m8985a(this.f319g, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return mo379a().mo282a(i);
    }

    public void invalidateOptionsMenu() {
        mo379a().mo304g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo379a().mo303f();
        super.onCreate(bundle);
        mo379a().mo286a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo379a().mo308k();
    }

    public void onSupportActionModeFinished(C4821b bVar) {
    }

    public void onSupportActionModeStarted(C4821b bVar) {
    }

    public C4821b onWindowStartingSupportActionMode(C4821b.C4822a aVar) {
        return null;
    }

    public void setContentView(int i) {
        mo379a().mo298c(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo379a().mo290a(charSequence);
    }

    /* renamed from: a */
    public C0078f mo379a() {
        if (this.f318f == null) {
            this.f318f = C0078f.m242a((Dialog) this, (C0077e) this);
        }
        return this.f318f;
    }

    public void setContentView(View view) {
        mo379a().mo287a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo379a().mo295b(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo379a().mo290a((CharSequence) getContext().getString(i));
    }

    /* renamed from: a */
    private static int m395a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4790a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo381a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
