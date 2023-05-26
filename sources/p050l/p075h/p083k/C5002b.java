package p050l.p075h.p083k;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* renamed from: l.h.k.b */
/* compiled from: LogWriter */
public class C5002b extends Writer {

    /* renamed from: f */
    private final String f8860f;

    /* renamed from: g */
    private StringBuilder f8861g = new StringBuilder(128);

    public C5002b(String str) {
        this.f8860f = str;
    }

    /* renamed from: a */
    private void m8887a() {
        if (this.f8861g.length() > 0) {
            Log.d(this.f8860f, this.f8861g.toString());
            StringBuilder sb = this.f8861g;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m8887a();
    }

    public void flush() {
        m8887a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m8887a();
            } else {
                this.f8861g.append(c);
            }
        }
    }
}
