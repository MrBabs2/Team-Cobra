package com.squareup.moshi.p207v.p208a;

import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.C8939o;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.p206u.C8973c;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.C9157f;
import kotlin.p045h0.C9162i;
import kotlin.p045h0.C9166k;
import kotlin.p045h0.C9173n;
import kotlin.p262y.C10495c;
import kotlin.p262y.C10525m;
import p015cm.aptoide.p016pt.database.room.RoomNotification;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002 !BU\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0006\u0012\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001fH\u0016R'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, mo16641d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "constructor", "Lkotlin/reflect/KFunction;", "allBindings", "", "Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "", "nonTransientBindings", "options", "Lcom/squareup/moshi/JsonReader$Options;", "(Lkotlin/reflect/KFunction;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/JsonReader$Options;)V", "getAllBindings", "()Ljava/util/List;", "getConstructor", "()Lkotlin/reflect/KFunction;", "getNonTransientBindings", "getOptions", "()Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "toString", "", "Binding", "IndexedParameterMap", "moshi-kotlin"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: com.squareup.moshi.v.a.a */
/* compiled from: KotlinJsonAdapter.kt */
public final class C8977a<T> extends C8924f<T> {

    /* renamed from: a */
    private final C9157f<T> f25474a;

    /* renamed from: b */
    private final List<C8978a<T, Object>> f25475b;

    /* renamed from: c */
    private final List<C8978a<T, Object>> f25476c;

    /* renamed from: d */
    private final C8930i.C8931a f25477d;

    /* renamed from: com.squareup.moshi.v.a.a$a */
    /* compiled from: KotlinJsonAdapter.kt */
    public static final class C8978a<K, P> {

        /* renamed from: a */
        private final String f25478a;

        /* renamed from: b */
        private final String f25479b;

        /* renamed from: c */
        private final C8924f<P> f25480c;

        /* renamed from: d */
        private final C9173n<K, P> f25481d;

        /* renamed from: e */
        private final C9166k f25482e;

        /* renamed from: f */
        private final int f25483f;

        public C8978a(String str, String str2, C8924f<P> fVar, C9173n<K, ? extends P> nVar, C9166k kVar, int i) {
            C10202j.m34178b(str, "name");
            C10202j.m34178b(fVar, "adapter");
            C10202j.m34178b(nVar, "property");
            this.f25478a = str;
            this.f25479b = str2;
            this.f25480c = fVar;
            this.f25481d = nVar;
            this.f25482e = kVar;
            this.f25483f = i;
        }

        /* renamed from: a */
        public static /* synthetic */ C8978a m29548a(C8978a aVar, String str, String str2, C8924f<P> fVar, C9173n<K, P> nVar, C9166k kVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.f25478a;
            }
            if ((i2 & 2) != 0) {
                str2 = aVar.f25479b;
            }
            String str3 = str2;
            if ((i2 & 4) != 0) {
                fVar = aVar.f25480c;
            }
            C8924f<P> fVar2 = fVar;
            if ((i2 & 8) != 0) {
                nVar = aVar.f25481d;
            }
            C9173n<K, P> nVar2 = nVar;
            if ((i2 & 16) != 0) {
                kVar = aVar.f25482e;
            }
            C9166k kVar2 = kVar;
            if ((i2 & 32) != 0) {
                i = aVar.f25483f;
            }
            return aVar.mo33019a(str, str3, fVar2, nVar2, kVar2, i);
        }

        /* renamed from: a */
        public final C8924f<P> mo33018a() {
            return this.f25480c;
        }

        /* renamed from: a */
        public final C8978a<K, P> mo33019a(String str, String str2, C8924f<P> fVar, C9173n<K, ? extends P> nVar, C9166k kVar, int i) {
            C10202j.m34178b(str, "name");
            C10202j.m34178b(fVar, "adapter");
            C10202j.m34178b(nVar, "property");
            return new C8978a(str, str2, fVar, nVar, kVar, i);
        }

        /* renamed from: b */
        public final String mo33022b() {
            return this.f25479b;
        }

        /* renamed from: c */
        public final String mo33023c() {
            return this.f25478a;
        }

        /* renamed from: d */
        public final C9173n<K, P> mo33024d() {
            return this.f25481d;
        }

        /* renamed from: e */
        public final int mo33025e() {
            return this.f25483f;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8978a) {
                    C8978a aVar = (C8978a) obj;
                    if (C10202j.m34176a((Object) this.f25478a, (Object) aVar.f25478a) && C10202j.m34176a((Object) this.f25479b, (Object) aVar.f25479b) && C10202j.m34176a((Object) this.f25480c, (Object) aVar.f25480c) && C10202j.m34176a((Object) this.f25481d, (Object) aVar.f25481d) && C10202j.m34176a((Object) this.f25482e, (Object) aVar.f25482e)) {
                        if (this.f25483f == aVar.f25483f) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f25478a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f25479b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            C8924f<P> fVar = this.f25480c;
            int hashCode3 = (hashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 31;
            C9173n<K, P> nVar = this.f25481d;
            int hashCode4 = (hashCode3 + (nVar != null ? nVar.hashCode() : 0)) * 31;
            C9166k kVar = this.f25482e;
            if (kVar != null) {
                i = kVar.hashCode();
            }
            return ((hashCode4 + i) * 31) + this.f25483f;
        }

        public String toString() {
            return "Binding(name=" + this.f25478a + ", jsonName=" + this.f25479b + ", adapter=" + this.f25480c + ", property=" + this.f25481d + ", parameter=" + this.f25482e + ", propertyIndex=" + this.f25483f + ")";
        }

        /* renamed from: a */
        public final P mo33020a(K k) {
            return this.f25481d.get(k);
        }

        /* renamed from: a */
        public final void mo33021a(K k, P p) {
            if (p != C8981c.f25487b) {
                C9173n<K, P> nVar = this.f25481d;
                if (nVar != null) {
                    ((C9162i) nVar).mo33515a(k, p);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K, P>");
            }
        }
    }

    /* renamed from: com.squareup.moshi.v.a.a$b */
    /* compiled from: KotlinJsonAdapter.kt */
    public static final class C8979b extends C10495c<C9166k, Object> {

        /* renamed from: h */
        private final List<C9166k> f25484h;

        /* renamed from: i */
        private final Object[] f25485i;

        public C8979b(List<? extends C9166k> list, Object[] objArr) {
            C10202j.m34178b(list, "parameterKeys");
            C10202j.m34178b(objArr, "parameterValues");
            this.f25484h = list;
            this.f25485i = objArr;
        }

        /* renamed from: a */
        public /* bridge */ Object mo33029a(C9166k kVar, Object obj) {
            return super.getOrDefault(kVar, obj);
        }

        /* renamed from: b */
        public Object mo33032b(C9166k kVar) {
            C10202j.m34178b(kVar, RoomNotification.KEY);
            Object obj = this.f25485i[kVar.mo33516e()];
            if (obj != C8981c.f25487b) {
                return obj;
            }
            return null;
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof C9166k) {
                return mo33031a((C9166k) obj);
            }
            return false;
        }

        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof C9166k) {
                return mo33032b((C9166k) obj);
            }
            return null;
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return obj instanceof C9166k ? mo33029a((C9166k) obj, obj2) : obj2;
        }

        /* renamed from: a */
        public Set<Map.Entry<C9166k, Object>> mo33030a() {
            List<C9166k> list = this.f25484h;
            ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new AbstractMap.SimpleEntry((C9166k) next, this.f25485i[i]));
                    i = i2;
                } else {
                    C10525m.m35693c();
                    throw null;
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next2 : arrayList) {
                if (((AbstractMap.SimpleEntry) next2).getValue() != C8981c.f25487b) {
                    linkedHashSet.add(next2);
                }
            }
            return linkedHashSet;
        }

        /* renamed from: a */
        public boolean mo33031a(C9166k kVar) {
            C10202j.m34178b(kVar, RoomNotification.KEY);
            return this.f25485i[kVar.mo33516e()] != C8981c.f25487b;
        }
    }

    public C8977a(C9157f<? extends T> fVar, List<C8978a<T, Object>> list, List<C8978a<T, Object>> list2, C8930i.C8931a aVar) {
        C10202j.m34178b(fVar, "constructor");
        C10202j.m34178b(list, "allBindings");
        C10202j.m34178b(list2, "nonTransientBindings");
        C10202j.m34178b(aVar, "options");
        this.f25474a = fVar;
        this.f25475b = list;
        this.f25476c = list2;
        this.f25477d = aVar;
    }

    public T fromJson(C8930i iVar) {
        C10202j.m34178b(iVar, "reader");
        int size = this.f25474a.getParameters().size();
        int size2 = this.f25475b.size();
        Object[] objArr = new Object[size2];
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            objArr[i2] = C8981c.f25487b;
        }
        iVar.mo32868b();
        while (iVar.mo32874m()) {
            int a = iVar.mo32861a(this.f25477d);
            if (a == -1) {
                iVar.mo32884y();
                iVar.mo32885z();
            } else {
                C8978a aVar = this.f25476c.get(a);
                int e = aVar.mo33025e();
                if (objArr[e] == C8981c.f25487b) {
                    objArr[e] = aVar.mo33018a().fromJson(iVar);
                    if (objArr[e] == null && !aVar.mo33024d().getReturnType().mo33528c()) {
                        JsonDataException b = C8973c.m29543b(aVar.mo33024d().getName(), aVar.mo33022b(), iVar);
                        C10202j.m34174a((Object) b, "Util.unexpectedNull(\n   …         reader\n        )");
                        throw b;
                    }
                } else {
                    throw new JsonDataException("Multiple values for '" + aVar.mo33024d().getName() + "' at " + iVar.getPath());
                }
            }
        }
        iVar.mo32872i();
        while (true) {
            String str = null;
            if (i < size) {
                if (objArr[i] == C8981c.f25487b && !this.f25474a.getParameters().get(i).mo33520h()) {
                    if (!this.f25474a.getParameters().get(i).getType().mo33528c()) {
                        String name = this.f25474a.getParameters().get(i).getName();
                        C8978a aVar2 = this.f25475b.get(i);
                        if (aVar2 != null) {
                            str = aVar2.mo33022b();
                        }
                        JsonDataException a2 = C8973c.m29530a(name, str, iVar);
                        C10202j.m34174a((Object) a2, "Util.missingProperty(\n  …       reader\n          )");
                        throw a2;
                    }
                    objArr[i] = null;
                }
                i++;
            } else {
                T callBy = this.f25474a.callBy(new C8979b(this.f25474a.getParameters(), objArr));
                int size3 = this.f25475b.size();
                while (size < size3) {
                    C8978a<T, Object> aVar3 = this.f25475b.get(size);
                    if (aVar3 != null) {
                        aVar3.mo33021a(callBy, objArr[size]);
                        size++;
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                }
                return callBy;
            }
        }
    }

    public void toJson(C8939o oVar, T t) {
        C10202j.m34178b(oVar, "writer");
        if (t != null) {
            oVar.mo32893b();
            for (C8978a next : this.f25475b) {
                if (next != null) {
                    oVar.mo32892a(next.mo33023c());
                    next.mo33018a().toJson(oVar, next.mo33020a(t));
                }
            }
            oVar.mo32901l();
            return;
        }
        throw new NullPointerException("value == null");
    }

    public String toString() {
        return "KotlinJsonAdapter(" + this.f25474a.getReturnType() + ')';
    }
}
