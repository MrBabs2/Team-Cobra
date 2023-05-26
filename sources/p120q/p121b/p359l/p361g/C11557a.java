package p120q.p121b.p359l.p361g;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: q.b.l.g.a */
/* compiled from: DebugMetaInterface */
public class C11557a implements C11565h {

    /* renamed from: f */
    private ArrayList<C11558a> f30852f = new ArrayList<>();

    /* renamed from: q.b.l.g.a$a */
    /* compiled from: DebugMetaInterface */
    public static class C11558a implements Serializable {

        /* renamed from: f */
        private final String f30853f;

        /* renamed from: g */
        private final String f30854g;

        public C11558a(String str) {
            this(str, "proguard");
        }

        /* renamed from: a */
        public String mo37725a() {
            return this.f30854g;
        }

        /* renamed from: b */
        public String mo37726b() {
            return this.f30853f;
        }

        public String toString() {
            return "DebugImage{uuid='" + this.f30853f + '\'' + ", type='" + this.f30854g + '\'' + '}';
        }

        public C11558a(String str, String str2) {
            this.f30853f = str;
            this.f30854g = str2;
        }
    }

    /* renamed from: a */
    public ArrayList<C11558a> mo37720a() {
        return this.f30852f;
    }

    public int hashCode() {
        return this.f30852f.hashCode();
    }

    public String toString() {
        return "DebugMetaInterface{debugImages=" + this.f30852f + '}';
    }

    /* renamed from: y */
    public String mo37724y() {
        return "debug_meta";
    }

    /* renamed from: a */
    public void mo37721a(C11558a aVar) {
        this.f30852f.add(aVar);
    }
}
