package p015cm.aptoide.p016pt.search.view;

import androidx.recyclerview.widget.C0688f;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.search.view.DiffUtilAdapter;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "T", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "run"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.view.DiffUtilAdapter$internalApplyDiffUtil$1 */
/* compiled from: DiffUtilAdapter.kt */
final class DiffUtilAdapter$internalApplyDiffUtil$1 implements Runnable {
    final /* synthetic */ DiffUtilAdapter.DiffRequest $diffRequest;
    final /* synthetic */ DiffUtilAdapter this$0;

    DiffUtilAdapter$internalApplyDiffUtil$1(DiffUtilAdapter diffUtilAdapter, DiffUtilAdapter.DiffRequest diffRequest) {
        this.this$0 = diffUtilAdapter;
        this.$diffRequest = diffRequest;
    }

    public final void run() {
        final C0688f.C0691c a = C0688f.m3266a(this.$diffRequest.getDiffCallback());
        C10202j.m34174a((Object) a, "DiffUtil.calculateDiff(diffRequest.diffCallback)");
        this.this$0.getHandler().post(new Runnable(this) {
            final /* synthetic */ DiffUtilAdapter$internalApplyDiffUtil$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                this.this$0.this$0.pendingUpdates.remove();
                DiffUtilAdapter$internalApplyDiffUtil$1 diffUtilAdapter$internalApplyDiffUtil$1 = this.this$0;
                diffUtilAdapter$internalApplyDiffUtil$1.this$0.dispatchUpdates(diffUtilAdapter$internalApplyDiffUtil$1.$diffRequest.getNewItems(), a);
                if (this.this$0.this$0.pendingUpdates.size() > 0) {
                    DiffUtilAdapter diffUtilAdapter = this.this$0.this$0;
                    Object peek = diffUtilAdapter.pendingUpdates.peek();
                    C10202j.m34174a(peek, "pendingUpdates.peek()");
                    diffUtilAdapter.internalApplyDiffUtil((DiffUtilAdapter.DiffRequest) peek);
                }
            }
        });
    }
}
