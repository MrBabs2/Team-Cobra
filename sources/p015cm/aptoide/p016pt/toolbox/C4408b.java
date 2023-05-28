package p015cm.aptoide.p016pt.toolbox;

import android.content.Context;
import android.widget.Toast;
import java.util.Map;

/* renamed from: cm.aptoide.pt.toolbox.b */
/* compiled from: lambda */
public final /* synthetic */ class C4408b implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Context f7572f;

    /* renamed from: g */
    private final /* synthetic */ Map.Entry f7573g;

    public /* synthetic */ C4408b(Context context, Map.Entry entry) {
        this.f7572f = context;
        this.f7573g = entry;
    }

    public final void run() {
        Toast.makeText(this.f7572f, "Preference set: " + ((String) this.f7573g.getKey()) + "=" + this.f7573g.getValue(), 1).show();
    }
}
