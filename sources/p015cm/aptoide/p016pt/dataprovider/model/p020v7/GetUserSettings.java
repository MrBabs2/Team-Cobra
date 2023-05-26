package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetUserSettings */
public class GetUserSettings extends BaseV7Response {
    private Data data;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetUserSettings$Access */
    public static class Access {
        private boolean confirmed;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Access;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Access)) {
                return false;
            }
            Access access = (Access) obj;
            return access.canEqual(this) && isConfirmed() == access.isConfirmed();
        }

        public int hashCode() {
            return 59 + (isConfirmed() ? 79 : 97);
        }

        public boolean isConfirmed() {
            return this.confirmed;
        }

        public void setConfirmed(boolean z) {
            this.confirmed = z;
        }

        public String toString() {
            return "GetUserSettings.Access(confirmed=" + isConfirmed() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetUserSettings$Data */
    public static class Data {
        private Access access;
        private boolean mature;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Data;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            if (!data.canEqual(this) || isMature() != data.isMature()) {
                return false;
            }
            Access access2 = getAccess();
            Access access3 = data.getAccess();
            return access2 != null ? access2.equals(access3) : access3 == null;
        }

        public Access getAccess() {
            return this.access;
        }

        public int hashCode() {
            int i;
            int i2 = isMature() ? 79 : 97;
            Access access2 = getAccess();
            int i3 = (i2 + 59) * 59;
            if (access2 == null) {
                i = 43;
            } else {
                i = access2.hashCode();
            }
            return i3 + i;
        }

        public boolean isMature() {
            return this.mature;
        }

        public void setAccess(Access access2) {
            this.access = access2;
        }

        public void setMature(boolean z) {
            this.mature = z;
        }

        public String toString() {
            return "GetUserSettings.Data(mature=" + isMature() + ", access=" + getAccess() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetUserSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUserSettings)) {
            return false;
        }
        GetUserSettings getUserSettings = (GetUserSettings) obj;
        if (!getUserSettings.canEqual(this)) {
            return false;
        }
        Data data2 = getData();
        Data data3 = getUserSettings.getData();
        return data2 != null ? data2.equals(data3) : data3 == null;
    }

    public Data getData() {
        return this.data;
    }

    public int hashCode() {
        int i;
        Data data2 = getData();
        if (data2 == null) {
            i = 43;
        } else {
            i = data2.hashCode();
        }
        return 59 + i;
    }

    public void setData(Data data2) {
        this.data = data2;
    }

    public String toString() {
        return "GetUserSettings(data=" + getData() + ")";
    }
}
