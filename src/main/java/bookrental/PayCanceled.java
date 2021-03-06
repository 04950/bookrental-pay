package bookrental;

public class PayCanceled extends AbstractEvent {

    private Long id;
    private Long askId;
    private Long bookId;
    private String status;

    public PayCanceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAskId() {
        return askId;
    }

    public void setAskId(Long id) {
        this.askId = askId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
