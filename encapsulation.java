
public class ak {

    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

class encapsulation {

    static void main(String[] args) {
        ak ap = new ak();
        ap.setName("hello aaidan");
        System.out.println("my name:- " + ap.getName());
    }
}
