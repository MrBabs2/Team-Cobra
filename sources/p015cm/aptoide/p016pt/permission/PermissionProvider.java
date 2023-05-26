package p015cm.aptoide.p016pt.permission;

import java.util.List;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.permission.PermissionProvider */
public interface PermissionProvider {

    /* renamed from: cm.aptoide.pt.permission.PermissionProvider$Permission */
    public static class Permission {
        private final boolean granted;
        private final String name;
        private final int requestCode;

        public Permission(int i, String str, boolean z) {
            this.requestCode = i;
            this.name = str;
            this.granted = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Permission.class != obj.getClass()) {
                return false;
            }
            Permission permission = (Permission) obj;
            if (this.requestCode != permission.requestCode) {
                return false;
            }
            return this.name.equals(permission.name);
        }

        public String getName() {
            return this.name;
        }

        public int getRequestCode() {
            return this.requestCode;
        }

        public int hashCode() {
            return (this.requestCode * 31) + this.name.hashCode();
        }

        public boolean isGranted() {
            return this.granted;
        }
    }

    C5368e<List<Permission>> permissionResults(int i);

    void providePermissions(String[] strArr, int i);
}
