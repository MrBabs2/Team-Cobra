package p015cm.aptoide.p016pt.reviews;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.LinkedList;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.reviews.LanguageFilterHelper;

/* renamed from: cm.aptoide.pt.reviews.LanguageFilterSpinnerHelper */
class LanguageFilterSpinnerHelper {
    private final Context context;
    /* access modifiers changed from: private */
    public final LanguageFilterHelper languageFilterHelper = new LanguageFilterHelper(this.resources);
    /* access modifiers changed from: private */
    public final Resources resources;
    private final Spinner spinner;

    /* renamed from: cm.aptoide.pt.reviews.LanguageFilterSpinnerHelper$OnItemSelected */
    interface OnItemSelected {
        void onItemSelected(LanguageFilterHelper.LanguageFilter languageFilter);
    }

    LanguageFilterSpinnerHelper(Spinner spinner2) {
        this.spinner = spinner2;
        this.resources = spinner2.getResources();
        this.context = spinner2.getContext();
    }

    private List<String> createSpinnerAdapterRowsList() {
        List<LanguageFilterHelper.LanguageFilter> languageFilterList = this.languageFilterHelper.getLanguageFilterList();
        LinkedList linkedList = new LinkedList();
        for (LanguageFilterHelper.LanguageFilter stringId : languageFilterList) {
            linkedList.add(this.resources.getString(stringId.getStringId()));
        }
        return linkedList;
    }

    private int getDefaultSelectionId() {
        return this.languageFilterHelper.getCurrentLanguageFirst().getStringId();
    }

    private void setAdapter(SpinnerAdapter spinnerAdapter, OnItemSelected onItemSelected) {
        this.spinner.setAdapter(spinnerAdapter);
        setupOnItemSelectedListener(onItemSelected);
        setSelection(this.resources.getString(getDefaultSelectionId()));
    }

    private void setSelection(String str) {
        for (int i = 0; i < this.spinner.getAdapter().getCount(); i++) {
            if (str.equals(this.spinner.getAdapter().getItem(i))) {
                this.spinner.setSelection(i);
            }
        }
    }

    private SpinnerAdapter setupCommentsFilterLanguageSpinnerAdapter() {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.context, C1086R.layout.simple_language_spinner_item, createSpinnerAdapterRowsList());
        arrayAdapter.setDropDownViewResource(17367049);
        return arrayAdapter;
    }

    private void setupLanguageSpinnerClickListener(View view) {
        view.setOnClickListener(new C3960a(this));
    }

    private void setupOnItemSelectedListener(final OnItemSelected onItemSelected) {
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (view instanceof TextView) {
                    CharSequence text = ((TextView) view).getText();
                    LanguageFilterHelper.LanguageFilter languageFilter = null;
                    for (LanguageFilterHelper.LanguageFilter next : LanguageFilterSpinnerHelper.this.languageFilterHelper.getLanguageFilterList()) {
                        if (text.equals(LanguageFilterSpinnerHelper.this.resources.getString(next.getStringId()))) {
                            languageFilter = new LanguageFilterHelper.LanguageFilter(next);
                        }
                    }
                    onItemSelected.onItemSelected(languageFilter);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    /* renamed from: a */
    public /* synthetic */ void mo14006a(View view) {
        this.spinner.performClick();
    }

    /* access modifiers changed from: package-private */
    public void setup(OnItemSelected onItemSelected) {
        setAdapter(setupCommentsFilterLanguageSpinnerAdapter(), onItemSelected);
        setupLanguageSpinnerClickListener((View) this.spinner.getParent());
    }
}
