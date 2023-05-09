
import fr.yncrea.cin3.stream.model.Person;
import fr.yncrea.cin3.stream.service.DataProvider;

import java.util.List;

public class Main {
    private DataProvider dataProvider;

    public static void main(String[] args) {
        var main = new Main();
        main.run();
    }

    public Main() {
        dataProvider = new DataProvider();
    }

    public void run() {
        List<Person> personList = dataProvider.fetchFamily();

        // TODO écrire les streams
    }
}