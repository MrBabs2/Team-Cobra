package com.airbnb.epoxy;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.C10202j;

/* renamed from: com.airbnb.epoxy.l0 */
/* compiled from: UnboundedViewPool.kt */
public final class C5604l0 extends RecyclerView.C0654u {

    /* renamed from: c */
    private final SparseArray<Queue<RecyclerView.C0629c0>> f9884c = new SparseArray<>();

    /* renamed from: a */
    public RecyclerView.C0629c0 mo3971a(int i) {
        Queue queue = this.f9884c.get(i);
        if (queue != null) {
            return (RecyclerView.C0629c0) queue.poll();
        }
        return null;
    }

    /* renamed from: b */
    public void mo3977b() {
        this.f9884c.clear();
    }

    /* renamed from: b */
    private final Queue<RecyclerView.C0629c0> m10644b(int i) {
        Queue<RecyclerView.C0629c0> queue = this.f9884c.get(i);
        if (queue != null) {
            return queue;
        }
        LinkedList linkedList = new LinkedList();
        this.f9884c.put(i, linkedList);
        return linkedList;
    }

    /* renamed from: a */
    public void mo3974a(RecyclerView.C0629c0 c0Var) {
        C10202j.m34178b(c0Var, "viewHolder");
        m10644b(c0Var.getItemViewType()).add(c0Var);
    }
}
