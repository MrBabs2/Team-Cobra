package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.SetComment */
public class SetComment extends BaseV7Response {
    private Data data;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.SetComment$Data */
    public static class Data {
        private String body;

        /* renamed from: id */
        private long f4859id;
        private String mode;
        private String status;
        private Comment.User user;

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
            if (!data.canEqual(this) || getId() != data.getId()) {
                return false;
            }
            String body2 = getBody();
            String body3 = data.getBody();
            if (body2 != null ? !body2.equals(body3) : body3 != null) {
                return false;
            }
            Comment.User user2 = getUser();
            Comment.User user3 = data.getUser();
            if (user2 != null ? !user2.equals(user3) : user3 != null) {
                return false;
            }
            String status2 = getStatus();
            String status3 = data.getStatus();
            if (status2 != null ? !status2.equals(status3) : status3 != null) {
                return false;
            }
            String mode2 = getMode();
            String mode3 = data.getMode();
            return mode2 != null ? mode2.equals(mode3) : mode3 == null;
        }

        public String getBody() {
            return this.body;
        }

        public long getId() {
            return this.f4859id;
        }

        public String getMode() {
            return this.mode;
        }

        public String getStatus() {
            return this.status;
        }

        public Comment.User getUser() {
            return this.user;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            long id = getId();
            String body2 = getBody();
            int i4 = (((int) (id ^ (id >>> 32))) + 59) * 59;
            int i5 = 43;
            if (body2 == null) {
                i = 43;
            } else {
                i = body2.hashCode();
            }
            int i6 = i4 + i;
            Comment.User user2 = getUser();
            int i7 = i6 * 59;
            if (user2 == null) {
                i2 = 43;
            } else {
                i2 = user2.hashCode();
            }
            int i8 = i7 + i2;
            String status2 = getStatus();
            int i9 = i8 * 59;
            if (status2 == null) {
                i3 = 43;
            } else {
                i3 = status2.hashCode();
            }
            int i10 = i9 + i3;
            String mode2 = getMode();
            int i11 = i10 * 59;
            if (mode2 != null) {
                i5 = mode2.hashCode();
            }
            return i11 + i5;
        }

        public void setBody(String str) {
            this.body = str;
        }

        public void setId(long j) {
            this.f4859id = j;
        }

        public void setMode(String str) {
            this.mode = str;
        }

        public void setStatus(String str) {
            this.status = str;
        }

        public void setUser(Comment.User user2) {
            this.user = user2;
        }

        public String toString() {
            return "SetComment.Data(id=" + getId() + ", body=" + getBody() + ", user=" + getUser() + ", status=" + getStatus() + ", mode=" + getMode() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof SetComment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetComment)) {
            return false;
        }
        SetComment setComment = (SetComment) obj;
        if (!setComment.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Data data2 = getData();
        Data data3 = setComment.getData();
        return data2 != null ? data2.equals(data3) : data3 == null;
    }

    public Data getData() {
        return this.data;
    }

    public int hashCode() {
        int i;
        Data data2 = getData();
        int hashCode = (super.hashCode() + 59) * 59;
        if (data2 == null) {
            i = 43;
        } else {
            i = data2.hashCode();
        }
        return hashCode + i;
    }

    public void setData(Data data2) {
        this.data = data2;
    }

    public String toString() {
        return "SetComment(data=" + getData() + ")";
    }
}
