package p015cm.aptoide.p016pt.reviews;

import android.content.res.Resources;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.reviews.LanguageFilterHelper */
public class LanguageFilterHelper {
    private final LanguageFilter all = new LanguageFilter((int) C1086R.string.reviewappview_short_comments_by_language_all, (List<String>) Collections.emptyList());
    private final String currentCountryCode;
    private final LanguageFilter currentLanguageFirst;
    private final LanguageFilter english;

    /* renamed from: cm.aptoide.pt.reviews.LanguageFilterHelper$LanguageCode */
    public enum LanguageCode {
        en_GB
    }

    /* renamed from: cm.aptoide.pt.reviews.LanguageFilterHelper$LanguageFilter */
    public static class LanguageFilter {
        private final List<String> countryCodes;
        private int position;
        private final int stringId;

        LanguageFilter(int i, String str) {
            this(i, (List<String>) Collections.singletonList(str));
        }

        public List<String> getCountryCodes() {
            return this.countryCodes;
        }

        public int getPosition() {
            return this.position;
        }

        public int getStringId() {
            return this.stringId;
        }

        public String getValue() {
            if (this.countryCodes.size() > 0) {
                return this.countryCodes.get(this.position);
            }
            return null;
        }

        public boolean hasMoreCountryCodes() {
            return this.countryCodes.size() > this.position + 1;
        }

        public LanguageFilter inc() {
            this.position++;
            return this;
        }

        public void setPosition(int i) {
            this.position = i;
        }

        LanguageFilter(int i, List<String> list) {
            this.position = 0;
            this.stringId = i;
            this.countryCodes = list;
        }

        public LanguageFilter(LanguageFilter languageFilter) {
            this(languageFilter.getStringId(), languageFilter.getCountryCodes());
        }
    }

    public LanguageFilterHelper(Resources resources) {
        List list;
        String countryCode = AptoideUtils.SystemU.getCountryCode(resources);
        this.currentCountryCode = countryCode;
        if (countryCode.startsWith("en")) {
            list = Arrays.asList(new String[]{this.currentCountryCode});
        } else {
            list = Arrays.asList(new String[]{this.currentCountryCode, LanguageCode.en_GB.toString()});
        }
        this.currentLanguageFirst = new LanguageFilter((int) C1086R.string.reviewappview_short_comments_by_language_current_language_first, (List<String>) list);
        this.english = new LanguageFilter((int) C1086R.string.reviewappview_short_comments_by_language_english, LanguageCode.en_GB.toString());
    }

    public LanguageFilter getAll() {
        return this.all;
    }

    public String getCurrentCountryCode() {
        return this.currentCountryCode;
    }

    public LanguageFilter getCurrentLanguageFirst() {
        return this.currentLanguageFirst;
    }

    public LanguageFilter getEnglish() {
        return this.english;
    }

    /* access modifiers changed from: package-private */
    public List<LanguageFilter> getLanguageFilterList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.all);
        linkedList.add(this.currentLanguageFirst);
        if (!this.currentCountryCode.startsWith("en")) {
            linkedList.add(this.english);
        }
        return linkedList;
    }
}
