package p036io.rakam.api;

import java.util.HashSet;
import java.util.Set;

/* renamed from: io.rakam.api.j */
/* compiled from: TrackingOptions */
public class C9027j {

    /* renamed from: a */
    Set<String> f25560a = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo33376a() {
        return m29678a("adid");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo33377b() {
        return m29678a("carrier");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo33378c() {
        return m29678a("country");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo33379d() {
        return m29678a("device_brand");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo33380e() {
        return m29678a("device_manufacturer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo33381f() {
        return m29678a("device_model");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo33382g() {
        return m29678a("language");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo33383h() {
        return m29678a("lat_lng");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo33384i() {
        return m29678a("os_name");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo33385j() {
        return m29678a("os_version");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo33386k() {
        return m29678a("platform");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo33387l() {
        return m29678a("version_name");
    }

    /* renamed from: a */
    private boolean m29678a(String str) {
        return !this.f25560a.contains(str);
    }
}
