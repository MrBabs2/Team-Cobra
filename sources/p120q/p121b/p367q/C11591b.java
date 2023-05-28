package p120q.p121b.p367q;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: q.b.q.b */
/* compiled from: Util */
public final class C11591b {
    private C11591b() {
    }

    /* renamed from: a */
    public static boolean m37916a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static Map<String, String> m37919b(String str) {
        return m37915a(str, "extras");
    }

    /* renamed from: c */
    public static Set<String> m37920c(String str) {
        if (m37917a(str)) {
            return Collections.emptySet();
        }
        return new HashSet(Arrays.asList(str.split(",")));
    }

    /* renamed from: d */
    public static Map<String, String> m37921d(String str) {
        return m37915a(str, "tags");
    }

    /* renamed from: a */
    public static boolean m37917a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    private static Map<String, String> m37915a(String str, String str2) {
        if (m37917a(str)) {
            return Collections.emptyMap();
        }
        String[] split = str.split(",");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = split.length;
        int i = 0;
        while (i < length) {
            String str3 = split[i];
            String[] split2 = str3.split(":");
            if (split2.length == 2) {
                linkedHashMap.put(split2[0], split2[1]);
                i++;
            } else {
                throw new IllegalArgumentException("Invalid " + str2 + " entry: " + str3);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static Integer m37912a(String str, Integer num) {
        if (m37917a(str)) {
            return num;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    /* renamed from: a */
    public static Long m37913a(String str, Long l) {
        if (m37917a(str)) {
            return l;
        }
        return Long.valueOf(Long.parseLong(str));
    }

    /* renamed from: a */
    public static Double m37911a(String str, Double d) {
        if (m37917a(str)) {
            return d;
        }
        return Double.valueOf(Double.parseDouble(str));
    }

    /* renamed from: a */
    public static String m37914a(String str, int i) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 3) + "...";
    }

    /* renamed from: a */
    public static boolean m37918a(Thread thread) {
        try {
            return Runtime.getRuntime().removeShutdownHook(thread);
        } catch (IllegalStateException e) {
            if (e.getMessage().equals("Shutdown in progress")) {
                return false;
            }
            throw e;
        }
    }
}
