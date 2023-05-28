package com.facebook.internal;

import android.content.Intent;
import com.facebook.C4716f;
import com.facebook.C6365d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.d */
/* compiled from: CallbackManagerImpl */
public final class C6422d implements C6365d {

    /* renamed from: b */
    private static Map<Integer, C6423a> f11781b = new HashMap();

    /* renamed from: a */
    private Map<Integer, C6423a> f11782a = new HashMap();

    /* renamed from: com.facebook.internal.d$a */
    /* compiled from: CallbackManagerImpl */
    public interface C6423a {
        /* renamed from: a */
        boolean mo20972a(int i, Intent intent);
    }

    /* renamed from: com.facebook.internal.d$b */
    /* compiled from: CallbackManagerImpl */
    public enum C6424b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10);
        

        /* renamed from: f */
        private final int f11795f;

        private C6424b(int i) {
            this.f11795f = i;
        }

        /* renamed from: a */
        public int mo20973a() {
            return C4716f.m7701j() + this.f11795f;
        }
    }

    /* renamed from: a */
    private static synchronized C6423a m13308a(Integer num) {
        C6423a aVar;
        synchronized (C6422d.class) {
            aVar = f11781b.get(num);
        }
        return aVar;
    }

    /* renamed from: b */
    public static synchronized void m13310b(int i, C6423a aVar) {
        synchronized (C6422d.class) {
            C6481y.m13556a((Object) aVar, "callback");
            if (!f11781b.containsKey(Integer.valueOf(i))) {
                f11781b.put(Integer.valueOf(i), aVar);
            }
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        C6423a aVar = this.f11782a.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.mo20972a(i2, intent);
        }
        return m13309a(i, i2, intent);
    }

    /* renamed from: a */
    private static boolean m13309a(int i, int i2, Intent intent) {
        C6423a a = m13308a(Integer.valueOf(i));
        if (a != null) {
            return a.mo20972a(i2, intent);
        }
        return false;
    }

    /* renamed from: a */
    public void mo20971a(int i, C6423a aVar) {
        C6481y.m13556a((Object) aVar, "callback");
        this.f11782a.put(Integer.valueOf(i), aVar);
    }
}
