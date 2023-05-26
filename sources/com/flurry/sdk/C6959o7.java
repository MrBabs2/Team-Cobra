package com.flurry.sdk;

import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.o7 */
public final class C6959o7 {
    /* renamed from: a */
    public static Map<String, String> m14778a() {
        HashMap hashMap = new HashMap();
        m14779a(hashMap);
        m14780b(hashMap);
        m14782d(hashMap);
        m14785g(hashMap);
        m14786h(hashMap);
        m14781c(hashMap);
        m14783e(hashMap);
        m14784f(hashMap);
        return hashMap;
    }

    /* renamed from: b */
    private static void m14780b(Map<String, String> map) {
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            map.put("mem.pss", Long.toString((long) (memoryInfo.getTotalPss() * 1024)));
        } catch (RuntimeException e) {
            C6792d1.m14477a(6, "CrashParameterCollector", "Error retrieving pss memory", e);
        }
    }

    /* renamed from: c */
    private static void m14781c(Map<String, String> map) {
        BufferedReader bufferedReader;
        Pattern compile = Pattern.compile("^Vm(RSS|Size|Peak):\\s+(\\d+)\\s+kB$");
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(new File(new File("/proc/" + Integer.toString(Process.myPid())), "status"));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
            } catch (IOException e) {
                e = e;
                bufferedReader = null;
                fileInputStream = fileInputStream2;
                try {
                    C6792d1.m14477a(6, "CrashParameterCollector", "Error getting proc file Info", e);
                    C6766c2.m14420a((Closeable) fileInputStream);
                    C6766c2.m14420a((Closeable) bufferedReader);
                } catch (Throwable th) {
                    th = th;
                    C6766c2.m14420a((Closeable) fileInputStream);
                    C6766c2.m14420a((Closeable) bufferedReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                fileInputStream = fileInputStream2;
                C6766c2.m14420a((Closeable) fileInputStream);
                C6766c2.m14420a((Closeable) bufferedReader);
                throw th;
            }
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    Matcher matcher = compile.matcher(readLine);
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (!TextUtils.isEmpty(group)) {
                            if (!TextUtils.isEmpty(group2)) {
                                char c = 65535;
                                int hashCode = group.hashCode();
                                if (hashCode != 81458) {
                                    if (hashCode != 2483455) {
                                        if (hashCode == 2577441) {
                                            if (group.equals("Size")) {
                                                c = 1;
                                            }
                                        }
                                    } else if (group.equals("Peak")) {
                                        c = 2;
                                    }
                                } else if (group.equals("RSS")) {
                                    c = 0;
                                }
                                if (c == 0) {
                                    map.put("mem.rss", group2);
                                } else if (c == 1) {
                                    map.put("mem.virt", group2);
                                } else if (c == 2) {
                                    map.put("mem.virt.max", group2);
                                }
                            }
                        }
                    }
                }
                C6766c2.m14420a((Closeable) fileInputStream2);
            } catch (IOException e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                C6792d1.m14477a(6, "CrashParameterCollector", "Error getting proc file Info", e);
                C6766c2.m14420a((Closeable) fileInputStream);
                C6766c2.m14420a((Closeable) bufferedReader);
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                C6766c2.m14420a((Closeable) fileInputStream);
                C6766c2.m14420a((Closeable) bufferedReader);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedReader = null;
            C6792d1.m14477a(6, "CrashParameterCollector", "Error getting proc file Info", e);
            C6766c2.m14420a((Closeable) fileInputStream);
            C6766c2.m14420a((Closeable) bufferedReader);
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            C6766c2.m14420a((Closeable) fileInputStream);
            C6766c2.m14420a((Closeable) bufferedReader);
            throw th;
        }
        C6766c2.m14420a((Closeable) bufferedReader);
    }

    /* renamed from: d */
    private static void m14782d(Map<String, String> map) {
        map.put("application.state", Integer.toString(C6812e7.m14513a().f12704i.mo23603b().f12797f));
    }

    /* renamed from: e */
    private static void m14783e(Map<String, String> map) {
        long j;
        long j2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            j = statFs.getBlockSizeLong();
        } else {
            j = (long) statFs.getBlockSize();
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getAvailableBlocksLong();
        } else {
            j2 = (long) statFs.getAvailableBlocks();
        }
        map.put("disk.size.free", Long.toString(j2 * j));
    }

    /* renamed from: f */
    private static void m14784f(Map<String, String> map) {
        long j;
        long j2;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            j = statFs.getBlockSizeLong();
        } else {
            j = (long) statFs.getBlockSize();
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockCountLong();
        } else {
            j2 = (long) statFs.getBlockCount();
        }
        map.put("disk.size.total", Long.toString(j2 * j));
    }

    /* renamed from: g */
    private static void m14785g(Map<String, String> map) {
        map.put("net.status", Integer.toString(C6812e7.m14513a().f12697b.mo23730g().ordinal()));
    }

    /* renamed from: h */
    private static void m14786h(Map<String, String> map) {
        map.put("orientation", Integer.toString(C6812e7.m14513a().f12698c.f13118o));
    }

    /* renamed from: a */
    private static void m14779a(Map<String, String> map) {
        try {
            map.put("mem.java.max", Long.toString(Runtime.getRuntime().maxMemory()));
        } catch (RuntimeException e) {
            C6792d1.m14477a(6, "CrashParameterCollector", "Error retrieving max memory", e);
        }
    }
}
