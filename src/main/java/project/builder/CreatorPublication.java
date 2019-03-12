package project.builder;

import project.model.Importance;
import project.model.NoteType;
import project.model.entity.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created on 06.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CreatorPublication {

    private final int ONE = 1;
    private final int TWO = 2;
    private final int THREE = 3;
    private final int FOUR = 4;
    private final int FIVE = 5;

    private List<Note> notes;

    public int generateId() {
        return (int) (Math.random() * 100);
    }

    public String date() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SS");
        return sdf.format(date);
    }

    public List<Publication> createPublication() {
        List<Publication> notes = new ArrayList<>();

        notes.add(new Publication(FOUR, NoteType.SPORT.getName(),
                asList(new Image(), new Image(), new ListNote(), new Text(), new Text()),
                NoteType.SPORT.getSize(), Importance.FOUR.getLevel(), "11/03/2019"));

        notes.add(new Publication(ONE, NoteType.HEALTHY_FOOD.getName(),
                asList(new Image(), new Text(), new ListNote(), new Text()),
                NoteType.HEALTHY_FOOD.getSize(), Importance.TWO.getLevel(), "11/03/2019"));

        notes.add(new Publication(FIVE, NoteType.SCIENCE_AND_TECHNOLOGY.getName(),
                asList(new Image(), new Text(), new ListNote()),
                NoteType.SCIENCE_AND_TECHNOLOGY.getSize(), Importance.FIVE.getLevel(), "10/08/2018"));

        notes.add(new Publication(THREE, NoteType.TOURISM_AND_TRAVEL.getName(),
                asList(new Image(), new Text(), new ListNote()),
                NoteType.TOURISM_AND_TRAVEL.getSize(), Importance.THREE.getLevel(), "08/02/2017"));

        notes.add(new Publication(TWO, NoteType.SPORT.getName(),
                asList(new Image(), new Image(), new ListNote(), new Text(), new Text()),
                NoteType.SPORT.getSize(), Importance.ONE.getLevel(), "06/02/2016"));

        return notes;
    }
}
