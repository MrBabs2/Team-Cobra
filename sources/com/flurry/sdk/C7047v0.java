package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.v0 */
public final class C7047v0 {

    /* renamed from: a */
    private final File f13259a;

    /* renamed from: b */
    boolean f13260b;

    /* renamed from: c */
    private String f13261c;

    public C7047v0() {
        this(C6747b0.m14386a());
    }

    /* renamed from: a */
    private void m14941a(String str) {
        if (str != null) {
            this.f13261c = str;
        }
    }

    public C7047v0(Context context) {
        new C7065w0();
        this.f13259a = context.getFileStreamPath(".flurryinstallreceiver.");
        C6792d1.m14476a(3, "InstallLogger", "Referrer file name if it exists:  " + this.f13259a);
    }

    /* renamed from: a */
    public final synchronized Map<String, List<String>> mo23724a() {
        if (!this.f13260b) {
            this.f13260b = true;
            C6792d1.m14476a(4, "InstallLogger", "Loading referrer info from file: " + this.f13259a.getAbsolutePath());
            String c = C6749b2.m14394c(this.f13259a);
            C6792d1.m14478a("InstallLogger", "Referrer file contents: ".concat(String.valueOf(c)));
            m14941a(c);
        }
        return C7065w0.m15001a(this.f13261c);
    }
}
