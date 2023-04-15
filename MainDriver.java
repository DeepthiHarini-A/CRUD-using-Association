import java.util.Scanner;
class MainDriver {
	private static Scanner scn  = new Scanner(System.in);
	private static boolean data = true;
	private static boolean data1=true;
	private static boolean data2=true;
	private static boolean data3=true;
	private static boolean data4=true;	
	private static boolean data5=true;
	private static boolean data6=true;
	private static boolean data7=true;
	private static boolean data8=true;
	private static boolean data9=true;
	private static boolean data10=true;
	private static Project project;
	private static Student student;
	private static Department department;
	private static College college;
	private static University university;
	private static Company company;
	private static Branch branch;
	private static Employee employee;
	public static void main(String[] args) {
		do{
			System.out.println("Select Your Choice!");
			System.out.println("-------------------");
			System.out.println("A.Mini Project Phase1 CRUD Operation!");
			System.out.println("B.Mini Project Phase2 CRUD Operation!");
			System.out.println("C.Exit");
                     char choice=scn.next().charAt(0);
			switch(choice)
		       {
			case 'A':{
		    	System.out.println("You have Selected Mini Project Phase1 ");
		    	do {
		    		System.out.println("Select Your Choice!");
		    		System.out.println("-------------------");
		    		System.out.println("1. University has a College");
		    		System.out.println("2.College has a Department");
		    		System.out.println("3.Department has Student");
		    		System.out.println("4.Student has a Project");
		    		System.out.println("5.Exit");
			        int choice0 = scn.nextInt();
			        switch(choice0) 
			        {
			        case 1:{
			        	System.out.println("You have selected university has a college");
			        	do {
			        		System.out.println("Select Your Choice!");
			                System.out.println("-------------------");
			                System.out.println("1.Create The University!");
			                System.out.println("2.Read The University!");
			                System.out.println("3.Update The University!");
			                System.out.println("4.Delete The University!");
			                System.out.println("5.Create The College!");
			                System.out.println("6.Read The College!");
			                System.out.println("7.Update The College!");
			                System.out.println("8.Delete The College!");
			                System.out.println("9.Exit!");
			                int choice1 = scn.nextInt();
			                switch(choice1) {
				            case 1 : {
				            	System.out.println("Enter the University Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the University Name");
					            String name = scn.next();
					            System.out.println("Enter the University Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the University Contact Number");
					            long contactNumber = scn.nextLong();
					            university = new University(id,name,mailId,contactNumber);
					            if(university.getId()!=0&&university.getName()!=null&&university.getMailId()!=null&&university.getContactNumber()!=0l) {
						            System.out.println("University Create Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("University Already Exist!");
					            }
				            }
				            break;
				            case 2 : {
					            if(university.getId()!=0&&university.getName()!=null&&university.getMailId()!=null&&university.getContactNumber()!=0l) {
						            System.out.println("University Details");
						            System.out.println("---------------");
						            System.out.println("University Id : "+university.getId());
						            System.out.println("University Name : "+university.getName());
						            System.out.println("University Mail Id : "+university.getMailId());
						            System.out.println("University Contact Number : "+university.getContactNumber());
						            System.out.println("University Read Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("University Doesn't Exist!");
					            }
				            }
				            break;
				            case 3 : {
					            System.out.println("Enter the New University Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New University Name");
					            String name = scn.next();
					            System.out.println("Enter the New University Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New University Contact Number");
					            long contactNumber = scn.nextLong();
					            if(university.getId()!=0&&university.getName()!=null&&university.getMailId()!=null&&university.getContactNumber()!=0l) {
						            university.setId(id);
						            university.setName(name);
						            university.setMailId(mailId);
						            university.setContactNumber(contactNumber);
						            System.out.println("University Update Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("University Doesn't Exist!");
					            }
				            }
				            break;
				            case 4 : {
				            	System.out.println("Enter the new University Id");
					            int id = scn.nextInt();
					            if(university.getId()==id) {
						            university = null;
						            System.out.println("University Delete Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("University Doesn't Exist!");
					            }
				            }
				            break;
				            case 5 : {
					            System.out.println("Enter the College Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the College Name");
					            String name = scn.next();
                                               System.out.println("Enter the College Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the College Contact Number");
					            long contactNumber = scn.nextLong();
					            college = new College(id,name,mailId,contactNumber);
					            university.createTheCollege(college);
				            }
				            break;
				            case 6 : {
					            university.readTheCollege();
				            }
				            break;
				            case 7 : {
					            System.out.println("Enter the New College Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New College Name");
					            String name = scn.next();
					            System.out.println("Enter the New College Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New College Contact Number");
					            long contactNumber = scn.nextLong();
					            university.updateTheCollege(id,name,mailId,contactNumber);
				            }
				            break;
				            case 8 : {
					            System.out.println("Enter the Current College Id");
					            int id = scn.nextInt();
					            university.deleteTheCollege(id);
				            }
				            break;
				            case 9 : {
					            data2 = false;
					            System.out.println("Thank You!Visit Again!");
				            }
				            break;
				            default : {
					            System.out.println("Invalid Choice!Try Again!");
				            }
				            break;
			            }
		            }while(data2);
		            }
		            break;
                    case 2:{
                    	System.out.println("You have selected College has A Department");
                    	do{
                    		System.out.println("1.Create The College!");
			                System.out.println("2.Read The College!");
			                System.out.println("3.Update The College!");
			                System.out.println("4.Delete The College!");
			                System.out.println("5.Create The Department!");
			                System.out.println("6.Read The Department!");
			                System.out.println("7.Update The Department!");
			                System.out.println("8.Delete The Department!");
			                System.out.println("9.Exit");
                            int choice2 = scn.nextInt();
			                switch(choice2) {
				            case 1 : {
				            	System.out.println("Enter the Collge Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the College Name");
					            String name = scn.next();
					            System.out.println("Enter the College Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the College Contact Number");
					            long contactNumber = scn.nextLong();
					            college = new College(id,name,mailId,contactNumber);
					            if(college.getId()!=0&&college.getName()!=null&&college.getMailId()!=null&&college.getContactNumber()!=0l) {
						            System.out.println("College Create Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("College Already Exist!");
					            }
				            }
				            break;
				            case 2 : {
					            if(college.getId()!=0&&college.getName()!=null&&college.getMailId()!=null&&college.getContactNumber()!=0l) {
						            System.out.println("College Details");
						            System.out.println("---------------");
						            System.out.println("College Id : "+college.getId());
						            System.out.println("College Name : "+college.getName());
						            System.out.println("College Mail Id : "+college.getMailId());
						            System.out.println("College Contact Number : "+college.getContactNumber());
						            System.out.println("College Read Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("College Doesn't Exist!");
					            }
				            }
				            break;
				            case 3 : {
					            System.out.println("Enter the New College Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New College Name");
					            String name = scn.next();
					            System.out.println("Enter the New College Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New College Contact Number");
					            long contactNumber = scn.nextLong();
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
				            break;
				            case 4 : {
				            	System.out.println("Enter the new College Id");
					            int id = scn.nextInt();
					            if(college.getId()==id) {
						            college = null;
						            System.out.println("College Delete Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("College Doesn't Exist!");
					            }
				            }
				            break;
				            case 5 : {
					            System.out.println("Enter the Department Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the Department Name");
					            String name = scn.next();
                                System.out.println("Enter the Department Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the Department Contact Number");
					            long contactNumber = scn.nextLong();
					            department = new Department(id,name,mailId,contactNumber);
					            college.createTheDepartment(department);
				            }
				            break;
				            case 6 : {
					            college.readTheDepartment();
				            }
				            break;
				            case 7 : {
					            System.out.println("Enter the New Department Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New Department Name");
					            String name = scn.next();
					            System.out.println("Enter the New Department Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New Department Contact Number");
					            long contactNumber = scn.nextLong();
					            college.updateTheDepartment(id,name,mailId,contactNumber);
				            }
				            break;
				            case 8 : {
					            System.out.println("Enter the Current Department Id");
					            int id = scn.nextInt();
					            college.deleteTheDepartment(id);
				            }
				            break;
				            case 9 : {
					            data3 = false;
					            System.out.println("Thank You!Visit Again!");
				            }
				            break;
				            default : {
					            System.out.println("Invalid Choice!Try Again!");
				            }
				            break;
			            }
                    	}while(data3);

                    }
                    break;
                case 3:{
                	
                	do{
                       System.out.println("1.Create The Department!");
			           System.out.println("2.Read The Department!");
			           System.out.println("3.Update The Department!");
			           System.out.println("4.Delete The Department!");
			           System.out.println("5.Create The Student!");
			           System.out.println("6.Read The Student!");
			           System.out.println("7.Update The Student!");
			           System.out.println("8.Delete The Student!"); 
			           System.out.println("9.Exit");
			           int choice3 = scn.nextInt();
			                switch(choice3) {
				            case 1 : {
				            	System.out.println("Enter the Department Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the Department Name");
					            String name = scn.next();
					            System.out.println("Enter the Department Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the Department Contact Number");
					            long contactNumber = scn.nextLong();
					            department = new Department(id,name,mailId,contactNumber);
					            if(department.getId()!=0&&department.getName()!=null&&department.getMailId()!=null&&department.getContactNumber()!=0l) {
						            System.out.println("Department Create Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Department Already Exist!");
					            }
				            }
				            break;
				            case 2 : {
					            if(department.getId()!=0&&department.getName()!=null&&department.getMailId()!=null&&department.getContactNumber()!=0l) {
						            System.out.println("Department Details");
						            System.out.println("---------------");
						            System.out.println("Department Id : "+department.getId());
						            System.out.println("Department Name : "+department.getName());
						            System.out.println("Department Mail Id : "+department.getMailId());
						            System.out.println("Department Contact Number : "+department.getContactNumber());
						            System.out.println("Department Read Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Department Doesn't Exist!");
					            }
				            }
				            break;
				            case 3 : {
					            System.out.println("Enter the New Department Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New Department Name");
					            String name = scn.next();
					            System.out.println("Enter the New Department Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New Department Contact Number");
					            long contactNumber = scn.nextLong();
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
				            break;
				            case 4 : {
				            	System.out.println("Enter the new Department Id");
					            int id = scn.nextInt();
					            if(department.getId()==id) {
						            department = null;
						            System.out.println("Department Delete Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Department Doesn't Exist!");
					            }
				            }
				            break;
				            case 5 : {
					            System.out.println("Enter the Student Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the Student Name");
					            String name = scn.next();
                                               System.out.println("Enter the Student Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the Student Contact Number");
					            long contactNumber = scn.nextLong();
					            student = new Student(id,name,mailId,contactNumber);
					            department.createTheStudent(student);
				            }
				            break;
				            case 6 : {
					            department.readTheStudent();
				            }
				            break;
				            case 7 : {
					            System.out.println("Enter the New Student Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New Student Name");
					            String name = scn.next();
					            System.out.println("Enter the New Student Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New Student Contact Number");
					            long contactNumber = scn.nextLong();
					            department.updateTheStudent(id,name,mailId,contactNumber);
				            }
				            break;
				            case 8 : {
					            System.out.println("Enter the Current Student Id");
					            int id = scn.nextInt();
					            department.deleteTheStudent(id);
				            }
				            break;
				            case 9 : {
					            data4 = false;
					            System.out.println("Thank You!Visit Again!");
				            }
				            break;
				            default : {
					            System.out.println("Invalid Choice!Try Again!");
				            }
				            break;
			            }
                	    }while(data4);
		            }
		            break;
		            case 4:{
		            	do{
		            		System.out.println("1.Create The Student!");
			              System.out.println("2.Read The Student!");
			              System.out.println("3.Update The Student!");
			              System.out.println("4.Delete The Student!");
			              System.out.println("5.Create The Project!");
			              System.out.println("6.Read The Project!");
			              System.out.println("7.Update The Project!");
			              System.out.println("8.Delete The Project!"); 
			              System.out.println("9.Exit");
                                   int choice4 = scn.nextInt();
			       switch(choice4) {
				case 1 : {
					System.out.println("Enter the Student Id");
					int id = scn.nextInt();
					System.out.println("Enter the Student Name");
					String name = scn.next();
					System.out.println("Enter the Student Mail Id");
					String mailId = scn.next();
					System.out.println("Enter the Student Contact Number");
					long contactNumber = scn.nextLong();
					student = new Student(id,name,mailId,contactNumber);
					if(student.getId()!=0&&student.getName()!=null&&student.getMailId()!=null&&student.getContactNumber()!=0l) {
						System.out.println("Student Create Operation Performed Successfully!");
					}
					else {
						System.out.println("Student Already Exist!");
					}
				}
				break;
				case 2 : {
					if(student.getId()!=0&&student.getName()!=null&&student.getMailId()!=null&&student.getContactNumber()!=0l) {
						System.out.println("Student Details");
						System.out.println("---------------");
						System.out.println("Student Id : "+student.getId());
						System.out.println("Student Name : "+student.getName());
						System.out.println("Student Mail Id : "+student.getMailId());
						System.out.println("Student Contact Number : "+student.getContactNumber());
						System.out.println("Student Read Operation Performed Successfully!");
					}
					else {
						System.out.println("Student Doesn't Exist!");
					}
				}
				break;
				case 3 : {
					System.out.println("Enter the New Student Id");
					int id = scn.nextInt();
					System.out.println("Enter the New Student Name");
					String name = scn.next();
					System.out.println("Enter the New Student Mail Id");
					String mailId = scn.next();
					System.out.println("Enter the New Student Contact Number");
					long contactNumber = scn.nextLong();
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
				break;
				case 4 : {
					System.out.println("Enter the New Student Id");
					int id = scn.nextInt();
					if(student.getId()==id) {
						student = null;
						System.out.println("Student Delete Operation Performed Successfully!");
					}
					else {
						System.out.println("Student Doesn't Exist!");
					}
				}
				break;
				case 5 : {
					System.out.println("Enter the Project Id");
					int id = scn.nextInt();
					System.out.println("Enter the Project Name");
					String name = scn.next();
					project = new Project(id,name);
					student.createTheProject(project);
				}
				break;
				case 6 : {
					student.readTheProject();
				}
				break;
				case 7 : {
					System.out.println("Enter the New Project Id");
					int id = scn.nextInt();
					System.out.println("Enter the New Project Name");
					String name = scn.next();
					student.updateTheProject(id,name);
				}
				break;
				case 8 : {
					System.out.println("Enter the Current Project Id");
					int id = scn.nextInt();
					student.deleteTheProject(id);
				}
				break;
				case 9 : {
					data5 = false;
					System.out.println("Thank You!Visit Again!");
				}
				break;
				default : {
					System.out.println("Invalid Choice!Try Again!");
				}
				break;
			       }
		            	}while(data5);
		            }
		            break;
		     case 5:{
		     	data1 = false;
		     	System.out.println("You have Exited mini project phase-1");
		       }
		       break;
		       default: {
				System.out.println("Invalid choice try again!");
			    }
                     }
			}while(data1);
			}
			break;
                     case 'B':{
		    	System.out.println("You have Selected Mini Project Phase2 ");
		    	do {
		    		System.out.println("Select Your Choice!");
		    		System.out.println("-------------------");
		    		System.out.println("1.Company has a Branch");
		    		System.out.println("2.Branch has a Department");
		    		System.out.println("3.Department has Employee");
		    		System.out.println("4.employee has a Project");
		    		System.out.println("5.Exit");
			        int choice0 = scn.nextInt();
			        switch(choice0) 
			        {
			        case 1:{
			        	System.out.println("You have selected Company has a Branch");
			        	do {
			        	  System.out.println("Select Your Choice!");
			                System.out.println("-------------------");
			                System.out.println("1.Create The Company!");
			                System.out.println("2.Read The Company!");
			                System.out.println("3.Update The Company!");
			                System.out.println("4.Delete The Company!");
			                System.out.println("5.Create The Branch!");
			                System.out.println("6.Read The Branch!");
			                System.out.println("7.Update The Branch!");
			                System.out.println("8.Delete The Branch!");
			                System.out.println("9.Exit!");
			                int choice1 = scn.nextInt();
			                switch(choice1) {
				            case 1 : {
				            	System.out.println("Enter the Company Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the Company Name");
					            String name = scn.next();
					            System.out.println("Enter the Company Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the Company Contact Number");
					            long contactNumber = scn.nextLong();
					            company = new Company(id,name,mailId,contactNumber);
					            if(company.getId()!=0&&company.getName()!=null&&company.getMailId()!=null&&company.getContactNumber()!=0l) {
						            System.out.println("Company Create Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Company Already Exist!");
					            }
				            }
				            break;
				            case 2 : {
					            if(company.getId()!=0&&company.getName()!=null&&company.getMailId()!=null&&company.getContactNumber()!=0l) {
						            System.out.println("Company Details");
						            System.out.println("---------------");
						            System.out.println("Company Id : "+company.getId());
						            System.out.println("Company Name : "+company.getName());
						            System.out.println("Company Mail Id : "+company.getMailId());
						            System.out.println("Company Contact Number : "+company.getContactNumber());
						            System.out.println("Company Read Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Company Doesn't Exist!");
					            }
				            }
				            break;
				            case 3 : {
					            System.out.println("Enter the New Company Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New Company Name");
					            String name = scn.next();
					            System.out.println("Enter the New Company Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New Company Contact Number");
					            long contactNumber = scn.nextLong();
					            if(company.getId()!=0&&company.getName()!=null&&company.getMailId()!=null&&company.getContactNumber()!=0l) {
						            company.setId(id);
						            company.setName(name);
						            company.setMailId(mailId);
						            company.setContactNumber(contactNumber);
						            System.out.println("Company Update Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Company Doesn't Exist!");
					            }
				            }
				            break;
				            case 4 : {
				            	System.out.println("Enter the new Company Id");
					            int id = scn.nextInt();
					            if(company.getId()==id) {
						            company = null;
						            System.out.println("Company Delete Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Company Doesn't Exist!");
					            }
				            }
				            break;
				            case 5 : {
					            System.out.println("Enter the Branch Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the Branch Name");
					            String name = scn.next();
                                               System.out.println("Enter the Branch Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the Branch Contact Number");
					            long contactNumber = scn.nextLong();
					            branch = new Branch(id,name,mailId,contactNumber);
					            company.createTheBranch(branch);
				            }
				            break;
				            case 6 : {
					            company.readTheBranch();
				            }
				            break;
				            case 7 : {
					            System.out.println("Enter the New Branch Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New Branch Name");
					            String name = scn.next();
					            System.out.println("Enter the New Branch Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New Branch Contact Number");
					            long contactNumber = scn.nextLong();
					            company.updateTheBranch(id,name,mailId,contactNumber);
				            }
				            break;
				            case 8 : {
					            System.out.println("Enter the Current Branch Id");
					            int id = scn.nextInt();
					            company.deleteTheBranch(id);
				            }
				            break;
				            case 9 : {
					            data6 = false;
					            System.out.println("Thank You!Visit Again!");
				            }
				            break;
				            default : {
					            System.out.println("Invalid Choice!Try Again!");
				            }
				            break;
			            }
		            }while(data6);
		            }
		            break;
                    case 2:{
                    	System.out.println("You have selected Branch has A Department");
                    	do{
                    		System.out.println("1.Create The Branch!");
			                System.out.println("2.Read The Branch!");
			                System.out.println("3.Update The Branch!");
			                System.out.println("4.Delete The Branch!");
			                System.out.println("5.Create The Department!");
			                System.out.println("6.Read The Department!");
			                System.out.println("7.Update The Department!");
			                System.out.println("8.Delete The Department!");
			                System.out.println("9.Exit");
                            int choice2 = scn.nextInt();
			                switch(choice2) {
				            case 1 : {
				            	System.out.println("Enter the Branch Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the Branch Name");
					            String name = scn.next();
					            System.out.println("Enter the Branch Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the Branch Contact Number");
					            long contactNumber = scn.nextLong();
					            branch = new Branch(id,name,mailId,contactNumber);
					            if(branch.getId()!=0&&branch.getName()!=null&&branch.getMailId()!=null&&branch.getContactNumber()!=0l) {
						            System.out.println("Branch Create Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Branch Already Exist!");
					            }
				            }
				            break;
				            case 2 : {
					            if(branch.getId()!=0&&branch.getName()!=null&&branch.getMailId()!=null&&branch.getContactNumber()!=0l) {
						            System.out.println("Branch Details");
						            System.out.println("---------------");
						            System.out.println("Branch Id : "+branch.getId());
						            System.out.println("Branch Name : "+branch.getName());
						            System.out.println("Branch Mail Id : "+branch.getMailId());
						            System.out.println("Branch Contact Number : "+branch.getContactNumber());
						            System.out.println("Branch Read Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Branch Doesn't Exist!");
					            }
				            }
				            break;
				            case 3 : {
					            System.out.println("Enter the New Branch Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New Branch Name");
					            String name = scn.next();
					            System.out.println("Enter the New Branch Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New Branch Contact Number");
					            long contactNumber = scn.nextLong();
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
				            break;
				            case 4 : {
				            	System.out.println("Enter the new Branch Id");
					            int id = scn.nextInt();
					            if(branch.getId()==id) {
						            branch = null;
						            System.out.println("Branch Delete Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Branch Doesn't Exist!");
					            }
				            }
				            break;
				            case 5 : {
					            System.out.println("Enter the Department Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the Department Name");
					            String name = scn.next();
                                               System.out.println("Enter the Department Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the Department Contact Number");
					            long contactNumber = scn.nextLong();
					            department = new Department(id,name,mailId,contactNumber);
					            branch.createTheDepartment(department);
				            }
				            break;
				            case 6 : {
					            branch.readTheDepartment();
				            }
				            break;
				            case 7 : {
					            System.out.println("Enter the New Department Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New Department Name");
					            String name = scn.next();
					            System.out.println("Enter the New Department Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New Department Contact Number");
					            long contactNumber = scn.nextLong();
					            branch.updateTheDepartment(id,name,mailId,contactNumber);
				            }
				            break;
				            case 8 : {
					            System.out.println("Enter the Current Department Id");
					            int id = scn.nextInt();
					            branch.deleteTheDepartment(id);
				            }
				            break;
				            case 9 : {
					            data7 = false;
					            System.out.println("Thank You!Visit Again!");
				            }
				            break;
				            default : {
					            System.out.println("Invalid Choice!Try Again!");
				            }
				            break;
			            }
                    	}while(data7);

                    }
                    break;
                case 3:{
                	System.out.println("You have selected Department has Employee");
                	do{
                                System.out.println("1.Create The Department!");
			           System.out.println("2.Read The Department!");
			           System.out.println("3.Update The Department!");
			           System.out.println("4.Delete The Department!");
			           System.out.println("5.Create The Employee!");
			           System.out.println("6.Read The Employee!");
			           System.out.println("7.Update The Employee!");
			           System.out.println("8.Delete The Employee!"); 
			           System.out.println("9.Exit");
			           int choice3 = scn.nextInt();
			                switch(choice3) {
				            case 1 : {
				            	System.out.println("Enter the Department Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the Department Name");
					            String name = scn.next();
					            System.out.println("Enter the Department Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the Department Contact Number");
					            long contactNumber = scn.nextLong();
					            department = new Department(id,name,mailId,contactNumber);
					            if(department.getId()!=0&&department.getName()!=null&&department.getMailId()!=null&&department.getContactNumber()!=0l) {
						            System.out.println("Department Create Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Department Already Exist!");
					            }
				            }
				            break;
				            case 2 : {
					            if(department.getId()!=0&&department.getName()!=null&&department.getMailId()!=null&&department.getContactNumber()!=0l) {
						            System.out.println("Department Details");
						            System.out.println("---------------");
						            System.out.println("Department Id : "+department.getId());
						            System.out.println("Department Name : "+department.getName());
						            System.out.println("Department Mail Id : "+department.getMailId());
						            System.out.println("Department Contact Number : "+department.getContactNumber());
						            System.out.println("Department Read Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Department Doesn't Exist!");
					            }
				            }
				            break;
				            case 3 : {
					            System.out.println("Enter the New Department Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New Department Name");
					            String name = scn.next();
					            System.out.println("Enter the New Department Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New Department Contact Number");
					            long contactNumber = scn.nextLong();
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
				            break;
				            case 4 : {
				            	System.out.println("Enter the new Department Id");
					            int id = scn.nextInt();
					            if(department.getId()==id) {
						            department = null;
						            System.out.println("Department Delete Operation Performed Successfully!");
					            }
					            else {
						            System.out.println("Department Doesn't Exist!");
					            }
				            }
				            break;
				            case 5 : {
					            System.out.println("Enter the Employee Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the Employee Name");
					            String name = scn.next();
                                               System.out.println("Enter the Employee Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the Employee Contact Number");
					            long contactNumber = scn.nextLong();
					            employee = new Employee(id,name,mailId,contactNumber);
					            department.createTheEmployee(employee);
				            }
				            break;
				            case 6 : {
					            department.readTheEmployee();
				            }
				            break;
				            case 7 : {
					            System.out.println("Enter the New Employee Id");
					            int id = scn.nextInt();
					            System.out.println("Enter the New Employee Name");
					            String name = scn.next();
					            System.out.println("Enter the New Employee Mail Id");
					            String mailId = scn.next();
					            System.out.println("Enter the New Employee Contact Number");
					            long contactNumber = scn.nextLong();
					            department.updateTheEmployee(id,name,mailId,contactNumber);
				            }
				            break;
				            case 8 : {
					            System.out.println("Enter the Current Employee Id");
					            int id = scn.nextInt();
					            department.deleteTheEmployee(id);
				            }
				            break;
				            case 9 : {
					            data8 = false;
					            System.out.println("Thank You!Visit Again!");
				            }
				            break;
				            default : {
					            System.out.println("Invalid Choice!Try Again!");
				            }
				            break;
			            }
                	    }while(data8);
		            }
		            break;
		            case 4:{
		            	do{
		            		System.out.println("1.Create The Employee!");
			              System.out.println("2.Read The Employee!");
			              System.out.println("3.Update The Employee!");
			              System.out.println("4.Delete The Employee!");
			              System.out.println("5.Create The Project!");
			              System.out.println("6.Read The Project!");
			              System.out.println("7.Update The Project!");
			              System.out.println("8.Delete The Project!"); 
			              System.out.println("9.Exit");
                                   int choice4 = scn.nextInt();
			       switch(choice4) {
				case 1 : {
					System.out.println("Enter the Employee Id");
					int id = scn.nextInt();
					System.out.println("Enter the Employee Name");
					String name = scn.next();
					System.out.println("Enter the Employee Mail Id");
					String mailId = scn.next();
					System.out.println("Enter the Employee Contact Number");
					long contactNumber = scn.nextLong();
					employee = new Employee(id,name,mailId,contactNumber);
					if(employee.getId()!=0&&employee.getName()!=null&&employee.getMailId()!=null&&employee.getContactNumber()!=0l) {
						System.out.println("Employee Create Operation Performed Successfully!");
					}
					else {
						System.out.println("Employee Already Exist!");
					}
				}
				break;
				case 2 : {
					if(employee.getId()!=0&&employee.getName()!=null&&employee.getMailId()!=null&&employee.getContactNumber()!=0l) {
						System.out.println("Employee Details");
						System.out.println("---------------");
						System.out.println("Employee Id : "+employee.getId());
						System.out.println("Employee Name : "+employee.getName());
						System.out.println("Employee Mail Id : "+employee.getMailId());
						System.out.println("Employee Contact Number : "+employee.getContactNumber());
						System.out.println("Employee Read Operation Performed Successfully!");
					}
					else {
						System.out.println("Employee Doesn't Exist!");
					}
				}
				break;
				case 3 : {
					System.out.println("Enter the New Employee Id");
					int id = scn.nextInt();
					System.out.println("Enter the New Employee Name");
					String name = scn.next();
					System.out.println("Enter the New Employee Mail Id");
					String mailId = scn.next();
					System.out.println("Enter the New Employee Contact Number");
					long contactNumber = scn.nextLong();
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
				break;
				case 4 : {
					System.out.println("Enter the New Employee Id");
					int id = scn.nextInt();
					if(employee.getId()==id) {
						employee = null;
						System.out.println("Employee Delete Operation Performed Successfully!");
					}
					else {
						System.out.println("Employee Doesn't Exist!");
					}
				}
				break;
				case 5 : {
					System.out.println("Enter the Project Id");
					int id = scn.nextInt();
					System.out.println("Enter the Project Name");
					String name = scn.next();
					project = new Project(id,name);
					employee.createTheProject(project);
				}
				break;
				case 6 : {
					employee.readTheProject();
				}
				break;
				case 7 : {
					System.out.println("Enter the New Project Id");
					int id = scn.nextInt();
					System.out.println("Enter the New Project Name");
					String name = scn.next();
					employee.updateTheProject(id,name);
				}
				break;
				case 8 : {
					System.out.println("Enter the Current Project Id");
					int id = scn.nextInt();
					employee.deleteTheProject(id);
				}
				break;
				case 9 : {
					data9 = false;
					System.out.println("Thank You!Visit Again!");
				}
				break;
				default : {
					System.out.println("Invalid Choice!Try Again!");
				}
				break;
			       }
		            	}while(data9);
		            }
		            break;
		     case 5:{
		     	data10 = false;
		     	System.out.println("You have Exited mini project phase-1");
		       }
		       break;
		       default: {
				System.out.println("Invalid choice try again!");
			    }
                     }
			}while(data10);
			}
			break;
		case 'C':{
			data=false;
			System.out.println("Thank you! visit Again!");

		}
		break;
	     default: {
	    	System.out.println("Invalid choice try again!");
	    }
		}
		}while(data);

	}
}