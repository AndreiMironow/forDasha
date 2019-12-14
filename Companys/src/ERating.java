
public enum ERating {

    Rating_2 ("Неудовлетворительно", 2),
    Rating_3 ("Удовлетворительно",   3),
    Rating_4 ("Хорошо",              4),
    Rating_5 ("Отлично",             5);
    
    private final String text;
    private final int rating;
    
    ERating(String text, int rating) {
        this.text = text;
        this.rating = rating;
    }
    
    @Override
    public String toString() {
        return text;
    }

    public int getRating() {
        return rating;
    }
    
    public static ERating getRating(int rating)
    {
        for(ERating eRating : ERating.values())
        {
            if(eRating.getRating() == rating)
                return eRating;
        }
        return null;
    }
    
}
