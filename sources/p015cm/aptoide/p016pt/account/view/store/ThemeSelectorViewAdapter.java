package p015cm.aptoide.p016pt.account.view.store;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.themes.StoreTheme;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p112n.p118g.p119b.C5305c;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.account.view.store.ThemeSelectorViewAdapter */
public class ThemeSelectorViewAdapter extends RecyclerView.C0633g<ViewHolder> {
    private StoreTheme selectedStoreTheme;
    private final C5305c<StoreTheme> storeThemePublishRelay;
    private final ThemeManager themeManager;
    private final List<StoreTheme> themes;

    /* renamed from: cm.aptoide.pt.account.view.store.ThemeSelectorViewAdapter$ViewHolder */
    public static final class ViewHolder extends RecyclerView.C0629c0 {
        private static final int LAYOUT = 2131493130;
        private StoreTheme storeTheme;
        private ImageView storeThemeCheckMark;
        private ImageView storeThemeImage;
        private final C5305c<StoreTheme> storeThemePublishRelay;

        public ViewHolder(View view, C5305c<StoreTheme> cVar) {
            super(view);
            this.storeThemePublishRelay = cVar;
            bind(view);
        }

        private void bind(View view) {
            this.storeThemeImage = (ImageView) view.findViewById(C1086R.C1088id.theme_color);
            this.storeThemeCheckMark = (ImageView) view.findViewById(C1086R.C1088id.theme_checked);
            C10695a.m36221a(view).mo18664b(new C1216c0(this)).mo18693i();
        }

        /* renamed from: a */
        public /* synthetic */ void mo6546a(Void voidR) {
            this.storeThemePublishRelay.call(this.storeTheme);
        }

        public void update(StoreTheme storeTheme2, StoreTheme storeTheme3, int i) {
            this.storeTheme = storeTheme2;
            this.storeThemeImage.setBackgroundResource(i);
            if (storeTheme2 == storeTheme3) {
                this.storeThemeCheckMark.setVisibility(0);
            } else {
                this.storeThemeCheckMark.setVisibility(8);
            }
        }
    }

    public ThemeSelectorViewAdapter(C5305c<StoreTheme> cVar, List<StoreTheme> list, ThemeManager themeManager2) {
        this.storeThemePublishRelay = cVar;
        this.themes = list;
        this.themeManager = themeManager2;
    }

    public int getItemCount() {
        List<StoreTheme> list = this.themes;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public StoreTheme getSelectedTheme() {
        return this.selectedStoreTheme;
    }

    /* renamed from: selectTheme */
    public void mo6541a(StoreTheme storeTheme) {
        this.selectedStoreTheme = storeTheme;
        notifyDataSetChanged();
    }

    public C5368e<StoreTheme> storeThemeSelection() {
        return this.storeThemePublishRelay.mo18664b(new C1218d0(this));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.update(this.themes.get(i), this.selectedStoreTheme, this.themeManager.getAttributeForTheme(this.themes.get(i).getThemeName(), C1086R.attr.themeSelectorItemBackground).resourceId);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.partial_store_theme_round_item, viewGroup, false), this.storeThemePublishRelay);
    }
}
