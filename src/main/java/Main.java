import de.materna.jdec.DMNDecisionSession;
import de.materna.jdec.DecisionSession;
import de.materna.jdec.serialization.SerializationHelper;
import entities.Application;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) throws Exception {
		DecisionSession decisionSession = new DMNDecisionSession();

		Path modelPath = Paths.get(Main.class.getClassLoader().getResource("model.dmn").toURI());
		String model = new String(Files.readAllBytes(modelPath));
		decisionSession.importModel("https://kiegroup.org/dmn/6409e52a", model);

		Application application = new Application();
		application.setMonthlyIncome(1000);
		application.setMonthlyExpenses(500);
		application.setCreditAmount(10000);

		System.out.println(decisionSession.executeModel("https://kiegroup.org/dmn/6409e52a", application).getOutputs());
	}
}
