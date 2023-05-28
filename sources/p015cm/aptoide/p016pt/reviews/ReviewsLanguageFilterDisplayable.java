package p015cm.aptoide.p016pt.reviews;

import android.widget.Spinner;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.reviews.LanguageFilterHelper;
import p015cm.aptoide.p016pt.reviews.LanguageFilterSpinnerHelper;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.reviews.ReviewsLanguageFilterDisplayable */
public class ReviewsLanguageFilterDisplayable extends Displayable {
    private LanguageFilterSpinnerHelper languageFilterSpinnerHelper;
    private LanguageFilterSpinnerHelper.OnItemSelected onItemSelected;

    public ReviewsLanguageFilterDisplayable() {
    }

    /* renamed from: a */
    public /* synthetic */ void mo14033a(LanguageFilterHelper.LanguageFilter languageFilter) {
        this.onItemSelected.onItemSelected(languageFilter);
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public LanguageFilterSpinnerHelper.OnItemSelected getOnItemSelected() {
        return this.onItemSelected;
    }

    public int getViewLayout() {
        return C1086R.layout.reviews_language_filter;
    }

    public void setup(Spinner spinner) {
        if (this.languageFilterSpinnerHelper == null) {
            LanguageFilterSpinnerHelper languageFilterSpinnerHelper2 = new LanguageFilterSpinnerHelper(spinner);
            this.languageFilterSpinnerHelper = languageFilterSpinnerHelper2;
            languageFilterSpinnerHelper2.setup(new C3973n(this));
        }
    }

    public ReviewsLanguageFilterDisplayable(LanguageFilterSpinnerHelper.OnItemSelected onItemSelected2) {
        this.onItemSelected = onItemSelected2;
    }
}
