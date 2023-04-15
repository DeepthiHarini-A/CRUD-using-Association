class Branch {
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	private Department department;
	Branch(int id,String name,String mailId,long contactNumber) {
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public void createTheDepartment(Department department) {
		if(department.getId()!=0&&department.getName()!=null&&department.getMailId()!=null&&department.getContactNumber()!=0l) {
			this.department = department;
			System.out.println("Department Create Operation Performed Successfully!");
		}
		else {
			System.out.println("Department Already Exist!");
		}
	}
	public void readTheDepartment() {
		if(department.getId()!=0&&department.getName()!=null&&department.getMailId()!=null&&department.getContactNumber()!=0l) {
			System.out.println("Department Details");
			System.out.println("---------------");
			System.out.println("Department Id : "+department.getId());
			System.out.println("Department Name : "+department.getName());
			System.out.println("Department MailId : "+department.getMailId());
			System.out.println("Department ContactNumber : "+department.getContactNumber());
			System.out.println("Department Read Operation Performed Successfully!");
		}
		else {
			System.out.println("Department Doesn't Exist!");
		}
	}
	public void updateTheDepartment(int id,String name,String mailId,long contactNumber) {
		if(department.getId()!=0&&department.getName()!=null&&department.getMailId()!=null&&department.getContactNumber()!=0l) {
			department.setId(id);
			department.setName(name);
			department.setMailId(mailId);
			department.setContactNumber(contactNumber);
			System.out.println("Department Update Operation Performed Successfully!");
		}
		else {
			System.out.println("Department Doesn't Exist!");
		}
	}
	public void deleteTheDepartment(int id) {
		if(department.getId()==id) {
			this.department = null;
			System.out.println("Department Delete Operation Performed Successfully!");
		}
		else {
			System.out.println("Department Doesn't Exist!");
		}
	}
}