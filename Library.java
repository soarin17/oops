abstract class Item {
    private String id;
    private String title;
    private String publicationDate;
    private int maxCheckoutdays;

    public Item(String id, String title, String publicationDate, int maxCheckoutdays){
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.maxCheckoutdays = maxCheckoutdays;
    }

    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getPublicationDate(){
        return publicationDate;
    }
    public int getMaxcheckoutdays(){
        return maxCheckoutdays;
    }

    public abstract String getIteminfo();
}

class Book extends Item{
    private String author;
    private int numberofpages;
    
    public Book(String id, String title, String publicationDate, int maxCheckoutdays, String author, int numberofpages){
        super(id, title, publicationDate, maxCheckoutdays);
        this.author = author;
        this.numberofpages = numberofpages;
    }

    public String getAuthor(){
        return author;
    }
    public int getNumberofPages(){
        return numberofpages;
    }

    @Override
    public String getIteminfo(){
        return "Book: " + getTitle() + " by " + getAuthor() + " (number of pages: " + getNumberofPages() + " pages)";
    }
}

class DVD extends Item{
    private String Director;
    private int runningtime;
    
    public DVD(String id, String title, String publicationDate, int maxCheckoutdays, String Director, int runningtime){
        super(id, title, publicationDate, maxCheckoutdays);
        this.Director = Director;
        this.runningtime = runningtime;
    }

    public String getDirector(){
        return Director;
    }
    public int getRunningtime(){
        return runningtime;
    }


    @Override
    public String getIteminfo(){
        return "DVD: " + getTitle() + " directed by " + getDirector() + " (" + getRunningtime() + " mins)";
    }
}

