package matching;

public class ClassFinished extends AbstractEvent {

    private Long id;

    public ClassFinished(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}