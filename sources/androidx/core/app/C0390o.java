package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0394a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.o */
/* compiled from: TaskStackBuilder */
public final class C0390o implements Iterable<Intent> {

    /* renamed from: f */
    private final ArrayList<Intent> f1765f = new ArrayList<>();

    /* renamed from: g */
    private final Context f1766g;

    /* renamed from: androidx.core.app.o$a */
    /* compiled from: TaskStackBuilder */
    public interface C0391a {
        Intent getSupportParentActivityIntent();
    }

    private C0390o(Context context) {
        this.f1766g = context;
    }

    /* renamed from: a */
    public static C0390o m1891a(Context context) {
        return new C0390o(context);
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1765f.iterator();
    }

    /* renamed from: a */
    public C0390o mo2283a(Intent intent) {
        this.f1765f.add(intent);
        return this;
    }

    /* renamed from: a */
    public C0390o mo2281a(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof C0391a ? ((C0391a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0371g.m1800a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f1766g.getPackageManager());
            }
            mo2282a(component);
            mo2283a(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: a */
    public C0390o mo2282a(ComponentName componentName) {
        int size = this.f1765f.size();
        try {
            Intent a = C0371g.m1801a(this.f1766g, componentName);
            while (a != null) {
                this.f1765f.add(size, a);
                a = C0371g.m1801a(this.f1766g, a.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public void mo2284a() {
        mo2285a((Bundle) null);
    }

    /* renamed from: a */
    public void mo2285a(Bundle bundle) {
        if (!this.f1765f.isEmpty()) {
            ArrayList<Intent> arrayList = this.f1765f;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0394a.m1913a(this.f1766g, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f1766g.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
