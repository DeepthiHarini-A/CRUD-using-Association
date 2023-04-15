class University {
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	private College college;
	University(int id,String name,String mailId,long contactNumber) {
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
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public void createTheCollege(College college) {
		if(college.getId()!=0&&college.getName()!=null&&college.getMailId()!=null&&college.getContactNumber()!=0l) {
			this.college = college;
			System.out.println("College Create Operation Performed Successfully!");
		}
		else {
			System.out.println("College Already Exist!");
		}
	}
	public void readTheCollege() {
		if(college.getId()!=0&&college.getName()!=null&&college.getMailId()!=null&&college.getContactNumber()!=0l) {
			System.out.println("College Details");
			System.out.println("---------------");
			System.out.println("College Id : "+college.getId());
			System.out.println("College Name : "+college.getName());
			System.out.println("College MailId : "+college.getMailId());
			System.out.println("College ContactNumber : "+college.getContactNumber());
			System.out.println("College Read Operation Performed Successfully!");
		}
		else {
			System.out.println("College Doesn't Exist!");
		}
	}
	public void updateTheCollege(int id,String name,String mailId,long contactNumber) {
		if(college.getId()!=0&&college.getName()!=null&&college.getMailId()!=null&&college.getContactNumber()!=0l) {
			college.setId(id);
			college.setName(name);
			college.setMailId(mailId);
			college.setContactNumber(contactNumber);
			System.out.println("College Update Operation Performed Successfully!");
		}
		else {
			System.out.println("College Doesn't Exist!");
		}
	}
	public void deleteTheCollege(int id) {
		if(college.getId()==id) {
			this.college = null;
			System.out.println("College Delete Operation Performed Successfully!");
		}
		else {
			System.out.println("College Doesn't Exist!");
		}
	}
}