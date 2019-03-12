package project;

import project.builder.CreatorPublication;
import project.controller.Controller;
import project.model.entity.Publication;
import project.view.View;

/**
 * Created on 01.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Main {

    public static void main(String[] args) {
        View view = new View();
        Publication publication = new Publication();
        CreatorPublication cp = new CreatorPublication();

        Controller controller = new Controller(view, publication, cp);
        controller.processUser();
    }
}
