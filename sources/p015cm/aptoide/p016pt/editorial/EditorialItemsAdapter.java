package p015cm.aptoide.p016pt.editorial;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.editorial.EditorialItemsAdapter */
class EditorialItemsAdapter extends RecyclerView.C0633g<EditorialItemsViewHolder> {
    private final C12871b<EditorialDownloadEvent> downloadEventListener;
    private List<EditorialContent> editorialItemList;
    private final DecimalFormat oneDecimalFormat;
    private boolean shouldHaveAnimation = true;
    private C12871b<EditorialEvent> uiEventListener;

    public EditorialItemsAdapter(List<EditorialContent> list, DecimalFormat decimalFormat, C12871b<EditorialEvent> bVar, C12871b<EditorialDownloadEvent> bVar2) {
        this.editorialItemList = list;
        this.oneDecimalFormat = decimalFormat;
        this.uiEventListener = bVar;
        this.downloadEventListener = bVar2;
    }

    public void add(List<EditorialContent> list, boolean z) {
        this.editorialItemList.addAll(list);
        this.shouldHaveAnimation = z;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.editorialItemList.size();
    }

    public void onBindViewHolder(EditorialItemsViewHolder editorialItemsViewHolder, int i) {
        editorialItemsViewHolder.setVisibility(this.editorialItemList.get(i), i, Boolean.valueOf(this.shouldHaveAnimation));
    }

    public EditorialItemsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new EditorialItemsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.editorial_item_layout, viewGroup, false), this.oneDecimalFormat, this.uiEventListener, this.downloadEventListener);
    }
}
