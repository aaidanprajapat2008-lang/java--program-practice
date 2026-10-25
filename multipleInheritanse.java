class grandparent {
    String grandParentName;
    int grandparentage;

    grandparent(String grandParentName, int grandparentage) {
        this.grandParentName = grandParentName;
        this.grandparentage = grandparentage;
    }
}

class parent extends grandparent {
    String parentName;
    int parentAge;

    parent(String grandParentName, int grandparentage,
            String parentName, int parentAge) {

        super(grandParentName, grandparentage);

        this.parentName = parentName;
        this.parentAge = parentAge;
    }
}

class child extends parent {
    String childName;
    int childAge;

    child(String grandParentName , int grandparentage ,
     String parentName , int parentAge , String childName, int childAge) {
        super(grandParentName, grandparentage, parentName, parentAge);
        this.childName = childName;
        this.childAge = childAge;
    }
}

public class multipleInheritanse {
    public static void main(String[] args) {
        child s1 = new child(
            "Ramkarn prajapat" ,
            80,
            "Dhram chand",
            50,
            "aaidan prajapat",
            20
        );
        System.out.println("Grandparent: " + s1.grandParentName);
        System.out.println("Grandparent Age: " + s1.grandparentage);

        System.out.println("Parent: " + s1.parentName);
        System.out.println("Parent Age: " + s1.parentAge);

        System.out.println("Child: " + s1.childName);
        System.out.println("Child Age: " + s1.childAge);
    }
}
