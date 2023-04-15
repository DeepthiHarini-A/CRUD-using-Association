class Department {
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	private Student student;
	private Employee employee;
	Department(int id,String name,String mailId,long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Employee getEmployee(){
		return employee;
	}
	public void setEmployee(Employee employee){
		this.employee=employee;
	}
	public void createTheStudent(Student student) {
		if(student.getId()!=0&&student.getName()!=null&&student.getMailId()!=null&&student.getContactNumber()!=0l) {
			this.student = student;
			System.out.println("Student Create Operation Performed Successfully!");
		}
		else {
			System.out.println("Student Already Exist!");
		}
	}
	public void readTheStudent() {
		if(student.getId()!=0&&student.getName()!=null&&student.getMailId()!=null&&student.getContactNumber()!=0l) {
			System.out.println("Student Details");
			System.out.println("---------------");
			System.out.println("Student Id : "+student.getId());
			System.out.println("Student Name : "+student.getName());
			System.out.println("Student MailId : "+student.getMailId());
			System.out.println("Student ContactNumber : "+student.getContactNumber());
			System.out.println("Student Read Operation Performed Successfully!");
		}
		else {
			System.out.println("Student Doesn't Exist!");
		}
	}
	public void updateTheStudent(int id,String name,String mailId,long contactNumber) {
		if(student.getId()!=0&&student.getName()!=null&&student.getMailId()!=null&&student.getContactNumber()!=0l) {
			student.setId(id);
			student.setName(name);
			student.setMailId(mailId);
			student.setContactNumber(contactNumber);
			System.out.println("Student Update Operation Performed Successfully!");
		}
		else {
			System.out.println("Student Doesn't Exist!");
		}
	}
	public void deleteTheStudent(int id) {
		if(student.getId()==id) {
			this.student = null;
			System.out.println("Student Delete Operation Performed Successfully!");
		}
		else {
			System.out.println("Student Doesn't Exist!");
		}
	}
	public void createTheEmployee(Employee employee) {
		if(employee.getId()!=0&&employee.getName()!=null&&employee.getMailId()!=null&&employee.getContactNumber()!=0l) {
			this.employee = employee;
			System.out.println("Employee Create Operation Performed Successfully!");
		}
		else {
			System.out.println("Employee Already Exist!");
		}
	}
	public void readTheEmployee() {
		if(employee.getId()!=0&&employee.getName()!=null&&employee.getMailId()!=null&&employee.getContactNumber()!=0l) {
			System.out.println("Employee Details");
			System.out.println("---------------");
			System.out.println("Employee Id : "+employee.getId());
			System.out.println("Employee Name : "+employee.getName());
			System.out.println("Employee MailId : "+employee.getMailId());
			System.out.println("Employee ContactNumber : "+employee.getContactNumber());
			System.out.println("Employee Read Operation Performed Successfully!");
		}
		else {
			System.out.println("Employee Doesn't Exist!");
		}
	}
	public void updateTheEmployee(int id,String name,String mailId,long contactNumber) {
		if(employee.getId()!=0&&employee.getName()!=null&&employee.getMailId()!=null&&employee.getContactNumber()!=0l) {
			employee.setId(id);
			employee.setName(name);
			employee.setMailId(mailId);
			employee.setContactNumber(contactNumber);
			System.out.println("Employee Update Operation Performed Successfully!");
		}
		else {
			System.out.println("Employee Doesn't Exist!");
		}
	}
	public void deleteTheEmployee(int id) {
		if(employee.getId()==id) {
			this.employee = null;
			System.out.println("Employee Delete Operation Performed Successfully!");
		}
		else {
			System.out.println("Employee Doesn't Exist!");
		}	
	}
}
