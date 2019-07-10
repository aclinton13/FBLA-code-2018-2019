
package Student;


public class Student {
    //member variables
    String fname,lname;
    int grade;
    int ebookcode;
    boolean hasbook;
    
    //constructor with bookcode
    public Student(String fn,String ln, int g, int eb)
    {
        fname=fn;
        lname=ln;
        
        
        
        grade=g;
        ebookcode=eb;
        hasbook=true;
    }
    
    //constructor without bookcode
    public Student(String fn,String ln,int g)
    {
        fname=fn;
        lname = ln;
        grade=g;
        ebookcode=0;
        hasbook=false;
    }
    
    //setter methods
    public void setName(String fn, String ln) {fname=fn;lname=ln;}
    public void setGrade(int g) {grade=g;}
    public void setEbookcode(int eb) {ebookcode=eb; hasbook=true;}

   //getter methods 
    public String getName() {return (fname+" "+lname);}
    public int getGrade() {return grade;}
    public int getEbookcode() {return ebookcode;}
    public boolean hasBook() {return hasbook;}
    
    //return books
    public void returnbook(){ebookcode=0; hasbook=false;}
    //print student
    public String toString()
    {
        return(fname+" "+lname+" "+grade+" "+ebookcode);
    }
    

    
    
}
