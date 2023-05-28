package p112n.p319i;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

@C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 !*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u00020\u0002:\u0005!\"#$%B!\b\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0002\u0010\u0007J%\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0002\u0010\u0010JC\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002)\u0010\u0012\u001a%\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016J#\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0018*\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019J+\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e*\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u0015*\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u0015*\u00028\u00002\u0006\u0010\u001d\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001eJ\u001e\u0010 \u001a\u00020\u0015*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000eH\u0002R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo16641d2 = {"Lcom/tinder/StateMachine;", "STATE", "", "EVENT", "SIDE_EFFECT", "graph", "Lcom/tinder/StateMachine$Graph;", "(Lcom/tinder/StateMachine$Graph;)V", "state", "getState", "()Ljava/lang/Object;", "stateRef", "Ljava/util/concurrent/atomic/AtomicReference;", "transition", "Lcom/tinder/StateMachine$Transition;", "event", "(Ljava/lang/Object;)Lcom/tinder/StateMachine$Transition;", "with", "init", "Lkotlin/Function1;", "Lcom/tinder/StateMachine$GraphBuilder;", "", "Lkotlin/ExtensionFunctionType;", "getDefinition", "Lcom/tinder/StateMachine$Graph$State;", "(Ljava/lang/Object;)Lcom/tinder/StateMachine$Graph$State;", "getTransition", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/StateMachine$Transition;", "notifyOnEnter", "cause", "(Ljava/lang/Object;Ljava/lang/Object;)V", "notifyOnExit", "notifyOnTransition", "Companion", "Graph", "GraphBuilder", "Matcher", "Transition", "state-machine"}, mo16642k = 1, mo16643mv = {1, 1, 9})
/* renamed from: n.i.a */
/* compiled from: StateMachine.kt */
public final class C10807a<STATE, EVENT, SIDE_EFFECT> {

    /* renamed from: c */
    public static final C10808a f28873c = new C10808a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final AtomicReference<STATE> f28874a;

    /* renamed from: b */
    private final C10809b<STATE, EVENT, SIDE_EFFECT> f28875b;

    /* renamed from: n.i.a$a */
    /* compiled from: StateMachine.kt */
    public static final class C10808a {
        private C10808a() {
        }

        /* renamed from: a */
        public final <STATE, EVENT, SIDE_EFFECT> C10807a<STATE, EVENT, SIDE_EFFECT> mo36584a(C9113l<? super C10812c<STATE, EVENT, SIDE_EFFECT>, C10483v> lVar) {
            C10202j.m34178b(lVar, "init");
            return m36687a((C10809b) null, lVar);
        }

        public /* synthetic */ C10808a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final <STATE, EVENT, SIDE_EFFECT> C10807a<STATE, EVENT, SIDE_EFFECT> m36687a(C10809b<STATE, EVENT, SIDE_EFFECT> bVar, C9113l<? super C10812c<STATE, EVENT, SIDE_EFFECT>, C10483v> lVar) {
            C10812c cVar = new C10812c(bVar);
            lVar.invoke(cVar);
            return new C10807a<>(cVar.mo36599a(), (DefaultConstructorMarker) null);
        }
    }

    @C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0001*\u00020\u0002*\b\b\u0004\u0010\u0003*\u00020\u0002*\b\b\u0005\u0010\u0004*\u00020\u00022\u00020\u0002:\u0001#Bk\u0012\u0006\u0010\u0005\u001a\u00028\u0003\u00120\u0010\u0006\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\t0\u0007\u0012*\u0010\n\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0017\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J3\u0010\u0018\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\t0\u0007HÆ\u0003J-\u0010\u0019\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bHÆ\u0003J\u0001\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u000322\b\u0002\u0010\u0006\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\t0\u00072,\b\u0002\u0010\n\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R5\u0010\n\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R;\u0010\u0006\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, mo16641d2 = {"Lcom/tinder/StateMachine$Graph;", "STATE", "", "EVENT", "SIDE_EFFECT", "initialState", "stateDefinitions", "", "Lcom/tinder/StateMachine$Matcher;", "Lcom/tinder/StateMachine$Graph$State;", "onTransitionListeners", "", "Lkotlin/Function1;", "Lcom/tinder/StateMachine$Transition;", "", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;)V", "getInitialState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getOnTransitionListeners", "()Ljava/util/List;", "getStateDefinitions", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;)Lcom/tinder/StateMachine$Graph;", "equals", "", "other", "hashCode", "", "toString", "", "State", "state-machine"}, mo16642k = 1, mo16643mv = {1, 1, 9})
    /* renamed from: n.i.a$b */
    /* compiled from: StateMachine.kt */
    public static final class C10809b<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: a */
        private final STATE f28876a;

        /* renamed from: b */
        private final Map<C10816d<STATE, STATE>, C10810a<STATE, EVENT, SIDE_EFFECT>> f28877b;

        /* renamed from: c */
        private final List<C9113l<C10819e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10483v>> f28878c;

        @C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0006\u0010\u0001*\u00020\u0002*\b\b\u0007\u0010\u0003*\u00020\u0002*\b\b\b\u0010\u0004*\u00020\u00022\u00020\u0002:\u0001\u0015B\u0007\b\u0000¢\u0006\u0002\u0010\u0005R)\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR)\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0001\u0010\u000e\u001ar\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00070\u0010\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\b0\u00110\b0\u000fj8\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00070\u0010\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\b0\u00110\b`\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, mo16641d2 = {"Lcom/tinder/StateMachine$Graph$State;", "STATE", "", "EVENT", "SIDE_EFFECT", "()V", "onEnterListeners", "", "Lkotlin/Function2;", "", "getOnEnterListeners", "()Ljava/util/List;", "onExitListeners", "getOnExitListeners", "transitions", "Ljava/util/LinkedHashMap;", "Lcom/tinder/StateMachine$Matcher;", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lkotlin/collections/LinkedHashMap;", "getTransitions", "()Ljava/util/LinkedHashMap;", "TransitionTo", "state-machine"}, mo16642k = 1, mo16643mv = {1, 1, 9})
        /* renamed from: n.i.a$b$a */
        /* compiled from: StateMachine.kt */
        public static final class C10810a<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            private final List<C9117p<STATE, EVENT, C10483v>> f28879a = new ArrayList();

            /* renamed from: b */
            private final List<C9117p<STATE, EVENT, C10483v>> f28880b = new ArrayList();

            /* renamed from: c */
            private final LinkedHashMap<C10816d<EVENT, EVENT>, C9117p<STATE, EVENT, C10811a<STATE, SIDE_EFFECT>>> f28881c = new LinkedHashMap<>();

            /* renamed from: n.i.a$b$a$a */
            /* compiled from: StateMachine.kt */
            public static final class C10811a<STATE, SIDE_EFFECT> {

                /* renamed from: a */
                private final STATE f28882a;

                /* renamed from: b */
                private final SIDE_EFFECT f28883b;

                public C10811a(STATE state, SIDE_EFFECT side_effect) {
                    C10202j.m34178b(state, "toState");
                    this.f28882a = state;
                    this.f28883b = side_effect;
                }

                /* renamed from: a */
                public final STATE mo36594a() {
                    return this.f28882a;
                }

                /* renamed from: b */
                public final SIDE_EFFECT mo36595b() {
                    return this.f28883b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C10811a)) {
                        return false;
                    }
                    C10811a aVar = (C10811a) obj;
                    return C10202j.m34176a((Object) this.f28882a, (Object) aVar.f28882a) && C10202j.m34176a((Object) this.f28883b, (Object) aVar.f28883b);
                }

                public int hashCode() {
                    STATE state = this.f28882a;
                    int i = 0;
                    int hashCode = (state != null ? state.hashCode() : 0) * 31;
                    SIDE_EFFECT side_effect = this.f28883b;
                    if (side_effect != null) {
                        i = side_effect.hashCode();
                    }
                    return hashCode + i;
                }

                public String toString() {
                    return "TransitionTo(toState=" + this.f28882a + ", sideEffect=" + this.f28883b + ")";
                }
            }

            /* renamed from: a */
            public final List<C9117p<STATE, EVENT, C10483v>> mo36591a() {
                return this.f28879a;
            }

            /* renamed from: b */
            public final List<C9117p<STATE, EVENT, C10483v>> mo36592b() {
                return this.f28880b;
            }

            /* renamed from: c */
            public final LinkedHashMap<C10816d<EVENT, EVENT>, C9117p<STATE, EVENT, C10811a<STATE, SIDE_EFFECT>>> mo36593c() {
                return this.f28881c;
            }
        }

        public C10809b(STATE state, Map<C10816d<STATE, STATE>, C10810a<STATE, EVENT, SIDE_EFFECT>> map, List<? extends C9113l<? super C10819e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10483v>> list) {
            C10202j.m34178b(state, "initialState");
            C10202j.m34178b(map, "stateDefinitions");
            C10202j.m34178b(list, "onTransitionListeners");
            this.f28876a = state;
            this.f28877b = map;
            this.f28878c = list;
        }

        /* renamed from: a */
        public final STATE mo36585a() {
            return this.f28876a;
        }

        /* renamed from: b */
        public final List<C9113l<C10819e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10483v>> mo36586b() {
            return this.f28878c;
        }

        /* renamed from: c */
        public final Map<C10816d<STATE, STATE>, C10810a<STATE, EVENT, SIDE_EFFECT>> mo36587c() {
            return this.f28877b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10809b)) {
                return false;
            }
            C10809b bVar = (C10809b) obj;
            return C10202j.m34176a((Object) this.f28876a, (Object) bVar.f28876a) && C10202j.m34176a((Object) this.f28877b, (Object) bVar.f28877b) && C10202j.m34176a((Object) this.f28878c, (Object) bVar.f28878c);
        }

        public int hashCode() {
            STATE state = this.f28876a;
            int i = 0;
            int hashCode = (state != null ? state.hashCode() : 0) * 31;
            Map<C10816d<STATE, STATE>, C10810a<STATE, EVENT, SIDE_EFFECT>> map = this.f28877b;
            int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
            List<C9113l<C10819e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10483v>> list = this.f28878c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Graph(initialState=" + this.f28876a + ", stateDefinitions=" + this.f28877b + ", onTransitionListeners=" + this.f28878c + ")";
        }
    }

    @C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0001*\u00020\u0002*\b\b\u0004\u0010\u0003*\u00020\u0002*\b\b\u0005\u0010\u0004*\u00020\u00022\u00020\u0002:\u0001!B#\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006J\u0013\u0010\b\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0003¢\u0006\u0002\u0010\u0017J,\u0010\u0018\u001a\u00020\u000e2$\u0010\u0019\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e0\fJY\u0010\u001a\u001a\u00020\u000e\"\n\b\u0006\u0010\u001b\u0018\u0001*\u00028\u00032\u0006\u0010\u001a\u001a\u0002H\u001b25\b\b\u0010\u001c\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u001b0\u001dR\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0000\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u001eH\b¢\u0006\u0002\u0010\u001fJL\u0010\u001a\u001a\u00020\u000e\"\n\b\u0006\u0010\u001b\u0018\u0001*\u00028\u000325\b\b\u0010\u001c\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u001b0\u001dR\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0000\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u001eH\bJY\u0010\u001a\u001a\u00020\u000e\"\b\b\u0006\u0010\u001b*\u00028\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u0002H\u001b0\u001323\u0010\u001c\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u001b0\u001dR\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0000\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u001eR\u0012\u0010\b\u001a\u0004\u0018\u00018\u0003X\u000e¢\u0006\u0004\n\u0002\u0010\tR§\u0001\u0010\n\u001a\u0001\u0012H\u0012F\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e \u000f*\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f0\f0\u000bjL\u0012H\u0012F\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e \u000f*\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f0\f`\u0010X\u0004¢\u0006\u0002\n\u0000RÃ\u0001\u0010\u0011\u001a¶\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003 \u000f*\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00130\u0013\u00120\u0012.\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005 \u000f*\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u00140\u00140\u0012jZ\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003 \u000f*\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00130\u0013\u00120\u0012.\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005 \u000f*\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u00140\u0014`\u0015X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo16641d2 = {"Lcom/tinder/StateMachine$GraphBuilder;", "STATE", "", "EVENT", "SIDE_EFFECT", "graph", "Lcom/tinder/StateMachine$Graph;", "(Lcom/tinder/StateMachine$Graph;)V", "initialState", "Ljava/lang/Object;", "onTransitionListeners", "Ljava/util/ArrayList;", "Lkotlin/Function1;", "Lcom/tinder/StateMachine$Transition;", "", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "stateDefinitions", "Ljava/util/LinkedHashMap;", "Lcom/tinder/StateMachine$Matcher;", "Lcom/tinder/StateMachine$Graph$State;", "Lkotlin/collections/LinkedHashMap;", "build", "(Ljava/lang/Object;)V", "onTransition", "listener", "state", "S", "init", "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "stateMatcher", "StateDefinitionBuilder", "state-machine"}, mo16642k = 1, mo16643mv = {1, 1, 9})
    /* renamed from: n.i.a$c */
    /* compiled from: StateMachine.kt */
    public static final class C10812c<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: a */
        private STATE f28884a;

        /* renamed from: b */
        private final LinkedHashMap<C10816d<STATE, STATE>, C10809b.C10810a<STATE, EVENT, SIDE_EFFECT>> f28885b;

        /* renamed from: c */
        private final ArrayList<C9113l<C10819e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10483v>> f28886c;

        @C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0004\u0018\u0000*\b\b\u0006\u0010\u0001*\u00028\u00032\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u0002H\b0\u0007\"\n\b\u0007\u0010\b\u0018\u0001*\u00028\u0004H\bJ\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005J.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u0002H\u000b0\u0007\"\n\b\u0007\u0010\u000b\u0018\u0001*\u00028\u00042\u0006\u0010\f\u001a\u0002H\u000bH\b¢\u0006\u0002\u0010\rJO\u0010\u000e\u001a\u00020\u000f\"\n\b\u0007\u0010\b\u0018\u0001*\u00028\u00042\u0006\u0010\u0010\u001a\u0002H\b2+\b\b\u0010\u0011\u001a%\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u0002H\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00130\u0012¢\u0006\u0002\b\u0014H\b¢\u0006\u0002\u0010\u0015JB\u0010\u000e\u001a\u00020\u000f\"\n\b\u0007\u0010\b\u0018\u0001*\u00028\u00042+\b\b\u0010\u0011\u001a%\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u0002H\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00130\u0012¢\u0006\u0002\b\u0014H\bJO\u0010\u000e\u001a\u00020\u000f\"\b\b\u0007\u0010\b*\u00028\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u0002H\b0\u00072)\u0010\u0011\u001a%\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u0002H\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00130\u0012¢\u0006\u0002\b\u0014J%\u0010\u0017\u001a\u00020\u00182\u001d\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\u000f0\u0012¢\u0006\u0002\b\u0014J%\u0010\u001a\u001a\u00020\u00182\u001d\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\u000f0\u0012¢\u0006\u0002\b\u0014J)\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u0013*\u00028\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00018\u0005H\u0007¢\u0006\u0002\u0010\u001dJ1\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u0013*\u00028\u00062\u0006\u0010\u001f\u001a\u00028\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00018\u0005H\u0007¢\u0006\u0002\u0010 R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo16641d2 = {"Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "S", "", "(Lcom/tinder/StateMachine$GraphBuilder;)V", "stateDefinition", "Lcom/tinder/StateMachine$Graph$State;", "any", "Lcom/tinder/StateMachine$Matcher;", "E", "build", "eq", "R", "value", "(Ljava/lang/Object;)Lcom/tinder/StateMachine$Matcher;", "on", "", "event", "createTransitionTo", "Lkotlin/Function2;", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "eventMatcher", "onEnter", "", "listener", "onExit", "dontTransition", "sideEffect", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "transitionTo", "state", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "state-machine"}, mo16642k = 1, mo16643mv = {1, 1, 9})
        /* renamed from: n.i.a$c$a */
        /* compiled from: StateMachine.kt */
        public final class C10813a<S extends STATE> {

            /* renamed from: a */
            private final C10809b.C10810a<STATE, EVENT, SIDE_EFFECT> f28887a = new C10809b.C10810a<>();

            /* renamed from: n.i.a$c$a$a */
            /* compiled from: StateMachine.kt */
            static final class C10814a extends C10203k implements C9117p<STATE, EVENT, C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>> {

                /* renamed from: f */
                final /* synthetic */ C9117p f28888f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C10814a(C9117p pVar) {
                    super(2);
                    this.f28888f = pVar;
                }

                public final C10809b.C10810a.C10811a<STATE, SIDE_EFFECT> invoke(STATE state, EVENT event) {
                    C10202j.m34178b(state, "state");
                    C10202j.m34178b(event, "event");
                    return (C10809b.C10810a.C10811a) this.f28888f.invoke(state, event);
                }
            }

            /* renamed from: n.i.a$c$a$b */
            /* compiled from: StateMachine.kt */
            static final class C10815b extends C10203k implements C9117p<STATE, EVENT, C10483v> {

                /* renamed from: f */
                final /* synthetic */ C9117p f28889f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C10815b(C9117p pVar) {
                    super(2);
                    this.f28889f = pVar;
                }

                public final void invoke(STATE state, EVENT event) {
                    C10202j.m34178b(state, "state");
                    C10202j.m34178b(event, "cause");
                    this.f28889f.invoke(state, event);
                }
            }

            public C10813a(C10812c cVar) {
            }

            /* renamed from: a */
            public final <E extends EVENT> void mo36605a(C10816d<EVENT, ? extends E> dVar, C9117p<? super S, ? super E, ? extends C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>> pVar) {
                C10202j.m34178b(dVar, "eventMatcher");
                C10202j.m34178b(pVar, "createTransitionTo");
                this.f28887a.mo36593c().put(dVar, new C10814a(pVar));
            }

            /* renamed from: a */
            public final boolean mo36606a(C9117p<? super S, ? super EVENT, C10483v> pVar) {
                C10202j.m34178b(pVar, "listener");
                return this.f28887a.mo36591a().add(new C10815b(pVar));
            }

            /* renamed from: a */
            public final C10809b.C10810a<STATE, EVENT, SIDE_EFFECT> mo36604a() {
                return this.f28887a;
            }

            /* renamed from: a */
            public static /* bridge */ /* synthetic */ C10809b.C10810a.C10811a m36701a(C10813a aVar, Object obj, Object obj2, Object obj3, int i, Object obj4) {
                if ((i & 2) != 0) {
                    obj3 = null;
                }
                return aVar.mo36603a(obj, obj2, obj3);
            }

            /* renamed from: a */
            public final C10809b.C10810a.C10811a<STATE, SIDE_EFFECT> mo36603a(S s, STATE state, SIDE_EFFECT side_effect) {
                C10202j.m34178b(s, "$receiver");
                C10202j.m34178b(state, "state");
                return new C10809b.C10810a.C10811a<>(state, side_effect);
            }

            /* renamed from: a */
            public final C10809b.C10810a.C10811a<STATE, SIDE_EFFECT> mo36602a(S s, SIDE_EFFECT side_effect) {
                C10202j.m34178b(s, "$receiver");
                return mo36603a(s, s, side_effect);
            }

            /* renamed from: a */
            public static /* bridge */ /* synthetic */ C10809b.C10810a.C10811a m36700a(C10813a aVar, Object obj, Object obj2, int i, Object obj3) {
                if ((i & 1) != 0) {
                    obj2 = null;
                }
                return aVar.mo36602a(obj, obj2);
            }
        }

        public C10812c() {
            this((C10809b) null, 1, (DefaultConstructorMarker) null);
        }

        public C10812c(C10809b<STATE, EVENT, SIDE_EFFECT> bVar) {
            List<C9113l<C10819e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, C10483v>> a;
            Map<C10816d<STATE, STATE>, C10809b.C10810a<STATE, EVENT, SIDE_EFFECT>> a2;
            this.f28884a = bVar != null ? bVar.mo36585a() : null;
            this.f28885b = new LinkedHashMap<>((bVar == null || (a2 = bVar.mo36587c()) == null) ? C10518j0.m35601a() : a2);
            this.f28886c = new ArrayList<>((bVar == null || (a = bVar.mo36586b()) == null) ? C10529o.m35736a() : a);
        }

        /* renamed from: a */
        public final void mo36600a(STATE state) {
            C10202j.m34178b(state, "initialState");
            this.f28884a = state;
        }

        /* renamed from: a */
        public final <S extends STATE> void mo36601a(C10816d<STATE, ? extends S> dVar, C9113l<? super C10812c<STATE, EVENT, SIDE_EFFECT>.C0000a<S>, C10483v> lVar) {
            C10202j.m34178b(dVar, "stateMatcher");
            C10202j.m34178b(lVar, "init");
            LinkedHashMap<C10816d<STATE, STATE>, C10809b.C10810a<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.f28885b;
            C10813a aVar = new C10813a(this);
            lVar.invoke(aVar);
            linkedHashMap.put(dVar, aVar.mo36604a());
        }

        /* renamed from: a */
        public final C10809b<STATE, EVENT, SIDE_EFFECT> mo36599a() {
            STATE state = this.f28884a;
            if (state != null) {
                return new C10809b<>(state, C10518j0.m35610c(this.f28885b), C10539w.m35815n(this.f28886c));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C10812c(C10809b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bVar);
        }
    }

    @C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0011*\b\b\u0003\u0010\u0001*\u00020\u0002*\n\b\u0004\u0010\u0003 \u0001*\u0002H\u00012\u00020\u0002:\u0001\u0011B\u0015\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00040\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0003¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00040\u0005X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\n0\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo16641d2 = {"Lcom/tinder/StateMachine$Matcher;", "T", "", "R", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "predicates", "", "Lkotlin/Function1;", "", "matches", "value", "(Ljava/lang/Object;)Z", "where", "predicate", "Lkotlin/ExtensionFunctionType;", "Companion", "state-machine"}, mo16642k = 1, mo16643mv = {1, 1, 9})
    /* renamed from: n.i.a$d */
    /* compiled from: StateMachine.kt */
    public static final class C10816d<T, R extends T> {

        /* renamed from: c */
        public static final C10817a f28890c = new C10817a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final List<C9113l<T, Boolean>> f28891a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Class<R> f28892b;

        /* renamed from: n.i.a$d$a */
        /* compiled from: StateMachine.kt */
        public static final class C10817a {
            private C10817a() {
            }

            /* renamed from: a */
            public final <T, R extends T> C10816d<T, R> mo36608a(Class<R> cls) {
                C10202j.m34178b(cls, "clazz");
                return new C10816d<>(cls, (DefaultConstructorMarker) null);
            }

            public /* synthetic */ C10817a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: n.i.a$d$b */
        /* compiled from: StateMachine.kt */
        static final class C10818b extends C10203k implements C9113l<T, Boolean> {

            /* renamed from: f */
            final /* synthetic */ C10816d f28893f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10818b(C10816d dVar) {
                super(1);
                this.f28893f = dVar;
            }

            public final boolean invoke(T t) {
                C10202j.m34178b(t, "it");
                return this.f28893f.f28892b.isInstance(t);
            }
        }

        private C10816d(Class<R> cls) {
            this.f28892b = cls;
            this.f28891a = C10529o.m35745d(new C10818b(this));
        }

        /* renamed from: a */
        public final boolean mo36607a(T t) {
            C10202j.m34178b(t, DonationsAnalytics.VALUE);
            List<C9113l<T, Boolean>> list = this.f28891a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            for (C9113l invoke : list) {
                if (!((Boolean) invoke.invoke(t)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ C10816d(Class cls, DefaultConstructorMarker defaultConstructorMarker) {
            this(cls);
        }
    }

    @C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0003\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0004\u0010\u0003 \u0001*\u00020\u0002*\n\b\u0005\u0010\u0004 \u0001*\u00020\u00022\u00020\u0002:\u0002\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00028\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0001\u0002\r\u000e¨\u0006\u000f"}, mo16641d2 = {"Lcom/tinder/StateMachine$Transition;", "STATE", "", "EVENT", "SIDE_EFFECT", "()V", "event", "getEvent", "()Ljava/lang/Object;", "fromState", "getFromState", "Invalid", "Valid", "Lcom/tinder/StateMachine$Transition$Valid;", "Lcom/tinder/StateMachine$Transition$Invalid;", "state-machine"}, mo16642k = 1, mo16643mv = {1, 1, 9})
    /* renamed from: n.i.a$e */
    /* compiled from: StateMachine.kt */
    public static abstract class C10819e<STATE, EVENT, SIDE_EFFECT> {

        /* renamed from: n.i.a$e$a */
        /* compiled from: StateMachine.kt */
        public static final class C10820a<STATE, EVENT, SIDE_EFFECT> extends C10819e<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            private final STATE f28894a;

            /* renamed from: b */
            private final EVENT f28895b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10820a(STATE state, EVENT event) {
                super((DefaultConstructorMarker) null);
                C10202j.m34178b(state, "fromState");
                C10202j.m34178b(event, "event");
                this.f28894a = state;
                this.f28895b = event;
            }

            /* renamed from: a */
            public EVENT mo36609a() {
                return this.f28895b;
            }

            /* renamed from: b */
            public STATE mo36610b() {
                return this.f28894a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10820a)) {
                    return false;
                }
                C10820a aVar = (C10820a) obj;
                return C10202j.m34176a(mo36610b(), aVar.mo36610b()) && C10202j.m34176a(mo36609a(), aVar.mo36609a());
            }

            public int hashCode() {
                Object b = mo36610b();
                int i = 0;
                int hashCode = (b != null ? b.hashCode() : 0) * 31;
                Object a = mo36609a();
                if (a != null) {
                    i = a.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                return "Invalid(fromState=" + mo36610b() + ", event=" + mo36609a() + ")";
            }
        }

        /* renamed from: n.i.a$e$b */
        /* compiled from: StateMachine.kt */
        public static final class C10821b<STATE, EVENT, SIDE_EFFECT> extends C10819e<STATE, EVENT, SIDE_EFFECT> {

            /* renamed from: a */
            private final STATE f28896a;

            /* renamed from: b */
            private final EVENT f28897b;

            /* renamed from: c */
            private final STATE f28898c;

            /* renamed from: d */
            private final SIDE_EFFECT f28899d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10821b(STATE state, EVENT event, STATE state2, SIDE_EFFECT side_effect) {
                super((DefaultConstructorMarker) null);
                C10202j.m34178b(state, "fromState");
                C10202j.m34178b(event, "event");
                C10202j.m34178b(state2, "toState");
                this.f28896a = state;
                this.f28897b = event;
                this.f28898c = state2;
                this.f28899d = side_effect;
            }

            /* renamed from: a */
            public EVENT mo36614a() {
                return this.f28897b;
            }

            /* renamed from: b */
            public STATE mo36615b() {
                return this.f28896a;
            }

            /* renamed from: c */
            public final STATE mo36616c() {
                return this.f28898c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10821b)) {
                    return false;
                }
                C10821b bVar = (C10821b) obj;
                return C10202j.m34176a(mo36615b(), bVar.mo36615b()) && C10202j.m34176a(mo36614a(), bVar.mo36614a()) && C10202j.m34176a((Object) this.f28898c, (Object) bVar.f28898c) && C10202j.m34176a((Object) this.f28899d, (Object) bVar.f28899d);
            }

            public int hashCode() {
                Object b = mo36615b();
                int i = 0;
                int hashCode = (b != null ? b.hashCode() : 0) * 31;
                Object a = mo36614a();
                int hashCode2 = (hashCode + (a != null ? a.hashCode() : 0)) * 31;
                STATE state = this.f28898c;
                int hashCode3 = (hashCode2 + (state != null ? state.hashCode() : 0)) * 31;
                SIDE_EFFECT side_effect = this.f28899d;
                if (side_effect != null) {
                    i = side_effect.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                return "Valid(fromState=" + mo36615b() + ", event=" + mo36614a() + ", toState=" + this.f28898c + ", sideEffect=" + this.f28899d + ")";
            }
        }

        private C10819e() {
        }

        public /* synthetic */ C10819e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private C10807a(C10809b<STATE, EVENT, SIDE_EFFECT> bVar) {
        this.f28875b = bVar;
        this.f28874a = new AtomicReference<>(this.f28875b.mo36585a());
    }

    /* renamed from: b */
    private final C10809b.C10810a<STATE, EVENT, SIDE_EFFECT> m36682b(STATE state) {
        Map<C10816d<STATE, STATE>, C10809b.C10810a<STATE, EVENT, SIDE_EFFECT>> c = this.f28875b.mo36587c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : c.entrySet()) {
            if (((C10816d) next.getKey()).mo36607a(state)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry value : linkedHashMap.entrySet()) {
            arrayList.add((C10809b.C10810a) value.getValue());
        }
        C10809b.C10810a<STATE, EVENT, SIDE_EFFECT> aVar = (C10809b.C10810a) C10539w.m35803f(arrayList);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: c */
    private final void m36684c(STATE state, EVENT event) {
        for (C9117p invoke : m36682b(state).mo36592b()) {
            invoke.invoke(state, event);
        }
    }

    /* renamed from: a */
    public final STATE mo36582a() {
        STATE state = this.f28874a.get();
        C10202j.m34174a((Object) state, "stateRef.get()");
        return state;
    }

    /* renamed from: a */
    public final C10819e<STATE, EVENT, SIDE_EFFECT> mo36583a(EVENT event) {
        C10819e<STATE, EVENT, SIDE_EFFECT> a;
        C10202j.m34178b(event, "event");
        synchronized (this) {
            STATE state = this.f28874a.get();
            C10202j.m34174a((Object) state, "fromState");
            a = m36680a(state, event);
            if (a instanceof C10819e.C10821b) {
                this.f28874a.set(((C10819e.C10821b) a).mo36616c());
            }
        }
        m36681a(a);
        if (a instanceof C10819e.C10821b) {
            C10819e.C10821b bVar = (C10819e.C10821b) a;
            m36684c(bVar.mo36615b(), event);
            m36683b(bVar.mo36616c(), event);
        }
        return a;
    }

    public /* synthetic */ C10807a(C10809b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* renamed from: b */
    private final void m36683b(STATE state, EVENT event) {
        for (C9117p invoke : m36682b(state).mo36591a()) {
            invoke.invoke(state, event);
        }
    }

    /* renamed from: a */
    private final C10819e<STATE, EVENT, SIDE_EFFECT> m36680a(STATE state, EVENT event) {
        for (Map.Entry entry : m36682b(state).mo36593c().entrySet()) {
            C9117p pVar = (C9117p) entry.getValue();
            if (((C10816d) entry.getKey()).mo36607a(event)) {
                C10809b.C10810a.C10811a aVar = (C10809b.C10810a.C10811a) pVar.invoke(state, event);
                return new C10819e.C10821b(state, event, aVar.mo36594a(), aVar.mo36595b());
            }
        }
        return new C10819e.C10820a(state, event);
    }

    /* renamed from: a */
    private final void m36681a(C10819e<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT> eVar) {
        for (C9113l invoke : this.f28875b.mo36586b()) {
            invoke.invoke(eVar);
        }
    }
}
