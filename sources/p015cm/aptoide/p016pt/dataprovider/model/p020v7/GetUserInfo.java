package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetUserInfo */
public class GetUserInfo extends BaseV7Response {
    private Nodes nodes;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetUserInfo$Nodes */
    public static class Nodes {
        private GetUserMeta meta;
        private GetUserSettings settings;

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
            GetUserMeta meta2 = getMeta();
            GetUserMeta meta3 = nodes.getMeta();
            if (meta2 != null ? !meta2.equals(meta3) : meta3 != null) {
                return false;
            }
            GetUserSettings settings2 = getSettings();
            GetUserSettings settings3 = nodes.getSettings();
            return settings2 != null ? settings2.equals(settings3) : settings3 == null;
        }

        public GetUserMeta getMeta() {
            return this.meta;
        }

        public GetUserSettings getSettings() {
            return this.settings;
        }

        public int hashCode() {
            int i;
            GetUserMeta meta2 = getMeta();
            int i2 = 43;
            if (meta2 == null) {
                i = 43;
            } else {
                i = meta2.hashCode();
            }
            GetUserSettings settings2 = getSettings();
            int i3 = (i + 59) * 59;
            if (settings2 != null) {
                i2 = settings2.hashCode();
            }
            return i3 + i2;
        }

        public void setMeta(GetUserMeta getUserMeta) {
            this.meta = getUserMeta;
        }

        public void setSettings(GetUserSettings getUserSettings) {
            this.settings = getUserSettings;
        }

        public String toString() {
            return "GetUserInfo.Nodes(meta=" + getMeta() + ", settings=" + getSettings() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUserInfo)) {
            return false;
        }
        GetUserInfo getUserInfo = (GetUserInfo) obj;
        if (!getUserInfo.canEqual(this)) {
            return false;
        }
        Nodes nodes2 = getNodes();
        Nodes nodes3 = getUserInfo.getNodes();
        return nodes2 != null ? nodes2.equals(nodes3) : nodes3 == null;
    }

    public Nodes getNodes() {
        return this.nodes;
    }

    public int hashCode() {
        int i;
        Nodes nodes2 = getNodes();
        if (nodes2 == null) {
            i = 43;
        } else {
            i = nodes2.hashCode();
        }
        return 59 + i;
    }

    public void setNodes(Nodes nodes2) {
        this.nodes = nodes2;
    }

    public String toString() {
        return "GetUserInfo(nodes=" + getNodes() + ")";
    }
}
