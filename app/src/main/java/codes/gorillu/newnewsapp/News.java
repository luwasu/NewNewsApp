package codes.gorillu.newnewsapp;

public class News {
    private String mTitle;
    private String mSection;
    private String mUrl;
    private String mAuthor;
    private String mDate;
    private String mThumbnail;

    public News(String thumbnail, String title, String section, String url, String author, String date) {
        this.mTitle = title;
        this.mSection = section;
        this.mUrl = url;
        this.mAuthor = author;
        this.mDate = date;
        this.mThumbnail = thumbnail;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getDate() {
        return mDate;
    }

    public String getThumbnail() {
        return mThumbnail;
    }
}
