
class student {

    int rollnumber;

    void getnumber(int n) {
        rollnumber = n;
    }

    void putnumber() {
        System.out.println("Rollnumber: = " + rollnumber);
    }
}

class test extends student {

    float part1, part2;

    void getmarks(float m1, float m2) {
        part1 = m1;
        part2 = m2;
    }

    void putmarks() {
        System.out.println("Marks obitained");
        System.out.println(" part1: = " + part1);
        System.out.println(" part2: = " + part2);
    }
}

interface sports {

    float sportWt = 6.0F;

    void putwt();
}

class results extends test implements sports {

    float total;

    public void putwt() {
        System.out.println("Sports Wt: = " + sportWt);
    }

    void diaplay() {
        total = part1 + part2 + sportWt;
        putnumber();
        putmarks();
        putwt();
        System.err.println("total score = " + total);
    }
}

class Hybride {

    public static void main(String[] args) {
        results student1 = new results();
        student1.getnumber(1234);
        student1.getmarks(27.5F, 33.0F);
        student1.diaplay();
    }
}
