package p015cm.aptoide.p016pt.view.recycler;

import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.view.recycler.b */
/* compiled from: lambda */
public final /* synthetic */ class C4659b implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ BaseAdapter f7917f;

    /* renamed from: g */
    private final /* synthetic */ int f7918g;

    /* renamed from: h */
    private final /* synthetic */ Displayable f7919h;

    public /* synthetic */ C4659b(BaseAdapter baseAdapter, int i, Displayable displayable) {
        this.f7917f = baseAdapter;
        this.f7918g = i;
        this.f7919h = displayable;
    }

    public final void run() {
        this.f7917f.mo15633a(this.f7918g, this.f7919h);
    }
}
