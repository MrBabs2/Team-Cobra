package com.bumptech.glide.load.p150n;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.j */
/* compiled from: LazyHeaders */
public final class C6091j implements C6088h {

    /* renamed from: b */
    private final Map<String, List<C6090i>> f11172b;

    /* renamed from: c */
    private volatile Map<String, String> f11173c;

    /* renamed from: com.bumptech.glide.load.n.j$a */
    /* compiled from: LazyHeaders */
    public static final class C6092a {

        /* renamed from: b */
        private static final String f11174b = m12259b();

        /* renamed from: c */
        private static final Map<String, List<C6090i>> f11175c;

        /* renamed from: a */
        private Map<String, List<C6090i>> f11176a = f11175c;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f11174b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C6093b(f11174b)));
            }
            f11175c = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m12259b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C6091j mo20394a() {
            return new C6091j(this.f11176a);
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$b */
    /* compiled from: LazyHeaders */
    static final class C6093b implements C6090i {

        /* renamed from: a */
        private final String f11177a;

        C6093b(String str) {
            this.f11177a = str;
        }

        /* renamed from: a */
        public String mo20390a() {
            return this.f11177a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6093b) {
                return this.f11177a.equals(((C6093b) obj).f11177a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11177a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f11177a + '\'' + '}';
        }
    }

    C6091j(Map<String, List<C6090i>> map) {
        this.f11172b = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private Map<String, String> m12257b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f11172b.entrySet()) {
            String a = m12256a((List) next.getValue());
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(next.getKey(), a);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo20389a() {
        if (this.f11173c == null) {
            synchronized (this) {
                if (this.f11173c == null) {
                    this.f11173c = Collections.unmodifiableMap(m12257b());
                }
            }
        }
        return this.f11173c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6091j) {
            return this.f11172b.equals(((C6091j) obj).f11172b);
        }
        return false;
    }

    public int hashCode() {
        return this.f11172b.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f11172b + '}';
    }

    /* renamed from: a */
    private String m12256a(List<C6090i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo20390a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }
}
