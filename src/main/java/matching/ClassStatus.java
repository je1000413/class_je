package matching;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ClassStatus_table")
public class ClassStatus {

        @Id
        private Long id;
        private String teacher;
        private String visitDate;
        private String status;



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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

}
