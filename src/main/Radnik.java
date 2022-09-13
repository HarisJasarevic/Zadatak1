package main;

public abstract class Radnik {

    protected String name;
    protected String lastname;
    protected long idNum;
    protected long accNum;
    protected long payment;

    public Radnik(String name, String lastname, long idNum, long accNum, long payment) {
        this.name = name;
        this.lastname = lastname;
        this.idNum = idNum;
        this.accNum = accNum;
        this.payment = payment;
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

    public void rest(){
        System.out.println("Resting...");
    }

    abstract void move();

    @Override
    public String toString() {
        return "Radnik{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", idNum=" + idNum +
                ", accNum=" + accNum +
                ", payment=" + payment +
                '}';
    }
}

