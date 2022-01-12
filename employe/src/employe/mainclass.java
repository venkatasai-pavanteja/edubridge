package employe;

 class employee {
	

      int empId;
      String empName;
      int empSalary;
      String empDesg;
      public void display()
      {
    	 empId=462;
    	 empName="Pavan Teja";
    	 empSalary=30000;
    	 empDesg="IT Consultant";
    	 System.out.println("Employe Id :"+empId+"\nEmploye name :"+empName+"\nEmploye Salary :"+empSalary+"\nEmploye Desg :"+empDesg);
      }
      public static void main(String[] args) {
    	  
    	    
    	  
    	  employee emp=new employee();
    	  emp.display();
    	  employee emp1=new employee();
    	  emp1.display();
    	  employee emp2=new employee();
    	  emp2.display();
    	  
      }
      
}      



