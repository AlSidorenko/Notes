package project;

import project.builder.CreatorPublication;
import project.builder.MenuPublication;
import project.model.entity.Publication;
import project.view.View;

import java.util.List;

/**
 * Created on 01.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Main {

    private static CreatorPublication cp = new CreatorPublication();
    private static Publication publication = new Publication();


    public static void main(String[] args) {
        View view = new View();
        MenuPublication mp = new MenuPublication();

        view.printArray(cp.createPublication()); // Print Publication
        view.printArray(publication.sortByTimeCreation(cp.createPublication()));
        //view.printArray(publication.sortByImportance(cp.createPublication()));
        //view.printArray(publication.sortByTitle(cp.createPublication()));
        //view.printArray(publication.sortById(cp.createPublication()));
        //view.printArray(publication.findByTitle(cp.createPublication(), "SPORT"));
    }
}
