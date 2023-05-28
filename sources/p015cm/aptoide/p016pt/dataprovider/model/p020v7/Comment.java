package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.Comment */
public class Comment {
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date added;
    private String body;

    /* renamed from: id */
    private long f4843id;
    private Parent parent;
    private Long parentReview;
    private User user;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Comment$Access */
    public enum Access {
        PUBLIC,
        PRIVATE,
        UNLISTED
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Comment$Parent */
    public static class Parent {

        /* renamed from: id */
        private long f4844id;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Parent;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Parent)) {
                return false;
            }
            Parent parent = (Parent) obj;
            return parent.canEqual(this) && getId() == parent.getId();
        }

        public long getId() {
            return this.f4844id;
        }

        public int hashCode() {
            long id = getId();
            return 59 + ((int) (id ^ (id >>> 32)));
        }

        public void setId(long j) {
            this.f4844id = j;
        }

        public String toString() {
            return "Comment.Parent(id=" + getId() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Comment$User */
    public static class User {
        private Access access;
        private String avatar;

        /* renamed from: id */
        private long f4845id;
        private String name;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof User;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            if (!user.canEqual(this) || getId() != user.getId()) {
                return false;
            }
            String name2 = getName();
            String name3 = user.getName();
            if (name2 != null ? !name2.equals(name3) : name3 != null) {
                return false;
            }
            String avatar2 = getAvatar();
            String avatar3 = user.getAvatar();
            if (avatar2 != null ? !avatar2.equals(avatar3) : avatar3 != null) {
                return false;
            }
            Access access2 = getAccess();
            Access access3 = user.getAccess();
            return access2 != null ? access2.equals(access3) : access3 == null;
        }

        public Access getAccess() {
            return this.access;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public long getId() {
            return this.f4845id;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            int i;
            int i2;
            long id = getId();
            String name2 = getName();
            int i3 = (((int) (id ^ (id >>> 32))) + 59) * 59;
            int i4 = 43;
            if (name2 == null) {
                i = 43;
            } else {
                i = name2.hashCode();
            }
            int i5 = i3 + i;
            String avatar2 = getAvatar();
            int i6 = i5 * 59;
            if (avatar2 == null) {
                i2 = 43;
            } else {
                i2 = avatar2.hashCode();
            }
            int i7 = i6 + i2;
            Access access2 = getAccess();
            int i8 = i7 * 59;
            if (access2 != null) {
                i4 = access2.hashCode();
            }
            return i8 + i4;
        }

        public void setAccess(Access access2) {
            this.access = access2;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(long j) {
            this.f4845id = j;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "Comment.User(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ", access=" + getAccess() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof Comment;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) obj;
        if (!comment.canEqual(this) || getId() != comment.getId()) {
            return false;
        }
        String body2 = getBody();
        String body3 = comment.getBody();
        if (body2 != null ? !body2.equals(body3) : body3 != null) {
            return false;
        }
        Date added2 = getAdded();
        Date added3 = comment.getAdded();
        if (added2 != null ? !added2.equals(added3) : added3 != null) {
            return false;
        }
        User user2 = getUser();
        User user3 = comment.getUser();
        if (user2 != null ? !user2.equals(user3) : user3 != null) {
            return false;
        }
        Long parentReview2 = getParentReview();
        Long parentReview3 = comment.getParentReview();
        if (parentReview2 != null ? !parentReview2.equals(parentReview3) : parentReview3 != null) {
            return false;
        }
        Parent parent2 = getParent();
        Parent parent3 = comment.getParent();
        return parent2 != null ? parent2.equals(parent3) : parent3 == null;
    }

    public Date getAdded() {
        return this.added;
    }

    public String getBody() {
        return this.body;
    }

    public long getId() {
        return this.f4843id;
    }

    public Parent getParent() {
        return this.parent;
    }

    public Long getParentReview() {
        return this.parentReview;
    }

    public User getUser() {
        return this.user;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        long id = getId();
        String body2 = getBody();
        int i5 = (((int) (id ^ (id >>> 32))) + 59) * 59;
        int i6 = 43;
        if (body2 == null) {
            i = 43;
        } else {
            i = body2.hashCode();
        }
        int i7 = i5 + i;
        Date added2 = getAdded();
        int i8 = i7 * 59;
        if (added2 == null) {
            i2 = 43;
        } else {
            i2 = added2.hashCode();
        }
        int i9 = i8 + i2;
        User user2 = getUser();
        int i10 = i9 * 59;
        if (user2 == null) {
            i3 = 43;
        } else {
            i3 = user2.hashCode();
        }
        int i11 = i10 + i3;
        Long parentReview2 = getParentReview();
        int i12 = i11 * 59;
        if (parentReview2 == null) {
            i4 = 43;
        } else {
            i4 = parentReview2.hashCode();
        }
        int i13 = i12 + i4;
        Parent parent2 = getParent();
        int i14 = i13 * 59;
        if (parent2 != null) {
            i6 = parent2.hashCode();
        }
        return i14 + i6;
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setId(long j) {
        this.f4843id = j;
    }

    public void setParent(Parent parent2) {
        this.parent = parent2;
    }

    public void setParentReview(Long l) {
        this.parentReview = l;
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    public String toString() {
        return "Comment(id=" + getId() + ", body=" + getBody() + ", added=" + getAdded() + ", user=" + getUser() + ", parentReview=" + getParentReview() + ", parent=" + getParent() + ")";
    }
}
