class Company {
	private int id;
	private String name;
	private String mailId;
	private long contactNumber;
	private Branch branch;
	Company(int id,String name,String mailId,long contactNumber) {
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
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public void createTheBranch(Branch branch) {
		if(branch.getId()!=0&&branch.getName()!=null&&branch.getMailId()!=null&&branch.getContactNumber()!=0l) {
			this.branch = branch;
			System.out.println("Branch Create Operation Performed Successfully!");
		}
		else {
			System.out.println("Branch Already Exist!");
		}
	}
	public void readTheBranch() {
		if(branch.getId()!=0&&branch.getName()!=null&&branch.getMailId()!=null&&branch.getContactNumber()!=0l) {
			System.out.println("Branch Details");
			System.out.println("---------------");
			System.out.println("Branch Id : "+branch.getId());
			System.out.println("Branch Name : "+branch.getName());
			System.out.println("Branch MailId : "+branch.getMailId());
			System.out.println("Branch ContactNumber : "+branch.getContactNumber());
			System.out.println("Branch Read Operation Performed Successfully!");
		}
		else {
			System.out.println("Branch Doesn't Exist!");
		}
	}
	public void updateTheBranch(int id,String name,String mailId,long contactNumber) {
		if(branch.getId()!=0&&branch.getName()!=null&&branch.getMailId()!=null&&branch.getContactNumber()!=0l) {
			branch.setId(id);
			branch.setName(name);
			branch.setMailId(mailId);
			branch.setContactNumber(contactNumber);
			System.out.println("Branch Update Operation Performed Successfully!");
		}
		else {
			System.out.println("Branch Doesn't Exist!");
		}
	}
	public void deleteTheBranch(int id) {
		if(branch.getId()==id) {
			this.branch = null;
			System.out.println("Branch Delete Operation Performed Successfully!");
		}
		else {
			System.out.println("Branch Doesn't Exist!");
		}
	}
}