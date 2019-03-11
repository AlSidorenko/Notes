package project.model.entity;

import project.model.Importance;

/**
 * Created on 01.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Text extends Note {

    public Text() {
    }

    public Text(int id, String title, int size, String timeCreation, int importance) {
        super(id, title, size, timeCreation, importance);
    }

    @Override
    public String toString() {
        return "Text";
    }
}
