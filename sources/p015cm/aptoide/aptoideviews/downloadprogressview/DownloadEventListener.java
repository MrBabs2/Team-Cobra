package p015cm.aptoide.aptoideviews.downloadprogressview;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener;", "", "onActionClick", "", "action", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "Action", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener */
/* compiled from: DownloadEventListener.kt */
public interface DownloadEventListener {

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "", "type", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action$Type;", "payload", "(Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action$Type;Ljava/lang/Object;)V", "getPayload", "()Ljava/lang/Object;", "getType", "()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action$Type;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Type", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener$Action */
    /* compiled from: DownloadEventListener.kt */
    public static final class Action {
        private final Object payload;
        private final Type type;

        @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action$Type;", "", "(Ljava/lang/String;I)V", "CANCEL", "RESUME", "PAUSE", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
        /* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener$Action$Type */
        /* compiled from: DownloadEventListener.kt */
        public enum Type {
            CANCEL,
            RESUME,
            PAUSE
        }

        public Action(Type type2, Object obj) {
            C10202j.m34178b(type2, "type");
            this.type = type2;
            this.payload = obj;
        }

        public static /* synthetic */ Action copy$default(Action action, Type type2, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                type2 = action.type;
            }
            if ((i & 2) != 0) {
                obj = action.payload;
            }
            return action.copy(type2, obj);
        }

        public final Type component1() {
            return this.type;
        }

        public final Object component2() {
            return this.payload;
        }

        public final Action copy(Type type2, Object obj) {
            C10202j.m34178b(type2, "type");
            return new Action(type2, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return C10202j.m34176a((Object) this.type, (Object) action.type) && C10202j.m34176a(this.payload, action.payload);
        }

        public final Object getPayload() {
            return this.payload;
        }

        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            Type type2 = this.type;
            int i = 0;
            int hashCode = (type2 != null ? type2.hashCode() : 0) * 31;
            Object obj = this.payload;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Action(type=" + this.type + ", payload=" + this.payload + ")";
        }
    }

    void onActionClick(Action action);
}
