package p015cm.aptoide.p016pt.permission;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.core.app.C0352a;
import androidx.core.content.C0394a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p015cm.aptoide.p016pt.permission.PermissionProvider;
import p112n.p118g.p119b.C5305c;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.permission.PermissionProviderActivity */
public abstract class PermissionProviderActivity extends PermissionServiceActivity implements PermissionProvider {
    private C5305c<Set<PermissionProvider.Permission>> permissionRelay;
    private SparseArray<Set<PermissionProvider.Permission>> requestedCodeGrantedPermissions;

    /* renamed from: a */
    static /* synthetic */ Iterable m6649a(Set set) {
        return set;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13330a(int i, Set set) {
        return C5368e.m10256b(C5368e.m10257c(set), C5368e.m10257c(this.requestedCodeGrantedPermissions.get(i)), C3571c.f6581f).mo18691h(C3573e.f6583f).mo18681d(new C3572d(i)).mo18698l().mo18681d(C3574f.f6584f);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.permissionRelay = C5305c.m10045o();
        this.requestedCodeGrantedPermissions = new SparseArray<>();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            hashSet.add(new PermissionProvider.Permission(i, strArr[i2], iArr[i2] == 0));
        }
        this.permissionRelay.call(hashSet);
    }

    public C5368e<List<PermissionProvider.Permission>> permissionResults(int i) {
        return this.permissionRelay.mo18687f(new C3570b(this, i));
    }

    public void providePermissions(String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        this.requestedCodeGrantedPermissions.clear();
        for (String str : strArr) {
            if (C0394a.m1910a((Context) this, str) == 0) {
                hashSet.add(new PermissionProvider.Permission(i, str, true));
            } else {
                arrayList.add(str);
            }
        }
        this.requestedCodeGrantedPermissions.put(i, hashSet);
        if (arrayList.isEmpty()) {
            this.permissionRelay.call(hashSet);
        } else {
            C0352a.m1773a(this, (String[]) arrayList.toArray(new String[0]), i);
        }
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m6647a(int i, PermissionProvider.Permission permission) {
        return Boolean.valueOf(i == permission.getRequestCode());
    }
}
