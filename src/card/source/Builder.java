package card.source;

import player.Player;

/**
 *
 * @author Felix
 */
public class Builder extends AbstractSource {
    
    public Builder() {
        super(10);
        setBricks(8);
        setBuilders(1);
    }
    
    @Override
    public void supply(Player executor) {
        if (canUse(executor)) {
            executor.decreaseBricks(getBricks());
            executor.increaseBuilders(getBuilders());
            System.out.println("Builder sourcing!");
        }
    }
    
    @Override
    public boolean canUse(Player executor) {
        return executor.ensureBricks(getBricks());
    }
}
