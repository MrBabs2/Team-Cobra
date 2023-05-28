package p050l.p075h.p076e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import androidx.core.content.p003c.C0398c;
import java.io.IOException;
import java.io.InputStream;
import p050l.p075h.p081i.C4971b;

/* renamed from: l.h.e.i */
/* compiled from: TypefaceCompatApi29Impl */
public class C4959i extends C4960j {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4971b.C4977f mo17376a(C4971b.C4977f[] fVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Typeface mo17375a(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo17364a(android.content.Context r11, android.os.CancellationSignal r12, p050l.p075h.p081i.C4971b.C4977f[] r13, int r14) {
        /*
            r10 = this;
            android.content.ContentResolver r11 = r11.getContentResolver()
            int r0 = r13.length
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = 0
        L_0x0009:
            r5 = 1
            if (r3 >= r0) goto L_0x005e
            r6 = r13[r3]
            android.net.Uri r7 = r6.mo17401c()     // Catch:{ IOException -> 0x005b }
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r11.openFileDescriptor(r7, r8, r12)     // Catch:{ IOException -> 0x005b }
            if (r7 != 0) goto L_0x0020
            if (r7 == 0) goto L_0x005b
        L_0x001c:
            r7.close()     // Catch:{ IOException -> 0x005b }
            goto L_0x005b
        L_0x0020:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x0054 }
            r8.<init>(r7)     // Catch:{ all -> 0x0054 }
            int r9 = r6.mo17402d()     // Catch:{ all -> 0x0054 }
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch:{ all -> 0x0054 }
            boolean r9 = r6.mo17403e()     // Catch:{ all -> 0x0054 }
            if (r9 == 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch:{ all -> 0x0054 }
            int r6 = r6.mo17400b()     // Catch:{ all -> 0x0054 }
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch:{ all -> 0x0054 }
            android.graphics.fonts.Font r5 = r5.build()     // Catch:{ all -> 0x0054 }
            if (r4 != 0) goto L_0x004e
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x0054 }
            r6.<init>(r5)     // Catch:{ all -> 0x0054 }
            r4 = r6
            goto L_0x0051
        L_0x004e:
            r4.addFont(r5)     // Catch:{ all -> 0x0054 }
        L_0x0051:
            if (r7 == 0) goto L_0x005b
            goto L_0x001c
        L_0x0054:
            r5 = move-exception
            if (r7 == 0) goto L_0x005a
            r7.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x005e:
            if (r4 != 0) goto L_0x0061
            return r1
        L_0x0061:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle
            r12 = r14 & 1
            if (r12 == 0) goto L_0x006a
            r12 = 700(0x2bc, float:9.81E-43)
            goto L_0x006c
        L_0x006a:
            r12 = 400(0x190, float:5.6E-43)
        L_0x006c:
            r13 = r14 & 2
            if (r13 == 0) goto L_0x0071
            r2 = 1
        L_0x0071:
            r11.<init>(r12, r2)
            android.graphics.Typeface$CustomFallbackBuilder r12 = new android.graphics.Typeface$CustomFallbackBuilder
            android.graphics.fonts.FontFamily r13 = r4.build()
            r12.<init>(r13)
            android.graphics.Typeface$CustomFallbackBuilder r11 = r12.setStyle(r11)
            android.graphics.Typeface r11 = r11.build()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p076e.C4959i.mo17364a(android.content.Context, android.os.CancellationSignal, l.h.i.b$f[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public Typeface mo17365a(Context context, C0398c.C0400b bVar, Resources resources, int i) {
        C0398c.C0401c[] a = bVar.mo2305a();
        int length = a.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            C0398c.C0401c cVar = a[i3];
            try {
                Font.Builder weight = new Font.Builder(resources, cVar.mo2307b()).setWeight(cVar.mo2310e());
                if (!cVar.mo2311f()) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(cVar.mo2308c()).setFontVariationSettings(cVar.mo2309d()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = (i & 1) != 0 ? 700 : 400;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
    }

    /* renamed from: a */
    public Typeface mo17366a(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }
}
