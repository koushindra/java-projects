package pack.inherit;

public class Aggrgtion
{
public static void main(String[] args)
{
	Address address=new Address("Delhi", "343434", " Uttar pradesh");
	
	Employee emp=new Employee(23434, "koushi",address);
	emp.show();
}
}
