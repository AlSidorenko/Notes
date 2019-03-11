package project.builder;

import project.model.entity.Publication;
import project.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 10.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MenuPublication {

    private View view;
    private CreatorPublication cp;
    private Publication publication;

    public List<String> showMenu() {
        List<String> action = new ArrayList<>();
        action.add("1: Show all PUBLICATIONS.");
        action.add("2: Sorting publication by IMPORTANCE.");
        action.add("3: Sorting publication by TITLE.");
        action.add("4: Sorting publication by ID.");
        action.add("5: Find publication by TITLE.");

        return action;
    }

    public void select(int key) {
        if (key == 1) {
            view.printArray(cp.createPublication());
        } else if (key == 2) {
            view.printArray(publication.sortByImportance(cp.createPublication()));
        }
    }
}
