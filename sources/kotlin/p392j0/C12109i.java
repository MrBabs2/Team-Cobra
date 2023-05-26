package kotlin.p392j0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p220g0.C9146c;
import kotlin.p262y.C10486a;
import kotlin.p262y.C10489b;
import kotlin.p392j0.C12106h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, mo16641d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.j0.i */
/* compiled from: Regex.kt */
final class C12109i implements C12106h {

    /* renamed from: a */
    private List<String> f31883a;

    /* renamed from: b */
    private final Matcher f31884b;

    /* renamed from: kotlin.j0.i$a */
    /* compiled from: Regex.kt */
    public static final class C12110a extends C10489b<String> {

        /* renamed from: g */
        final /* synthetic */ C12109i f31885g;

        C12110a(C12109i iVar) {
            this.f31885g = iVar;
        }

        /* renamed from: a */
        public /* bridge */ boolean mo38735a(String str) {
            return super.contains(str);
        }

        /* renamed from: b */
        public /* bridge */ int mo38736b(String str) {
            return super.indexOf(str);
        }

        /* renamed from: c */
        public /* bridge */ int mo38737c(String str) {
            return super.lastIndexOf(str);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return mo38735a((String) obj);
            }
            return false;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return mo38736b((String) obj);
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return mo38737c((String) obj);
            }
            return -1;
        }

        /* renamed from: a */
        public int mo35897a() {
            return this.f31885g.m39956c().groupCount() + 1;
        }

        public String get(int i) {
            String group = this.f31885g.m39956c().group(i);
            return group != null ? group : "";
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo16641d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: kotlin.j0.i$b */
    /* compiled from: Regex.kt */
    public static final class C12111b extends C10486a<C12103e> implements C12105g {

        /* renamed from: f */
        final /* synthetic */ C12109i f31886f;

        /* renamed from: kotlin.j0.i$b$a */
        /* compiled from: Regex.kt */
        static final class C12112a extends C10203k implements C9113l<Integer, C12103e> {

            /* renamed from: f */
            final /* synthetic */ C12111b f31887f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12112a(C12111b bVar) {
                super(1);
                this.f31887f = bVar;
            }

            /* renamed from: a */
            public final C12103e mo38741a(int i) {
                return this.f31887f.get(i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo38741a(((Number) obj).intValue());
            }
        }

        C12111b(C12109i iVar) {
            this.f31886f = iVar;
        }

        /* renamed from: a */
        public /* bridge */ boolean mo38738a(C12103e eVar) {
            return super.contains(eVar);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null ? obj instanceof C12103e : true) {
                return mo38738a((C12103e) obj);
            }
            return false;
        }

        public C12103e get(int i) {
            C9146c a = C12117k.m39971b(this.f31886f.m39956c(), i);
            if (a.mo33495c().intValue() < 0) {
                return null;
            }
            String group = this.f31886f.m39956c().group(i);
            C10202j.m34174a((Object) group, "matchResult.group(index)");
            return new C12103e(group, a);
        }

        public boolean isEmpty() {
            return false;
        }

        public Iterator<C12103e> iterator() {
            return C12090n.m39926d(C10539w.m35782b(C10529o.m35737a((Collection<?>) this)), new C12112a(this)).iterator();
        }

        /* renamed from: a */
        public int mo35897a() {
            return this.f31886f.m39956c().groupCount() + 1;
        }
    }

    public C12109i(Matcher matcher, CharSequence charSequence) {
        C10202j.m34178b(matcher, "matcher");
        C10202j.m34178b(charSequence, "input");
        this.f31884b = matcher;
        new C12111b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final MatchResult m39956c() {
        return this.f31884b;
    }

    /* renamed from: b */
    public List<String> mo38733b() {
        if (this.f31883a == null) {
            this.f31883a = new C12110a(this);
        }
        List<String> list = this.f31883a;
        if (list != null) {
            return list;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: a */
    public C12106h.C12108b mo38732a() {
        return C12106h.C12107a.m39953a(this);
    }
}
