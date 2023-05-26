package kotlin.p045h0.p046u.p047e;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.C9188c;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11721e;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11738f;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11752j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9631r;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9712i;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9878f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9880h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9920e;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9928i;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9940g;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0004\t\n\u000b\f¨\u0006\r"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "()V", "asString", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.d */
/* compiled from: RuntimeTypeMapper.kt */
public abstract class C9200d {

    /* renamed from: kotlin.h0.u.e.d$a */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C9201a extends C9200d {

        /* renamed from: a */
        private final Field f25724a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9201a(Field field) {
            super((DefaultConstructorMarker) null);
            C10202j.m34178b(field, "field");
            this.f25724a = field;
        }

        /* renamed from: a */
        public String mo33569a() {
            StringBuilder sb = new StringBuilder();
            sb.append(C9631r.m31047a(this.f25724a.getName()));
            sb.append("()");
            Class<?> type = this.f25724a.getType();
            C10202j.m34174a((Object) type, "field.type");
            sb.append(C12029b.m39749c(type));
            return sb.toString();
        }

        /* renamed from: b */
        public final Field mo33570b() {
            return this.f25724a;
        }
    }

    /* renamed from: kotlin.h0.u.e.d$b */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C9202b extends C9200d {

        /* renamed from: a */
        private final Method f25725a;

        /* renamed from: b */
        private final Method f25726b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9202b(Method method, Method method2) {
            super((DefaultConstructorMarker) null);
            C10202j.m34178b(method, "getterMethod");
            this.f25725a = method;
            this.f25726b = method2;
        }

        /* renamed from: a */
        public String mo33569a() {
            return C9216e0.m29954b(this.f25725a);
        }

        /* renamed from: b */
        public final Method mo33571b() {
            return this.f25725a;
        }

        /* renamed from: c */
        public final Method mo33572c() {
            return this.f25726b;
        }
    }

    /* renamed from: kotlin.h0.u.e.d$c */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C9203c extends C9200d {

        /* renamed from: a */
        private final String f25727a;

        /* renamed from: b */
        private final C10352i0 f25728b;

        /* renamed from: c */
        private final C9930z f25729c;

        /* renamed from: d */
        private final C9890a.C9898d f25730d;

        /* renamed from: e */
        private final C9875c f25731e;

        /* renamed from: f */
        private final C9880h f25732f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9203c(C10352i0 i0Var, C9930z zVar, C9890a.C9898d dVar, C9875c cVar, C9880h hVar) {
            super((DefaultConstructorMarker) null);
            String str;
            C10202j.m34178b(i0Var, "descriptor");
            C10202j.m34178b(zVar, "proto");
            C10202j.m34178b(dVar, RoomInstalled.SIGNATURE);
            C10202j.m34178b(cVar, "nameResolver");
            C10202j.m34178b(hVar, "typeTable");
            this.f25728b = i0Var;
            this.f25729c = zVar;
            this.f25730d = dVar;
            this.f25731e = cVar;
            this.f25732f = hVar;
            if (dVar.mo34891n()) {
                StringBuilder sb = new StringBuilder();
                C9875c cVar2 = this.f25731e;
                C9890a.C9895c j = this.f25730d.mo34887j();
                C10202j.m34174a((Object) j, "signature.getter");
                sb.append(cVar2.getString(j.mo34879j()));
                C9875c cVar3 = this.f25731e;
                C9890a.C9895c j2 = this.f25730d.mo34887j();
                C10202j.m34174a((Object) j2, "signature.getter");
                sb.append(cVar3.getString(j2.mo34878i()));
                str = sb.toString();
            } else {
                C9920e.C9921a a = C9928i.m33155a(C9928i.f27389b, this.f25729c, this.f25731e, this.f25732f, false, 8, (Object) null);
                if (a != null) {
                    String d = a.mo34928d();
                    str = C9631r.m31047a(d) + m29925g() + "()" + a.mo34929e();
                } else {
                    throw new C10174x("No field signature for property: " + this.f25728b);
                }
            }
            this.f25727a = str;
        }

        /* renamed from: g */
        private final String m29925g() {
            String str;
            C10359m b = this.f25728b.mo33762b();
            C10202j.m34174a((Object) b, "descriptor.containingDeclaration");
            if (C10202j.m34176a((Object) this.f25728b.getVisibility(), (Object) C10397z0.f28191d) && (b instanceof C11721e)) {
                C9775f B = ((C11721e) b).mo38301B();
                C10427h.C10435g<C9775f, Integer> gVar = C9890a.f27292i;
                C10202j.m34174a((Object) gVar, "JvmProtoBuf.classModuleName");
                Integer num = (Integer) C9878f.m32873a(B, gVar);
                if (num == null || (str = this.f25731e.getString(num.intValue())) == null) {
                    str = "main";
                }
                return "$" + C9940g.m33309a(str);
            } else if (!C10202j.m34176a((Object) this.f25728b.getVisibility(), (Object) C10397z0.f28188a) || !(b instanceof C10240b0)) {
                return "";
            } else {
                C10352i0 i0Var = this.f25728b;
                if (i0Var != null) {
                    C11738f B2 = ((C11752j) i0Var).mo38327B();
                    if (!(B2 instanceof C9712i)) {
                        return "";
                    }
                    C9712i iVar = (C9712i) B2;
                    if (iVar.mo34297e() == null) {
                        return "";
                    }
                    return "$" + iVar.mo34299g().mo35021a();
                }
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            }
        }

        /* renamed from: a */
        public String mo33569a() {
            return this.f25727a;
        }

        /* renamed from: b */
        public final C10352i0 mo33573b() {
            return this.f25728b;
        }

        /* renamed from: c */
        public final C9875c mo33574c() {
            return this.f25731e;
        }

        /* renamed from: d */
        public final C9930z mo33575d() {
            return this.f25729c;
        }

        /* renamed from: e */
        public final C9890a.C9898d mo33576e() {
            return this.f25730d;
        }

        /* renamed from: f */
        public final C9880h mo33577f() {
            return this.f25732f;
        }
    }

    /* renamed from: kotlin.h0.u.e.d$d */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C9204d extends C9200d {

        /* renamed from: a */
        private final C9188c.C9196e f25733a;

        /* renamed from: b */
        private final C9188c.C9196e f25734b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9204d(C9188c.C9196e eVar, C9188c.C9196e eVar2) {
            super((DefaultConstructorMarker) null);
            C10202j.m34178b(eVar, "getterSignature");
            this.f25733a = eVar;
            this.f25734b = eVar2;
        }

        /* renamed from: a */
        public String mo33569a() {
            return this.f25733a.mo33551a();
        }

        /* renamed from: b */
        public final C9188c.C9196e mo33578b() {
            return this.f25733a;
        }

        /* renamed from: c */
        public final C9188c.C9196e mo33579c() {
            return this.f25734b;
        }
    }

    private C9200d() {
    }

    /* renamed from: a */
    public abstract String mo33569a();

    public /* synthetic */ C9200d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
