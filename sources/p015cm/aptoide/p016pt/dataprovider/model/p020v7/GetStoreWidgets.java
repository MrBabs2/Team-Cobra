package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Review;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetStoreWidgets */
public class GetStoreWidgets extends BaseV7EndlessDataListResponse<WSWidget> {

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetStoreWidgets$WSWidget */
    public static class WSWidget {
        public static final String ADS_TYPE = "ADS";
        public static final String APPS_GROUP_TYPE = "APPS_GROUP";
        public static final String CATEGORIES_TYPE = "DISPLAYS";
        public static final String COMMENTS_TYPE = "COMMENTS";
        public static final String REVIEWS_TYPE = "REVIEWS";
        public static final String STORE_GROUP = "STORES_GROUP";
        public static final String TIMELINE_TYPE = "TIMELINE";
        private List<Action> actions;
        private Data data;
        private String tag;
        private String title;
        private Type type;
        private String view;
        private Object viewObject;

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetStoreWidgets$WSWidget$Action */
        public static class Action {
            private Event event;
            private String label;
            private String tag;
            private String type;

            /* access modifiers changed from: protected */
            public boolean canEqual(Object obj) {
                return obj instanceof Action;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                if (!action.canEqual(this)) {
                    return false;
                }
                String type2 = getType();
                String type3 = action.getType();
                if (type2 != null ? !type2.equals(type3) : type3 != null) {
                    return false;
                }
                String label2 = getLabel();
                String label3 = action.getLabel();
                if (label2 != null ? !label2.equals(label3) : label3 != null) {
                    return false;
                }
                String tag2 = getTag();
                String tag3 = action.getTag();
                if (tag2 != null ? !tag2.equals(tag3) : tag3 != null) {
                    return false;
                }
                Event event2 = getEvent();
                Event event3 = action.getEvent();
                return event2 != null ? event2.equals(event3) : event3 == null;
            }

            public Event getEvent() {
                return this.event;
            }

            public String getLabel() {
                return this.label;
            }

            public String getTag() {
                return this.tag;
            }

            public String getType() {
                return this.type;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                String type2 = getType();
                int i4 = 43;
                if (type2 == null) {
                    i = 43;
                } else {
                    i = type2.hashCode();
                }
                String label2 = getLabel();
                int i5 = (i + 59) * 59;
                if (label2 == null) {
                    i2 = 43;
                } else {
                    i2 = label2.hashCode();
                }
                int i6 = i5 + i2;
                String tag2 = getTag();
                int i7 = i6 * 59;
                if (tag2 == null) {
                    i3 = 43;
                } else {
                    i3 = tag2.hashCode();
                }
                int i8 = i7 + i3;
                Event event2 = getEvent();
                int i9 = i8 * 59;
                if (event2 != null) {
                    i4 = event2.hashCode();
                }
                return i9 + i4;
            }

            public Action setEvent(Event event2) {
                this.event = event2;
                return this;
            }

            public Action setLabel(String str) {
                this.label = str;
                return this;
            }

            public Action setTag(String str) {
                this.tag = str;
                return this;
            }

            public Action setType(String str) {
                this.type = str;
                return this;
            }

            public String toString() {
                return "GetStoreWidgets.WSWidget.Action(type=" + getType() + ", label=" + getLabel() + ", tag=" + getTag() + ", event=" + getEvent() + ")";
            }
        }

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetStoreWidgets$WSWidget$Data */
        public static class Data {
            private List<Categories> categories;
            private String icon;
            private boolean isEskills;
            private Layout layout;
            private String message;
            private Review.User user;

            /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetStoreWidgets$WSWidget$Data$Categories */
            public static class Categories {
                private int adsCount;
                private String graphic;
                private String icon;

                /* renamed from: id */
                private long f4852id;
                private String name;
                private String parentId;
                private String parentRefId;
                private String refId;

                /* access modifiers changed from: protected */
                public boolean canEqual(Object obj) {
                    return obj instanceof Categories;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Categories)) {
                        return false;
                    }
                    Categories categories = (Categories) obj;
                    if (!categories.canEqual(this) || getId() != categories.getId()) {
                        return false;
                    }
                    String refId2 = getRefId();
                    String refId3 = categories.getRefId();
                    if (refId2 != null ? !refId2.equals(refId3) : refId3 != null) {
                        return false;
                    }
                    String parentId2 = getParentId();
                    String parentId3 = categories.getParentId();
                    if (parentId2 != null ? !parentId2.equals(parentId3) : parentId3 != null) {
                        return false;
                    }
                    String parentRefId2 = getParentRefId();
                    String parentRefId3 = categories.getParentRefId();
                    if (parentRefId2 != null ? !parentRefId2.equals(parentRefId3) : parentRefId3 != null) {
                        return false;
                    }
                    String name2 = getName();
                    String name3 = categories.getName();
                    if (name2 != null ? !name2.equals(name3) : name3 != null) {
                        return false;
                    }
                    String graphic2 = getGraphic();
                    String graphic3 = categories.getGraphic();
                    if (graphic2 != null ? !graphic2.equals(graphic3) : graphic3 != null) {
                        return false;
                    }
                    String icon2 = getIcon();
                    String icon3 = categories.getIcon();
                    if (icon2 != null ? icon2.equals(icon3) : icon3 == null) {
                        return getAdsCount() == categories.getAdsCount();
                    }
                    return false;
                }

                public int getAdsCount() {
                    return this.adsCount;
                }

                public String getGraphic() {
                    return this.graphic;
                }

                public String getIcon() {
                    return this.icon;
                }

                public long getId() {
                    return this.f4852id;
                }

                public String getName() {
                    return this.name;
                }

                public String getParentId() {
                    return this.parentId;
                }

                public String getParentRefId() {
                    return this.parentRefId;
                }

                public String getRefId() {
                    return this.refId;
                }

                public int hashCode() {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    long id = getId();
                    String refId2 = getRefId();
                    int i6 = (((int) (id ^ (id >>> 32))) + 59) * 59;
                    int i7 = 43;
                    if (refId2 == null) {
                        i = 43;
                    } else {
                        i = refId2.hashCode();
                    }
                    int i8 = i6 + i;
                    String parentId2 = getParentId();
                    int i9 = i8 * 59;
                    if (parentId2 == null) {
                        i2 = 43;
                    } else {
                        i2 = parentId2.hashCode();
                    }
                    int i10 = i9 + i2;
                    String parentRefId2 = getParentRefId();
                    int i11 = i10 * 59;
                    if (parentRefId2 == null) {
                        i3 = 43;
                    } else {
                        i3 = parentRefId2.hashCode();
                    }
                    int i12 = i11 + i3;
                    String name2 = getName();
                    int i13 = i12 * 59;
                    if (name2 == null) {
                        i4 = 43;
                    } else {
                        i4 = name2.hashCode();
                    }
                    int i14 = i13 + i4;
                    String graphic2 = getGraphic();
                    int i15 = i14 * 59;
                    if (graphic2 == null) {
                        i5 = 43;
                    } else {
                        i5 = graphic2.hashCode();
                    }
                    int i16 = i15 + i5;
                    String icon2 = getIcon();
                    int i17 = i16 * 59;
                    if (icon2 != null) {
                        i7 = icon2.hashCode();
                    }
                    return ((i17 + i7) * 59) + getAdsCount();
                }

                public Categories setAdsCount(int i) {
                    this.adsCount = i;
                    return this;
                }

                public Categories setGraphic(String str) {
                    this.graphic = str;
                    return this;
                }

                public Categories setIcon(String str) {
                    this.icon = str;
                    return this;
                }

                public Categories setId(long j) {
                    this.f4852id = j;
                    return this;
                }

                public Categories setName(String str) {
                    this.name = str;
                    return this;
                }

                public Categories setParentId(String str) {
                    this.parentId = str;
                    return this;
                }

                public Categories setParentRefId(String str) {
                    this.parentRefId = str;
                    return this;
                }

                public Categories setRefId(String str) {
                    this.refId = str;
                    return this;
                }

                public String toString() {
                    return "GetStoreWidgets.WSWidget.Data.Categories(id=" + getId() + ", refId=" + getRefId() + ", parentId=" + getParentId() + ", parentRefId=" + getParentRefId() + ", name=" + getName() + ", graphic=" + getGraphic() + ", icon=" + getIcon() + ", adsCount=" + getAdsCount() + ")";
                }
            }

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
                if (!data.canEqual(this)) {
                    return false;
                }
                Layout layout2 = getLayout();
                Layout layout3 = data.getLayout();
                if (layout2 != null ? !layout2.equals(layout3) : layout3 != null) {
                    return false;
                }
                String icon2 = getIcon();
                String icon3 = data.getIcon();
                if (icon2 != null ? !icon2.equals(icon3) : icon3 != null) {
                    return false;
                }
                String message2 = getMessage();
                String message3 = data.getMessage();
                if (message2 != null ? !message2.equals(message3) : message3 != null) {
                    return false;
                }
                List<Categories> categories2 = getCategories();
                List<Categories> categories3 = data.getCategories();
                if (categories2 != null ? !categories2.equals(categories3) : categories3 != null) {
                    return false;
                }
                Review.User user2 = getUser();
                Review.User user3 = data.getUser();
                return user2 != null ? user2.equals(user3) : user3 == null;
            }

            public List<Categories> getCategories() {
                return this.categories;
            }

            public String getIcon() {
                return this.icon;
            }

            public Layout getLayout() {
                return this.layout;
            }

            public String getMessage() {
                return this.message;
            }

            public Review.User getUser() {
                return this.user;
            }

            public int hashCode() {
                int i;
                int i2;
                int i3;
                int i4;
                Layout layout2 = getLayout();
                int i5 = 43;
                if (layout2 == null) {
                    i = 43;
                } else {
                    i = layout2.hashCode();
                }
                String icon2 = getIcon();
                int i6 = (i + 59) * 59;
                if (icon2 == null) {
                    i2 = 43;
                } else {
                    i2 = icon2.hashCode();
                }
                int i7 = i6 + i2;
                String message2 = getMessage();
                int i8 = i7 * 59;
                if (message2 == null) {
                    i3 = 43;
                } else {
                    i3 = message2.hashCode();
                }
                int i9 = i8 + i3;
                List<Categories> categories2 = getCategories();
                int i10 = i9 * 59;
                if (categories2 == null) {
                    i4 = 43;
                } else {
                    i4 = categories2.hashCode();
                }
                int i11 = i10 + i4;
                Review.User user2 = getUser();
                int i12 = i11 * 59;
                if (user2 != null) {
                    i5 = user2.hashCode();
                }
                return i12 + i5;
            }

            public boolean isEskills() {
                return this.isEskills;
            }

            public Data setCategories(List<Categories> list) {
                this.categories = list;
                return this;
            }

            public void setEskills(boolean z) {
                this.isEskills = z;
            }

            public Data setIcon(String str) {
                this.icon = str;
                return this;
            }

            public Data setLayout(Layout layout2) {
                this.layout = layout2;
                return this;
            }

            public Data setMessage(String str) {
                this.message = str;
                return this;
            }

            public Data setUser(Review.User user2) {
                this.user = user2;
                return this;
            }

            public String toString() {
                return "GetStoreWidgets.WSWidget.Data(layout=" + getLayout() + ", icon=" + getIcon() + ", message=" + getMessage() + ", categories=" + getCategories() + ", user=" + getUser() + ")";
            }
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof WSWidget;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WSWidget)) {
                return false;
            }
            WSWidget wSWidget = (WSWidget) obj;
            if (!wSWidget.canEqual(this)) {
                return false;
            }
            Type type2 = getType();
            Type type3 = wSWidget.getType();
            if (type2 != null ? !type2.equals(type3) : type3 != null) {
                return false;
            }
            String title2 = getTitle();
            String title3 = wSWidget.getTitle();
            if (title2 != null ? !title2.equals(title3) : title3 != null) {
                return false;
            }
            String tag2 = getTag();
            String tag3 = wSWidget.getTag();
            if (tag2 != null ? !tag2.equals(tag3) : tag3 != null) {
                return false;
            }
            String view2 = getView();
            String view3 = wSWidget.getView();
            if (view2 != null ? !view2.equals(view3) : view3 != null) {
                return false;
            }
            Object viewObject2 = getViewObject();
            Object viewObject3 = wSWidget.getViewObject();
            if (viewObject2 != null ? !viewObject2.equals(viewObject3) : viewObject3 != null) {
                return false;
            }
            List<Action> actions2 = getActions();
            List<Action> actions3 = wSWidget.getActions();
            if (actions2 != null ? !actions2.equals(actions3) : actions3 != null) {
                return false;
            }
            Data data2 = getData();
            Data data3 = wSWidget.getData();
            return data2 != null ? data2.equals(data3) : data3 == null;
        }

        public List<Action> getActions() {
            return this.actions;
        }

        public Data getData() {
            return this.data;
        }

        public String getTag() {
            return this.tag;
        }

        public String getTitle() {
            return this.title;
        }

        public Type getType() {
            return this.type;
        }

        public String getView() {
            return this.view;
        }

        public Object getViewObject() {
            return this.viewObject;
        }

        public boolean hasActions() {
            List<Action> list = this.actions;
            if (list == null || list.size() <= 0 || this.actions.get(0).getEvent().getName() == null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            Type type2 = getType();
            int i7 = 43;
            if (type2 == null) {
                i = 43;
            } else {
                i = type2.hashCode();
            }
            String title2 = getTitle();
            int i8 = (i + 59) * 59;
            if (title2 == null) {
                i2 = 43;
            } else {
                i2 = title2.hashCode();
            }
            int i9 = i8 + i2;
            String tag2 = getTag();
            int i10 = i9 * 59;
            if (tag2 == null) {
                i3 = 43;
            } else {
                i3 = tag2.hashCode();
            }
            int i11 = i10 + i3;
            String view2 = getView();
            int i12 = i11 * 59;
            if (view2 == null) {
                i4 = 43;
            } else {
                i4 = view2.hashCode();
            }
            int i13 = i12 + i4;
            Object viewObject2 = getViewObject();
            int i14 = i13 * 59;
            if (viewObject2 == null) {
                i5 = 43;
            } else {
                i5 = viewObject2.hashCode();
            }
            int i15 = i14 + i5;
            List<Action> actions2 = getActions();
            int i16 = i15 * 59;
            if (actions2 == null) {
                i6 = 43;
            } else {
                i6 = actions2.hashCode();
            }
            int i17 = i16 + i6;
            Data data2 = getData();
            int i18 = i17 * 59;
            if (data2 != null) {
                i7 = data2.hashCode();
            }
            return i18 + i7;
        }

        public WSWidget setActions(List<Action> list) {
            this.actions = list;
            return this;
        }

        public WSWidget setData(Data data2) {
            this.data = data2;
            return this;
        }

        public WSWidget setTag(String str) {
            this.tag = str;
            return this;
        }

        public WSWidget setTitle(String str) {
            this.title = str;
            return this;
        }

        public WSWidget setType(Type type2) {
            this.type = type2;
            return this;
        }

        public WSWidget setView(String str) {
            this.view = str;
            return this;
        }

        public WSWidget setViewObject(Object obj) {
            this.viewObject = obj;
            return this;
        }

        public String toString() {
            return "GetStoreWidgets.WSWidget(type=" + getType() + ", title=" + getTitle() + ", tag=" + getTag() + ", view=" + getView() + ", viewObject=" + getViewObject() + ", actions=" + getActions() + ", data=" + getData() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetStoreWidgets;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetStoreWidgets) && ((GetStoreWidgets) obj).canEqual(this) && super.equals(obj);
    }

    public int hashCode() {
        return 59 + super.hashCode();
    }

    public String toString() {
        return "GetStoreWidgets()";
    }
}
