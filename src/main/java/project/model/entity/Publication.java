package project.model.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created on 07.03.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Publication {

    private int id;
    private String noteType;
    private List<Note> notes;
    private int size;
    private int importance;
    private String timeCreation;

    public Publication() { }

    public Publication(int id, String noteType, List<Note> notes, int size, int importance, String timeCreation) {
        this.id = id;
        this.noteType = noteType;
        this.notes = notes;
        this.size = size;
        this.importance = importance;
        this.timeCreation = timeCreation;
    }

    public List<Publication> sortById(List<Publication> publications) {
        publications.sort(new Comparator<Publication>() {
            @Override
            public int compare(Publication o1, Publication o2) {
                int elem1 = o1.id;
                int elem2 = o2.id;
                return Integer.compare(elem1, elem2);
            }
        });
        return publications;
    }

    public List<Publication> sortByTimeCreation(List<Publication> publications) {
        publications.sort(new Comparator<Publication>() {
            DateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            @Override
            public int compare(Publication o1, Publication o2) {
                try {
                    return f.parse(o1.timeCreation).compareTo(f.parse(o2.timeCreation));
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e);
                }

            }
        });
        return publications;
    }

    public List<Publication> sortByImportance(List<Publication> publications) {
        publications.sort(new Comparator<Publication>() {
            @Override
            public int compare(Publication o1, Publication o2) {
                int elem1 = o1.importance;
                int elem2 = o2.importance;
                return Integer.compare(elem1, elem2);
            }
        });
        return publications;
    }

    public List<Publication> sortByTitle(List<Publication> publications) {
        publications.sort(new Comparator<Publication>() {
            @Override
            public int compare(Publication o1, Publication o2) {
                return o1.noteType.compareTo(o2.noteType);
            }
        });
        return publications;
    }

    public List<Publication> findByTitle(List<Publication> publications, String nameNoteType) {
        List<Publication> result = new ArrayList<>();
        for (Publication publication : publications) {
            if (publication.noteType.equals(nameNoteType)) {
                result.add(publication);
            }
        }
        return result;
    }

    public List<Publication> findById(List<Publication> publications, int idPublication) {
        List<Publication> result = new ArrayList<>();
        for (Publication publication : publications) {
            if (publication.id == idPublication) {
                result.add(publication);
            }
        }
        return result;
    }

    public List<Publication> findByDate(List<Publication> publications, String date) {
        List<Publication> result = new ArrayList<>();
        for (Publication publication : publications) {
            if (publication.timeCreation.equals(date)) {
                result.add(publication);
            }
        }
        return result;
    }

    public List<Publication> findByImportance(List<Publication> publications, int importancePublication) {
        List<Publication> result = new ArrayList<>();
        for (Publication publication : publications) {
            if (publication.importance == importancePublication) {
                result.add(publication);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "id='" + id + '\'' +
                ", noteType=" + noteType +
                ", notes=" + notes +
                ", size=" + size +
                ", importance=" + importance +
                ", timeCreation='" + timeCreation + '\'' +
                '}';
    }
}
