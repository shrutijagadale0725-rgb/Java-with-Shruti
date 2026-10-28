class Staff{
    String Staff_name;
    String Staff_dob;
    String designation;
    double Salary;

    Staff(String Staff_name, String Staff_dob, String designation, double Salary){
        this.Staff_name=Staff_name;
        this.Staff_dob=Staff_dob;
        this.designation=designation;
        this.Salary=Salary;
    }
    public void display(){
        System.out.print("Name:"+ Staff_name);
        System.out.print("\nBirth-Date: "+ Staff_dob);
        System.out.print("\nDesignation: "+ designation);
        System.out.print("Salary:"+ Salary+"\n\n");
    }
    public static void main(String[] args){

        Staff s1=new Staff("Shruti","7/05/2005","Cloud Engineer\n",100000);
        Staff s2=new Staff("Siya","25/02/2005","Physiotherapist\n",50000);
        Staff s3=new Staff("Shubhada","19/05/1998","Interior designer\n",3300000);
        s1.display();
        s2.display();
        s3.display();
        System.out.println("\nStaff with highest salary: ");
        if(s1.Salary>s2.Salary && s1.Salary>s3.Salary){
            s1.display();
        }
        else if(s2.Salary>s3.Salary && s2.Salary>s1.Salary){
            s2.display();
        }
        else{
            s3.display();
        }
    }
}