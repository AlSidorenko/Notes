package project.controller;

import project.builder.CreatorPublication;
import project.model.entity.Publication;
import project.view.View;

/**
 * Created on 01.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Controller {

    private View view;
    private Publication publication;
    private CreatorPublication cp;

    public Controller(View view, Publication publication, CreatorPublication cp) {
        this.view = view;
        this.publication = publication;
        this.cp = cp;
    }

    public void processUser() {

        view.printMessage(TextConstant.LIST_OF_PUBLICATION, "");
        view.printArray(cp.createPublication());

        view.printMessage("\n", TextConstant.SORT_BY_DATE, "");
        view.printArray(publication.sortByTimeCreation(cp.createPublication()));

        view.printMessage("\n", TextConstant.SORT_BY_IMPORTANCE, "");
        view.printArray(publication.sortByImportance(cp.createPublication()));

        view.printMessage("\n", TextConstant.SORT_BY_TITLE, "");
        view.printArray(publication.sortByTitle(cp.createPublication()));

        view.printMessage("\n", TextConstant.SORT_BY_ID, "");
        view.printArray(publication.sortById(cp.createPublication()));

        view.printMessage("\n", TextConstant.FIND_BY_TITLE, "SPORT");
        view.printArray(publication.findByTitle(cp.createPublication(), "SPORT"));

        view.printMessage("\n", TextConstant.FIND_BY_ID, "2");
        view.printArray(publication.findById(cp.createPublication(), 2));

        view.printMessage("\n", TextConstant.FIND_BY_DATE, "11/03/2019");
        view.printArray(publication.findByDate(cp.createPublication(), "11/03/2019"));

        view.printMessage("\n", TextConstant.FIND_BY_IMPORTANCE, "2");
        view.printArray(publication.findByImportance(cp.createPublication(), 2));

    }
}
