package p015cm.aptoide.p016pt.editorial;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.editorial.MediaBundleAdapter */
class MediaBundleAdapter extends RecyclerView.C0633g<MediaViewHolder> {
    private List<EditorialMedia> media;
    private C12871b<EditorialEvent> uiEventListener;

    public MediaBundleAdapter(List<EditorialMedia> list, C12871b<EditorialEvent> bVar) {
        this.media = list;
        this.uiEventListener = bVar;
    }

    public void add(List<EditorialMedia> list) {
        this.media.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.media.size();
    }

    public void onBindViewHolder(MediaViewHolder mediaViewHolder, int i) {
        mediaViewHolder.setVisibility(this.media.get(i));
    }

    public MediaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MediaViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.media_layout, viewGroup, false), this.uiEventListener);
    }
}
