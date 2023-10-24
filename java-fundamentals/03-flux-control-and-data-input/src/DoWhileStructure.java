import java.util.Random;

public class DoWhileStructure {
    public static void main(String[] args) {

		int tries = 0;
		int answered = 0;
		String log;

		do {
			log = "Calling selected candidate ...\n";
			// Random number from 1 to 4.
			answered = new Random().ints(0, 2).findFirst().getAsInt();
			tries += 1;
		} while (answered == 0 && tries < 3);

		log = "Candidate answered in the try: " + tries;
		System.out.println(log);
	}
}
