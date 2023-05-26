package p015cm.aptoide.aptoideviews.downloadprogressview;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State;", "", "()V", "Canceled", "InProgress", "InitialPaused", "Installing", "Paused", "Queue", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Paused;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$InitialPaused;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Installing;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Canceled;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.downloadprogressview.State */
/* compiled from: States.kt */
public abstract class State {

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$Canceled;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.State$Canceled */
    /* compiled from: States.kt */
    public static final class Canceled extends State {
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.State$InProgress */
    /* compiled from: States.kt */
    public static final class InProgress extends State {
        public static final InProgress INSTANCE = new InProgress();

        private InProgress() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$InitialPaused;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.State$InitialPaused */
    /* compiled from: States.kt */
    public static final class InitialPaused extends State {
        public static final InitialPaused INSTANCE = new InitialPaused();

        private InitialPaused() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$Installing;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.State$Installing */
    /* compiled from: States.kt */
    public static final class Installing extends State {
        public static final Installing INSTANCE = new Installing();

        private Installing() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$Paused;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.State$Paused */
    /* compiled from: States.kt */
    public static final class Paused extends State {
        public static final Paused INSTANCE = new Paused();

        private Paused() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.State$Queue */
    /* compiled from: States.kt */
    public static final class Queue extends State {
        public static final Queue INSTANCE = new Queue();

        private Queue() {
            super((DefaultConstructorMarker) null);
        }
    }

    private State() {
    }

    public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
