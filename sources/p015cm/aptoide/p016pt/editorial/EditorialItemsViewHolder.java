package p015cm.aptoide.p016pt.editorial;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.aptoideviews.video.WebChromeClientWithoutPlayerPlaceholder;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.editorial.EditorialEvent;
import p015cm.aptoide.p016pt.home.SnapToStartHelper;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.editorial.EditorialItemsViewHolder */
class EditorialItemsViewHolder extends RecyclerView.C0629c0 {
    private DownloadModel.Action action;
    private final Button actionButton;
    private final Button appCardButton = ((Button) this.appCardLayout.findViewById(C1086R.C1088id.appview_install_button));
    private final ImageView appCardImage = ((ImageView) this.appCardLayout.findViewById(C1086R.C1088id.app_icon_imageview));
    private final View appCardLayout;
    private final TextView appCardNameWithRating = ((TextView) this.appCardLayout.findViewById(C1086R.C1088id.app_title_textview_with_rating));
    private final TextView appCardRating = ((TextView) this.appCardLayout.findViewById(C1086R.C1088id.rating_label));
    private final View appCardRatingLayout = this.appCardLayout.findViewById(C1086R.C1088id.rating_layout);
    private ImageView cancelDownload;
    private RelativeLayout cardInfoLayout;
    private int currentMediaPosition;
    private TextSwitcher descriptionSwitcher;
    private View downloadControlsLayout;
    private final C12871b<EditorialDownloadEvent> downloadEventListener;
    private LinearLayout downloadInfoLayout;
    private ProgressBar downloadProgressBar;
    private TextView downloadProgressValue;
    private WebView embeddedVideo;
    private TextView firstTitle;
    private ImageView image;
    private View itemText;
    /* access modifiers changed from: private */
    public final LinearLayoutManager layoutManager;
    private View media;
    private MediaBundleAdapter mediaBundleAdapter;
    private boolean mediaDescriptionVisible;
    private RecyclerView mediaList;
    private TextView message;
    private final DecimalFormat oneDecimalFormat;
    private ImageView pauseDownload;
    private ImageView resumeDownload;
    private TextView secondaryTitle;
    private View title;
    /* access modifiers changed from: private */
    public C12871b<EditorialEvent> uiEventListener;
    private ImageView videoThumbnail;
    private FrameLayout videoThumbnailContainer;

    /* renamed from: cm.aptoide.pt.editorial.EditorialItemsViewHolder$3 */
    static /* synthetic */ class C23893 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
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
                cm.aptoide.pt.app.DownloadModel$DownloadState r4 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.PAUSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r5 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0033 }
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
                int[] r1 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x004e }
                cm.aptoide.pt.app.DownloadModel$Action r4 = p015cm.aptoide.p016pt.app.DownloadModel.Action.INSTALL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0058 }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.OPEN     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0062 }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.editorial.EditorialItemsViewHolder.C23893.<clinit>():void");
        }
    }

    public EditorialItemsViewHolder(View view, DecimalFormat decimalFormat, C12871b<EditorialEvent> bVar, C12871b<EditorialDownloadEvent> bVar2) {
        super(view);
        this.itemText = view.findViewById(C1086R.C1088id.editorial_item_text);
        this.title = view.findViewById(C1086R.C1088id.editorial_item_title);
        this.firstTitle = (TextView) view.findViewById(C1086R.C1088id.editorial_item_first_title);
        this.secondaryTitle = (TextView) view.findViewById(C1086R.C1088id.editorial_item_secondary_title);
        this.message = (TextView) view.findViewById(C1086R.C1088id.editorial_item_message);
        this.media = view.findViewById(C1086R.C1088id.editorial_item_media);
        this.image = (ImageView) view.findViewById(C1086R.C1088id.editorial_image);
        this.embeddedVideo = (WebView) view.findViewById(C1086R.C1088id.embedded_video);
        this.videoThumbnail = (ImageView) view.findViewById(C1086R.C1088id.editorial_video_thumbnail);
        this.videoThumbnailContainer = (FrameLayout) view.findViewById(C1086R.C1088id.editorial_video_thumbnail_container);
        this.descriptionSwitcher = (TextSwitcher) view.findViewById(C1086R.C1088id.editorial_image_description_switcher);
        this.mediaList = (RecyclerView) view.findViewById(C1086R.C1088id.editoral_image_list);
        this.appCardLayout = view.findViewById(C1086R.C1088id.app_cardview);
        this.actionButton = (Button) view.findViewById(C1086R.C1088id.action_button);
        this.oneDecimalFormat = decimalFormat;
        this.uiEventListener = bVar;
        this.downloadEventListener = bVar2;
        this.mediaBundleAdapter = new MediaBundleAdapter(new ArrayList(), bVar);
        this.cardInfoLayout = (RelativeLayout) view.findViewById(C1086R.C1088id.card_info_install_layout);
        this.downloadControlsLayout = view.findViewById(C1086R.C1088id.install_controls_layout);
        this.downloadInfoLayout = (LinearLayout) view.findViewById(C1086R.C1088id.appview_transfer_info);
        this.downloadProgressBar = (ProgressBar) view.findViewById(C1086R.C1088id.appview_download_progress_bar);
        this.downloadProgressValue = (TextView) view.findViewById(C1086R.C1088id.appview_download_progress_number);
        this.cancelDownload = (ImageView) view.findViewById(C1086R.C1088id.appview_download_cancel_button);
        this.resumeDownload = (ImageView) view.findViewById(C1086R.C1088id.appview_download_resume_download);
        this.pauseDownload = (ImageView) view.findViewById(C1086R.C1088id.appview_download_pause_download);
        this.layoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        new SnapToStartHelper().attachToRecyclerView(this.mediaList);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1000);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(500);
        this.currentMediaPosition = -1;
        this.descriptionSwitcher.setInAnimation(alphaAnimation);
        this.descriptionSwitcher.setOutAnimation(alphaAnimation2);
        this.mediaList.addItemDecoration(new RecyclerView.C0643n() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
                rect.set(0, 0, AptoideUtils.ScreenU.getPixelsForDip(6, view.getResources()), 0);
            }
        });
        this.mediaList.setLayoutManager(this.layoutManager);
        this.mediaList.setAdapter(this.mediaBundleAdapter);
    }

    private void manageActionVisibility(EditorialContent editorialContent) {
        this.actionButton.setText(editorialContent.getActionTitle());
        this.actionButton.setVisibility(0);
        this.actionButton.setOnClickListener(new C2400b0(this, editorialContent));
    }

    private void manageMediaVisibility(final EditorialContent editorialContent, final int i) {
        if (editorialContent.hasMedia()) {
            List<EditorialMedia> media2 = editorialContent.getMedia();
            this.media.setVisibility(0);
            if (editorialContent.hasListOfMedia()) {
                this.mediaBundleAdapter.add(media2);
                this.mediaList.setVisibility(0);
                if (editorialContent.hasAnyMediaDescription()) {
                    this.mediaList.addOnScrollListener(new RecyclerView.C0653t() {
                        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                            super.onScrolled(recyclerView, i, i2);
                            EditorialItemsViewHolder.this.uiEventListener.onNext(new EditorialEvent(EditorialEvent.Type.MEDIA_LIST, EditorialItemsViewHolder.this.layoutManager.findFirstCompletelyVisibleItemPosition(), EditorialItemsViewHolder.this.layoutManager.findLastCompletelyVisibleItemPosition(), i, editorialContent.getMedia()));
                        }
                    });
                    return;
                }
                return;
            }
            EditorialMedia editorialMedia = media2.get(0);
            if (editorialMedia.hasDescription()) {
                this.descriptionSwitcher.setCurrentText(editorialMedia.getDescription());
                this.descriptionSwitcher.setVisibility(0);
            }
            if (editorialMedia.isImage()) {
                ImageLoader.with(this.itemView.getContext()).load(editorialMedia.getUrl(), this.image);
                this.image.setVisibility(0);
            }
            if (editorialMedia.isVideo()) {
                if (editorialMedia.getThumbnail() != null) {
                    ImageLoader.with(this.itemView.getContext()).load(editorialMedia.getThumbnail(), this.videoThumbnail);
                }
                if (editorialMedia.hasUrl()) {
                    this.videoThumbnailContainer.setVisibility(0);
                    this.videoThumbnailContainer.setOnClickListener(new C2440g0(this, editorialMedia));
                }
            }
            if (editorialMedia.isEmbedded()) {
                this.embeddedVideo.setWebViewClient(new WebViewClient());
                this.embeddedVideo.getSettings().setJavaScriptEnabled(true);
                this.embeddedVideo.loadUrl(editorialMedia.getUrl());
                this.embeddedVideo.setWebChromeClient(new WebChromeClientWithoutPlayerPlaceholder());
                this.embeddedVideo.setVisibility(0);
            }
        }
    }

    private void manageMessageVisibility(EditorialContent editorialContent) {
        if (editorialContent.hasMessage()) {
            this.message.setText(editorialContent.getMessage());
            this.message.setVisibility(0);
        }
    }

    private void manageTitleVisibility(EditorialContent editorialContent, int i) {
        if (editorialContent.hasTitle()) {
            this.title.setVisibility(0);
            if (i == 0) {
                this.firstTitle.setText(editorialContent.getTitle());
                this.firstTitle.setVisibility(0);
                return;
            }
            this.secondaryTitle.setText(editorialContent.getTitle());
            this.secondaryTitle.setVisibility(0);
        }
    }

    private void setButtonText(DownloadModel downloadModel, String str, String str2, String str3, String str4) {
        DownloadModel.Action action2 = downloadModel.getAction();
        this.action = action2;
        int i = C23893.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action2.ordinal()];
        if (i == 1) {
            this.appCardButton.setText(str);
        } else if (i == 2) {
            this.appCardButton.setText(str2);
        } else if (i == 3) {
            this.appCardButton.setText(str3);
        } else if (i == 4) {
            this.appCardButton.setText(str4);
        }
    }

    private void setDownloadState(int i, DownloadModel.DownloadState downloadState) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        int i2 = C23893.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
        if (i2 == 1) {
            this.downloadProgressBar.setIndeterminate(false);
            this.downloadProgressBar.setProgress(i);
            TextView textView = this.downloadProgressValue;
            textView.setText(String.valueOf(i) + "%");
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
        } else if (i2 == 2) {
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
        } else if (i2 == 3) {
            this.downloadProgressBar.setIndeterminate(false);
            this.downloadProgressBar.setProgress(i);
            TextView textView2 = this.downloadProgressValue;
            textView2.setText(String.valueOf(i) + "%");
            this.pauseDownload.setVisibility(8);
            this.cancelDownload.setVisibility(0);
            this.resumeDownload.setVisibility(0);
            this.downloadControlsLayout.setLayoutParams(layoutParams2);
        } else if (i2 == 4) {
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
        }
    }

    private void setPlaceHolderInfo(String str, String str2, float f) {
        ImageLoader.with(this.itemView.getContext()).load(str2, this.appCardImage);
        this.appCardImage.setVisibility(0);
        if (f == 0.0f) {
            this.appCardRating.setText(C1086R.string.appcardview_title_no_stars);
        } else {
            this.appCardRating.setText(this.oneDecimalFormat.format((double) f));
        }
        this.appCardRatingLayout.setVisibility(0);
        this.appCardNameWithRating.setText(str);
        this.appCardNameWithRating.setVisibility(0);
        this.appCardLayout.setVisibility(0);
    }

    private void setPlaceHolderListeners(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, Obb obb, long j, long j2, List<Split> list, List<String> list2, String str8, String str9) {
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        int i2 = i;
        String str14 = str6;
        String str15 = str7;
        Obb obb2 = obb;
        long j3 = j2;
        C2408c0 c0Var = r0;
        C2408c0 c0Var2 = new C2408c0(this, str, str10, str11, str12, str13, i2, str14, str15, obb2, j3, list, list2);
        this.cancelDownload.setOnClickListener(c0Var);
        this.resumeDownload.setOnClickListener(new C2448h0(this, str, str2, str3, str4, str5, i, str6, str7, obb, j2, list, list2, str8, str9));
        ImageView imageView = this.pauseDownload;
        C2424e0 e0Var = r0;
        C2424e0 e0Var2 = new C2424e0(this, str, str10, str11, str12, str13, i2, str14, str15, obb2, j3, list, list2);
        imageView.setOnClickListener(e0Var);
        this.appCardButton.setOnClickListener(new C2416d0(this, str, str2, str3, str4, str5, i, str6, str7, obb, j2, list, list2, str8, str9));
        this.appCardLayout.setOnClickListener(new C2432f0(this, j, str10));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11105a(EditorialContent editorialContent, View view) {
        this.uiEventListener.onNext(new EditorialEvent(EditorialEvent.Type.ACTION, editorialContent.getActionUrl()));
    }

    /* renamed from: b */
    public /* synthetic */ void mo11109b(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, Obb obb, long j, List list, List list2, View view) {
        C12871b<EditorialDownloadEvent> bVar = this.downloadEventListener;
        EditorialDownloadEvent editorialDownloadEvent = r2;
        EditorialDownloadEvent editorialDownloadEvent2 = new EditorialDownloadEvent(EditorialEvent.Type.PAUSE, str, str2, str3, str4, str5, i, str6, str7, obb, j, list, list2);
        bVar.onNext(editorialDownloadEvent);
    }

    public View getPlaceHolder() {
        return this.appCardLayout;
    }

    public boolean isVisible(float f, float f2) {
        Rect rect = new Rect();
        this.appCardLayout.getLocalVisibleRect(rect);
        return rect.intersect(new Rect(0, 0, (int) f2, ((int) f) - (this.appCardLayout.getHeight() * 2)));
    }

    public void manageDescriptionAnimationVisibility(int i, List<EditorialMedia> list) {
        if (!this.mediaDescriptionVisible) {
            String description = list.get(i).getDescription();
            if (this.currentMediaPosition != i) {
                this.descriptionSwitcher.setVisibility(0);
                this.descriptionSwitcher.setText(description);
                this.currentMediaPosition = i;
            }
        }
    }

    public void setAllDescriptionsVisible() {
        if (!this.mediaDescriptionVisible) {
            for (int i = 0; i < this.mediaBundleAdapter.getItemCount(); i++) {
                MediaViewHolder mediaViewHolder = (MediaViewHolder) this.mediaList.findViewHolderForAdapterPosition(i);
                if (mediaViewHolder != null) {
                    mediaViewHolder.setDescriptionVisible();
                    this.mediaDescriptionVisible = true;
                }
            }
        }
    }

    public void setPlaceHolderDefaultStateInfo(DownloadModel downloadModel, String str, String str2, String str3, String str4) {
        this.downloadInfoLayout.setVisibility(8);
        this.cardInfoLayout.setVisibility(0);
        setButtonText(downloadModel, str, str2, str3, str4);
    }

    public void setPlaceHolderDownloadingInfo(DownloadModel downloadModel) {
        this.downloadInfoLayout.setVisibility(0);
        this.cardInfoLayout.setVisibility(8);
        setDownloadState(downloadModel.getProgress(), downloadModel.getDownloadState());
    }

    public void setVisibility(EditorialContent editorialContent, int i, Boolean bool) {
        if (editorialContent.hasTitle() || editorialContent.hasMessage()) {
            this.itemText.setVisibility(0);
            manageTitleVisibility(editorialContent, i);
            manageMessageVisibility(editorialContent);
        }
        manageMediaVisibility(editorialContent, i);
        if (editorialContent.isPlaceHolderType()) {
            setPlaceHolderListeners(editorialContent.getAppName(), editorialContent.getPackageName(), editorialContent.getMd5sum(), editorialContent.getIcon(), editorialContent.getVerName(), editorialContent.getVerCode(), editorialContent.getPath(), editorialContent.getPathAlt(), editorialContent.getObb(), editorialContent.getId(), editorialContent.getSize(), editorialContent.getSplits(), editorialContent.getRequiredSplits(), editorialContent.getRank(), editorialContent.getStoreName());
            setPlaceHolderInfo(editorialContent.getAppName(), editorialContent.getIcon(), editorialContent.getRating());
            if (bool.booleanValue()) {
                this.appCardLayout.setVisibility(4);
                this.appCardLayout.setScaleX(0.1f);
                this.appCardLayout.setScaleY(0.1f);
            }
        }
        if (editorialContent.hasAction()) {
            manageActionVisibility(editorialContent);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo11110b(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, Obb obb, long j, List list, List list2, String str8, String str9, View view) {
        C12871b<EditorialDownloadEvent> bVar = this.downloadEventListener;
        EditorialDownloadEvent editorialDownloadEvent = r1;
        C12871b<EditorialDownloadEvent> bVar2 = bVar;
        EditorialDownloadEvent editorialDownloadEvent2 = new EditorialDownloadEvent(EditorialEvent.Type.BUTTON, str, str2, str3, str4, str5, i, str6, str7, obb, this.action, j, list, list2, str8, str9);
        bVar2.onNext(editorialDownloadEvent);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11106a(EditorialMedia editorialMedia, View view) {
        this.uiEventListener.onNext(new EditorialEvent(EditorialEvent.Type.MEDIA, editorialMedia.getUrl()));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11107a(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, Obb obb, long j, List list, List list2, View view) {
        C12871b<EditorialDownloadEvent> bVar = this.downloadEventListener;
        EditorialDownloadEvent editorialDownloadEvent = r2;
        EditorialDownloadEvent editorialDownloadEvent2 = new EditorialDownloadEvent(EditorialEvent.Type.CANCEL, str, str2, str3, str4, str5, i, str6, str7, obb, j, list, list2);
        bVar.onNext(editorialDownloadEvent);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11108a(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, Obb obb, long j, List list, List list2, String str8, String str9, View view) {
        C12871b<EditorialDownloadEvent> bVar = this.downloadEventListener;
        EditorialDownloadEvent editorialDownloadEvent = r1;
        C12871b<EditorialDownloadEvent> bVar2 = bVar;
        EditorialDownloadEvent editorialDownloadEvent2 = new EditorialDownloadEvent(EditorialEvent.Type.RESUME, str, str2, str3, str4, str5, i, str6, str7, obb, this.action, j, list, list2, str8, str9);
        bVar2.onNext(editorialDownloadEvent);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11104a(long j, String str, View view) {
        this.uiEventListener.onNext(new EditorialEvent(EditorialEvent.Type.APPCARD, j, str));
    }
}
