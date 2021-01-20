package matching;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Class_table")
public class Class {

    @Id
    private Long id;
    private String teacher;
    private String visitDate;
    private String classStatus;

    @PrePersist
    public void onPrePersist(){
        ClassFinished classFinished = new ClassFinished();
        BeanUtils.copyProperties(this, classFinished);
        classFinished.publishAfterCommit();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
    public String getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }




}
