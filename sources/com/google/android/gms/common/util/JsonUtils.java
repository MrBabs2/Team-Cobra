package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@KeepForSdk
@VisibleForTesting
public final class JsonUtils {

    /* renamed from: a */
    private static final Pattern f14270a = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    static {
        Pattern.compile("\\\\.");
    }

    private JsonUtils() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static String m16282a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f14270a.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == 12) {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (charAt == 13) {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case 8:
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case 9:
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case 10:
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
