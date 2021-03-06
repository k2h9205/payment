package carrental;

public class PaidCanceled extends AbstractEvent {

    private Long id;
    private Long carNo;
    private String status;
    private String paymentCancelDate;

    public PaidCanceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getCarNo() {
        return carNo;
    }

    public void setCarNo(Long carNo) {
        this.carNo = carNo;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getPaymentCancelDate() {
        return paymentCancelDate;
    }

    public void setPaymentCancelDate(String paymentCancelDate) {
        this.paymentCancelDate = paymentCancelDate;
    }
}
