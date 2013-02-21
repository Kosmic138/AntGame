package card;

/**
 *
 * @author Felix
 */
public abstract class Card {

    private String name;
    public int prop = 1;

    public Card() {
    }

    public Card(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getProp() {
    	return prop;
    }
    
    public void setProp(int prop) {
    	this.prop = prop;
    }
}