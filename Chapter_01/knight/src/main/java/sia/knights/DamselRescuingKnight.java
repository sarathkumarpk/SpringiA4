package sia.knights;

public class DamselRescuingKnight implements Knight {

  private Quest quest;
  
  private Integer age;

  public DamselRescuingKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark(age);
  }

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

}
