package p015cm.aptoide.p016pt.search.view;

import android.os.Handler;
import androidx.recyclerview.widget.C0688f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0629c0;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u001e\u0010\u0016\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0016\u0010\u001b\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0002R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo16641d2 = {"Lcm/aptoide/pt/search/view/DiffUtilAdapter;", "T", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "diffUtilThread", "Ljava/lang/Thread;", "getDiffUtilThread", "()Ljava/lang/Thread;", "setDiffUtilThread", "(Ljava/lang/Thread;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "pendingUpdates", "Ljava/util/Queue;", "Lcm/aptoide/pt/search/view/DiffUtilAdapter$DiffRequest;", "applyDiffUtil", "", "diffRequest", "dispatchUpdates", "newItems", "", "diffResult", "Landroidx/recyclerview/widget/DiffUtil$DiffResult;", "internalApplyDiffUtil", "DiffRequest", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.view.DiffUtilAdapter */
/* compiled from: DiffUtilAdapter.kt */
public abstract class DiffUtilAdapter<T, VH extends RecyclerView.C0629c0> extends RecyclerView.C0633g<VH> {
    private Thread diffUtilThread = new Thread();
    private final Handler handler = new Handler();
    /* access modifiers changed from: private */
    public final Queue<DiffRequest<T>> pendingUpdates = new ArrayDeque();

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo16641d2 = {"Lcm/aptoide/pt/search/view/DiffUtilAdapter$DiffRequest;", "T", "", "newItems", "", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "(Ljava/util/List;Landroidx/recyclerview/widget/DiffUtil$Callback;)V", "getDiffCallback", "()Landroidx/recyclerview/widget/DiffUtil$Callback;", "getNewItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.search.view.DiffUtilAdapter$DiffRequest */
    /* compiled from: DiffUtilAdapter.kt */
    public static final class DiffRequest<T> {
        private final C0688f.C0690b diffCallback;
        private final List<T> newItems;

        public DiffRequest(List<? extends T> list, C0688f.C0690b bVar) {
            C10202j.m34178b(list, "newItems");
            C10202j.m34178b(bVar, "diffCallback");
            this.newItems = list;
            this.diffCallback = bVar;
        }

        public static /* synthetic */ DiffRequest copy$default(DiffRequest diffRequest, List<T> list, C0688f.C0690b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                list = diffRequest.newItems;
            }
            if ((i & 2) != 0) {
                bVar = diffRequest.diffCallback;
            }
            return diffRequest.copy(list, bVar);
        }

        public final List<T> component1() {
            return this.newItems;
        }

        public final C0688f.C0690b component2() {
            return this.diffCallback;
        }

        public final DiffRequest<T> copy(List<? extends T> list, C0688f.C0690b bVar) {
            C10202j.m34178b(list, "newItems");
            C10202j.m34178b(bVar, "diffCallback");
            return new DiffRequest<>(list, bVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiffRequest)) {
                return false;
            }
            DiffRequest diffRequest = (DiffRequest) obj;
            return C10202j.m34176a((Object) this.newItems, (Object) diffRequest.newItems) && C10202j.m34176a((Object) this.diffCallback, (Object) diffRequest.diffCallback);
        }

        public final C0688f.C0690b getDiffCallback() {
            return this.diffCallback;
        }

        public final List<T> getNewItems() {
            return this.newItems;
        }

        public int hashCode() {
            List<T> list = this.newItems;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            C0688f.C0690b bVar = this.diffCallback;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "DiffRequest(newItems=" + this.newItems + ", diffCallback=" + this.diffCallback + ")";
        }
    }

    /* access modifiers changed from: private */
    public final void internalApplyDiffUtil(DiffRequest<T> diffRequest) {
        Thread thread = new Thread(new DiffUtilAdapter$internalApplyDiffUtil$1(this, diffRequest));
        this.diffUtilThread = thread;
        if (thread != null) {
            thread.start();
        }
    }

    public final void applyDiffUtil(DiffRequest<T> diffRequest) {
        C10202j.m34178b(diffRequest, "diffRequest");
        this.pendingUpdates.add(diffRequest);
        if (this.pendingUpdates.size() <= 1) {
            internalApplyDiffUtil(diffRequest);
        }
    }

    public abstract void dispatchUpdates(List<? extends T> list, C0688f.C0691c cVar);

    public final Thread getDiffUtilThread() {
        return this.diffUtilThread;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final void setDiffUtilThread(Thread thread) {
        this.diffUtilThread = thread;
    }
}
