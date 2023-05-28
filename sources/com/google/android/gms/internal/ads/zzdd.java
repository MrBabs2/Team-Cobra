package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class zzdd implements zzdc {

    /* renamed from: y */
    protected static volatile zzdy f21346y;

    /* renamed from: f */
    protected MotionEvent f21347f;

    /* renamed from: g */
    protected LinkedList<MotionEvent> f21348g = new LinkedList<>();

    /* renamed from: h */
    protected long f21349h = 0;

    /* renamed from: i */
    protected long f21350i = 0;

    /* renamed from: j */
    protected long f21351j = 0;

    /* renamed from: k */
    protected long f21352k = 0;

    /* renamed from: l */
    protected long f21353l = 0;

    /* renamed from: m */
    protected long f21354m = 0;

    /* renamed from: n */
    protected long f21355n = 0;

    /* renamed from: o */
    protected double f21356o;

    /* renamed from: p */
    private double f21357p;

    /* renamed from: q */
    private double f21358q;

    /* renamed from: r */
    protected float f21359r;

    /* renamed from: s */
    protected float f21360s;

    /* renamed from: t */
    protected float f21361t;

    /* renamed from: u */
    protected float f21362u;

    /* renamed from: v */
    private boolean f21363v = false;

    /* renamed from: w */
    protected boolean f21364w = false;

    /* renamed from: x */
    protected DisplayMetrics f21365x;

    protected zzdd(Context context) {
        try {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17967t1)).booleanValue()) {
                C7582ij.m17183a();
            } else {
                C7971sy.m18183a(f21346y);
            }
            this.f21365x = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[SYNTHETIC, Splitter:B:16:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d A[Catch:{ Exception -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[Catch:{ Exception -> 0x0054 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0071 A[SYNTHETIC, Splitter:B:33:0x0071] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m23311a(android.content.Context r10, java.lang.String r11, boolean r12, android.view.View r13, android.app.Activity r14, byte[] r15) {
        /*
            r9 = this;
            r0 = 0
            if (r15 == 0) goto L_0x000f
            int r1 = r15.length
            if (r1 <= 0) goto L_0x000f
            com.google.android.gms.internal.ads.zzdno r1 = com.google.android.gms.internal.ads.zzdno.m23986d()     // Catch:{ zzdok -> 0x000f }
            com.google.android.gms.internal.ads.zzbk$zza r15 = com.google.android.gms.internal.ads.zzbk.zza.m21233a(r15, r1)     // Catch:{ zzdok -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r15 = r0
        L_0x0010:
            com.google.android.gms.internal.ads.zzdy r1 = f21346y
            if (r1 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzacu.f17924j1
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r1 = r2.mo27163a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.zzdy r1 = f21346y
            com.google.android.gms.internal.ads.zzda r1 = r1.mo29249i()
            goto L_0x002e
        L_0x002d:
            r1 = r0
        L_0x002e:
            long r2 = java.lang.System.currentTimeMillis()
            r8 = -1
            if (r12 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.zzbp$zza$zza r0 = r9.mo28924a(r10, r13, r14)     // Catch:{ Exception -> 0x0054 }
            r10 = 1
            r9.f21363v = r10     // Catch:{ Exception -> 0x0054 }
            goto L_0x0042
        L_0x003d:
            com.google.android.gms.internal.ads.zzbp$zza$zza r10 = r9.mo28925a(r10, r15)     // Catch:{ Exception -> 0x0054 }
            r0 = r10
        L_0x0042:
            if (r1 == 0) goto L_0x006b
            if (r12 == 0) goto L_0x0049
            r10 = 1002(0x3ea, float:1.404E-42)
            goto L_0x004b
        L_0x0049:
            r10 = 1000(0x3e8, float:1.401E-42)
        L_0x004b:
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0054 }
            long r13 = r13 - r2
            r1.mo28868a(r10, r8, r13)     // Catch:{ Exception -> 0x0054 }
            goto L_0x006b
        L_0x0054:
            r10 = move-exception
            r7 = r10
            if (r1 == 0) goto L_0x006b
            if (r12 == 0) goto L_0x005d
            r10 = 1003(0x3eb, float:1.406E-42)
            goto L_0x005f
        L_0x005d:
            r10 = 1001(0x3e9, float:1.403E-42)
        L_0x005f:
            r4 = -1
            long r13 = java.lang.System.currentTimeMillis()
            long r5 = r13 - r2
            r2 = r1
            r3 = r10
            r2.mo28869a(r3, r4, r5, r7)
        L_0x006b:
            long r13 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.zzdpk r10 = r0.mo29143t()     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.internal.ads.zzdob r10 = (com.google.android.gms.internal.ads.zzdob) r10     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.internal.ads.zzbp$zza r10 = (com.google.android.gms.internal.ads.zzbp.zza) r10     // Catch:{ Exception -> 0x00a4 }
            int r10 = r10.mo29133h()     // Catch:{ Exception -> 0x00a4 }
            if (r10 != 0) goto L_0x0080
            goto L_0x009e
        L_0x0080:
            com.google.android.gms.internal.ads.zzdpk r10 = r0.mo29143t()     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.internal.ads.zzdob r10 = (com.google.android.gms.internal.ads.zzdob) r10     // Catch:{ Exception -> 0x00a4 }
            com.google.android.gms.internal.ads.zzbp$zza r10 = (com.google.android.gms.internal.ads.zzbp.zza) r10     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r10 = com.google.android.gms.internal.ads.C7582ij.m17180a((com.google.android.gms.internal.ads.zzbp.zza) r10, (java.lang.String) r11)     // Catch:{ Exception -> 0x00a4 }
            if (r1 == 0) goto L_0x00c3
            if (r12 == 0) goto L_0x0093
            r11 = 1006(0x3ee, float:1.41E-42)
            goto L_0x0095
        L_0x0093:
            r11 = 1004(0x3ec, float:1.407E-42)
        L_0x0095:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00a4 }
            long r2 = r2 - r13
            r1.mo28868a(r11, r8, r2)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00c3
        L_0x009e:
            r10 = 5
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00c3
        L_0x00a4:
            r10 = move-exception
            r7 = r10
            r10 = 7
            java.lang.String r10 = java.lang.Integer.toString(r10)
            if (r1 == 0) goto L_0x00c3
            if (r12 == 0) goto L_0x00b4
            r11 = 1007(0x3ef, float:1.411E-42)
            r3 = 1007(0x3ef, float:1.411E-42)
            goto L_0x00b8
        L_0x00b4:
            r11 = 1005(0x3ed, float:1.408E-42)
            r3 = 1005(0x3ed, float:1.408E-42)
        L_0x00b8:
            r4 = -1
            long r11 = java.lang.System.currentTimeMillis()
            long r5 = r11 - r13
            r2 = r1
            r2.mo28869a(r3, r4, r5, r7)
        L_0x00c3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdd.m23311a(android.content.Context, java.lang.String, boolean, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo28923a(StackTraceElement[] stackTraceElementArr) throws zzdv;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract zzbp.zza.C12966zza mo28924a(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract zzbp.zza.C12966zza mo28925a(Context context, zzbk.zza zza);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract zzee mo28926a(MotionEvent motionEvent) throws zzdv;

    public final String zza(Context context) {
        if (zzef.m24290a()) {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17975v1)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m23311a(context, (String) null, false, (View) null, (Activity) null, (byte[]) null);
    }

    public void zzb(View view) {
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, (Activity) null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        return m23311a(context, str, true, view, activity, (byte[]) null);
    }

    public final void zza(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f21363v) {
            this.f21352k = 0;
            this.f21351j = 0;
            this.f21350i = 0;
            this.f21349h = 0;
            this.f21353l = 0;
            this.f21355n = 0;
            this.f21354m = 0;
            Iterator it = this.f21348g.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.f21348g.clear();
            this.f21347f = null;
            this.f21363v = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f21356o = 0.0d;
            this.f21357p = (double) motionEvent.getRawX();
            this.f21358q = (double) motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = (double) motionEvent.getRawX();
            double rawY = (double) motionEvent.getRawY();
            double d = this.f21357p;
            Double.isNaN(rawX);
            double d2 = rawX - d;
            double d3 = this.f21358q;
            Double.isNaN(rawY);
            double d4 = rawY - d3;
            this.f21356o += Math.sqrt((d2 * d2) + (d4 * d4));
            this.f21357p = rawX;
            this.f21358q = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 == 0) {
            this.f21359r = motionEvent.getX();
            this.f21360s = motionEvent.getY();
            this.f21361t = motionEvent.getRawX();
            this.f21362u = motionEvent.getRawY();
            this.f21349h++;
        } else if (action2 == 1) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            this.f21347f = obtain;
            this.f21348g.add(obtain);
            if (this.f21348g.size() > 6) {
                this.f21348g.remove().recycle();
            }
            this.f21351j++;
            this.f21353l = mo28923a(new Throwable().getStackTrace());
        } else if (action2 == 2) {
            this.f21350i += (long) (motionEvent.getHistorySize() + 1);
            try {
                zzee a = mo28926a(motionEvent);
                if ((a == null || a.f21797e == null || a.f21800h == null) ? false : true) {
                    this.f21354m += a.f21797e.longValue() + a.f21800h.longValue();
                }
                if (!(this.f21365x == null || a == null || a.f21798f == null || a.f21801i == null)) {
                    z = true;
                }
                if (z) {
                    this.f21355n += a.f21798f.longValue() + a.f21801i.longValue();
                }
            } catch (zzdv unused) {
            }
        } else if (action2 == 3) {
            this.f21352k++;
        }
        this.f21364w = true;
    }

    public final void zza(int i, int i2, int i3) {
        MotionEvent motionEvent = this.f21347f;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        DisplayMetrics displayMetrics = this.f21365x;
        if (displayMetrics != null) {
            float f = displayMetrics.density;
            this.f21347f = MotionEvent.obtain(0, (long) i3, 1, ((float) i) * f, ((float) i2) * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f21347f = null;
        }
        this.f21364w = false;
    }
}
