package androidx.room.p006t;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p050l.p103q.p104a.C5165b;

/* renamed from: androidx.room.t.g */
/* compiled from: TableInfo */
public class C0781g {

    /* renamed from: a */
    public final String f2855a;

    /* renamed from: b */
    public final Map<String, C0782a> f2856b;

    /* renamed from: c */
    public final Set<C0783b> f2857c;

    /* renamed from: d */
    public final Set<C0785d> f2858d;

    /* renamed from: androidx.room.t.g$a */
    /* compiled from: TableInfo */
    public static class C0782a {

        /* renamed from: a */
        public final String f2859a;

        /* renamed from: b */
        public final String f2860b;

        /* renamed from: c */
        public final int f2861c;

        /* renamed from: d */
        public final boolean f2862d;

        /* renamed from: e */
        public final int f2863e;

        /* renamed from: f */
        public final String f2864f;

        /* renamed from: g */
        private final int f2865g;

        @Deprecated
        public C0782a(String str, String str2, boolean z, int i) {
            this(str, str2, z, i, (String) null, 0);
        }

        /* renamed from: a */
        private static int m3552a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0782a.class != obj.getClass()) {
                return false;
            }
            C0782a aVar = (C0782a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f2863e != aVar.f2863e) {
                    return false;
                }
            } else if (mo4460a() != aVar.mo4460a()) {
                return false;
            }
            if (!this.f2859a.equals(aVar.f2859a) || this.f2862d != aVar.f2862d) {
                return false;
            }
            if (this.f2865g == 1 && aVar.f2865g == 2 && (str3 = this.f2864f) != null && !str3.equals(aVar.f2864f)) {
                return false;
            }
            if (this.f2865g == 2 && aVar.f2865g == 1 && (str2 = aVar.f2864f) != null && !str2.equals(this.f2864f)) {
                return false;
            }
            int i = this.f2865g;
            if ((i == 0 || i != aVar.f2865g || ((str = this.f2864f) == null ? aVar.f2864f == null : str.equals(aVar.f2864f))) && this.f2861c == aVar.f2861c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f2859a.hashCode() * 31) + this.f2861c) * 31) + (this.f2862d ? 1231 : 1237)) * 31) + this.f2863e;
        }

        public String toString() {
            return "Column{name='" + this.f2859a + '\'' + ", type='" + this.f2860b + '\'' + ", affinity='" + this.f2861c + '\'' + ", notNull=" + this.f2862d + ", primaryKeyPosition=" + this.f2863e + ", defaultValue='" + this.f2864f + '\'' + '}';
        }

        public C0782a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f2859a = str;
            this.f2860b = str2;
            this.f2862d = z;
            this.f2863e = i;
            this.f2861c = m3552a(str2);
            this.f2864f = str3;
            this.f2865g = i2;
        }

        /* renamed from: a */
        public boolean mo4460a() {
            return this.f2863e > 0;
        }
    }

    /* renamed from: androidx.room.t.g$b */
    /* compiled from: TableInfo */
    public static class C0783b {

        /* renamed from: a */
        public final String f2866a;

        /* renamed from: b */
        public final String f2867b;

        /* renamed from: c */
        public final String f2868c;

        /* renamed from: d */
        public final List<String> f2869d;

        /* renamed from: e */
        public final List<String> f2870e;

        public C0783b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f2866a = str;
            this.f2867b = str2;
            this.f2868c = str3;
            this.f2869d = Collections.unmodifiableList(list);
            this.f2870e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0783b.class != obj.getClass()) {
                return false;
            }
            C0783b bVar = (C0783b) obj;
            if (this.f2866a.equals(bVar.f2866a) && this.f2867b.equals(bVar.f2867b) && this.f2868c.equals(bVar.f2868c) && this.f2869d.equals(bVar.f2869d)) {
                return this.f2870e.equals(bVar.f2870e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f2866a.hashCode() * 31) + this.f2867b.hashCode()) * 31) + this.f2868c.hashCode()) * 31) + this.f2869d.hashCode()) * 31) + this.f2870e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f2866a + '\'' + ", onDelete='" + this.f2867b + '\'' + ", onUpdate='" + this.f2868c + '\'' + ", columnNames=" + this.f2869d + ", referenceColumnNames=" + this.f2870e + '}';
        }
    }

    /* renamed from: androidx.room.t.g$c */
    /* compiled from: TableInfo */
    static class C0784c implements Comparable<C0784c> {

        /* renamed from: f */
        final int f2871f;

        /* renamed from: g */
        final int f2872g;

        /* renamed from: h */
        final String f2873h;

        /* renamed from: i */
        final String f2874i;

        C0784c(int i, int i2, String str, String str2) {
            this.f2871f = i;
            this.f2872g = i2;
            this.f2873h = str;
            this.f2874i = str2;
        }

        /* renamed from: a */
        public int compareTo(C0784c cVar) {
            int i = this.f2871f - cVar.f2871f;
            return i == 0 ? this.f2872g - cVar.f2872g : i;
        }
    }

    /* renamed from: androidx.room.t.g$d */
    /* compiled from: TableInfo */
    public static class C0785d {

        /* renamed from: a */
        public final String f2875a;

        /* renamed from: b */
        public final boolean f2876b;

        /* renamed from: c */
        public final List<String> f2877c;

        public C0785d(String str, boolean z, List<String> list) {
            this.f2875a = str;
            this.f2876b = z;
            this.f2877c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0785d.class != obj.getClass()) {
                return false;
            }
            C0785d dVar = (C0785d) obj;
            if (this.f2876b != dVar.f2876b || !this.f2877c.equals(dVar.f2877c)) {
                return false;
            }
            if (this.f2875a.startsWith("index_")) {
                return dVar.f2875a.startsWith("index_");
            }
            return this.f2875a.equals(dVar.f2875a);
        }

        public int hashCode() {
            int i;
            if (this.f2875a.startsWith("index_")) {
                i = -1184239155;
            } else {
                i = this.f2875a.hashCode();
            }
            return (((i * 31) + (this.f2876b ? 1 : 0)) * 31) + this.f2877c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f2875a + '\'' + ", unique=" + this.f2876b + ", columns=" + this.f2877c + '}';
        }
    }

    public C0781g(String str, Map<String, C0782a> map, Set<C0783b> set, Set<C0785d> set2) {
        Set<C0785d> set3;
        this.f2855a = str;
        this.f2856b = Collections.unmodifiableMap(map);
        this.f2857c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f2858d = set3;
    }

    /* renamed from: a */
    public static C0781g m3547a(C5165b bVar, String str) {
        return new C0781g(str, m3549b(bVar, str), m3550c(bVar, str), m3551d(bVar, str));
    }

    /* renamed from: b */
    private static Map<String, C0782a> m3549b(C5165b bVar, String str) {
        Cursor c = bVar.mo17852c("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (c.getColumnCount() > 0) {
                int columnIndex = c.getColumnIndex("name");
                int columnIndex2 = c.getColumnIndex("type");
                int columnIndex3 = c.getColumnIndex("notnull");
                int columnIndex4 = c.getColumnIndex("pk");
                int columnIndex5 = c.getColumnIndex("dflt_value");
                while (c.moveToNext()) {
                    String string = c.getString(columnIndex);
                    hashMap.put(string, new C0782a(string, c.getString(columnIndex2), c.getInt(columnIndex3) != 0, c.getInt(columnIndex4), c.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            c.close();
        }
    }

    /* renamed from: c */
    private static Set<C0783b> m3550c(C5165b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor c = bVar.mo17852c("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = c.getColumnIndex(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
            int columnIndex2 = c.getColumnIndex("seq");
            int columnIndex3 = c.getColumnIndex("table");
            int columnIndex4 = c.getColumnIndex("on_delete");
            int columnIndex5 = c.getColumnIndex("on_update");
            List<C0784c> a = m3548a(c);
            int count = c.getCount();
            for (int i = 0; i < count; i++) {
                c.moveToPosition(i);
                if (c.getInt(columnIndex2) == 0) {
                    int i2 = c.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0784c next : a) {
                        if (next.f2871f == i2) {
                            arrayList.add(next.f2873h);
                            arrayList2.add(next.f2874i);
                        }
                    }
                    hashSet.add(new C0783b(c.getString(columnIndex3), c.getString(columnIndex4), c.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            c.close();
        }
    }

    /* renamed from: d */
    private static Set<C0785d> m3551d(C5165b bVar, String str) {
        Cursor c = bVar.mo17852c("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = c.getColumnIndex("name");
            int columnIndex2 = c.getColumnIndex("origin");
            int columnIndex3 = c.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (c.moveToNext()) {
                        if ("c".equals(c.getString(columnIndex2))) {
                            String string = c.getString(columnIndex);
                            boolean z = true;
                            if (c.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C0785d a = m3546a(bVar, string, z);
                            if (a == null) {
                                c.close();
                                return null;
                            }
                            hashSet.add(a);
                        }
                    }
                    c.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            c.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C0785d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0781g.class != obj.getClass()) {
            return false;
        }
        C0781g gVar = (C0781g) obj;
        String str = this.f2855a;
        if (str == null ? gVar.f2855a != null : !str.equals(gVar.f2855a)) {
            return false;
        }
        Map<String, C0782a> map = this.f2856b;
        if (map == null ? gVar.f2856b != null : !map.equals(gVar.f2856b)) {
            return false;
        }
        Set<C0783b> set2 = this.f2857c;
        if (set2 == null ? gVar.f2857c != null : !set2.equals(gVar.f2857c)) {
            return false;
        }
        Set<C0785d> set3 = this.f2858d;
        if (set3 == null || (set = gVar.f2858d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f2855a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C0782a> map = this.f2856b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C0783b> set = this.f2857c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f2855a + '\'' + ", columns=" + this.f2856b + ", foreignKeys=" + this.f2857c + ", indices=" + this.f2858d + '}';
    }

    /* renamed from: a */
    private static List<C0784c> m3548a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0784c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private static C0785d m3546a(C5165b bVar, String str, boolean z) {
        Cursor c = bVar.mo17852c("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = c.getColumnIndex("seqno");
            int columnIndex2 = c.getColumnIndex("cid");
            int columnIndex3 = c.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (c.moveToNext()) {
                        if (c.getInt(columnIndex2) >= 0) {
                            int i = c.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), c.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C0785d dVar = new C0785d(str, z, arrayList);
                    c.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            c.close();
        }
    }
}
