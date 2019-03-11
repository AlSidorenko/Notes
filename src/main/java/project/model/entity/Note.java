package project.model.entity;

/**
 * Created on 03.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public abstract class Note {

    private int id;
    private String title;
    private int size;
    private String timeCreation;
    private int importance;

    public Note() {
    }

    public Note(int id, String title, int size, String timeCreation, int importance) {
        this.id = id;
        this.title = title;
        this.size = size;
        this.timeCreation = timeCreation;
        this.importance = importance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTimeCreation() {
        return timeCreation;
    }

    public void setTimeCreation(String timeCreation) {
        this.timeCreation = timeCreation;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", size=" + size +
                ", timeCreation='" + timeCreation + '\'' +
                ", importance=" + importance +
                '}';
    }
}
