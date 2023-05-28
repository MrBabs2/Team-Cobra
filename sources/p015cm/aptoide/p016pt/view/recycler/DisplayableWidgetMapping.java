package p015cm.aptoide.p016pt.view.recycler;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p015cm.aptoide.p016pt.account.view.LoginDisplayable;
import p015cm.aptoide.p016pt.account.view.user.CreateStoreDisplayable;
import p015cm.aptoide.p016pt.app.view.GridAppDisplayable;
import p015cm.aptoide.p016pt.app.view.GridAppListDisplayable;
import p015cm.aptoide.p016pt.app.view.GridAppListWidget;
import p015cm.aptoide.p016pt.app.view.GridAppWidget;
import p015cm.aptoide.p016pt.app.view.OfficialAppDisplayable;
import p015cm.aptoide.p016pt.app.view.OfficialAppWidget;
import p015cm.aptoide.p016pt.app.view.displayable.OtherVersionDisplayable;
import p015cm.aptoide.p016pt.app.view.widget.OtherVersionWidget;
import p015cm.aptoide.p016pt.comments.view.CommentDisplayable;
import p015cm.aptoide.p016pt.comments.view.CommentWidget;
import p015cm.aptoide.p016pt.comments.view.CommentsReadMoreDisplayable;
import p015cm.aptoide.p016pt.comments.view.CommentsReadMoreWidget;
import p015cm.aptoide.p016pt.comments.view.RateAndReviewCommentDisplayable;
import p015cm.aptoide.p016pt.comments.view.RateAndReviewCommentWidget;
import p015cm.aptoide.p016pt.comments.view.StoreAddCommentWidget;
import p015cm.aptoide.p016pt.comments.view.StoreLatestCommentsWidget;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.reviews.ReviewsLanguageFilterDisplayable;
import p015cm.aptoide.p016pt.reviews.ReviewsLanguageFilterWidget;
import p015cm.aptoide.p016pt.reviews.ReviewsRatingDisplayable;
import p015cm.aptoide.p016pt.reviews.ReviewsRatingWidget;
import p015cm.aptoide.p016pt.reviews.RowReviewDisplayable;
import p015cm.aptoide.p016pt.store.view.CreateStoreWidget;
import p015cm.aptoide.p016pt.store.view.GridDisplayDisplayable;
import p015cm.aptoide.p016pt.store.view.GridStoreDisplayable;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaDisplayable;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget;
import p015cm.aptoide.p016pt.store.view.GridStoreWidget;
import p015cm.aptoide.p016pt.store.view.LoginWidget;
import p015cm.aptoide.p016pt.store.view.StoreAddCommentDisplayable;
import p015cm.aptoide.p016pt.store.view.StoreGridHeaderDisplayable;
import p015cm.aptoide.p016pt.store.view.StoreGridHeaderWidget;
import p015cm.aptoide.p016pt.store.view.StoreLatestCommentsDisplayable;
import p015cm.aptoide.p016pt.store.view.featured.AppBrickDisplayable;
import p015cm.aptoide.p016pt.store.view.featured.AppBrickListDisplayable;
import p015cm.aptoide.p016pt.store.view.featured.AppBrickListWidget;
import p015cm.aptoide.p016pt.store.view.featured.AppBrickWidget;
import p015cm.aptoide.p016pt.store.view.p028my.StoreDisplayable;
import p015cm.aptoide.p016pt.store.view.p028my.StoreWidget;
import p015cm.aptoide.p016pt.store.view.recommended.RecommendedStoreDisplayable;
import p015cm.aptoide.p016pt.store.view.recommended.RecommendedStoreWidget;
import p015cm.aptoide.p016pt.store.view.top.TopAppListDisplayable;
import p015cm.aptoide.p016pt.store.view.top.TopAppListWidget;
import p015cm.aptoide.p016pt.timeline.view.displayable.FollowStoreDisplayable;
import p015cm.aptoide.p016pt.timeline.view.displayable.FollowUserDisplayable;
import p015cm.aptoide.p016pt.timeline.view.follow.FollowStoreWidget;
import p015cm.aptoide.p016pt.timeline.view.follow.FollowUserWidget;
import p015cm.aptoide.p016pt.updates.view.excluded.ExcludedUpdateDisplayable;
import p015cm.aptoide.p016pt.updates.view.excluded.ExcludedUpdateWidget;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.EmptyDisplayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.FooterRowDisplayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.GridAdDisplayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.MessageWhiteBgDisplayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.ProgressBarDisplayable;
import p015cm.aptoide.p016pt.view.recycler.widget.EmptyWidget;
import p015cm.aptoide.p016pt.view.recycler.widget.FooterRowWidget;
import p015cm.aptoide.p016pt.view.recycler.widget.GridAdWidget;
import p015cm.aptoide.p016pt.view.recycler.widget.GridDisplayWidget;
import p015cm.aptoide.p016pt.view.recycler.widget.MessageWhiteBgWidget;
import p015cm.aptoide.p016pt.view.recycler.widget.ProgressBarWidget;
import p015cm.aptoide.p016pt.view.recycler.widget.RowReviewWidget;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;

/* renamed from: cm.aptoide.pt.view.recycler.DisplayableWidgetMapping */
public class DisplayableWidgetMapping {
    private static final String TAG = "cm.aptoide.pt.view.recycler.DisplayableWidgetMapping";
    private static final DisplayableWidgetMapping instance = new DisplayableWidgetMapping();
    private List<Displayable> cachedDisplayables;
    private Class<? extends Displayable> displayableClass;
    private Map<Integer, DisplayableWidgetMapping> viewTypeMapping = new HashMap();
    private Class<? extends Widget> widgetClass;

    protected DisplayableWidgetMapping() {
        parseMappings(createMapping());
    }

    public static DisplayableWidgetMapping getInstance() {
        return instance;
    }

    /* access modifiers changed from: protected */
    public List<DisplayableWidgetMapping> createMapping() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new DisplayableWidgetMapping(EmptyWidget.class, EmptyDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(AppBrickWidget.class, AppBrickDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridAppWidget.class, GridAppDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridDisplayWidget.class, GridDisplayDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(StoreGridHeaderWidget.class, StoreGridHeaderDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(FooterRowWidget.class, FooterRowDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridStoreWidget.class, GridStoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridStoreMetaWidget.class, GridStoreMetaDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridAdWidget.class, GridAdDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(GridAppListWidget.class, GridAppListDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(AppBrickListWidget.class, AppBrickListDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(TopAppListWidget.class, TopAppListDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(ExcludedUpdateWidget.class, ExcludedUpdateDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(ProgressBarWidget.class, ProgressBarDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(OtherVersionWidget.class, OtherVersionDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(RowReviewWidget.class, RowReviewDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(RateAndReviewCommentWidget.class, RateAndReviewCommentDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(CommentWidget.class, CommentDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(CommentsReadMoreWidget.class, CommentsReadMoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(StoreLatestCommentsWidget.class, StoreLatestCommentsDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(StoreAddCommentWidget.class, StoreAddCommentDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(CreateStoreWidget.class, CreateStoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(StoreWidget.class, StoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(RecommendedStoreWidget.class, RecommendedStoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(OfficialAppWidget.class, OfficialAppDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(FollowUserWidget.class, FollowUserDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(MessageWhiteBgWidget.class, MessageWhiteBgDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(FollowStoreWidget.class, FollowStoreDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(ReviewsLanguageFilterWidget.class, ReviewsLanguageFilterDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(ReviewsRatingWidget.class, ReviewsRatingDisplayable.class));
        linkedList.add(new DisplayableWidgetMapping(LoginWidget.class, LoginDisplayable.class));
        return linkedList;
    }

    public List<Displayable> getCachedDisplayables() {
        if (this.cachedDisplayables == null) {
            LinkedList linkedList = new LinkedList();
            for (DisplayableWidgetMapping newDisplayable : this.viewTypeMapping.values()) {
                linkedList.add(newDisplayable.newDisplayable());
            }
            this.cachedDisplayables = Collections.unmodifiableList(linkedList);
        }
        return this.cachedDisplayables;
    }

    public Displayable newDisplayable() {
        try {
            return (Displayable) this.displayableClass.newInstance();
        } catch (Exception e) {
            CrashReport.getInstance().log(e);
            String format = String.format("Error instantiating displayable '%s'", new Object[]{this.displayableClass.getName()});
            Logger.getInstance().mo12980e(TAG, format, e);
            throw new RuntimeException(format);
        }
    }

    public Widget newWidget(View view, int i) {
        DisplayableWidgetMapping displayableWidgetMapping = this.viewTypeMapping.get(Integer.valueOf(i));
        if (displayableWidgetMapping != null) {
            return displayableWidgetMapping.newWidget(view);
        }
        throw new IllegalStateException(String.format("There's no widget for '%s' viewType", new Object[]{Integer.valueOf(i)}) + "\nDid you forget to add the mapping to DisplayableWidgetMapping enum??");
    }

    /* access modifiers changed from: protected */
    public void parseMappings(List<DisplayableWidgetMapping> list) {
        for (DisplayableWidgetMapping next : list) {
            this.viewTypeMapping.put(Integer.valueOf(next.newDisplayable().getViewLayout()), next);
        }
    }

    public DisplayableWidgetMapping(Class<? extends Widget> cls, Class<? extends Displayable> cls2) {
        this.displayableClass = cls2;
        this.widgetClass = cls;
    }

    private Widget newWidget(View view) {
        try {
            return (Widget) this.widgetClass.getDeclaredConstructor(new Class[]{View.class}).newInstance(new Object[]{view});
        } catch (Exception e) {
            CrashReport.getInstance().log(e);
            String format = String.format("Error instantiating widget '%s'", new Object[]{this.widgetClass.getName()});
            Logger.getInstance().mo12980e(TAG, format, e);
            throw new RuntimeException(format);
        }
    }
}
