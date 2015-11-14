package benobenq.fantasy_game_GUI.myEnum;

/**
 * Created by Bent on 12.11.2015.
 */
public enum Material {
    HOLZ(1), STEIN(2), EISEN(3), STAHL(4), LASER(5);

    private final int material;

    Material(int material) {
         this.material = material;
    }

    public String toString() {
        switch (material) {
            case 1:
                return "Holz";
            case 2:
                return "Stein";
            case 3:
                return "Eisen";
            case 4:
                return "Stahl";
            case 5:
                return "Laser";
        }
        return null;
    }

    public int getInt() {
        return material;
    }
}
