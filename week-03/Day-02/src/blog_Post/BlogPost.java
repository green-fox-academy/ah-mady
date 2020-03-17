package blog_Post;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate){
      this.authorName=authorName;
      this.authorName=authorName;
      this.title = title;
      this.text = text;
      this.publicationDate = publicationDate;

      System.out.println("\"" + title + "\" titled by "+authorName+ " posted at \"" +publicationDate + "\"." );
      System.out.println("\t*\t" + text + ".");
    }


}
