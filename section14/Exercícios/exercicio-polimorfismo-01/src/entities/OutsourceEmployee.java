package entities;

public class OutsourceEmployee extends Employee {
    private Double additionalCharge;

    public OutsourceEmployee() {}

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        double bonus = additionalCharge * 1.1;
        return super.payment() + bonus;
    }
}
