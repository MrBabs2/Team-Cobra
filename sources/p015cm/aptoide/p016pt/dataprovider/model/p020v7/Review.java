package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.Review */
public class Review {
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date added;
    private String body;
    private ListComments commentList;
    private Comments comments;

    /* renamed from: id */
    private long f4857id;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date modified;
    private Stats stats;
    private String title;
    private User user;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Review$Comments */
    public static class Comments {
        private long total;
        private String view;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Comments;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Comments)) {
                return false;
            }
            Comments comments = (Comments) obj;
            if (!comments.canEqual(this) || getTotal() != comments.getTotal()) {
                return false;
            }
            String view2 = getView();
            String view3 = comments.getView();
            return view2 != null ? view2.equals(view3) : view3 == null;
        }

        public long getTotal() {
            return this.total;
        }

        public String getView() {
            return this.view;
        }

        public int hashCode() {
            int i;
            long total2 = getTotal();
            String view2 = getView();
            int i2 = (((int) (total2 ^ (total2 >>> 32))) + 59) * 59;
            if (view2 == null) {
                i = 43;
            } else {
                i = view2.hashCode();
            }
            return i2 + i;
        }

        public void setTotal(long j) {
            this.total = j;
        }

        public void setView(String str) {
            this.view = str;
        }

        public String toString() {
            return "Review.Comments(total=" + getTotal() + ", view=" + getView() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Review$Stats */
    public static class Stats {
        private long comments;
        private long likes;
        private long points;
        private float rating;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Stats;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj;
            return stats.canEqual(this) && Float.compare(getRating(), stats.getRating()) == 0 && getPoints() == stats.getPoints() && getLikes() == stats.getLikes() && getComments() == stats.getComments();
        }

        public long getComments() {
            return this.comments;
        }

        public long getLikes() {
            return this.likes;
        }

        public long getPoints() {
            return this.points;
        }

        public float getRating() {
            return this.rating;
        }

        public int hashCode() {
            long points2 = getPoints();
            long likes2 = getLikes();
            long comments2 = getComments();
            return ((((((Float.floatToIntBits(getRating()) + 59) * 59) + ((int) (points2 ^ (points2 >>> 32)))) * 59) + ((int) (likes2 ^ (likes2 >>> 32)))) * 59) + ((int) (comments2 ^ (comments2 >>> 32)));
        }

        public void setComments(long j) {
            this.comments = j;
        }

        public void setLikes(long j) {
            this.likes = j;
        }

        public void setPoints(long j) {
            this.points = j;
        }

        public void setRating(float f) {
            this.rating = f;
        }

        public String toString() {
            return "Review.Stats(rating=" + getRating() + ", points=" + getPoints() + ", likes=" + getLikes() + ", comments=" + getComments() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Review$User */
    public static class User {
        private String avatar;

        /* renamed from: id */
        private long f4858id;
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
            return avatar2 != null ? avatar2.equals(avatar3) : avatar3 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public long getId() {
            return this.f4858id;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            int i;
            long id = getId();
            String name2 = getName();
            int i2 = (((int) (id ^ (id >>> 32))) + 59) * 59;
            int i3 = 43;
            if (name2 == null) {
                i = 43;
            } else {
                i = name2.hashCode();
            }
            int i4 = i2 + i;
            String avatar2 = getAvatar();
            int i5 = i4 * 59;
            if (avatar2 != null) {
                i3 = avatar2.hashCode();
            }
            return i5 + i3;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(long j) {
            this.f4858id = j;
        }

        public void setName(String str) {
            this.name = str;
        }

        public String toString() {
            return "Review.User(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof Review;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Review)) {
            return false;
        }
        Review review = (Review) obj;
        if (!review.canEqual(this) || getId() != review.getId()) {
            return false;
        }
        String title2 = getTitle();
        String title3 = review.getTitle();
        if (title2 != null ? !title2.equals(title3) : title3 != null) {
            return false;
        }
        String body2 = getBody();
        String body3 = review.getBody();
        if (body2 != null ? !body2.equals(body3) : body3 != null) {
            return false;
        }
        Date added2 = getAdded();
        Date added3 = review.getAdded();
        if (added2 != null ? !added2.equals(added3) : added3 != null) {
            return false;
        }
        Date modified2 = getModified();
        Date modified3 = review.getModified();
        if (modified2 != null ? !modified2.equals(modified3) : modified3 != null) {
            return false;
        }
        User user2 = getUser();
        User user3 = review.getUser();
        if (user2 != null ? !user2.equals(user3) : user3 != null) {
            return false;
        }
        Stats stats2 = getStats();
        Stats stats3 = review.getStats();
        if (stats2 != null ? !stats2.equals(stats3) : stats3 != null) {
            return false;
        }
        Comments comments2 = getComments();
        Comments comments3 = review.getComments();
        if (comments2 != null ? !comments2.equals(comments3) : comments3 != null) {
            return false;
        }
        ListComments commentList2 = getCommentList();
        ListComments commentList3 = review.getCommentList();
        return commentList2 != null ? commentList2.equals(commentList3) : commentList3 == null;
    }

    public Date getAdded() {
        return this.added;
    }

    public String getBody() {
        return this.body;
    }

    public ListComments getCommentList() {
        return this.commentList;
    }

    public Comments getComments() {
        return this.comments;
    }

    public long getId() {
        return this.f4857id;
    }

    public Date getModified() {
        return this.modified;
    }

    public Stats getStats() {
        return this.stats;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public boolean hasComments() {
        ListComments listComments = this.commentList;
        return (listComments == null || listComments.getDataList() == null || this.commentList.getDataList().getList() == null || this.commentList.getDataList().getList().isEmpty()) ? false : true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long id = getId();
        String title2 = getTitle();
        int i8 = (((int) (id ^ (id >>> 32))) + 59) * 59;
        int i9 = 43;
        if (title2 == null) {
            i = 43;
        } else {
            i = title2.hashCode();
        }
        int i10 = i8 + i;
        String body2 = getBody();
        int i11 = i10 * 59;
        if (body2 == null) {
            i2 = 43;
        } else {
            i2 = body2.hashCode();
        }
        int i12 = i11 + i2;
        Date added2 = getAdded();
        int i13 = i12 * 59;
        if (added2 == null) {
            i3 = 43;
        } else {
            i3 = added2.hashCode();
        }
        int i14 = i13 + i3;
        Date modified2 = getModified();
        int i15 = i14 * 59;
        if (modified2 == null) {
            i4 = 43;
        } else {
            i4 = modified2.hashCode();
        }
        int i16 = i15 + i4;
        User user2 = getUser();
        int i17 = i16 * 59;
        if (user2 == null) {
            i5 = 43;
        } else {
            i5 = user2.hashCode();
        }
        int i18 = i17 + i5;
        Stats stats2 = getStats();
        int i19 = i18 * 59;
        if (stats2 == null) {
            i6 = 43;
        } else {
            i6 = stats2.hashCode();
        }
        int i20 = i19 + i6;
        Comments comments2 = getComments();
        int i21 = i20 * 59;
        if (comments2 == null) {
            i7 = 43;
        } else {
            i7 = comments2.hashCode();
        }
        int i22 = i21 + i7;
        ListComments commentList2 = getCommentList();
        int i23 = i22 * 59;
        if (commentList2 != null) {
            i9 = commentList2.hashCode();
        }
        return i23 + i9;
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setCommentList(ListComments listComments) {
        this.commentList = listComments;
    }

    public void setComments(Comments comments2) {
        this.comments = comments2;
    }

    public void setId(long j) {
        this.f4857id = j;
    }

    public void setModified(Date date) {
        this.modified = date;
    }

    public void setStats(Stats stats2) {
        this.stats = stats2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    public String toString() {
        return "Review(id=" + getId() + ", title=" + getTitle() + ", body=" + getBody() + ", added=" + getAdded() + ", modified=" + getModified() + ", user=" + getUser() + ", stats=" + getStats() + ", comments=" + getComments() + ", commentList=" + getCommentList() + ")";
    }
}
