package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;

@TargetApi(14)
@zzard
public final class zzbdi implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final AudioManager f18854a;

    /* renamed from: b */
    private final C4740g8 f18855b;

    /* renamed from: c */
    private boolean f18856c;

    /* renamed from: d */
    private boolean f18857d;

    /* renamed from: e */
    private boolean f18858e;

    /* renamed from: f */
    private float f18859f = 1.0f;

    public zzbdi(Context context, C4740g8 g8Var) {
        this.f18854a = (AudioManager) context.getSystemService("audio");
        this.f18855b = g8Var;
    }

    /* renamed from: d */
    private final void m20691d() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        boolean z4 = this.f18857d && !this.f18858e && this.f18859f > 0.0f;
        if (z4 && !(z2 = this.f18856c)) {
            AudioManager audioManager = this.f18854a;
            if (audioManager != null && !z2) {
                if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                    z3 = true;
                }
                this.f18856c = z3;
            }
            this.f18855b.mo16504a();
        } else if (!z4 && (z = this.f18856c)) {
            AudioManager audioManager2 = this.f18854a;
            if (audioManager2 != null && z) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z3 = true;
                }
                this.f18856c = z3;
            }
            this.f18855b.mo16504a();
        }
    }

    /* renamed from: a */
    public final void mo27987a(boolean z) {
        this.f18858e = z;
        m20691d();
    }

    /* renamed from: b */
    public final void mo27988b() {
        this.f18857d = true;
        m20691d();
    }

    /* renamed from: c */
    public final void mo27989c() {
        this.f18857d = false;
        m20691d();
    }

    public final void onAudioFocusChange(int i) {
        this.f18856c = i > 0;
        this.f18855b.mo16504a();
    }

    /* renamed from: a */
    public final void mo27986a(float f) {
        this.f18859f = f;
        m20691d();
    }

    /* renamed from: a */
    public final float mo27985a() {
        float f = this.f18858e ? 0.0f : this.f18859f;
        if (this.f18856c) {
            return f;
        }
        return 0.0f;
    }
}
