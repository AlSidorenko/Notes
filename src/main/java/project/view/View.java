package project.view;

import project.model.entity.Publication;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created on 03.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class View {


    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printMessage(String ... messages) {
        StringBuilder message = new StringBuilder();
        for (String s : messages) {
            message.append(s);
        }
        System.out.println(message.toString());
    }

    public void printArray(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
