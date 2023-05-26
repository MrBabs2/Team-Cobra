package p112n.p312h.p313a.p318f0;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: n.h.a.f0.f */
/* compiled from: FileDownloadUtils */
public class C10771f {

    /* renamed from: a */
    private static int f28834a = 65536;

    /* renamed from: b */
    private static long f28835b = 2000;

    /* renamed from: c */
    private static String f28836c;

    /* renamed from: d */
    private static Boolean f28837d;

    /* renamed from: e */
    private static final Pattern f28838e = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    /* renamed from: a */
    public static void m36505a(int i) throws IllegalAccessException {
        if (m36511b(C10763c.m36479a())) {
            f28834a = i;
            return;
        }
        throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-step'.");
    }

    /* renamed from: b */
    public static int m36508b() {
        return f28834a;
    }

    /* renamed from: c */
    public static long m36512c() {
        return f28835b;
    }

    /* renamed from: d */
    public static String m36515d(String str) {
        return m36502a(m36501a(), m36513c(str));
    }

    /* renamed from: e */
    public static long m36517e(String str) {
        StatFs statFs = new StatFs(str);
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBytes();
        }
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    /* renamed from: f */
    public static String m36518f(String str) {
        char c;
        int length = str.length();
        int i = 2;
        int i2 = (File.separatorChar == '\\' && length > 2 && str.charAt(1) == ':') ? 2 : 0;
        int lastIndexOf = str.lastIndexOf(File.separatorChar);
        if (lastIndexOf != -1 || i2 <= 0) {
            i = lastIndexOf;
        }
        if (i == -1 || str.charAt(length - 1) == (c = File.separatorChar)) {
            return null;
        }
        if (str.indexOf(c) == i && str.charAt(i2) == File.separatorChar) {
            return str.substring(0, i + 1);
        }
        return str.substring(0, i);
    }

    /* renamed from: g */
    public static String m36519g(String str) {
        return m36504a("%s.temp", str);
    }

    /* renamed from: h */
    public static String m36520h(String str) {
        return "FileDownloader-" + str;
    }

    /* renamed from: i */
    public static boolean m36521i(String str) {
        return true;
    }

    /* renamed from: j */
    private static String m36522j(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                byte b2 = b & 255;
                if (b2 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(b2));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Huh, MD5 should be supported?", e);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e2);
        }
    }

    /* renamed from: k */
    public static String m36523k(String str) {
        if (str == null) {
            return null;
        }
        try {
            Matcher matcher = f28838e.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        } catch (IllegalStateException unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static int m36509b(String str, String str2) {
        return m36499a(str, str2, false);
    }

    /* renamed from: c */
    public static String m36513c(String str) {
        return m36522j(str);
    }

    /* renamed from: d */
    public static boolean m36516d() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) C10763c.m36479a().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m36511b(Context context) {
        Boolean bool = f28837d;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        if (!C10768e.m36497a().f28830d) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        z = next.processName.endsWith(":filedownloader");
                        break;
                    }
                }
            } else {
                C10767d.m36495e(C10771f.class, "The running app process info list from ActivityManager is null or empty, maybe current App is not running.", new Object[0]);
                return false;
            }
        } else {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f28837d = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: c */
    public static void m36514c(Context context) {
        File a = m36500a(context);
        try {
            a.getParentFile().mkdirs();
            a.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m36506a(long j) throws IllegalAccessException {
        if (m36511b(C10763c.m36479a())) {
            f28835b = j;
            return;
        }
        throw new IllegalAccessException("This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-time'.");
    }

    /* renamed from: a */
    public static String m36501a() {
        if (!TextUtils.isEmpty(f28836c)) {
            return f28836c;
        }
        if (C10763c.m36479a().getExternalCacheDir() == null) {
            return Environment.getDownloadCacheDirectory().getAbsolutePath();
        }
        return C10763c.m36479a().getExternalCacheDir().getAbsolutePath();
    }

    /* renamed from: a */
    public static String m36502a(String str, String str2) {
        if (str2 == null) {
            throw new IllegalStateException("can't generate real path, the file name is null");
        } else if (str != null) {
            return m36504a("%s%s%s", str, File.separator, str2);
        } else {
            throw new IllegalStateException("can't generate real path, the directory is null");
        }
    }

    /* renamed from: a */
    public static int m36499a(String str, String str2, boolean z) {
        if (z) {
            return m36522j(m36504a("%sp%s@dir", str, str2)).hashCode();
        }
        return m36522j(m36504a("%sp%s", str, str2)).hashCode();
    }

    /* renamed from: b */
    public static long m36510b(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m36504a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    /* renamed from: a */
    public static File m36500a(Context context) {
        return new File(context.getFilesDir().getAbsolutePath() + File.separator + "filedownloader", ".old_file_converted");
    }

    /* renamed from: a */
    public static String m36503a(String str, boolean z, String str2) {
        if (str == null) {
            return null;
        }
        if (!z) {
            return str;
        }
        if (str2 == null) {
            return null;
        }
        return m36502a(str, str2);
    }

    /* renamed from: a */
    public static boolean m36507a(String str) {
        return C10763c.m36479a().checkCallingOrSelfPermission(str) == 0;
    }
}
