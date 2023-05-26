package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@VisibleForTesting
final class v40 {
    @VisibleForTesting

    /* renamed from: a */
    private ByteArrayOutputStream f17003a = new ByteArrayOutputStream(RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT);
    @VisibleForTesting

    /* renamed from: b */
    private Base64OutputStream f17004b = new Base64OutputStream(this.f17003a, 10);

    /* renamed from: a */
    public final void mo26685a(byte[] bArr) throws IOException {
        this.f17004b.write(bArr);
    }

    public final String toString() {
        try {
            this.f17004b.close();
        } catch (IOException e) {
            zzbad.m20520b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f17003a.close();
            return this.f17003a.toString();
        } catch (IOException e2) {
            zzbad.m20520b("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.f17003a = null;
            this.f17004b = null;
        }
    }
}
