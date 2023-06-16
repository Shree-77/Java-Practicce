package Collections.question5;

import java.util.LinkedList;

public class GymTest {
    public static void main(String[] args) {
        Gym gym = new Gym("Batman Gym", 2, "Arkhram", 1234567);
        Gym gym2 = new Gym("Man of Steel ", 20, "Lois", 0764567);
        Gym gym3 = new Gym("Iron Gym", 12, "Pepper", 9876565);
        LinkedList<Gym> list = new LinkedList<>();
        list.add(gym);
        list.add(gym2);
        list.add(gym3);

        for (Gym gyms : list) {
            if (gyms.Distance <= 2) {
                gyms.display();
            }
        }

    }
}
