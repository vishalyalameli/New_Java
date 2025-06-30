interface core2web {

}

class c2wstud implements core2web {

}

class otherstud {

}

class companyInterview {

    static void selectprocess(Object obj) {
        if (obj instanceof core2web) {
            System.out.println("Direct CEO");
        } else {
            System.out.println("5 Interview");
        }
    }

    public static void main(String[] args) {
        c2wstud obj1 = new c2wstud();
        otherstud obj2 = new otherstud();

        selectprocess(obj1);
        selectprocess(obj2);
    }
}

/*
 Direct CEO
5 Interview
 */
//