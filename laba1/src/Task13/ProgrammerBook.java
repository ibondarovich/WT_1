package Task13;
import Task12.Book;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj)
    {
        if(!super.equals(obj))
        return false;
    
        ProgrammerBook book = (ProgrammerBook)obj;
        return this.language == book.language && this.level == book.level;
    }

    @Override
    public int hashCode()
    {
        int hash = super.hashCode();
        hash = hash * 29 + level;
        hash = hash * 29 + (language == null ? 0 : language.hashCode());

        return hash;
    } 

    @Override
    public String toString()
    {
        return super.toString() + language + "\n" + Integer.toString(level) + "\n";
    }
}
