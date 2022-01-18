public class My{  
    static int last_roll = 100;    
    int roll_no;   
    // Constructor   
    My()   
    {   
        roll_no = last_roll;   
        last_roll++;   
    }   
    public int hashCode()   
    {   
        return roll_no;   
    }   
    // Driver code   
    public static void main(String args[])   
    {   
        My = new My();   
        // Below two statements are equivalent   
        System.out.println("HashCode : "+s);   
    }   
}  