package p015cm.aptoide.p016pt.editorial;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.Snackbar;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.errors.ErrorView;
import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.editorial.EditorialEvent;
import p015cm.aptoide.p016pt.editorial.EditorialViewModel;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.reactions.ReactionEvent;
import p015cm.aptoide.p016pt.reactions.ReactionMapper;
import p015cm.aptoide.p016pt.reactions.TopReactionsPreview;
import p015cm.aptoide.p016pt.reactions.data.ReactionType;
import p015cm.aptoide.p016pt.reactions.data.TopReaction;
import p015cm.aptoide.p016pt.reactions.p027ui.ReactionsPopup;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.AppBarStateChangeListener;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.Translator;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;
import p112n.p118g.p301a.p303b.p304a.p305a.C10668b;
import p112n.p118g.p301a.p303b.p306b.p307a.C10676b;
import p112n.p118g.p301a.p310c.C10695a;
import p112n.p118g.p301a.p310c.C10706f;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.editorial.EditorialFragment */
public class EditorialFragment extends NavigationTrackFragment implements EditorialView, NotBottomNavigationView {
    public static final String CARD_ID = "cardId";
    public static final String FROM_HOME = "fromHome";
    public static final String SLUG = "slug";
    private static final String TAG = EditorialFragment.class.getName();
    private DownloadModel.Action action;
    private CardView actionItemCard;
    private EditorialItemsAdapter adapter;
    private AppBarLayout appBarLayout;
    private Button appCardButton;
    private ImageView appCardImage;
    private View appCardLayout;
    private TextView appCardTitle;
    private View appCardView;
    private ImageView appImage;
    /* access modifiers changed from: private */
    public Drawable backArrow;
    private ImageView cancelDownload;
    @Inject
    CaptionBackgroundPainter captionBackgroundPainter;
    private RelativeLayout cardInfoLayout;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private View downloadControlsLayout;
    private C12871b<EditorialDownloadEvent> downloadEventListener;
    private LinearLayout downloadInfoLayout;
    private ProgressBar downloadProgressBar;
    private TextView downloadProgressValue;
    private RecyclerView editorialItems;
    private View editorialItemsCard;
    private C5375k errorMessageSubscription;
    private ErrorView errorView;
    private C12871b<Void> installClickSubject;
    private TextView itemName;
    /* access modifiers changed from: private */
    public C12871b<Boolean> movingCollapseSubject;
    private DecimalFormat oneDecimalFormatter;
    private ImageView pauseDownload;
    private List<Integer> placeHolderPositions;
    @Inject
    EditorialPresenter presenter;
    private ProgressBar progressBar;
    private ImageButton reactButton;
    private C12871b<ReactionEvent> reactionEventListener;
    private C12871b<Void> ready;
    private ImageView resumeDownload;
    @Inject
    @Named
    float screenHeight;
    @Inject
    @Named
    float screenWidth;
    private NestedScrollView scrollView;
    private boolean shouldAnimate;
    private C12871b<Void> snackListener;
    private SocialMediaView socialMediaView;
    @Inject
    ThemeManager themeManager;
    /* access modifiers changed from: private */
    public Toolbar toolbar;
    /* access modifiers changed from: private */
    public TextView toolbarTitle;
    private TopReactionsPreview topReactionsPreview;
    private C12871b<EditorialEvent> uiEventsListener;
    private Window window;

    /* renamed from: cm.aptoide.pt.editorial.EditorialFragment$3 */
    static /* synthetic */ class C23863 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$editorial$EditorialViewModel$Error;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|(2:23|24)|25|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|33|34|35|36|37|38|39|40|42) */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0098 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a2 */
        static {
            /*
                cm.aptoide.pt.app.DownloadModel$DownloadState[] r0 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState = r0
                r1 = 1
                cm.aptoide.pt.app.DownloadModel$DownloadState r2 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.app.DownloadModel$DownloadState r3 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.INDETERMINATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r4 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r5 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                cm.aptoide.pt.app.DownloadModel$Action[] r4 = p015cm.aptoide.p016pt.app.DownloadModel.Action.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = r4
                cm.aptoide.pt.app.DownloadModel$Action r5 = p015cm.aptoide.p016pt.app.DownloadModel.Action.UPDATE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x004e }
                cm.aptoide.pt.app.DownloadModel$Action r5 = p015cm.aptoide.p016pt.app.DownloadModel.Action.INSTALL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0058 }
                cm.aptoide.pt.app.DownloadModel$Action r5 = p015cm.aptoide.p016pt.app.DownloadModel.Action.OPEN     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0062 }
                cm.aptoide.pt.app.DownloadModel$Action r5 = p015cm.aptoide.p016pt.app.DownloadModel.Action.DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                cm.aptoide.pt.editorial.EditorialViewModel$Error[] r4 = p015cm.aptoide.p016pt.editorial.EditorialViewModel.Error.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$cm$aptoide$pt$editorial$EditorialViewModel$Error = r4
                cm.aptoide.pt.editorial.EditorialViewModel$Error r5 = p015cm.aptoide.p016pt.editorial.EditorialViewModel.Error.NETWORK     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r4 = $SwitchMap$cm$aptoide$pt$editorial$EditorialViewModel$Error     // Catch:{ NoSuchFieldError -> 0x007d }
                cm.aptoide.pt.editorial.EditorialViewModel$Error r5 = p015cm.aptoide.p016pt.editorial.EditorialViewModel.Error.GENERIC     // Catch:{ NoSuchFieldError -> 0x007d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                cm.aptoide.pt.util.AppBarStateChangeListener$State[] r4 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State = r4
                cm.aptoide.pt.util.AppBarStateChangeListener$State r5 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.EXPANDED     // Catch:{ NoSuchFieldError -> 0x008e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x008e }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x008e }
            L_0x008e:
                int[] r1 = $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State     // Catch:{ NoSuchFieldError -> 0x0098 }
                cm.aptoide.pt.util.AppBarStateChangeListener$State r4 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.IDLE     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                int[] r0 = $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State     // Catch:{ NoSuchFieldError -> 0x00a2 }
                cm.aptoide.pt.util.AppBarStateChangeListener$State r1 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.MOVING     // Catch:{ NoSuchFieldError -> 0x00a2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a2 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a2 }
            L_0x00a2:
                int[] r0 = $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State     // Catch:{ NoSuchFieldError -> 0x00ac }
                cm.aptoide.pt.util.AppBarStateChangeListener$State r1 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.COLLAPSED     // Catch:{ NoSuchFieldError -> 0x00ac }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ac }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00ac }
            L_0x00ac:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.editorial.EditorialFragment.C23863.<clinit>():void");
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m5492b(GenericDialogs.EResponse eResponse) {
    }

    /* renamed from: c */
    static /* synthetic */ EditorialEvent m5493c(EditorialViewModel editorialViewModel, Void voidR) {
        return new EditorialEvent(EditorialEvent.Type.APPCARD, editorialViewModel.getBottomCardAppId(), editorialViewModel.getBottomCardPackageName());
    }

    private void configureAppCardAnimation(View view, View view2, float f, int i, boolean z) {
        final View view3 = view2;
        final int i2 = i;
        final boolean z2 = z;
        final View view4 = view;
        view.animate().scaleY(f).scaleX(f).alpha(0.0f).setDuration((long) i).setListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (!z2) {
                    view4.setVisibility(4);
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                view3.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration((long) i2).setListener(new Animator.AnimatorListener() {
                    public void onAnimationCancel(Animator animator) {
                    }

                    public void onAnimationEnd(Animator animator) {
                    }

                    public void onAnimationRepeat(Animator animator) {
                    }

                    public void onAnimationStart(Animator animator) {
                        view3.setVisibility(0);
                    }
                }).start();
            }
        }).start();
    }

    /* renamed from: e */
    static /* synthetic */ EditorialDownloadEvent m5500e(EditorialViewModel editorialViewModel, Void voidR) {
        return new EditorialDownloadEvent(EditorialEvent.Type.PAUSE, editorialViewModel.getBottomCardPackageName(), editorialViewModel.getBottomCardMd5(), editorialViewModel.getBottomCardVersionCode(), editorialViewModel.getBottomCardAppId());
    }

    private EditorialItemsViewHolder getViewHolderForAdapterPosition(int i) {
        RecyclerView recyclerView;
        if (i == -1 || (recyclerView = this.editorialItems) == null) {
            return null;
        }
        EditorialItemsViewHolder editorialItemsViewHolder = (EditorialItemsViewHolder) recyclerView.findViewHolderForAdapterPosition(i);
        if (editorialItemsViewHolder == null) {
            Log.e(TAG, "Unable to find editorialViewHolder");
        }
        return editorialItemsViewHolder;
    }

    private void handleDownloadError(DownloadModel.DownloadState downloadState) {
        showErrorDialog("", getContext().getString(C1086R.string.error_occured));
    }

    /* access modifiers changed from: private */
    public void handleStatusBar(boolean z) {
        if (z) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                if (i > 23 && !this.themeManager.isThemeDark()) {
                    this.window.getDecorView().setSystemUiVisibility(8192);
                }
                this.window.setStatusBarColor(getResources().getColor(this.themeManager.getAttributeForTheme(C1086R.attr.statusBarColorSecondary).resourceId));
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.window.setStatusBarColor(getResources().getColor(C1086R.color.black_87_alpha));
            this.window.getDecorView().setSystemUiVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public boolean isItemShown() {
        EditorialItemsViewHolder viewHolderForAdapterPosition;
        List<Integer> list = this.placeHolderPositions;
        if (list == null || list.isEmpty() || (viewHolderForAdapterPosition = getViewHolderForAdapterPosition(this.placeHolderPositions.get(0).intValue())) == null || !viewHolderForAdapterPosition.isVisible(this.screenHeight, this.screenWidth)) {
            return false;
        }
        return true;
    }

    private void populateAppContent(EditorialViewModel editorialViewModel) {
        this.placeHolderPositions = editorialViewModel.getPlaceHolderPositions();
        this.shouldAnimate = editorialViewModel.shouldHaveAnimation();
        if (editorialViewModel.hasBackgroundImage()) {
            ImageLoader.with(getContext()).load(editorialViewModel.getBackgroundImage(), this.appImage);
        } else {
            this.appImage.setBackgroundColor(getResources().getColor(C1086R.color.grey_fog_normal));
        }
        String caption = editorialViewModel.getCaption();
        this.toolbar.setTitle((CharSequence) caption);
        this.toolbarTitle.setText(editorialViewModel.getTitle());
        this.appImage.setVisibility(0);
        this.itemName.setText(Translator.translate(caption, getContext(), ""));
        this.captionBackgroundPainter.addColorBackgroundToCaption(this.actionItemCard, editorialViewModel.getCaptionColor());
        this.itemName.setVisibility(0);
        this.actionItemCard.setVisibility(0);
        setBottomAppCardInfo(editorialViewModel);
    }

    private void populateCardContent(EditorialViewModel editorialViewModel) {
        if (editorialViewModel.hasContent()) {
            this.editorialItemsCard.setVisibility(0);
            this.adapter.add(editorialViewModel.getContentList(), editorialViewModel.shouldHaveAnimation());
        }
    }

    private void setBottomAppCardInfo(EditorialViewModel editorialViewModel) {
        if (editorialViewModel.shouldHaveAnimation()) {
            this.appCardTitle.setText(editorialViewModel.getBottomCardAppName());
            this.appCardTitle.setVisibility(0);
            ImageLoader.with(getContext()).load(editorialViewModel.getBottomCardIcon(), this.appCardImage);
            this.appCardView.setVisibility(0);
        }
    }

    private void setButtonText(DownloadModel downloadModel) {
        int i = C23863.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[downloadModel.getAction().ordinal()];
        if (i == 1) {
            this.appCardButton.setText(getResources().getString(C1086R.string.appview_button_update));
        } else if (i == 2) {
            this.appCardButton.setText(getResources().getString(C1086R.string.appview_button_install));
        } else if (i == 3) {
            this.appCardButton.setText(getResources().getString(C1086R.string.appview_button_open));
        } else if (i == 4) {
            this.appCardButton.setText(getResources().getString(C1086R.string.appview_button_downgrade));
        }
    }

    private void setDownloadState(int i, DownloadModel.DownloadState downloadState) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        int i2 = C23863.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
        if (i2 == 1) {
            this.downloadProgressBar.setIndeterminate(false);
            this.downloadProgressBar.setProgress(i);
            TextView textView = this.downloadProgressValue;
            textView.setText(i + "%");
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
        } else if (i2 == 2 || i2 == 3) {
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
        } else if (i2 == 4) {
            this.downloadProgressBar.setIndeterminate(false);
            this.downloadProgressBar.setProgress(i);
            TextView textView2 = this.downloadProgressValue;
            textView2.setText(i + "%");
            this.pauseDownload.setVisibility(8);
            this.cancelDownload.setVisibility(0);
            this.resumeDownload.setVisibility(0);
            this.downloadControlsLayout.setLayoutParams(layoutParams2);
        }
    }

    private void showErrorDialog(String str, String str2) {
        this.errorMessageSubscription = GenericDialogs.createGenericOkMessage(getContext(), str, str2, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18662b(C5376a.m10346b()).mo18655a(C2535s.f5351f, (C5378b<Throwable>) C2431f.f5200f);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11048a(View view) {
        this.installClickSubject.onNext(null);
    }

    public C5368e<EditorialEvent> actionButtonClicked() {
        return this.uiEventsListener.mo18681d(C2463j.f5257f);
    }

    public void addBottomCardAnimation() {
        EditorialItemsViewHolder viewHolderForAdapterPosition;
        View placeHolder;
        List<Integer> list = this.placeHolderPositions;
        if (list != null && !list.isEmpty() && (viewHolderForAdapterPosition = getViewHolderForAdapterPosition(this.placeHolderPositions.get(0).intValue())) != null && (placeHolder = viewHolderForAdapterPosition.getPlaceHolder()) != null && this.shouldAnimate) {
            configureAppCardAnimation(placeHolder, this.appCardLayout, 0.1f, 300, false);
        }
    }

    public C5368e<EditorialEvent> appCardClicked(EditorialViewModel editorialViewModel) {
        return C10695a.m36221a(this.appCardView).mo18694j(new C2392a0(editorialViewModel)).mo18661b(this.uiEventsListener.mo18681d(C2439g.f5213f));
    }

    public C5368e<EditorialDownloadEvent> cancelDownload(EditorialViewModel editorialViewModel) {
        return C10695a.m36221a(this.cancelDownload).mo18694j(new C2479l(editorialViewModel)).mo18661b(this.downloadEventListener.mo18681d(C2551u.f5370f));
    }

    public String getAction() {
        return this.action.toString();
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(EditorialFragment.class.getSimpleName(), "", StoreContext.home.name());
    }

    public C5368e<Boolean> handleMovingCollapse() {
        return this.movingCollapseSubject.mo18656b();
    }

    public void hideLoading() {
        this.actionItemCard.setVisibility(8);
        this.editorialItemsCard.setVisibility(8);
        this.appCardView.setVisibility(8);
        this.itemName.setVisibility(8);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(8);
    }

    public C5368e<EditorialDownloadEvent> installButtonClick(EditorialViewModel editorialViewModel) {
        return this.installClickSubject.mo18694j(new C2527r(this, editorialViewModel)).mo18661b(this.downloadEventListener.mo18681d(C2447h.f5222f));
    }

    public C5368e<Void> isViewReady() {
        return this.ready;
    }

    public void manageMediaListDescriptionAnimationVisibility(EditorialEvent editorialEvent) {
        EditorialItemsViewHolder editorialItemsViewHolder = (EditorialItemsViewHolder) this.editorialItems.findViewHolderForAdapterPosition(editorialEvent.getPosition());
        if (editorialItemsViewHolder != null) {
            editorialItemsViewHolder.manageDescriptionAnimationVisibility(editorialEvent.getFirstVisiblePosition(), editorialEvent.getMedia());
        }
    }

    public void managePlaceHolderVisibity() {
        EditorialItemsViewHolder viewHolderForAdapterPosition;
        List<Integer> list = this.placeHolderPositions;
        if (list != null && !list.isEmpty() && (viewHolderForAdapterPosition = getViewHolderForAdapterPosition(this.placeHolderPositions.get(0).intValue())) != null && viewHolderForAdapterPosition.isVisible(this.screenHeight, this.screenWidth)) {
            removeBottomCardAnimation();
        }
    }

    public C5368e<EditorialEvent> mediaContentClicked() {
        return this.uiEventsListener.mo18681d(C2519q.f5325f);
    }

    public C5368e<EditorialEvent> mediaListDescriptionChanged() {
        return this.uiEventsListener.mo18681d(C2487m.f5286f).mo18674c(C2566v6.f5388f);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.oneDecimalFormatter = new DecimalFormat("0.0");
        this.window = getActivity().getWindow();
        this.ready = C12871b.m41468p();
        this.uiEventsListener = C12871b.m41468p();
        this.downloadEventListener = C12871b.m41468p();
        this.movingCollapseSubject = C12871b.m41468p();
        this.reactionEventListener = C12871b.m41468p();
        this.installClickSubject = C12871b.m41468p();
        this.snackListener = C12871b.m41468p();
        this.topReactionsPreview = new TopReactionsPreview();
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_empty, menu);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.fragment_editorial, viewGroup, false);
    }

    public void onDestroy() {
        this.uiEventsListener = null;
        this.installClickSubject = null;
        this.snackListener = null;
        this.reactionEventListener = null;
        this.downloadEventListener = null;
        super.onDestroy();
        C5375k kVar = this.errorMessageSubscription;
        if (kVar != null && !kVar.isUnsubscribed()) {
            this.errorMessageSubscription.unsubscribe();
        }
        this.ready = null;
        this.window = null;
        this.oneDecimalFormatter = null;
        this.movingCollapseSubject = null;
        this.socialMediaView = null;
    }

    public void onDestroyView() {
        this.themeManager.resetStatusBarColor();
        if (Build.VERSION.SDK_INT >= 16) {
            this.window.getDecorView().setSystemUiVisibility(256);
        }
        this.toolbar = null;
        this.appImage = null;
        this.itemName = null;
        this.actionItemCard = null;
        this.appCardView = null;
        this.appCardImage = null;
        this.appCardTitle = null;
        this.appCardButton = null;
        this.editorialItemsCard = null;
        this.editorialItems = null;
        this.errorView = null;
        this.progressBar = null;
        this.collapsingToolbarLayout = null;
        this.appBarLayout = null;
        this.adapter = null;
        this.backArrow = null;
        this.reactButton = null;
        this.cardInfoLayout = null;
        this.downloadControlsLayout = null;
        this.downloadInfoLayout = null;
        this.downloadProgressBar = null;
        this.downloadProgressValue = null;
        this.cancelDownload = null;
        this.resumeDownload = null;
        this.pauseDownload = null;
        this.scrollView = null;
        this.appCardLayout = null;
        this.topReactionsPreview.onDestroy();
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getFragmentComponent(bundle).inject(this);
        if (Build.VERSION.SDK_INT >= 21) {
            this.window.setStatusBarColor(getResources().getColor(C1086R.color.black_87_alpha));
        }
        Toolbar toolbar2 = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
        this.toolbar = toolbar2;
        toolbar2.setTitle((CharSequence) "");
        C0076d dVar = (C0076d) getActivity();
        dVar.setSupportActionBar(this.toolbar);
        C0069a supportActionBar = dVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo188d(true);
        }
        this.backArrow = this.toolbar.getNavigationIcon();
        this.scrollView = (NestedScrollView) view.findViewById(C1086R.C1088id.nested_scroll_view);
        this.appBarLayout = (AppBarLayout) view.findViewById(C1086R.C1088id.app_bar_layout);
        this.appImage = (ImageView) view.findViewById(C1086R.C1088id.app_graphic);
        this.itemName = (TextView) view.findViewById(C1086R.C1088id.action_item_name);
        this.appCardLayout = view.findViewById(C1086R.C1088id.app_cardview_layout);
        View findViewById = view.findViewById(C1086R.C1088id.app_cardview);
        this.appCardView = findViewById;
        this.appCardImage = (ImageView) findViewById.findViewById(C1086R.C1088id.app_icon_imageview);
        this.appCardTitle = (TextView) this.appCardView.findViewById(C1086R.C1088id.app_title_textview);
        this.appCardButton = (Button) this.appCardView.findViewById(C1086R.C1088id.appview_install_button);
        this.actionItemCard = (CardView) view.findViewById(C1086R.C1088id.action_item_card);
        this.editorialItemsCard = view.findViewById(C1086R.C1088id.card_info_layout);
        this.editorialItems = (RecyclerView) view.findViewById(C1086R.C1088id.editorial_items);
        this.errorView = (ErrorView) view.findViewById(C1086R.C1088id.error_view);
        this.progressBar = (ProgressBar) view.findViewById(C1086R.C1088id.progress_bar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        this.adapter = new EditorialItemsAdapter(new ArrayList(), this.oneDecimalFormatter, this.uiEventsListener, this.downloadEventListener);
        this.editorialItems.setLayoutManager(linearLayoutManager);
        this.editorialItems.setAdapter(this.adapter);
        this.reactButton = (ImageButton) view.findViewById(C1086R.C1088id.add_reactions);
        this.topReactionsPreview.initialReactionsSetup(view);
        this.cardInfoLayout = (RelativeLayout) view.findViewById(C1086R.C1088id.card_info_install_layout);
        this.downloadControlsLayout = view.findViewById(C1086R.C1088id.install_controls_layout);
        this.downloadInfoLayout = (LinearLayout) view.findViewById(C1086R.C1088id.appview_transfer_info);
        this.downloadProgressBar = (ProgressBar) view.findViewById(C1086R.C1088id.appview_download_progress_bar);
        this.downloadProgressValue = (TextView) view.findViewById(C1086R.C1088id.appview_download_progress_number);
        this.cancelDownload = (ImageView) view.findViewById(C1086R.C1088id.appview_download_cancel_button);
        this.resumeDownload = (ImageView) view.findViewById(C1086R.C1088id.appview_download_resume_download);
        this.pauseDownload = (ImageView) view.findViewById(C1086R.C1088id.appview_download_pause_download);
        this.toolbarTitle = (TextView) view.findViewById(C1086R.C1088id.toolbar_title);
        CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) view.findViewById(C1086R.C1088id.collapsing_toolbar_layout);
        this.collapsingToolbarLayout = collapsingToolbarLayout2;
        collapsingToolbarLayout2.setExpandedTitleColor(getResources().getColor(C1086R.color.transparent));
        this.collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(C1086R.color.transparent));
        this.appBarLayout.mo30728a((AppBarLayout.C8416e) new AppBarStateChangeListener() {
            private void configureAppBarLayout(Drawable drawable, int i, boolean z) {
                EditorialFragment.this.toolbar.setBackgroundDrawable(drawable);
                EditorialFragment.this.toolbarTitle.setTextColor(i);
                if (Build.VERSION.SDK_INT >= 21) {
                    EditorialFragment.this.handleStatusBar(z);
                }
                if (EditorialFragment.this.backArrow != null) {
                    EditorialFragment.this.backArrow.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                }
            }

            public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
                Resources resources = EditorialFragment.this.getResources();
                int i = C23863.$SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[state.ordinal()];
                if (i == 1) {
                    EditorialFragment.this.movingCollapseSubject.onNext(Boolean.valueOf(EditorialFragment.this.isItemShown()));
                } else if (i != 4) {
                    EditorialFragment.this.movingCollapseSubject.onNext(Boolean.valueOf(EditorialFragment.this.isItemShown()));
                    configureAppBarLayout(resources.getDrawable(C1086R.C1087drawable.editorial_up_bottom_black_gradient), resources.getColor(C1086R.color.white), false);
                } else {
                    EditorialFragment.this.movingCollapseSubject.onNext(Boolean.valueOf(EditorialFragment.this.isItemShown()));
                    configureAppBarLayout(resources.getDrawable(EditorialFragment.this.themeManager.getAttributeForTheme(C1086R.attr.toolbarBackgroundSecondary).resourceId), resources.getColor(EditorialFragment.this.themeManager.getAttributeForTheme(C1086R.attr.textColorBlackAlpha).resourceId), true);
                }
            }
        });
        this.appCardButton.setOnClickListener(new C2559v(this));
        this.socialMediaView = (SocialMediaView) view.findViewById(C1086R.C1088id.social_media_view);
        attachPresenter(this.presenter);
    }

    public void openApp(String str) {
        AptoideUtils.SystemU.openApp(str, getContext().getPackageManager(), getContext());
    }

    public C5368e<EditorialDownloadEvent> pauseDownload(EditorialViewModel editorialViewModel) {
        return C10695a.m36221a(this.pauseDownload).mo18694j(new C2590z(editorialViewModel)).mo18661b(this.downloadEventListener.mo18681d(C2583y.f5409f));
    }

    public C5368e<ScrollEvent> placeHolderVisibilityChange() {
        return C5368e.m10258c(C10676b.m36205a(this.scrollView), (C5368e<C10706f>) C10668b.m36200a(this.appBarLayout)).mo18687f(new C2543t(this)).mo18674c(C2534r6.f5350f);
    }

    public void populateView(EditorialViewModel editorialViewModel) {
        populateAppContent(editorialViewModel);
        populateCardContent(editorialViewModel);
        this.ready.onNext(null);
    }

    public C5368e<ReactionEvent> reactionClicked() {
        return this.reactionEventListener;
    }

    public C5368e<Void> reactionsButtonClicked() {
        return C10695a.m36221a(this.reactButton);
    }

    public C5368e<Void> reactionsButtonLongPressed() {
        return C10695a.m36223c(this.reactButton);
    }

    public void removeBottomCardAnimation() {
        EditorialItemsViewHolder viewHolderForAdapterPosition;
        View placeHolder;
        List<Integer> list = this.placeHolderPositions;
        if (list != null && !list.isEmpty() && (viewHolderForAdapterPosition = getViewHolderForAdapterPosition(this.placeHolderPositions.get(0).intValue())) != null && (placeHolder = viewHolderForAdapterPosition.getPlaceHolder()) != null && this.shouldAnimate) {
            configureAppCardAnimation(this.appCardLayout, placeHolder, 0.0f, 300, true);
        }
    }

    public C5368e<EditorialDownloadEvent> resumeDownload(EditorialViewModel editorialViewModel) {
        return C10695a.m36221a(this.resumeDownload).mo18694j(new C2455i(this, editorialViewModel)).mo18661b(this.downloadEventListener.mo18681d(C2575x.f5398f));
    }

    public C5368e<Void> retryClicked() {
        return this.errorView.retryClick();
    }

    public void setMediaListDescriptionsVisible(EditorialEvent editorialEvent) {
        EditorialItemsViewHolder editorialItemsViewHolder = (EditorialItemsViewHolder) this.editorialItems.findViewHolderForAdapterPosition(editorialEvent.getPosition());
        if (editorialItemsViewHolder != null) {
            editorialItemsViewHolder.setAllDescriptionsVisible();
        }
    }

    public void setUserReaction(String str) {
        if (this.topReactionsPreview.isReactionValid(str)) {
            this.reactButton.setImageResource(ReactionMapper.mapReaction(str));
        } else {
            this.reactButton.setImageResource(this.themeManager.getAttributeForTheme(C1086R.attr.reactionInputDrawable).resourceId);
        }
    }

    public C5368e<Boolean> showDowngradeMessage() {
        return GenericDialogs.createGenericContinueCancelMessage(getContext(), (String) null, getContext().getResources().getString(C1086R.string.downgrade_warning_dialog), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18694j(C2471k.f5267f);
    }

    public void showDowngradingMessage() {
        Snackbar.m28075a(getView(), (int) C1086R.string.downgrading_msg, -1).mo31972k();
    }

    public void showDownloadError(EditorialDownloadModel editorialDownloadModel) {
        if (editorialDownloadModel.hasError()) {
            handleDownloadError(editorialDownloadModel.getDownloadState());
        }
    }

    public void showDownloadModel(EditorialDownloadModel editorialDownloadModel) {
        this.action = editorialDownloadModel.getAction();
        EditorialItemsViewHolder viewHolderForAdapterPosition = getViewHolderForAdapterPosition(editorialDownloadModel.getPosition());
        if (editorialDownloadModel.isDownloading()) {
            this.downloadInfoLayout.setVisibility(0);
            this.cardInfoLayout.setVisibility(8);
            setDownloadState(editorialDownloadModel.getProgress(), editorialDownloadModel.getDownloadState());
            if (viewHolderForAdapterPosition != null) {
                viewHolderForAdapterPosition.setPlaceHolderDownloadingInfo(editorialDownloadModel);
                return;
            }
            return;
        }
        this.downloadInfoLayout.setVisibility(8);
        this.cardInfoLayout.setVisibility(0);
        setButtonText(editorialDownloadModel);
        if (viewHolderForAdapterPosition != null) {
            viewHolderForAdapterPosition.setPlaceHolderDefaultStateInfo(editorialDownloadModel, getResources().getString(C1086R.string.appview_button_update), getResources().getString(C1086R.string.appview_button_install), getResources().getString(C1086R.string.appview_button_open), getResources().getString(C1086R.string.appview_button_downgrade));
        }
    }

    public void showError(EditorialViewModel.Error error) {
        int i = C23863.$SwitchMap$cm$aptoide$pt$editorial$EditorialViewModel$Error[error.ordinal()];
        if (i == 1) {
            this.errorView.setError(ErrorView.Error.NO_NETWORK);
            this.errorView.setVisibility(0);
        } else if (i == 2) {
            this.errorView.setError(ErrorView.Error.GENERIC);
            this.errorView.setVisibility(0);
        }
    }

    public void showGenericErrorToast() {
        Snackbar.m28076a(getView(), (CharSequence) getString(C1086R.string.error_occured), 0).mo31972k();
    }

    public void showLoading() {
        this.actionItemCard.setVisibility(8);
        this.editorialItemsCard.setVisibility(8);
        this.appCardView.setVisibility(8);
        this.itemName.setVisibility(8);
        this.errorView.setVisibility(8);
        this.progressBar.setVisibility(0);
    }

    public void showLoginDialog() {
        Snackbar a = Snackbar.m28076a(getView(), (CharSequence) getString(C1086R.string.editorial_reactions_login_short), 0);
        a.mo32011a((int) C1086R.string.login, (View.OnClickListener) new C2567w(this));
        a.mo31972k();
    }

    public void showNetworkErrorToast() {
        Snackbar.m28076a(getView(), (CharSequence) getString(C1086R.string.connection_error), 0).mo31972k();
    }

    public void showReactionsPopup(String str, String str2) {
        ReactionsPopup reactionsPopup = new ReactionsPopup(getContext(), this.reactButton);
        reactionsPopup.show();
        reactionsPopup.setOnReactionsItemClickListener(new C2503o(this, str, str2, reactionsPopup));
    }

    public C5368e<Boolean> showRootInstallWarningPopup() {
        return GenericDialogs.createGenericYesNoCancelMessage(getContext(), (String) null, getResources().getString(C1086R.string.root_access_dialog), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18694j(C2495n.f5294f);
    }

    public void showTopReactions(String str, List<TopReaction> list, int i) {
        setUserReaction(str);
        this.topReactionsPreview.setReactions(list, i, getContext());
    }

    public C5368e<Void> snackLoginClick() {
        return this.snackListener;
    }

    public C5368e<SocialMediaView.SocialMediaType> socialMediaClick() {
        return this.socialMediaView.onSocialMediaClick();
    }

    /* renamed from: d */
    static /* synthetic */ EditorialDownloadEvent m5497d(EditorialViewModel editorialViewModel, Void voidR) {
        return new EditorialDownloadEvent(EditorialEvent.Type.CANCEL, editorialViewModel.getBottomCardPackageName(), editorialViewModel.getBottomCardMd5(), editorialViewModel.getBottomCardVersionCode(), editorialViewModel.getBottomCardAppId());
    }

    /* renamed from: a */
    public /* synthetic */ EditorialDownloadEvent mo11046a(EditorialViewModel editorialViewModel, Void voidR) {
        return new EditorialDownloadEvent(editorialViewModel, this.action);
    }

    /* renamed from: b */
    public /* synthetic */ EditorialDownloadEvent mo11053b(EditorialViewModel editorialViewModel, Void voidR) {
        return new EditorialDownloadEvent(EditorialEvent.Type.RESUME, editorialViewModel.getBottomCardPackageName(), editorialViewModel.getBottomCardMd5(), editorialViewModel.getBottomCardVersionCode(), editorialViewModel.getBottomCardAppId(), this.action);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo11047a(Object obj) {
        return Boolean.valueOf(isItemShown());
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11054b(Object obj) {
        return C5368e.m10257c(obj).mo18694j(new C2511p(this)).mo18694j(C2423e.f5180f);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11049a(String str, String str2, ReactionsPopup reactionsPopup, ReactionType reactionType) {
        this.reactionEventListener.onNext(new ReactionEvent(str, ReactionMapper.mapUserReaction(reactionType), str2));
        reactionsPopup.dismiss();
        reactionsPopup.setOnReactionsItemClickListener((ReactionsPopup.OnReactionClickListener) null);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11055b(View view) {
        this.snackListener.onNext(null);
    }

    /* renamed from: a */
    static /* synthetic */ void m5489a(Throwable th) {
        new OnErrorNotImplementedException(th);
    }
}
