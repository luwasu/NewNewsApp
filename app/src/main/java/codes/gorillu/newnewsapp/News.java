package codes.gorillu.newnewsapp;

/**
 * An {@link News} object contains information related to a single news item.
 */

public class News {

    /** Title of news article */
    private String mTitle;

    /** Section of news article*/
    private String mSection;

    /** Website URL of the earthquake */
    private String mUrl;

    /** Author of news article */
    private String mAuthor;

    /** Date  of news article */
    private String mDate;

    /** Thumbnail of news article */
    private String mThumbnail;

    /**
     * Constructs a new {@link News} object.
     *
     * @param thumbnail is the thumbnail of the news article
     * @param title is the title of the news article
     * @param section is the section of the news article
     * @param url is the url of the news article
     * @param author is the author of the news article
     * @param date is the date of the news article
     */

    public News(String thumbnail, String title, String section, String url, String author, String date) {
        this.mTitle = title;
        this.mSection = section;
        this.mUrl = url;
        this.mAuthor = author;
        this.mDate = date;
        this.mThumbnail = thumbnail;
    }

   /**
    * Returns the title of the news item.
    */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section of the news item.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the url of the news item.
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Returns the author of the news item.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the date of the news item.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the thumbnail of the news item.
     */
    public String getThumbnail() {
        return mThumbnail;
    }
}
