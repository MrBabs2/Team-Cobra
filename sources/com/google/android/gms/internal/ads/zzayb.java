package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.List;

@zzard
public final class zzayb {

    /* renamed from: a */
    private final Context f18663a;

    /* renamed from: b */
    private String f18664b;

    /* renamed from: c */
    private String f18665c;

    /* renamed from: d */
    private String f18666d;

    /* renamed from: e */
    private String f18667e;

    /* renamed from: f */
    private int f18668f;

    /* renamed from: g */
    private int f18669g;

    /* renamed from: h */
    private PointF f18670h;

    /* renamed from: i */
    private PointF f18671i;

    /* renamed from: j */
    private Handler f18672j;

    /* renamed from: k */
    private Runnable f18673k;

    public zzayb(Context context) {
        this.f18668f = 0;
        this.f18673k = new C7720m5(this);
        this.f18663a = context;
        this.f18669g = ViewConfiguration.get(context).getScaledTouchSlop();
        zzk.zzlu().mo27864b();
        this.f18672j = zzk.zzlu().mo27863a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27834a(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getActionMasked()
            int r1 = r11.getHistorySize()
            int r2 = r11.getPointerCount()
            r3 = 0
            if (r0 != 0) goto L_0x0021
            r10.f18668f = r3
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r3)
            float r11 = r11.getY(r3)
            r0.<init>(r1, r11)
            r10.f18670h = r0
            return
        L_0x0021:
            int r4 = r10.f18668f
            r5 = -1
            if (r4 != r5) goto L_0x0027
            return
        L_0x0027:
            r6 = 5
            r7 = 1
            if (r4 != 0) goto L_0x0056
            if (r0 != r6) goto L_0x0056
            r10.f18668f = r6
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r7)
            float r11 = r11.getY(r7)
            r0.<init>(r1, r11)
            r10.f18671i = r0
            android.os.Handler r11 = r10.f18672j
            java.lang.Runnable r0 = r10.f18673k
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzacu.f17900e2
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r1 = r2.mo27163a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r11.postDelayed(r0, r1)
            return
        L_0x0056:
            int r4 = r10.f18668f
            if (r4 != r6) goto L_0x00a2
            r4 = 2
            if (r2 == r4) goto L_0x005f
        L_0x005d:
            r3 = 1
            goto L_0x0097
        L_0x005f:
            if (r0 != r4) goto L_0x0097
            r0 = 0
            r2 = 0
        L_0x0063:
            if (r0 >= r1) goto L_0x007f
            float r4 = r11.getHistoricalX(r3, r0)
            float r6 = r11.getHistoricalY(r3, r0)
            float r8 = r11.getHistoricalX(r7, r0)
            float r9 = r11.getHistoricalY(r7, r0)
            boolean r4 = r10.m20381a(r4, r6, r8, r9)
            if (r4 != 0) goto L_0x007c
            r2 = 1
        L_0x007c:
            int r0 = r0 + 1
            goto L_0x0063
        L_0x007f:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r11.getX(r7)
            float r11 = r11.getY(r7)
            boolean r11 = r10.m20381a(r0, r1, r3, r11)
            if (r11 != 0) goto L_0x0096
            goto L_0x005d
        L_0x0096:
            r3 = r2
        L_0x0097:
            if (r3 == 0) goto L_0x00a2
            r10.f18668f = r5
            android.os.Handler r11 = r10.f18672j
            java.lang.Runnable r0 = r10.f18673k
            r11.removeCallbacks(r0)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayb.mo27834a(android.view.MotionEvent):void");
    }

    /* renamed from: b */
    public final void mo27838b(String str) {
        this.f18664b = str;
    }

    /* renamed from: c */
    public final void mo27840c(String str) {
        this.f18667e = str;
    }

    /* renamed from: d */
    public final void mo27842d(String str) {
        this.f18666d = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f18664b);
        sb.append(",DebugSignal: ");
        sb.append(this.f18667e);
        sb.append(",AFMA Version: ");
        sb.append(this.f18666d);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f18665c);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo27837b() {
        zzk.zzlq().mo27846a(this.f18663a, this.f18665c, this.f18666d, this.f18667e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo27839c() {
        zzk.zzlq().mo27845a(this.f18663a, this.f18665c, this.f18666d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo27841d() {
        this.f18668f = 4;
        mo27832a();
    }

    public zzayb(Context context, String str) {
        this(context);
        this.f18664b = str;
    }

    /* renamed from: a */
    private final boolean m20381a(float f, float f2, float f3, float f4) {
        return Math.abs(this.f18670h.x - f) < ((float) this.f18669g) && Math.abs(this.f18670h.y - f2) < ((float) this.f18669g) && Math.abs(this.f18671i.x - f3) < ((float) this.f18669g) && Math.abs(this.f18671i.y - f4) < ((float) this.f18669g);
    }

    /* renamed from: a */
    public final void mo27832a() {
        try {
            if (!(this.f18663a instanceof Activity)) {
                zzbad.m20521c("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(zzk.zzlq().mo27844a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = zzk.zzlq().mo27847b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a = m20380a((List<String>) arrayList, "Ad Information", true);
            int a2 = m20380a((List<String>) arrayList, str, true);
            int a3 = m20380a((List<String>) arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f18663a, zzk.zzli().mo27825c());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new C7757n5(this, a, a2, a3));
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            zzawz.m20168e("", e);
        }
    }

    /* renamed from: a */
    public final void mo27835a(String str) {
        this.f18665c = str;
    }

    /* renamed from: a */
    private static int m20380a(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo27836a(String str, DialogInterface dialogInterface, int i) {
        zzk.zzlg();
        zzaxi.m20273a(this.f18663a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006e, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0073;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo27833a(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L_0x009b
            android.content.Context r1 = r0.f18663a
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.zzbad.m20521c(r1)
            return
        L_0x000e:
            java.lang.String r1 = r0.f18664b
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.zzk.zzlg()
            java.util.Map r1 = com.google.android.gms.internal.ads.zzaxi.m20271a((android.net.Uri) r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x003f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L_0x003f
        L_0x0062:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            java.lang.String r1 = "No debug information"
        L_0x0073:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.f18663a
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            com.google.android.gms.internal.ads.o5 r3 = new com.google.android.gms.internal.ads.o5
            r3.<init>(r0, r1)
            java.lang.String r1 = "Share"
            r2.setPositiveButton(r1, r3)
            android.content.DialogInterface$OnClickListener r1 = com.google.android.gms.internal.ads.C7831p5.f16559f
            java.lang.String r3 = "Close"
            r2.setNegativeButton(r3, r1)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L_0x009b:
            if (r5 != r2) goto L_0x00ab
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.zzbad.m20516a((java.lang.String) r1)
            com.google.android.gms.internal.ads.q5 r1 = new com.google.android.gms.internal.ads.q5
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzaxg.m20259a((java.lang.Runnable) r1)
            return
        L_0x00ab:
            if (r5 != r3) goto L_0x00ba
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.zzbad.m20516a((java.lang.String) r1)
            com.google.android.gms.internal.ads.r5 r1 = new com.google.android.gms.internal.ads.r5
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzaxg.m20259a((java.lang.Runnable) r1)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayb.mo27833a(int, int, int, android.content.DialogInterface, int):void");
    }
}
