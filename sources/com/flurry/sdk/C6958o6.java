package com.flurry.sdk;

import android.os.SystemClock;
import com.flurry.sdk.C6976p6;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.flurry.sdk.o6 */
public final class C6958o6 extends C7008r6 {

    /* renamed from: e */
    private static String f13057e = "UserPropertiesFrame";

    /* renamed from: f */
    private static final AtomicInteger f13058f = new AtomicInteger(0);

    private C6958o6(C7031t6 t6Var) {
        super(t6Var);
    }

    /* renamed from: a */
    public final C7023s6 mo23538a() {
        return C7023s6.USER_PROPERTY;
    }

    /* renamed from: a */
    private static void m14775a(String str, String str2, C6976p6.C6977a aVar) {
        m14776a(str, (List<String>) str2 == null ? Collections.emptyList() : Collections.singletonList(str2), aVar);
    }

    /* renamed from: a */
    private static void m14776a(String str, List<String> list, C6976p6.C6977a aVar) {
        C6925m2.m14707a().mo23649a(new C6958o6(new C6976p6(f13058f.incrementAndGet(), SystemClock.elapsedRealtime(), str, list, aVar)));
    }

    /* renamed from: a */
    public static void m14774a(String str, String str2) {
        if (str2 == null) {
            C6792d1.m14476a(2, f13057e, "User Property is null, do not send the frame.");
        } else {
            m14775a(str, str2, C6976p6.C6977a.Add);
        }
    }
}
