package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzcan {

    /* renamed from: a */
    private final Clock f19861a;

    /* renamed from: b */
    private final Executor f19862b;

    public zzcan(zzayu zzayu, Clock clock, Executor executor) {
        this.f19861a = clock;
        this.f19862b = executor;
    }

    /* renamed from: a */
    public final zzbbh<Bitmap> mo28618a(String str, double d, boolean z) {
        return zzbar.m20543a(zzayu.m20419a(str), new C7657kg(this, d, z), this.f19862b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Bitmap m22279a(byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17891c3)).booleanValue()) {
            options.inJustDecodeBounds = true;
            m22280a(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                int i2 = i - 1;
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros(i2 / ((Integer) zzyt.m25670e().mo27163a(zzacu.f17896d3)).intValue())) / 2);
            }
        }
        return m22280a(bArr, options);
    }

    /* renamed from: a */
    private final Bitmap m22280a(byte[] bArr, BitmapFactory.Options options) {
        long c = this.f19861a.mo25499c();
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long c2 = this.f19861a.mo25499c();
        if (Build.VERSION.SDK_INT >= 19 && decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j = c2 - c;
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            }
            StringBuilder sb = new StringBuilder(108);
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            zzawz.m20167e(sb.toString());
        }
        return decodeByteArray;
    }
}
