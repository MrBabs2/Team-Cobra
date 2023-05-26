package kotlin.p262y;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.y.z */
/* compiled from: Maps.kt */
final class C10544z implements Map, Serializable, C10190a {

    /* renamed from: f */
    public static final C10544z f28393f = new C10544z();

    private C10544z() {
    }

    private final Object readResolve() {
        return f28393f;
    }

    /* renamed from: a */
    public Set<Map.Entry> mo36067a() {
        return C10488a0.f28362f;
    }

    /* renamed from: a */
    public boolean mo36068a(Void voidR) {
        C10202j.m34178b(voidR, DonationsAnalytics.VALUE);
        return false;
    }

    /* renamed from: b */
    public Set<Object> mo36069b() {
        return C10488a0.f28362f;
    }

    /* renamed from: c */
    public int mo36070c() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return mo36068a((Void) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Collection mo36074d() {
        return C10543y.f28392f;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return mo36067a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Object get(Object obj) {
        return get(obj);
    }

    public Void get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo36069b();
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo36070c();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo36074d();
    }
}
