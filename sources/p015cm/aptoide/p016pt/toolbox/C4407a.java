package p015cm.aptoide.p016pt.toolbox;

import android.content.Context;
import android.widget.Toast;

/* renamed from: cm.aptoide.pt.toolbox.a */
/* compiled from: lambda */
public final /* synthetic */ class C4407a implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Context f7571f;

    public /* synthetic */ C4407a(Context context) {
        this.f7571f = context;
    }

    public final void run() {
        Toast.makeText(this.f7571f, "Please enable debug mode for toolbox to work.", 1).show();
    }
}
