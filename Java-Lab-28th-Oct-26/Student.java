class Student implements CalculateResult{
    private int maths,java,python;
    int totalMarks;

    Student(int maths,int java,int python){
        this.maths = maths;
        this.java = java;
        this.python = python;
    }
    
    public int CalculateTotal(){

      return totalMarks = maths + java + python;
    }
    
    public double CalculatePercentage(){
        double marks=300;
        return ((CalculateTotal()/marks)*100);
    }
    public String CalculateGrade(){
        if(totalMarks>=250){
            return "A grade !";
        }
        else if(totalMarks>=200){
            return "B grade !";
        }
        else if(totalMarks>=150){
            return "C grade";
        }
        else if(totalMarks>=50){
            return "D grade";
        }
        else{
            return "Fail !";
        }
    }

}