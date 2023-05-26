package com.facebook;

import com.facebook.internal.C6437k;
import com.facebook.internal.p168a0.p171g.C6393b;
import java.util.Random;

public class FacebookException extends RuntimeException {

    /* renamed from: com.facebook.FacebookException$a */
    class C6334a implements C6437k.C6440c {

        /* renamed from: a */
        final /* synthetic */ String f11611a;

        C6334a(FacebookException facebookException, String str) {
            this.f11611a = str;
        }

        /* renamed from: a */
        public void mo15773a(boolean z) {
            if (z) {
                try {
                    C6393b.m13267a(this.f11611a);
                } catch (Exception unused) {
                }
            }
        }
    }

    public FacebookException() {
    }

    public String toString() {
        return getMessage();
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str != null && C4716f.m7713v() && random.nextInt(100) > 50) {
            C6437k.m13338a(C6437k.C6441d.ErrorReport, new C6334a(this, str));
        }
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
