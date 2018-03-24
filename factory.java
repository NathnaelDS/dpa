interface Phone {
    void make();
}


class S_nine implements Phone {

    @Override
    public void make() {
        System.out.println("Inside Galaxy S9");
    }
}


class S_eight implements Phone {

    @Override
    public void make() {
        System.out.println("Inside Galaxy S8");
    }
}


class S_seven implements Phone {

    @Override
    public void make() {
        System.out.println("Inside Galaxy S7");
    }
}


class PhoneFactory {
    public Phone getPhone(String phonetype){
        if (phonetype == null){
            return null;
        }
        if(phonetype.equalsIgnoreCase("seven")){
            return new S_seven();
        }
        if(phonetype.equalsIgnoreCase("eight")){
            return new S_eight();
        }
        if(phonetype.equalsIgnoreCase("nine")){
            return new S_nine();
        }

        return null;
    }
}


public class HereLiesAFactoryPattern {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();

        Shape shape1 = phoneFactory.getPhone("eight");
        shape1.make();

        Shape shape2 = phoneFactory.getPhone("nine");
        shape2.make();

        Shape shape3 = phoneFactory.getPhone("seven");
        shape3.make();
    }
}