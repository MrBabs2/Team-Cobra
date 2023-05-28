package p036io.rakam.api;

import android.util.Log;

/* renamed from: io.rakam.api.i */
/* compiled from: RakamLog */
public class C9026i {

    /* renamed from: c */
    protected static C9026i f25557c = new C9026i();

    /* renamed from: a */
    private volatile boolean f25558a = true;

    /* renamed from: b */
    private volatile int f25559b = 4;

    private C9026i() {
    }

    /* renamed from: a */
    public static C9026i m29670a() {
        return f25557c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo33373b(String str, String str2) {
        if (!this.f25558a || this.f25559b > 6) {
            return 0;
        }
        return Log.e(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo33374c(String str, String str2) {
        if (!this.f25558a || this.f25559b > 4) {
            return 0;
        }
        return Log.i(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo33375d(String str, String str2) {
        if (!this.f25558a || this.f25559b > 5) {
            return 0;
        }
        return Log.w(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C9026i mo33372a(int i) {
        this.f25559b = i;
        return f25557c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo33369a(String str, String str2) {
        if (!this.f25558a || this.f25559b > 3) {
            return 0;
        }
        return Log.d(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo33370a(String str, String str2, Throwable th) {
        if (!this.f25558a || this.f25559b > 6) {
            return 0;
        }
        return Log.e(str, str2, th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo33371a(String str, Throwable th) {
        if (!this.f25558a || this.f25559b > 5) {
            return 0;
        }
        return Log.w(str, th);
    }
}
