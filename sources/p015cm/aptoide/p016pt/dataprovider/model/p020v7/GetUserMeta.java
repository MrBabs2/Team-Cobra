package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetUserMeta */
public class GetUserMeta extends BaseV7Response {
    private Data data;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetUserMeta$Data */
    public static class Data {
        private String access;
        private String added;
        private String avatar;

        /* renamed from: id */
        private long f4853id;
        private Identity identity;
        private int level;
        private String modified;
        private String name;
        private Store store;

        public String getAccess() {
            return this.access;
        }

        public String getAdded() {
            return this.added;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public long getId() {
            return this.f4853id;
        }

        public Identity getIdentity() {
            return this.identity;
        }

        public int getLevel() {
            return this.level;
        }

        public String getModified() {
            return this.modified;
        }

        public String getName() {
            return this.name;
        }

        public Store getStore() {
            return this.store;
        }

        public void setAccess(String str) {
            this.access = str;
        }

        public void setAdded(String str) {
            this.added = str;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(long j) {
            this.f4853id = j;
        }

        public void setIdentity(Identity identity2) {
            this.identity = identity2;
        }

        public void setLevel(int i) {
            this.level = i;
        }

        public void setModified(String str) {
            this.modified = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setStore(Store store2) {
            this.store = store2;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetUserMeta$Identity */
    public static class Identity {
        private String email;
        private String phone;
        private String username;

        public String getEmail() {
            return this.email;
        }

        public String getPhone() {
            return this.phone;
        }

        public String getUsername() {
            return this.username;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setPhone(String str) {
            this.phone = str;
        }

        public void setUsername(String str) {
            this.username = str;
        }
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data2) {
        this.data = data2;
    }
}
