package in.gs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.gs.resources.SpringConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String std_name = "gagan";
    	int std_rollno = 59;
    	int st_marks = 99;
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        //  -------------------------  INSERTION QUERY  ----------------------------------
//        String insert_sql_queryString = "INSERT INTO Student VALUES(?,?,?)";
//        int count = jdbcTemplate.update(insert_sql_queryString, std_rollno,std_name,st_marks);
//        if(count > 0) {
//        	System.out.println("Insertion Success");
//        }
//        else {
//        	System.out.println("Insertion Failed");
//        }
        //  -------------------------  UPDATION QUERY  ----------------------------------
//        String updateQueryString = "UPDATE STUDENT SET st_marks=? where st_rollno=?";
//        int count = jdbcTemplate.update(updateQueryString,100,59);
//        if(count > 0) {
//        	System.out.println("Updation Success");
//        }
//        else {
//        	System.out.println("Updation Failed");
//        }
        //  -------------------------  UPDATION QUERY  ----------------------------------
        String update_sql_queryString = "DELETE FROM Student WHERE st_marks=?";
        int count = jdbcTemplate.update(update_sql_queryString, 100);
        if(count > 0) {
        	System.out.println("Deletion Success");
        }
        else {
        	System.out.println("Deletion Failed");
        }
    }
}
