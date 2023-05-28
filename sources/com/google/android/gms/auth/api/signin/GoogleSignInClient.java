package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.util.VisibleForTesting;

public class GoogleSignInClient extends GoogleApi<GoogleSignInOptions> {

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$a */
    private static class C7142a implements PendingResultUtil.ResultConverter<GoogleSignInResult, GoogleSignInAccount> {
        private C7142a() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo24754a(Result result) {
            return ((GoogleSignInResult) result).mo24773a();
        }

        /* synthetic */ C7142a(C7146c cVar) {
            this();
        }
    }

    /* 'enum' modifier removed */
    @VisibleForTesting
    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$b */
    static final class C7143b {

        /* renamed from: a */
        public static final int f13538a = 1;

        /* renamed from: b */
        public static final int f13539b = 3;

        /* renamed from: c */
        public static final int f13540c = 4;

        /* renamed from: d */
        private static final /* synthetic */ int[] f13541d = {1, 2, 3, 4};

        /* renamed from: a */
        public static int[] m15144a() {
            return (int[]) f13541d.clone();
        }
    }

    static {
        new C7142a((C7146c) null);
        int i = C7143b.f13538a;
    }
}
