package sia.knights;

import java.io.PrintStream;

public class RescueDamselQuest implements Quest {
	
	private PrintStream stream;

	  public RescueDamselQuest(PrintStream stream) {
	    this.stream = stream;
	  }

  public void embark() {
	  stream.println("Embarking on a quest to rescue the damsel.");
  }

@Override
public void embark(Integer age) {
	
	System.out.print("At the age of : "+age+" , I am ");
	embark();
}

}
