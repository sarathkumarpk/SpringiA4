package sia.knights;

import javax.annotation.PostConstruct;

public class BraveKnight implements Knight {

  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
  }

  @PostConstruct
  public void announce() {
	  System.out.println("Announcing arrival ! ");
  }
  
}
