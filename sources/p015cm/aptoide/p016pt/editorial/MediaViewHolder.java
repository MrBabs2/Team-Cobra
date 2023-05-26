package p015cm.aptoide.p016pt.editorial;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.editorial.EditorialEvent;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.editorial.MediaViewHolder */
class MediaViewHolder extends RecyclerView.C0629c0 {
    private TextView description;
    private ImageView image;
    private C12871b<EditorialEvent> uiEventListener;
    private ImageView videoThumbnail;
    private FrameLayout videoThumbnailContainer;

    public MediaViewHolder(View view, C12871b<EditorialEvent> bVar) {
        super(view);
        this.uiEventListener = bVar;
        this.image = (ImageView) view.findViewById(C1086R.C1088id.image_item);
        this.videoThumbnail = (ImageView) view.findViewById(C1086R.C1088id.editorial_video_thumbnail);
        this.videoThumbnailContainer = (FrameLayout) view.findViewById(C1086R.C1088id.editorial_video_thumbnail_container);
        this.description = (TextView) view.findViewById(C1086R.C1088id.editorial_image_description);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11308a(EditorialMedia editorialMedia, View view) {
        this.uiEventListener.onNext(new EditorialEvent(EditorialEvent.Type.MEDIA, editorialMedia.getUrl()));
    }

    public void setDescriptionVisible() {
        this.description.setVisibility(0);
    }

    public void setVisibility(EditorialMedia editorialMedia) {
        if (editorialMedia.hasUrl()) {
            if (editorialMedia.isVideo()) {
                if (editorialMedia.getThumbnail() != null) {
                    ImageLoader.with(this.itemView.getContext()).load(editorialMedia.getThumbnail(), this.videoThumbnail);
                }
                this.videoThumbnailContainer.setVisibility(0);
                this.videoThumbnailContainer.setOnClickListener(new C2550t6(this, editorialMedia));
            } else {
                ImageLoader.with(this.itemView.getContext()).load(editorialMedia.getUrl(), this.image);
                this.image.setVisibility(0);
            }
            this.description.setText(editorialMedia.getDescription());
        }
    }
}
