import java.math.BigDecimal;

public class Stuff {
	    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
		private String name;
	    private int age;
	    private BigDecimal salary;
		public Stuff(String name, int age, BigDecimal salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
	    
	    
}
