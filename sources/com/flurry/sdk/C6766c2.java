package com.flurry.sdk;

import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: com.flurry.sdk.c2 */
public final class C6766c2 {
    /* renamed from: a */
    public static void m14418a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Must be called from a background thread!");
        }
    }

    /* renamed from: b */
    public static String m14422b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 2);
        } catch (UnsupportedEncodingException e) {
            C6792d1.m14476a(5, "GeneralUtil", "Unsupported UTF-8: " + e.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    public static byte[] m14423c(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i += 2) {
            StringBuilder sb = new StringBuilder(2);
            sb.append(charArray[i]);
            sb.append(charArray[i + 1]);
            bArr[i / 2] = (byte) Integer.parseInt(sb.toString(), 16);
        }
        return bArr;
    }

    /* renamed from: d */
    public static long m14424d(String str) {
        if (str == null) {
            return 0;
        }
        long j = 1125899906842597L;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            j = (j * 31) + ((long) str.charAt(i));
        }
        return j;
    }

    /* renamed from: e */
    private static String m14425e(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("status code")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("<!--|-->")) {
            if (!str2.contains("timestamp")) {
                String trim = str2.trim();
                if (trim.length() > 0) {
                    sb.append("<");
                    sb.append(trim);
                    sb.append(">");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m14416a(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 255) {
            return str;
        }
        return str.substring(0, 255);
    }

    /* renamed from: a */
    public static void m14420a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m14417a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        for (byte b : bArr) {
            sb.append(cArr[(byte) ((b & 240) >> 4)]);
            sb.append(cArr[(byte) (b & 15)]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m14421a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: a */
    public static long m14415a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: a */
    public static void m14419a(int i, String str, String str2, boolean z) {
        if (i >= 100) {
            String a = C6812e7.m14513a().f12706k.mo23570a();
            long b = C6971p2.m14812b("last_streaming_session_id", Long.MIN_VALUE);
            HashMap hashMap = new HashMap();
            hashMap.put("fl.response.code", String.valueOf(i));
            hashMap.put("fl.message", m14425e(str));
            hashMap.put("fl.current.session", Boolean.toString(z));
            hashMap.put("fl.current.session.id", a);
            if (i != 200) {
                C6826g0.m14532b();
                C6826g0.m14531a("Flurry.SDKReport.ServerRequest", hashMap);
            }
            hashMap.put("fl.report.identifier", str2);
            if (b != Long.MIN_VALUE) {
                hashMap.put("fl.last.session.id", String.valueOf(b));
            }
            C6826g0.m14532b();
            C6826g0.m14533b("Flurry.SDKReport.ServerRequest", hashMap);
        }
    }
}
