public class WhileStructure {
    public static void main(String[] args) {
        String[] subscribers = { "Marcos", "João", "Erickson" , "Felipe", "Claudio", "Anna", "Antonio", "Carminha", "Adriana", "Sophia", "Cleber", "Armando" };

        final int numberOfPlaces = 10;

        String[] places = new String[numberOfPlaces];

        int currentPlace = 0;

        String subscriber = "Undefined";
        String log;

        while (currentPlace < numberOfPlaces) {
            subscriber = subscribers[currentPlace];
            log = "Adding to subscription " + subscriber + " on the place " + (currentPlace + 1);

            places[currentPlace] = subscriber;
            currentPlace += 1;
            System.out.println(log);            
        }
    }
}
