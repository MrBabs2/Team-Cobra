package p015cm.aptoide.p016pt.permissions;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cm.aptoide.pt.permissions.ApkPermissionGroup */
public class ApkPermissionGroup {
    private List<String> descriptions;
    private String name;

    public ApkPermissionGroup(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        this.descriptions = arrayList;
        this.name = str;
        arrayList.add(str2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ApkPermissionGroup) {
            ApkPermissionGroup apkPermissionGroup = (ApkPermissionGroup) obj;
            return getName().equals(apkPermissionGroup.getName()) && this.descriptions.size() == apkPermissionGroup.descriptions.size();
        }
    }

    public List<String> getDescriptions() {
        return this.descriptions;
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String str) {
        this.descriptions.add(str);
    }

    public void setName(String str) {
        this.name = str;
    }
}
