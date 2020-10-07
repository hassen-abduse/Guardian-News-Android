package et.edu.aait.citsc.abduselam.guardiannews;

import android.net.Uri;

public class Item {
    private String title;
    private String sectionName;
    private String webUrl;
    private String publicationDate;
    //private Uri imgUrl;


    //Constructor
    public Item(String title, String sectionName, String webUrl, String publicationDate) {
        this.title = title;
        this.sectionName = sectionName;
        this.webUrl = webUrl;
        this.publicationDate = publicationDate;
        //this.imgUrl = imgUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    //public void setImgUrl(Uri imgUrl) {
       // this.imgUrl = imgUrl;
    //}

    public String getTitle() {
        return title;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

   // public Uri getImgUrl() {
      //  return imgUrl;
   // }
}
