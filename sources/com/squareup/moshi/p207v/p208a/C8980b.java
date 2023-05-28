package com.squareup.moshi.p207v.p208a;

import com.squareup.moshi.C4746e;
import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.C8952r;
import com.squareup.moshi.C8970t;
import com.squareup.moshi.p206u.C8973c;
import com.squareup.moshi.p207v.p208a.C8977a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10187b0;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.C9154c;
import kotlin.p045h0.C9157f;
import kotlin.p045h0.C9162i;
import kotlin.p045h0.C9166k;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.C9173n;
import kotlin.p045h0.p046u.C4783a;
import kotlin.p045h0.p046u.C4785c;
import kotlin.p215c0.C9100a;
import kotlin.reflect.full.C10229a;

/* renamed from: com.squareup.moshi.v.a.b */
/* compiled from: KotlinJsonAdapter.kt */
public final class C8980b implements C8924f.C8929e {
    /* renamed from: a */
    public C8924f<?> mo32832a(Type type, Set<? extends Annotation> set, C8952r rVar) {
        T t;
        String str;
        String name;
        T t2;
        Type type2 = type;
        C8952r rVar2 = rVar;
        C10202j.m34178b(type2, "type");
        C10202j.m34178b(set, "annotations");
        C10202j.m34178b(rVar2, "moshi");
        boolean z = true;
        T t3 = null;
        if (!set.isEmpty()) {
            return null;
        }
        Class<?> d = C8970t.m29525d(type);
        C10202j.m34174a((Object) d, "rawType");
        if (d.isInterface() || d.isEnum() || !d.isAnnotationPresent(C8981c.f25486a) || C8973c.m29545b(d)) {
            return null;
        }
        try {
            C8924f<?> a = C8973c.m29531a(rVar2, type2, d);
            if (a != null) {
                return a;
            }
        } catch (RuntimeException e) {
            RuntimeException runtimeException = e;
            if (!(runtimeException.getCause() instanceof ClassNotFoundException)) {
                throw runtimeException;
            }
        }
        if (!d.isLocalClass()) {
            C9154c<?> a2 = C9100a.m29805a(d);
            if (!(!a2.isAbstract())) {
                throw new IllegalArgumentException(("Cannot serialize abstract class " + d.getName()).toString());
            } else if (!a2.mo33510k()) {
                if (!(a2.mo33512m() == null)) {
                    throw new IllegalArgumentException(("Cannot serialize object declaration " + d.getName()).toString());
                } else if (!a2.mo33513n()) {
                    C9157f<?> b = C10229a.m34219b(a2);
                    if (b == null) {
                        return null;
                    }
                    List<C9166k> parameters = b.getParameters();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C9150f.m29847a(C10515i0.m35582a(C10531p.m35750a(parameters, 10)), 16));
                    for (T next : parameters) {
                        linkedHashMap.put(((C9166k) next).getName(), next);
                    }
                    C4783a.m7901a(b, true);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (C9173n next2 : C10229a.m34217a(a2)) {
                        C9166k kVar = (C9166k) linkedHashMap.get(next2.getName());
                        Field a3 = C4785c.m7905a((C9168l<?>) next2);
                        if (Modifier.isTransient(a3 != null ? a3.getModifiers() : 0)) {
                            if (!(kVar == null || kVar.mo33520h())) {
                                throw new IllegalArgumentException(("No default value for transient constructor " + kVar).toString());
                            }
                        } else {
                            if (!(kVar == null || C10202j.m34176a((Object) kVar.getType(), (Object) next2.getReturnType()))) {
                                StringBuilder sb = new StringBuilder();
                                sb.append('\'');
                                sb.append(next2.getName());
                                sb.append("' has a constructor parameter of type ");
                                if (kVar == null) {
                                    C10202j.m34172a();
                                    throw t3;
                                }
                                sb.append(kVar.getType());
                                sb.append(" but a property of type ");
                                sb.append(next2.getReturnType());
                                sb.append('.');
                                throw new IllegalArgumentException(sb.toString().toString());
                            } else if ((next2 instanceof C9162i) || kVar != null) {
                                C4783a.m7901a(next2, z);
                                List<T> c = C10539w.m35789c(next2.getAnnotations());
                                Iterator<T> it = next2.getAnnotations().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = t3;
                                        break;
                                    }
                                    t = it.next();
                                    if (((Annotation) t) instanceof C4746e) {
                                        break;
                                    }
                                }
                                C4746e eVar = (C4746e) t;
                                if (kVar != null) {
                                    boolean unused = C10536t.m35760a(c, kVar.getAnnotations());
                                    if (eVar == null) {
                                        Iterator<T> it2 = kVar.getAnnotations().iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                t2 = null;
                                                break;
                                            }
                                            t2 = it2.next();
                                            if (((Annotation) t2) instanceof C4746e) {
                                                break;
                                            }
                                        }
                                        eVar = (C4746e) t2;
                                    }
                                }
                                if (eVar == null || (str = eVar.name()) == null) {
                                    str = next2.getName();
                                }
                                String str2 = str;
                                Type a4 = C8973c.m29537a(type2, d, C4785c.m7907a(next2.getReturnType()));
                                Object[] array = c.toArray(new Annotation[0]);
                                if (array != null) {
                                    C8924f<T> a5 = rVar2.mo32971a(a4, C8973c.m29541a((Annotation[]) array), next2.getName());
                                    String name2 = next2.getName();
                                    String str3 = (eVar == null || (name = eVar.name()) == null) ? str2 : name;
                                    C10202j.m34174a((Object) a5, "adapter");
                                    if (next2 != null) {
                                        linkedHashMap2.put(name2, new C8977a.C8978a(str2, str3, a5, next2, kVar, kVar != null ? kVar.mo33516e() : -1));
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>");
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                        }
                        z = true;
                        t3 = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (C9166k next3 : b.getParameters()) {
                        C8977a.C8978a aVar = (C8977a.C8978a) C10187b0.m34147c(linkedHashMap2).remove(next3.getName());
                        if (aVar != null || next3.mo33520h()) {
                            arrayList.add(aVar);
                        } else {
                            throw new IllegalArgumentException(("No property for required constructor " + next3).toString());
                        }
                    }
                    int size = arrayList.size();
                    Iterator it3 = linkedHashMap2.entrySet().iterator();
                    while (true) {
                        int i = size;
                        if (!it3.hasNext()) {
                            break;
                        }
                        size = i + 1;
                        arrayList.add(C8977a.C8978a.m29548a((C8977a.C8978a) ((Map.Entry) it3.next()).getValue(), (String) null, (String) null, (C8924f) null, (C9173n) null, (C9166k) null, i, 31, (Object) null));
                    }
                    List<C8977a.C8978a> d2 = C10539w.m35793d(arrayList);
                    ArrayList arrayList2 = new ArrayList(C10531p.m35750a(d2, 10));
                    for (C8977a.C8978a c2 : d2) {
                        arrayList2.add(c2.mo33023c());
                    }
                    Object[] array2 = arrayList2.toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr = (String[]) array2;
                        C8930i.C8931a a6 = C8930i.C8931a.m29357a((String[]) Arrays.copyOf(strArr, strArr.length));
                        C10202j.m34174a((Object) a6, "options");
                        return new C8977a(b, arrayList, d2, a6).nullSafe();
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                } else {
                    throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + d.getName() + ". Please register an adapter.").toString());
                }
            } else {
                throw new IllegalArgumentException(("Cannot serialize inner class " + d.getName()).toString());
            }
        } else {
            throw new IllegalArgumentException(("Cannot serialize local class or object expression " + d.getName()).toString());
        }
    }
}
