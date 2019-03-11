package project.controller;

import project.model.entity.Publication;
import project.view.View;

import java.util.Scanner;

/**
 * Created on 01.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Controller {

    View view;
    Publication publication;

    public Controller(View view, Publication publication) {
        this.view = view;
        this.publication = publication;
    }

    public void processSorting() {
        Scanner sc = new Scanner(System.in);


    }
}
