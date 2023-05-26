package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: com.google.gson.c */
/* compiled from: FieldNamingPolicy */
public enum C8661c implements C8667d {
    IDENTITY {
        /* renamed from: a */
        public String mo32297a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo32297a(Field field) {
            return C8661c.m28286a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo32297a(Field field) {
            return C8661c.m28286a(C8661c.m28287a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo32297a(Field field) {
            return C8661c.m28287a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo32297a(Field field) {
            return C8661c.m28287a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    static String m28287a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: a */
    static String m28286a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(m28285a(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }

    /* renamed from: a */
    private static String m28285a(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        return c + str.substring(i);
    }
}
