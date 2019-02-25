public class Main {
    private static final String color[]={"Red","Blue","pink","Brown"};

    public static void main(String[] args) {

        for (int i=0;i<20;i++){
            Circle  circle=(Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(400);
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return color[(int)(Math.random()*color.length)];
    }


    private static int getRandom(){
        return (int )(Math.random()*color.length);
    }


    private static int getRandomX(){
        return (int) (Math.random()*100);
    }

    private static int getRandomY(){
        return (int) (Math.random()*100);
    }
}
