package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.reflect.Method;

@KeepForSdk
public class WorkSourceUtil {
    static {
        Process.myUid();
        m16304e();
        m16305f();
        m16306g();
        m16300a();
        m16301b();
        m16302c();
        m16303d();
    }

    private WorkSourceUtil() {
    }

    /* renamed from: a */
    private static Method m16300a() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Method m16301b() {
        if (PlatformVersion.m16289e()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static final Method m16302c() {
        if (PlatformVersion.m16296l()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: d */
    private static final Method m16303d() {
        if (PlatformVersion.m16296l()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    private static Method m16304e() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static Method m16305f() {
        if (PlatformVersion.m16289e()) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: g */
    private static Method m16306g() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
