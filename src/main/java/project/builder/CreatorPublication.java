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

        notes.add(new Publication(generateId(), NoteType.SPORT.getName(),
                asList(new Image(), new Image(), new ListNote(), new Text(), new Text()),
                NoteType.SPORT.getSize(), Importance.FOUR.getLevel(), date()));

        notes.add(new Publication(generateId(), NoteType.HEALTHY_FOOD.getName(),
                asList(new Image(), new Text(), new ListNote(), new Text()),
                NoteType.HEALTHY_FOOD.getSize(), Importance.TWO.getLevel(),date()));

        notes.add(new Publication(generateId(), NoteType.SCIENCE_AND_TECHNOLOGY.getName(),
                asList(new Image(), new Text(), new ListNote()),
                NoteType.SCIENCE_AND_TECHNOLOGY.getSize(), Importance.FIVE.getLevel(),date()));

        notes.add(new Publication(generateId(), NoteType.TOURISM_AND_TRAVEL.getName(),
                asList(new Image(), new Text(), new ListNote()),
                NoteType.TOURISM_AND_TRAVEL.getSize(), Importance.THREE.getLevel(),date()));

        notes.add(new Publication(generateId(), NoteType.SPORT.getName(),
                asList(new Image(), new Image(), new ListNote(), new Text(), new Text()),
                NoteType.SPORT.getSize(), Importance.FOUR.getLevel(), date()));

        return notes;
    }
}
