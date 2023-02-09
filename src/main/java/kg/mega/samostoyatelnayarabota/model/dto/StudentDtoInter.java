package kg.mega.samostoyatelnayarabota.model.dto;

import kg.mega.samostoyatelnayarabota.model.entities.Schoolarship;
import kg.mega.samostoyatelnayarabota.model.entities.Subject;

public interface StudentDtoInter {

    String getName();
    String getLast_Name();
    String getPatronymic();
    boolean getIs_Active();
    Schoolarship getSchoolarships_Id();
    Subject getSubjects_Id();
}
