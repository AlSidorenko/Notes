package project.model;

/**
 * Created on 06.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public enum Importance {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

    private final int level;

     Importance(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Importance{" +
                "level=" + level +
                '}';
    }
}
