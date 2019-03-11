package project.model;

/**
 * Created on 06.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public enum NoteType {

    SPORT("SPORT", 10),
    HEALTHY_FOOD("HEALTHY_FOOD", 25),
    SCIENCE_AND_TECHNOLOGY("SCIENCE_AND_TECHNOLOGY", 18),
    TOURISM_AND_TRAVEL("TOURISM_AND_TRAVEL", 37);

    private final String name;
    private final int size;

    NoteType(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "NoteType{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
