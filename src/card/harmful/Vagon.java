package card.harmful;

import player.Player;

public class Vagon extends AbstractHarmful {
    
    private int buildCastle = 8;
    private int destroyCastle = 4;
    
    public Vagon() {
        super();
        setBricks(10);
    }

    @Override
    public void harass(Player executor, Player victim) {
        if (canUse(executor)) {
            executor.decreaseBricks(getBricks());
            executor.increaseCastle(buildCastle);
            victim.defendCastle(destroyCastle);
            System.out.println("Vagon harassing!");
        }
    }

    @Override
    public boolean canUse(Player executor) {
        return executor.ensureBricks(getBricks()) && executor.ensureWeapons(getWeapons());
    }
}
