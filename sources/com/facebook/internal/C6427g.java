package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.fragment.app.C0454b;
import androidx.fragment.app.C0456c;
import com.facebook.C4716f;
import com.facebook.FacebookException;
import com.facebook.internal.C6482z;

/* renamed from: com.facebook.internal.g */
/* compiled from: FacebookDialogFragment */
public class C6427g extends C0454b {

    /* renamed from: f */
    private Dialog f11798f;

    /* renamed from: com.facebook.internal.g$a */
    /* compiled from: FacebookDialogFragment */
    class C6428a implements C6482z.C6489g {
        C6428a() {
        }

        /* renamed from: a */
        public void mo20976a(Bundle bundle, FacebookException facebookException) {
            C6427g.this.m13319a(bundle, facebookException);
        }
    }

    /* renamed from: com.facebook.internal.g$b */
    /* compiled from: FacebookDialogFragment */
    class C6429b implements C6482z.C6489g {
        C6429b() {
        }

        /* renamed from: a */
        public void mo20976a(Bundle bundle, FacebookException facebookException) {
            C6427g.this.m13318a(bundle);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f11798f instanceof C6482z) && isResumed()) {
            ((C6482z) this.f11798f).mo21041d();
        }
    }

    public void onCreate(Bundle bundle) {
        C6482z zVar;
        super.onCreate(bundle);
        if (this.f11798f == null) {
            C0456c activity = getActivity();
            Bundle b = C6461s.m13434b(activity.getIntent());
            if (!b.getBoolean("is_fallback", false)) {
                String string = b.getString("action");
                Bundle bundle2 = b.getBundle("params");
                if (C6476x.m13533d(string)) {
                    C6476x.m13528c("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                }
                C6482z.C6487e eVar = new C6482z.C6487e(activity, string, bundle2);
                eVar.mo21054a(new C6428a());
                zVar = eVar.mo21055a();
            } else {
                String string2 = b.getString("url");
                if (C6476x.m13533d(string2)) {
                    C6476x.m13528c("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                zVar = C6435j.m13333a(activity, string2, String.format("fb%s://bridge/", new Object[]{C4716f.m7697f()}));
                zVar.mo21036a((C6482z.C6489g) new C6429b());
            }
            this.f11798f = zVar;
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f11798f == null) {
            m13319a((Bundle) null, (FacebookException) null);
            setShowsDialog(false);
        }
        return this.f11798f;
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        Dialog dialog = this.f11798f;
        if (dialog instanceof C6482z) {
            ((C6482z) dialog).mo21041d();
        }
    }

    /* renamed from: a */
    public void mo20975a(Dialog dialog) {
        this.f11798f = dialog;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13319a(Bundle bundle, FacebookException facebookException) {
        C0456c activity = getActivity();
        activity.setResult(facebookException == null ? -1 : 0, C6461s.m13424a(activity.getIntent(), bundle, facebookException));
        activity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13318a(Bundle bundle) {
        C0456c activity = getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
