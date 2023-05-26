package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.ListAppVersions;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetApp */
public class GetApp extends BaseV7Response {
    private Nodes nodes;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetApp$Nodes */
    public static class Nodes {
        private GroupDatalist groups;
        private GetAppMeta meta;
        private ListAppVersions versions;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Nodes;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Nodes)) {
                return false;
            }
            Nodes nodes = (Nodes) obj;
            if (!nodes.canEqual(this)) {
                return false;
            }
            GetAppMeta meta2 = getMeta();
            GetAppMeta meta3 = nodes.getMeta();
            if (meta2 != null ? !meta2.equals(meta3) : meta3 != null) {
                return false;
            }
            ListAppVersions versions2 = getVersions();
            ListAppVersions versions3 = nodes.getVersions();
            if (versions2 != null ? !versions2.equals(versions3) : versions3 != null) {
                return false;
            }
            GroupDatalist groups2 = getGroups();
            GroupDatalist groups3 = nodes.getGroups();
            return groups2 != null ? groups2.equals(groups3) : groups3 == null;
        }

        public GroupDatalist getGroups() {
            return this.groups;
        }

        public GetAppMeta getMeta() {
            return this.meta;
        }

        public ListAppVersions getVersions() {
            return this.versions;
        }

        public int hashCode() {
            int i;
            int i2;
            GetAppMeta meta2 = getMeta();
            int i3 = 43;
            if (meta2 == null) {
                i = 43;
            } else {
                i = meta2.hashCode();
            }
            ListAppVersions versions2 = getVersions();
            int i4 = (i + 59) * 59;
            if (versions2 == null) {
                i2 = 43;
            } else {
                i2 = versions2.hashCode();
            }
            int i5 = i4 + i2;
            GroupDatalist groups2 = getGroups();
            int i6 = i5 * 59;
            if (groups2 != null) {
                i3 = groups2.hashCode();
            }
            return i6 + i3;
        }

        public void setGroups(GroupDatalist groupDatalist) {
            this.groups = groupDatalist;
        }

        public void setMeta(GetAppMeta getAppMeta) {
            this.meta = getAppMeta;
        }

        public void setVersions(ListAppVersions listAppVersions) {
            this.versions = listAppVersions;
        }

        public String toString() {
            return "GetApp.Nodes(meta=" + getMeta() + ", versions=" + getVersions() + ", groups=" + getGroups() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetApp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetApp)) {
            return false;
        }
        GetApp getApp = (GetApp) obj;
        if (!getApp.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Nodes nodes2 = getNodes();
        Nodes nodes3 = getApp.getNodes();
        return nodes2 != null ? nodes2.equals(nodes3) : nodes3 == null;
    }

    public Nodes getNodes() {
        return this.nodes;
    }

    public int hashCode() {
        int i;
        Nodes nodes2 = getNodes();
        int hashCode = (super.hashCode() + 59) * 59;
        if (nodes2 == null) {
            i = 43;
        } else {
            i = nodes2.hashCode();
        }
        return hashCode + i;
    }

    public void setNodes(Nodes nodes2) {
        this.nodes = nodes2;
    }

    public String toString() {
        return "GetApp(nodes=" + getNodes() + ")";
    }
}
