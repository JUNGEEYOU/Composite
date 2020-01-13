package composite_iterator;
import java.util.Iterator;

public class NullIterator implements Iterator {

    public MenuComponent next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }

}
