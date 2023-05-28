package com.flurry.sdk;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import p112n.p113d.p114a.C10566e;

/* renamed from: com.flurry.sdk.h2 */
public final class C6847h2 {

    /* renamed from: a */
    private static boolean f12814a;

    /* renamed from: b */
    private static boolean f12815b;

    /* renamed from: a */
    public static synchronized void m14568a() {
        synchronized (C6847h2.class) {
            if (!f12814a) {
                try {
                    C6830g1.m14542a((Class<? extends C6846h1>) Class.forName("com.flurry.android.bridge.FlurryBridgeModule"));
                } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                    C6792d1.m14476a(3, "FlurrySDK", "Ads module not available");
                }
                f12814a = true;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m14569a(Context context) {
        synchronized (C6847h2.class) {
            C6830g1.m14543b(context);
        }
    }

    /* renamed from: a */
    public static synchronized void m14570a(List<C10566e> list) {
        synchronized (C6847h2.class) {
            if (!f12815b) {
                if (list != null) {
                    Iterator<C10566e> it = list.iterator();
                    while (it.hasNext()) {
                        C6830g1.m14541a((C6846h1) it.next());
                    }
                }
                f12815b = true;
            }
        }
    }
}
