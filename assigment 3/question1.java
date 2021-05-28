public class question1 {
    public static void main(String[] args) {
        square a = new square();
    }
}

class Shape{
    Shape(){System.out.println("This is shape\n");
}}

class rectangle extends Shape{
    rectangle(){System.out.println("This is Rectangle\n");}
}

class circle extends Shape{
    circle(){System.out.println("This is circle\n");}
}

class square extends rectangle{
    square(){System.out.println("square is a rectangle");}
}