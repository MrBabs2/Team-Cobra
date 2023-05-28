package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C0352a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p050l.p075h.p083k.C5008h;

/* renamed from: androidx.fragment.app.g */
/* compiled from: FragmentHostCallback */
public abstract class C0461g<E> extends C0458d {

    /* renamed from: f */
    private final Activity f1971f;

    /* renamed from: g */
    private final Context f1972g;

    /* renamed from: h */
    private final Handler f1973h;

    /* renamed from: i */
    private final int f1974i;

    /* renamed from: j */
    final C0466i f1975j;

    C0461g(C0456c cVar) {
        this(cVar, cVar, new Handler(), 0);
    }

    /* renamed from: a */
    public View mo2661a(int i) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2748a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo2749a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f1972g.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: a */
    public void mo2751a(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo2752a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo2662a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo2753a(String str) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Activity mo2786b() {
        return this.f1971f;
    }

    /* renamed from: b */
    public boolean mo2754b(Fragment fragment) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Context mo2787c() {
        return this.f1972g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Handler mo2788d() {
        return this.f1973h;
    }

    /* renamed from: e */
    public abstract E mo2755e();

    /* renamed from: f */
    public LayoutInflater mo2756f() {
        return LayoutInflater.from(this.f1972g);
    }

    /* renamed from: g */
    public int mo2757g() {
        return this.f1974i;
    }

    /* renamed from: h */
    public boolean mo2758h() {
        return true;
    }

    /* renamed from: i */
    public void mo2759i() {
    }

    C0461g(Activity activity, Context context, Handler handler, int i) {
        this.f1975j = new C0466i();
        this.f1971f = activity;
        C5008h.m8900a(context, (Object) "context == null");
        this.f1972g = context;
        C5008h.m8900a(handler, (Object) "handler == null");
        this.f1973h = handler;
        this.f1974i = i;
    }

    /* renamed from: a */
    public void mo2750a(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C0352a.m1771a(this.f1971f, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }
}
